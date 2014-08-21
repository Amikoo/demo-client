/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model.exception;

import org.springframework.http.HttpStatus;

/**
 * 连接异常
 */
public class GongmingConnectionException extends GongmingException {
  public HttpStatus httpStatus;

  public GongmingConnectionException(Exception e) {
    super(e);
  }

  public GongmingConnectionException(String message, Exception e) {
    super(message, e);
  }

  public GongmingConnectionException(HttpStatus status, Exception e) {
    super(e);
    this.httpStatus = status;
  }

  @Override
  public String toString() {
    return "GongmingConnectionException: httpStatus=" + httpStatus + ", message=" + this.getMessage();
  }
}
