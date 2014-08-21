/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model.exception;

/**
 * 共鸣SDK所有异常的基类
 */
public class GongmingException extends Exception {

  public GongmingException(Exception e) {
    super(e);
  }

  public GongmingException(String message) { super(message); }

  public GongmingException(String message, Exception e) {
    super(message, e);
  }

}
