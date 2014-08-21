/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.democlient;

import com.gmsd.model.exception.GongmingApplicationException;
import com.gmsd.model.exception.GongmingConnectionException;
import com.gmsd.model.request.*;
import com.gmsd.model.response.*;
import com.gmsd.sdk.Gongming;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {

  private static Logger logger = Logger.getLogger("application");

  private static Long merchantId = 1L;
  private static String merchantSecret = "ABCDEFG1234ABCDEFG1234";

  public Application() {
  }

  public static void main(String args[]) {

    Gongming gongming = new Gongming(merchantId, merchantSecret);

    try {
      String userIdentityNumber = "1" + String.format("%017d", new Random().nextInt(1000000000));

      logger.log(Level.INFO, "创建理财账户");
      CreateUserRequest createUserRequest = new CreateUserRequest(
          merchantId,           // 商户号
          "18680008813",        // 手机号
          userIdentityNumber,   // 身份证号
          "ManagerOfMoney"      // 真实姓名
      );
      CreateUserResponse createUserResponse = gongming.createUser(createUserRequest);
      logger.log(Level.INFO, "创建理财账户成功，理财账户号" + createUserResponse.userId);

      Long userId = createUserResponse.userId;

      logger.log(Level.INFO, "根据身份证号查询理财账户");
      QueryUserByIdentityNumberRequest queryUserByIdentityNumberRequest = new QueryUserByIdentityNumberRequest(
          merchantId,             // 商户号
          userIdentityNumber      // 身份证号
      );
      QueryUserByIdentityNumberResponse queryUserByIdentityNumberResponse = gongming.queryUserByIdentityNumber(
          queryUserByIdentityNumberRequest);
      logger.log(Level.INFO, "根据身份证号查询理财账户成功，理财账户号为" + queryUserByIdentityNumberResponse.user.id);

      logger.log(Level.INFO, "查询理财计划");
      QueryPlansRequest queryPlansRequest = new QueryPlansRequest(
          merchantId              // 商户号
      );
      QueryPlansResponse queryPlansResponse = gongming.queryPlans(queryPlansRequest);
      logger.log(Level.INFO, "查询理财计划成功，返回理财计划" + queryPlansResponse.plans.size() + "个");

      Long planId = queryPlansResponse.plans.size() == 0 ? 1L : queryPlansResponse.plans.get(0).id;

      logger.log(Level.INFO, "理财计划申购");
      OrderRequest orderRequest = new OrderRequest(
          merchantId,             // 商户号
          userId,                 // 理财账户号
          "5.00",                 // 申购金额
          "11100003431",          // 商户请求ID
          planId                  // 计划ID
      );
      OrderResponse orderResponse = gongming.orderWithoutPayment(orderRequest);
      logger.log(Level.INFO, "理财计划申购成功，订单号" + orderResponse.orderId + "，" +
          "成功申购" + orderResponse.successAmount + "元");

      Long orderId = orderResponse.orderId;

      // 若上一个申购操作成功，查询订单状态
      logger.log(Level.INFO, "查询订单");
      QueryOrderRequest queryOrderRequest = new QueryOrderRequest(
          merchantId,            // 商户号
          orderId                // 订单号
      );
      QueryOrderResponse queryOrderResponse = gongming.queryOrder(queryOrderRequest);
      logger.log(Level.INFO, "订单查询成功，状态为" + queryOrderResponse.order.status.toString() + "");

      logger.log(Level.INFO, "按日期查询订单");
      QueryOrdersByDateRequest queryOrderByDateRequest = new QueryOrdersByDateRequest(
          merchantId,             // 商户号
          "2014-06-01",           // 范围开始日期
          "2014-12-31"            // 范围结束日期
      );
      QueryOrdersByDateResponse queryOrdersByDateResponse = gongming.queryOrderByDate(queryOrderByDateRequest);
      logger.log(Level.INFO, "按日期查询订单成功，共有" + queryOrdersByDateResponse.orders.size() + "个订单");

      logger.log(Level.INFO, "确认支付结果");
      ConfirmPaymentRequest confirmPaymentRequest = new ConfirmPaymentRequest(
          merchantId,             // 商户号
          orderId,                // 订单号
          true                    // 支付是否成功
      );
      ConfirmPaymentResponse confirmPaymentResponse = gongming.confirmPayment(confirmPaymentRequest);
      logger.log(Level.INFO, "确认支付结果成功");

      logger.log(Level.INFO, "查询订单收益");
      QueryOrdersByDateRequest.QueryOrderInterestRequest queryOrderInterestRequest = new QueryOrdersByDateRequest.QueryOrderInterestRequest(
          merchantId,             // 商户号
          orderId                 // 订单号
      );
      QueryOrderInterestResponse queryOrderInterestResponse = gongming.queryOrderInterest(queryOrderInterestRequest);
      logger.log(Level.INFO, "查询订单收益成功，当日收益" + queryOrderInterestResponse.dailyInterest + "元，" +
          "累计收益" + queryOrderInterestResponse.totalInterest + "元");

    } catch (GongmingConnectionException e) {
      logger.log(Level.INFO, "连接失败：" + e.toString());
    } catch (GongmingApplicationException e) {
      logger.log(Level.INFO, "后台处理异常：" + e.toString());
    }
  }
}
