/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model.request;

public class QueryOrdersByDateRequest extends GMRequestBase {

  public Long merchantId;
  public String startDate;
  public String endDate;

  public QueryOrdersByDateRequest(Long merchantId, String dateStart, String dateEnd) {
    this.merchantId = merchantId;
    this.startDate = dateStart;
    this.endDate = dateEnd;
  }

  @Override
  public String toRawQuery() {
    return "merchantId=" + this.merchantId + "&" +
        "startDate=" + this.startDate + "&" +
        "endDate=" + this.endDate;
  }

  public static class QueryOrderInterestRequest extends GMRequestBase {

    public Long merchantId;
    public Long orderId;

    public QueryOrderInterestRequest(Long merchantId, Long orderId) {
      this.merchantId = merchantId;
      this.orderId = orderId;
    }

    @Override
    protected String toRawQuery() {
      return "merchantId=" + this.merchantId + "&" +
          "orderId=" + this.orderId;
    }
  }
}
