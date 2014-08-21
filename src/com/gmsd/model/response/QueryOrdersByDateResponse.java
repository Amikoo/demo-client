/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model.response;

import com.gmsd.model.Order;

import java.util.LinkedList;
import java.util.List;

/**
 * 按日期查询订单结果
 */
public class QueryOrdersByDateResponse extends GMResponseBase {
  /**
   * 订单列表
   */
  public List<Order> orders = new LinkedList<>();
}
