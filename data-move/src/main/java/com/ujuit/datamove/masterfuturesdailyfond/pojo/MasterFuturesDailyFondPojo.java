package com.ujuit.datamove.masterfuturesdailyfond.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_master_futures_daily_fond", desc = "主账户委托信息")
@GenModel(packageName = "com.ujuit.datamove.masterfuturesdailyfond", modelName = "masterfuturesdailyfond")
public class MasterFuturesDailyFondPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "主账号ID", column = "master_id", isnull = true)
	private Integer masterId;

	@GenField(labelname = "上次质押金额", column = "pre_mortgage", isnull = true)
	private BigDecimal preMortgage;

	@GenField(labelname = "上次信用额度", column = "pre_credit", isnull = true)
	private BigDecimal preCredit;

	@GenField(labelname = "上次存款额", column = "pre_deposit", isnull = true)
	private BigDecimal preDeposit;

	@GenField(labelname = "上次结算准备金", column = "pre_balance", isnull = true)
	private BigDecimal preBalance;

	@GenField(labelname = "上次占用的保证金", column = "pre_margin", isnull = true)
	private BigDecimal preMargin;

	@GenField(labelname = "利息基数", column = "interest_base", isnull = true)
	private BigDecimal interestBase;

	@GenField(labelname = "利息收入", column = "interest", isnull = true)
	private BigDecimal interest;

	@GenField(labelname = " 入金金额", column = "deposit", isnull = true)
	private BigDecimal deposit;

	@GenField(labelname = "出金金额", column = "withdraw", isnull = true)
	private BigDecimal withdraw;

	@GenField(labelname = "冻结的保证金", column = "frozen_margin", isnull = true)
	private BigDecimal frozenMargin;

	@GenField(labelname = "冻结的资金", column = "frozen_cash", isnull = true)
	private BigDecimal frozenCash;

	@GenField(labelname = "冻结的手续费", column = "frozen_commission", isnull = true)
	private BigDecimal frozenCommission;

	@GenField(labelname = "当前保证金总额", column = "curr_margin", isnull = true)
	private BigDecimal currMargin;

	@GenField(labelname = "资金差额", column = "cash_in", isnull = true)
	private BigDecimal cashIn;

	@GenField(labelname = "手续费", column = "commission", isnull = true)
	private BigDecimal commission;

	@GenField(labelname = "平仓盈亏", column = "close_profit", isnull = true)
	private BigDecimal closeProfit;

	@GenField(labelname = "持仓盈亏", column = "position_profit", isnull = true)
	private BigDecimal positionProfit;

	@GenField(labelname = "期货结算准备金", column = "balance", isnull = true)
	private BigDecimal balance;

	@GenField(labelname = "可用资金", column = "available", isnull = true)
	private BigDecimal available;

	@GenField(labelname = "可取资金", column = "withdraw_quota", isnull = true)
	private BigDecimal withdrawQuota;

	@GenField(labelname = "基本准备金", column = "reserve", isnull = true)
	private BigDecimal reserve;

	@GenField(labelname = "交易日", column = "trading_day", length = 10, isnull = true)
	private String tradingDay;

	@GenField(labelname = " 结算编号", column = "settlement_id", isnull = true)
	private Integer settlementId;

	@GenField(labelname = "信用额度", column = "credit", isnull = true)
	private BigDecimal credit;

	@GenField(labelname = "质押金额", column = "mortgage", isnull = true)
	private BigDecimal mortgage;

	@GenField(labelname = "交易所保证金", column = "exchange_margin", isnull = true)
	private BigDecimal exchangeMargin;

	@GenField(labelname = "投资者交割保证金", column = "delivery_margin", isnull = true)
	private BigDecimal deliveryMargin;

	@GenField(labelname = "交易所交割保证金", column = "exchange_delivery_margin", isnull = true)
	private BigDecimal exchangeDeliveryMargin;

	@GenField(labelname = "保底期货结算准备金", column = "reserve_balance", isnull = true)
	private BigDecimal reserveBalance;

	@GenField(labelname = "币种代码", column = "currency_id", length = 20, isnull = true)
	private String currencyId;

	@GenField(labelname = "上次货币质入金额", column = "pre_fund_mortgage_in", isnull = true)
	private BigDecimal preFundMortgageIn;

	@GenField(labelname = "上次货币质出金额", column = "pre_fund_mortgage_out", isnull = true)
	private BigDecimal preFundMortgageOut;

	@GenField(labelname = "货币质入金额", column = "fund_mortgage_in", isnull = true)
	private BigDecimal fundMortgageIn;

	@GenField(labelname = "货币质出金额", column = "fund_mortgage_out", isnull = true)
	private BigDecimal fundMortgageOut;

	@GenField(labelname = "货币质押余额", column = "fund_mortgage_available", isnull = true)
	private BigDecimal fundMortgageAvailable;

	@GenField(labelname = "可质押货币金额", column = "mortgageable_fund", isnull = true)
	private BigDecimal mortgageableFund;

	@GenField(labelname = "特殊产品占用保证金", column = "spec_product_margin", isnull = true)
	private BigDecimal specProductMargin;

	@GenField(labelname = "特殊产品冻结保证金", column = "spec_product_frozen_margin", isnull = true)
	private BigDecimal specProductFrozenMargin;

	@GenField(labelname = "特殊产品手续费", column = "spec_product_commission", isnull = true)
	private BigDecimal specProductCommission;

	@GenField(labelname = "特殊产品冻结手续费", column = "spec_product_frozen_commission", isnull = true)
	private BigDecimal specProductFrozenCommission;

	@GenField(labelname = "特殊产品持仓盈亏", column = "spec_product_position_profit", isnull = true)
	private BigDecimal specProductPositionProfit;

	@GenField(labelname = "特殊产品平仓盈亏", column = "spec_product_close_profit", isnull = true)
	private BigDecimal specProductCloseProfit;

	@GenField(labelname = "根据持仓盈亏算法计算的特殊产品持仓盈亏", column = "spec_product_position_profit_by_alg", isnull = true)
	private BigDecimal specProductPositionProfitByAlg;

	@GenField(labelname = " 特殊产品交易所保证金", column = "spec_product_exchange_margin", isnull = true)
	private BigDecimal specProductExchangeMargin;

	@GenField(labelname = "记录的日期", column = "his_date", isnull = true)
	private Date hisDate;

	@GenField(labelname = "初始权益", column = "init_equity", isnull = true)
	private BigDecimal initEquity;

	@GenField(labelname = "成本", column = "capital_amount", isnull = true)
	private BigDecimal capitalAmount;

	@GenField(labelname = "0,未结算1，是已经结算", column = "settlement_type", isnull = true)
	private Short settlementType;

	@GenField(labelname = "出入金总和", column = "deposit_withdrawal", isnull = true)
	private BigDecimal depositWithdrawal;

}