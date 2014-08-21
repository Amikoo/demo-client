/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model.response;

import com.gmsd.model.Order;

/**
 * 查询订单结果
 */
public class QueryOrderResponse extends GMResponseBase {
  /**
   * 订单
   */
  public Order order;
}