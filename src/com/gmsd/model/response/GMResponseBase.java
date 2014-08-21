/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model.response;

import java.text.SimpleDateFormat;

/**
 * 共鸣接口返回代码与错误信息
 */
public class GMResponseBase {
  /**
   * 共鸣使用的日期格式
   */
  public static SimpleDateFormat dateFormatTime = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss Z");
  public static SimpleDateFormat dateFormatDay = new SimpleDateFormat("YYYY-MM-dd");
  /**
   * 返回代码
   */
  public GMResponseCode code;

  /**
   * 错误信息
   */
  public String errorMessage;

  @Override
  public String toString() {
    return code.toString() + ":" + errorMessage;
  }

}

