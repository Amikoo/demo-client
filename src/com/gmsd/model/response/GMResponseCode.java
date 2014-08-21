/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model.response;

/**
 * 共鸣返回代码
 */
public enum GMResponseCode {

  COMMON_SUCCESS(0,                 "成功"),
  COMMON_ILLEGAL_PARAM(1,           "参数异常"),
  COMMON_SERVER_ERROR(2,            "系统异常"),

  USER_ALREADY_EXISTS(10001,        "用户已存在"),
  USER_NOT_EXISTS(10002,            "用户不存在"),
  USER_NOT_MATCH_ID_NUMBER(10003,   "用户身份证与姓名不匹配"),

  ORDER_ALREADY_EXISTS(11001,       "订单已存在"),
  ORDER_NOT_EXISTS(11002,           "订单不存在"),
  ORDER_EXPIRED(11003,              "订单已失效"), // E.g. 理财周期已结束

  PLAN_SOLD_OUT(12001,              "计划已售完"),

  PAYMENT_EXPIRED(13001,            "支付超时"),
  PAYMENT_ALREADY_CONFIRMED(13002,  "支付已确认过");

  private int value;
  private String info;

  private GMResponseCode(int value, String info) {
    this.value = value;
    this.info = info;
  }

  public String GetInfo() {
    return info;
  }

  @Override
  public String toString() {
    return "[" + Integer.toString(this.value) + "] " + info;
  }

}

