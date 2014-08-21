/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model.request;

/**
 * 查询订单请求
 */
public class QueryOrderRequest extends GMRequestBase {
  /**
   * 商户号
   */
  Long merchantId;
  /**
   * 订单号
   */
  Long orderId;

  public QueryOrderRequest(Long merchantId, Long orderId) {
    this.merchantId = merchantId;
    this.orderId = orderId;
  }

  @Override
  public String toRawQuery() {
    return "merchantId=" + this.merchantId + "&" +
        "orderId=" + this.orderId;
  }
}
