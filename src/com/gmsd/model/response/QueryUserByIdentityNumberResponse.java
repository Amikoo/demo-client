/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model.response;


import com.gmsd.model.User;

/**
 * 用户相关的响应
 */
public class QueryUserByIdentityNumberResponse extends GMResponseBase {

  /**
   * 返回的理财用户
   */
  public User user;
}
