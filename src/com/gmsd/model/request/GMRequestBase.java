/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model.request;

import com.gmsd.api.APISigner;

import java.security.InvalidKeyException;

/**
 * 共鸣API参数的共有接口
 */
public class GMRequestBase {

  public static final String API_KEY_SIGNATURE = "signature";

  protected String toRawQuery() { return ""; }

  protected String appendSignature(String path, String query, String merchantSecret) throws InvalidKeyException {
    String signature = APISigner.sign(path + "?" + query, merchantSecret);
    return query + "&" + API_KEY_SIGNATURE + "=" + signature;
  }

  public String toQuery(String path, String merchantSecret) throws InvalidKeyException {
    return appendSignature(path, toRawQuery(), merchantSecret);
  }
}
