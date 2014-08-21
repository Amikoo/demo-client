/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model;

/**
 * 流量端产品的期限单位
 */
public enum DurationUnit {
  DAY("日", 0), //
  MONTH("月", 1);

  public String title;
  public int value;

  private DurationUnit(String title, int value) {
    this.title = title;
    this.value = value;
  }

  /**
   * 根据传入的int值转换成一个枚举值
   *
   * @param value 传入的int值
   * @return EnumValue
   */
  public static DurationUnit durationUnitFromValue(int value) {
    if (value == DurationUnit.DAY.value)
      return DAY;
    if (value == DurationUnit.MONTH.value)
      return MONTH;

    throw new IllegalArgumentException("不支持的日期单位数值");
  }
}
