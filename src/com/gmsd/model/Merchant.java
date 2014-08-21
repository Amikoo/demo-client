/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model;

/**
 * 理财商户
 */
public class Merchant {

  public Merchant() {
  }

  /**
   * 有参数的构造方法
   *
   * @param id id
   * @param name 名称
   * @param email 邮箱
   * @param phoneNumber 手机号
   * @param address 地址
   */
  public Merchant(Long id,
                  String name,
                  String email,
                  String phoneNumber,
                  String address,
                  String privateKey) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.address = address;
    this.privateKey = privateKey;
  }

  public Long id;

  /** 商户名称 */
  public String name;

  /** 电子邮件地址 */
  public String email;

  /** 电话号码 */
  public String phoneNumber;

  /** 地址 */
  public String address;

  /** 私有密钥 */
  public String privateKey;
}
