/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model.exception;

/**
 * 逻辑异常
 */
public class GongmingApplicationException extends GongmingException {
  public String code;

  public GongmingApplicationException(Exception e) {
    super(e);
  }

  public GongmingApplicationException(String message, Exception e) {
    super(message, e);
  }

  public GongmingApplicationException(String code, String message) {
    super(message);
    this.code = code;
  }

  public GongmingApplicationException(String code, String message, Exception e) {
    super(message, e);
    this.code = code;
  }

  @Override
  public String toString() {
    return "GongmingApplicationException: code=" + this.code + ", message=" + this.getMessage();
  }
}
