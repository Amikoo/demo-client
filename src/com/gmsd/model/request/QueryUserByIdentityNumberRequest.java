/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model.request;

/**
 * 查询理财账户的请求
 */
public class QueryUserByIdentityNumberRequest extends GMRequestBase {

  public QueryUserByIdentityNumberRequest(Long merchantId, String identityNumber) {
    this.merchantId = merchantId;
    this.identityNumber = identityNumber;
  }

  /**
   * 商户ID
   */
  public Long merchantId;

  /**
   * 理财账户的身份证号
   */
  public String identityNumber;

  @Override
  protected String toRawQuery() {
    return "merchantId=" + this.merchantId + "&" +
        "identityNumber=" + this.identityNumber + "&";
  }
}
