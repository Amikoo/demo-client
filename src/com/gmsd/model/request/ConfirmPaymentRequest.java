/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model.request;

/**
 * 确认支付的请求
 */
public class ConfirmPaymentRequest extends GMRequestBase {

  /**
   * 商户号
   */
  public Long merchantId;

  /**
   * 订单号
   */
  public Long orderId;

  /**
   * 支付是否成功
   */
  public Boolean success;

  public ConfirmPaymentRequest(Long merchantId, Long orderId, Boolean success) {
    this.merchantId = merchantId;
    this.orderId = orderId;
    this.success = success;
  }

  @Override
  protected String toRawQuery() {
    return "merchantId=" + this.merchantId + "&" +
        "orderId=" + this.orderId + "&" +
        "success=" + this.success;
  }
}
