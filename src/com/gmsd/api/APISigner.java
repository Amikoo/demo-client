/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.api;

import org.apache.commons.codec.binary.Hex;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * 实现共鸣API的SHA256签名
 */
public class APISigner {

  private static final String HMAC_SHA256 = "HmacSHA256";

  public static String sign(String data, String key) throws InvalidKeyException {

    Mac sha256HMAC;
    try {
      sha256HMAC = Mac.getInstance(HMAC_SHA256);
    } catch (NoSuchAlgorithmException e) {
      return null;
    }

    SecretKeySpec secret_key = new SecretKeySpec(key.getBytes(), HMAC_SHA256);
    sha256HMAC.init(secret_key);

    return Hex.encodeHexString(sha256HMAC.doFinal(data.getBytes()));
  }
}

