/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package com.gmsd.model.response;

import com.gmsd.model.Plan;

import java.util.LinkedList;
import java.util.List;

/**
 * 查询计划返回结果
 */
public class QueryPlansResponse extends GMResponseBase {
  public List<Plan> plans = new LinkedList<>();
}

