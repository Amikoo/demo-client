/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model;

/**
 * 流量端订单。
 */
public class Order {
  /**
   * Dummy constructor to enable Bean to construct an instance
   * from a JSON string. Otherwise, with only the constructor
   * below (有参数构造方法) as a default constructor, Bean would
   * fail to construct an instance from a JSON string.
   */
  public Order() {
  }

  /**
   * 有参数构造方法
   *
   * @param id            id
   * @param userId       购买人id
   * @param planId        计划id
   * @param merchantId    商户号
   * @param orderAmount   订单金额
   * @param successAmount 扣款金额
   * @param requestDate   生成日期
   * @param effectiveDate 生效日期
   * @param endDate       结束日期
   * @param status        订单状态
   */
  public Order(Long id,
               Long userId,
               Long planId,
               Long merchantId,
               String orderAmount,
               String successAmount,
               String requestDate,
               String effectiveDate,
               String endDate,
               OrderStatus status) {
    this.id = id;
    this.userId = userId;
    this.planId = planId;
    this.merchantId = merchantId;
    this.orderAmount = orderAmount;
    this.successAmount = successAmount;
    this.requestDate = requestDate;
    this.effectiveDate = effectiveDate;
    this.endDate = endDate;
    this.status = status;
  }

  /**
   * 订单id
   */
  public Long id;

  /**
   * 下单用户id
   */
  public Long userId;

  /**
   * 所购买的理财计划id
   */
  public Long planId;

  /**
   * 订单的商户号
   */
  public Long merchantId;

  /**
   * 下单金额
   */
  public String orderAmount;

  /**
   * 实际扣款金额
   */
  public String successAmount;

  /**
   * 下单时间 YYYY/MM/DD HH:mm:ss Z
   */
  public String requestDate;

  /**
   * 订单完成支付和满标后，实际生效时间 YYYY/MM/DD
   */
  public String effectiveDate;

  /**
   * 预期还款结束日期 YYYY/MM/DD HH:mm:ss Z
   */
  public String endDate;

  /**
   * 订单状态
   */
  public OrderStatus status;
}
