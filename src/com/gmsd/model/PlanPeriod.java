/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model;

/**
 * 产品的期限
 */
public class PlanPeriod {
  public Long id;

  /** 时间数 **/
  public int numOfUnits;

  /** 期限单位 **/
  public PlanMaturityUnit unit;

  public PlanPeriod() {
  }

  public PlanPeriod(int numOfUnits, PlanMaturityUnit unit) {
    this.unit = unit;
    this.numOfUnits = numOfUnits;
  }

  @Override
  public String toString() {
    return "" + numOfUnits + unit;
  }
}
