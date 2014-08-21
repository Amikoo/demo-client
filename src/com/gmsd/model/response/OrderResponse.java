/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model.response;

/**
 * 下单结果，包含以下字段：
 */
public class OrderResponse extends GMResponseBase {
  /**
   * 订单号
   */
  public Long orderId;

  /**
   * 成功申购金额
   */
  public String successAmount;

  @Override
  public String toString() {
    return "code=" + this.code + ", " +
        "errorMessage=" + this.errorMessage + ", " +
        "orderId=" + this.orderId + ", " +
        "successAmount=" + this.successAmount;
  }
}
