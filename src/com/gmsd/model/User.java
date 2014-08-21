/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model;

/**
 * 理财账户
 */
public class User {

  /**
   * 构造方法
   *
   * @param id                 id
   * @param identityCardNumber 身份证号
   * @param name               用户姓名
   * @param phoneNumber        手机号
   * @param nickname           昵称
   * @param gender             性别
   * @param address            地址
   * @param educationLevel     教育程度
   */
  public User(Long id, String identityCardNumber, String name, String phoneNumber, String nickname, Gender gender, String address, String educationLevel) {
    this.id = id;
    this.identityCardNumber = identityCardNumber;
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.nickname = nickname;
    this.gender = gender;
    this.address = address;
    this.educationLevel = educationLevel;
  }

  /**
   * 默认的构造方法
   */
  public User() {

  }

  public Long id;

  /**
   * 身份证号码
   */
  public String identityCardNumber;

  /**
   * 姓名
   */
  public String name;

  /**
   * 商户ID
   */
  public Long merchantId;

  /**
   * 电话号码
   */
  public String phoneNumber;

  /**
   * 电子邮箱
   */
  public String email;

  /**
   * 昵称
   */
  public String nickname;

  /**
   * 性别
   */
  public Gender gender;

  /**
   * 地址
   */
  public String address;

  /**
   * 受教育程度
   */
  public String educationLevel;

  /**
   * 创建时间
   */
  public Long createTimestamp;

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", identityCardNumber='" + identityCardNumber + '\'' +
        ", name='" + name + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", nickname='" + nickname + '\'' +
        ", gender=" + gender +
        ", address='" + address + '\'' +
        ", educationLevel='" + educationLevel + '\'' +
        ", createTimestamp='" + createTimestamp + "'" +
        '}';
  }
}
