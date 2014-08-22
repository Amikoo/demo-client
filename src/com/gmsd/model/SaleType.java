/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model;

/**
 * 销售方式的枚举类
 */
public enum SaleType {
  // 特别注意：此处序数将存入数据库，所以请勿改变已有元素的顺序！
  DISTRIBUTION("分销"),
  UNDERWRITTING("承销");

  private String name;

  SaleType(String name) {
    this.name = name;
  }

  public static SaleType build(String saleTypeStr) {
    switch(saleTypeStr) {
      case("分销"):
        return DISTRIBUTION;
      case("承销"):
        return UNDERWRITTING;
    }
    throw new IllegalArgumentException("错误的销售方式字符串{" + saleTypeStr + "}");
  }

  @Override
  public String toString() {
    return name;
  }
}