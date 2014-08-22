/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model;

/**
 * 理财计划。
 */
public class Plan {
  /**
   * 计划ID
   */
  public Long id;

  /**
   * 计划名称
   */
  public String name;

  /**
   * 详细描述
   */
  public String description;

  /**
   * 产品到期数字
   */
  public Integer maturityDuration;

  /**
   * 产品到期单位
   */
  public DurationUnit maturityUnit;

  /**
   * 基础锁定期数字
   */
  public Integer lockDuration;

  /**
   * 基础锁定期单位
   */
  public DurationUnit lockUnit;

  /**
   * 预计最小年化收益
   */
  public String minInterest;

  /**
   * 预计最大年化收益
   */
  public String maxInterest;


  /**
   * 加入额度的下限 （0表示没有限制）
   */
  public String minAmount;

  /**
   * 加入额度的上限 （0表示没有限制）
   */
  public String maxAmount;

  /**
   * 加入额度的基数 （0表示没有限制）
   */
  public String baseAmount;

  /**
   * 计划总额度
   */
  public String totalAmount;

  /**
   * 计划剩余可卖额度
   */
  public String remainingAmount;

  /**
   * 已确认付款额度
   */
  public String paidAmount;

  /**
   * 创建时间
   */
  public Long createTimestamp;

  /**
   * 计划类别
   */
  public PlanType type;

  /**
   * 计划状态
   */
  public PlanStatus status;

  /**
   * 销售方式
   */
  public SaleType saleType;
}
