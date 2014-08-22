/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model;

/**
 * 理财计划状态
 */
public enum PlanStatus {

  // 特别注意：此处序数将存入数据库，所以请勿改变已有元素的顺序！
  LOAN_NOTE_IMPORT(0, "待导入债权"),
  UNDER_AUDIT(1, "债权待审核"),
  READY_FOR_SALE(2, "待上线"),
  ON_SALE(3, "发售中"),
  SOLD_OUT(4, "售罄"),
  LOCKED(5, "锁定中"),
  FINISHED(6, "完成"),
  CANCELED(7, "取消");

  public int code;
  public String description;

  @Override
  public String toString() {
    return this.description;
  }

  private PlanStatus(int code, String description) {
    this.code = code;
    this.description = description;
  }

  public static PlanStatus fromInt(int code) {
    for (PlanStatus status : PlanStatus.values()) {
      if (status.code == code) {
        return status;
      }
    }
    return null;
  }
}
