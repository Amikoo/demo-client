/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model.request;

public class QueryPlansRequest extends GMRequestBase {

  /**
   * 商户号
   */
  Long merchantId;

  public QueryPlansRequest(Long merchantId) {
    this.merchantId = merchantId;
  }

  @Override
  protected String toRawQuery() {
    return "merchantId=" + this.merchantId;
  }
}
