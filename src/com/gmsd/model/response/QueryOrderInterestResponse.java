/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model.response;

/**
 * 查询订单收益结果
 */
public class QueryOrderInterestResponse extends GMResponseBase {
  /**
   * 当日收益
   */
  public String dailyInterest;

  /**
   * 累计收益
   */
  public String totalInterest;

  /**
   * 手续费率
   */
  public String fee;
}
