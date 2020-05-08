package com.ujuit.datamove.hissettle.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_his_settle", desc = "主账户历史资金纪录 ")
@GenModel(packageName = "com.ujuit.datamove.hissettle", modelName = "hissettle")
public class HisSettlePojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "id", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "子账户id", column = "sub_account_id", isnull = true)
	private Integer subAccountId;

	@GenField(labelname = "类型(1股票 2期货)", column = "type", isnull = true)
	private Integer type;

	@GenField(labelname = "结算日期", column = "his_date", isnull = true)
	private Date hisDate;

	@GenField(labelname = "初始权益", column = "init_equity", isnull = true)
	private BigDecimal initEquity;

	@GenField(labelname = "持仓盈亏", column = "position_profit", isnull = true)
	private BigDecimal positionProfit;

	@GenField(labelname = "出入金(入金)", column = "deal_glod", isnull = true)
	private BigDecimal dealGlod;

	@GenField(labelname = "账号权益", column = "total_assets", isnull = true)
	private BigDecimal totalAssets;

	@GenField(labelname = "平仓盈亏", column = "offset_profit", isnull = true)
	private BigDecimal offsetProfit;

	@GenField(labelname = "手续费", column = "cost", isnull = true)
	private BigDecimal cost;

	@GenField(labelname = "可用资金", column = "surplus_amount", isnull = true)
	private BigDecimal surplusAmount;

	@GenField(labelname = "可取资金", column = "cash_amount", isnull = true)
	private BigDecimal cashAmount;

	@GenField(labelname = "用户资金", column = "user_amount", isnull = true)
	private BigDecimal userAmount;

	@GenField(labelname = "安全度", column = "safety_level", isnull = true)
	private BigDecimal safetyLevel;

	@GenField(labelname = "风险度", column = "risk_level", isnull = true)
	private BigDecimal riskLevel;

	@GenField(labelname = "(出入金)出金", column = "out_deal_glod", isnull = true)
	private BigDecimal outDealGlod;

	@GenField(labelname = "成本", column = "capital_amount", isnull = true)
	private BigDecimal capitalAmount;

	@GenField(labelname = "当日结存", column = "amount", isnull = true)
	private BigDecimal amount;

	@GenField(labelname = "", column = "create_time", isnull = true)
	private Date createTime;

	@GenField(labelname = "期初结存（上一日结算后总资产）", column = "pre_assets", isnull = true)
	private BigDecimal preAssets;

	@GenField(labelname = "", column = "net_worth", isnull = true)
	private BigDecimal netWorth;

	@GenField(labelname = "", column = "parts", isnull = true)
	private BigDecimal parts;

}