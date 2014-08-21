/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model.request;

/**
 * 订单
 */
public class OrderRequest extends GMRequestBase {

  /**
   * 商户号
   */
  public Long merchantId;

  /**
   * 理财账户ID
   */
  public Long userId;

  /**
   * 订单金额
   */
  public String orderAmount;

  /**
   * 商户请求ID
   */
  public String merchantRequestId;

  /**
   * 理财计划ID
   */
  public Long planId;

  public OrderRequest(Long merchantId, Long userId, String orderAmount, String merchantRequestId, Long planId) {
    this.merchantId = merchantId;
    this.userId = userId;
    this.orderAmount = orderAmount;
    this.merchantRequestId = merchantRequestId;
    this.planId = planId;
  }

  @Override
  protected String toRawQuery() {
    return "merchantId=" + this.merchantId + "&" +
        "userId=" + this.userId + "&" +
        "orderAmount=" + this.orderAmount + "&" +
        "merchantRequestId=" + this.merchantRequestId + "&" +
        "planId=" + this.planId;
  }
}
