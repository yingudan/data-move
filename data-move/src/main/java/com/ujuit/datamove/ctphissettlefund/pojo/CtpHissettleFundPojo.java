package com.ujuit.datamove.ctphissettlefund.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_ctp_hissettle_fund", desc = "主账户根据ctp结算")
@GenModel(packageName = "com.ujuit.datamove.ctphissettlefund", modelName = "ctphissettlefund")
public class CtpHissettleFundPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "", column = "master_id", isnull = true)
	private Integer masterId;

	@GenField(labelname = "", column = "his_date", isnull = true)
	private Date hisDate;

	@GenField(labelname = "", column = "create_time", isnull = true)
	private Date createTime;

	@GenField(labelname = "上一日总资产 ，期初结存 Balance b/f：", column = "pre_balance", isnull = true)
	private BigDecimal preBalance;

	@GenField(labelname = "", column = "deposit_withdrawal", isnull = true)
	private BigDecimal depositWithdrawal;

	@GenField(labelname = "期末总资产", column = "end_balance", isnull = true)
	private BigDecimal endBalance;

	@GenField(labelname = "总资产/客户权益", column = "balance", isnull = true)
	private BigDecimal balance;

	@GenField(labelname = "持仓盯市盈亏 MTM P/L", column = "today_profit", isnull = true)
	private BigDecimal todayProfit;

	@GenField(labelname = "平仓盈亏", column = "realized", isnull = true)
	private BigDecimal realized;

	@GenField(labelname = "手续费", column = "commission", isnull = true)
	private BigDecimal commission;

	@GenField(labelname = "占用保证金", column = "margin_occupied", isnull = true)
	private BigDecimal marginOccupied;

	@GenField(labelname = "行权手续费", column = "exercise_fee", isnull = true)
	private BigDecimal exerciseFee;

	@GenField(labelname = "交割保证金", column = "delivery_margin", isnull = true)
	private BigDecimal deliveryMargin;

	@GenField(labelname = "交割手续费", column = "delivery_fee", isnull = true)
	private BigDecimal deliveryFee;

	@GenField(labelname = "市值权益 Market value(equity)", column = "market_equity", isnull = true)
	private BigDecimal marketEquity;

	@GenField(labelname = "可用金额", column = "fund_avail", isnull = true)
	private BigDecimal fundAvail;

	@GenField(labelname = "净值", column = "net_worth", isnull = true)
	private BigDecimal netWorth;

	@GenField(labelname = "份数", column = "parts", isnull = true)
	private BigDecimal parts;

	@GenField(labelname = "当日盈亏", column = "profit", isnull = true)
	private BigDecimal profit;

	@GenField(labelname = "总盈亏", column = "profit_total", isnull = true)
	private BigDecimal profitTotal;

	@GenField(labelname = "当日盈亏率", column = "profit_rate", isnull = true)
	private BigDecimal profitRate;

	@GenField(labelname = "总盈亏率", column = "profit_total_rate", isnull = true)
	private BigDecimal profitTotalRate;

	@GenField(labelname = "成本", column = "capital_amount", isnull = true)
	private BigDecimal capitalAmount;

}