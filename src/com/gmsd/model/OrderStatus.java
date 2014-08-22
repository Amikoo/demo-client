/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model;

/**
 * 订单状态。
 */
public enum OrderStatus {
  CREATING(0, "下单中"),
  REQUESTED(1, "已下单"),
  FAILED(2, "下单失败"),
  PAID(3, "已支付"),
  FULFILLED(4, "已投标"),
  DELIVERED(5, "已放款"),
  FINISHED(6, "已还款结束");

  public int index;
  public String name;

  @Override
  public String toString() {
    return this.name;
  }

  OrderStatus(int index, String name) {
    this.index = index;
    this.name = name;
  }
}
