package com.ujuit.datamove.masterfuturesdailyposition.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_master_futures_daily_position", desc = "主账户根据ctp结算")
@GenModel(packageName = "com.ujuit.datamove.masterfuturesdailyposition", modelName = "masterfuturesdailyposition")
public class MasterFuturesDailyPositionPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "合约编号", column = "instrument_id", length = 20, isnull = false)
	private String instrumentId;

	@GenField(labelname = "经纪公司代码", column = "broker_id", length = 20, isnull = false)
	private String brokerId;

	@GenField(labelname = "母账户ID", column = "master_id", isnull = false)
	private Integer masterId;

	@GenField(labelname = "投资者代码", column = "investor_id", length = 20, isnull = false)
	private String investorId;

	@GenField(labelname = "持仓多空方向 2是多 3是空", column = "pos_drection", length = 1, isnull = false)
	private String posDrection;

	@GenField(labelname = "", column = "create_time", isnull = true)
	private Date createTime;

	@GenField(labelname = "", column = "hedge_flag", length = 1, isnull = false)
	private String hedgeFlag;

	@GenField(labelname = " 持仓日期历史持仓 2", column = "position_date", length = 1, isnull = false)
	private String positionDate;

	@GenField(labelname = "上日持仓", column = "yd_position", isnull = false)
	private Integer ydPosition;

	@GenField(labelname = "持仓数量", column = "position", isnull = false)
	private Integer position;

	@GenField(labelname = "多头冻结", column = "long_frozen", isnull = false)
	private Integer longFrozen;

	@GenField(labelname = "空头冻结", column = "short_frozen", isnull = false)
	private Integer shortFrozen;

	@GenField(labelname = "开仓冻结金额", column = "long_frozen_amount", isnull = false)
	private Double longFrozenAmount;

	@GenField(labelname = "开仓冻结金额", column = "short_frozen_amount", isnull = false)
	private Double shortFrozenAmount;

	@GenField(labelname = "开仓数量", column = "open_volume", isnull = false)
	private Double openVolume;

	@GenField(labelname = "平仓数量", column = "close_volume", isnull = true)
	private Integer closeVolume;

	@GenField(labelname = "平仓金额", column = "close_amount", isnull = true)
	private Double closeAmount;

	@GenField(labelname = "开仓金额", column = "open_amount", isnull = true)
	private Double openAmount;

	@GenField(labelname = "持仓成本", column = "position_cost", isnull = true)
	private Double positionCost;

	@GenField(labelname = "", column = "use_margin", isnull = true)
	private Double useMargin;

	@GenField(labelname = "冻结的保证金", column = "frozen_margin", isnull = true)
	private Double frozenMargin;

	@GenField(labelname = "冻结资金", column = "frozen_cash", isnull = true)
	private Double frozenCash;

	@GenField(labelname = "冻结的手续费", column = "frozen_commission", isnull = true)
	private Double frozenCommission;

	@GenField(labelname = "资金差额", column = "cash_in", isnull = true)
	private Double cashIn;

	@GenField(labelname = "手续费", column = "commission", isnull = true)
	private Double commission;

	@GenField(labelname = "平仓盈亏", column = "close_profit", isnull = true)
	private Double closeProfit;

	@GenField(labelname = "持仓盈亏", column = "position_profit", isnull = true)
	private Double positionProfit;

	@GenField(labelname = "上一次结算价", column = "pre_settlement_price", isnull = true)
	private Double preSettlementPrice;

	@GenField(labelname = "结算价", column = "settlement_price", isnull = true)
	private Double settlementPrice;

	@GenField(labelname = "", column = "trading_day", isnull = true)
	private Date tradingDay;

	@GenField(labelname = "结算编号", column = "settlement_id", isnull = true)
	private Integer settlementId;

	@GenField(labelname = " 开仓成本", column = "open_cost", isnull = true)
	private Double openCost;

	@GenField(labelname = "交易所保证金", column = "exchange_margin", isnull = true)
	private Double exchangeMargin;

	@GenField(labelname = "组合成交形成的持仓", column = "comb_position", isnull = true)
	private Integer combPosition;

	@GenField(labelname = "组合多头冻结", column = "comb_long_frozen", isnull = true)
	private Integer combLongFrozen;

	@GenField(labelname = "", column = "comb_short_frozen", isnull = true)
	private Integer combShortFrozen;

	@GenField(labelname = "逐日盯市平仓盈亏", column = "close_profit_by_date", isnull = true)
	private Double closeProfitByDate;

	@GenField(labelname = "逐笔对冲平仓盈亏", column = "close_profit_by_trade", isnull = true)
	private Double closeProfitByTrade;

	@GenField(labelname = "今日持仓", column = "today_position", isnull = true)
	private Integer todayPosition;

	@GenField(labelname = "保证金率", column = "margin_rate_by_money", isnull = true)
	private Double marginRateByMoney;

	@GenField(labelname = "保证金率(按手数)", column = "margin_rate_by_volume", isnull = true)
	private Integer marginRateByVolume;

	@GenField(labelname = " 执行冻结", column = "strike_frozen", isnull = true)
	private Integer strikeFrozen;

	@GenField(labelname = "执行冻结金额", column = "strike_frozen_amount", isnull = true)
	private Double strikeFrozenAmount;

	@GenField(labelname = "放弃执行冻结", column = "abandon_frozen", isnull = true)
	private Integer abandonFrozen;

	@GenField(labelname = "0,正常 1，待补单，2，待结算,3已结算", column = "fix_status", length = 1, isnull = true)
	private String fixStatus;

	@GenField(labelname = "记录的日期", column = "his_date", isnull = true)
	private Date hisDate;

	@GenField(labelname = "", column = "cost", isnull = true)
	private BigDecimal cost;

}