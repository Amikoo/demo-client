/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model.request;

/**
 * 理财账户注册的请求参数
 */
public class CreateUserRequest extends GMRequestBase {
  /**
   * 商户号
   */
  public Long merchantId;

  /**
   * 用户手机号
   */
  public String userPhoneNumber;

  /**
   * 用户身份证号
   */
  public String userIdentityNumber;

  /**
   * 用户姓名
   */
  public String userName;

  /**
   * constructor
   *
   * @param merchantId         商户号
   * @param userPhoneNumber    手机号
   * @param userIdentityNumber 身份证号
   * @param userName           用户姓名
   */
  public CreateUserRequest(Long merchantId, String userPhoneNumber, String userIdentityNumber, String userName) {
    this.merchantId = merchantId;
    this.userPhoneNumber = userPhoneNumber;
    this.userIdentityNumber = userIdentityNumber;
    this.userName = userName;
  }

  @Override
  protected String toRawQuery() {
    return "merchantId=" + this.merchantId + "&" +
        "userPhoneNumber=" + this.userPhoneNumber + "&" +
        "userIdentityNumber=" + this.userIdentityNumber + "&" +
        "userName=" + this.userName;
  }
}
