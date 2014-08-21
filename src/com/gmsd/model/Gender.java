/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model;

/**
 * 性别的枚举类
 */
public enum Gender {
  MALE(1),
  FEMALE(2);

  private static final String MALE_DESC = "男";
  private int index;

  Gender(int index) {
    this.index = index;
  }

  public static Gender buildGender(String genderStr) {
    return genderStr.equals(MALE_DESC) ? MALE : FEMALE;
  }
}
