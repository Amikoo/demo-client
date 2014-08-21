/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model;

/**
 * 产品的期限单位
 */
public enum PlanMaturityUnit {
  DAY("日", 0),
  MONTH("月", 1);

  public String title;
  public int value;

  private PlanMaturityUnit(String title, int value) {
    this.title = title;
    this.value = value;
  }

  @Override
  public String toString() {
    return title;
  }
}
