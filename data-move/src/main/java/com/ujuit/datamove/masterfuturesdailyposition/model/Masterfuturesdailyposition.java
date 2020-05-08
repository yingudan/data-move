package com.ujuit.datamove.masterfuturesdailyposition.model;

import java.math.BigDecimal;
import java.util.*;

/**
 * 主账户根据ctp结算
 * 
 * @author shadow
 */
public class Masterfuturesdailyposition {
	/**
	 *
	 */
	private Integer id;
	/**
	 * 合约编号
	 */
	private String instrumentId;
	/**
	 * 经纪公司代码
	 */
	private String brokerId;
	/**
	 * 母账户ID
	 */
	private Integer masterId;
	/**
	 * 投资者代码
	 */
	private String investorId;
	/**
	 * 持仓多空方向 2是多 3是空
	 */
	private String posDrection;
	/**
	 *
	 */
	private Date createTime;
	/**
	 *
	 */
	private String hedgeFlag;
	/**
	 * 持仓日期历史持仓 2
	 */
	private String positionDate;
	/**
	 * 上日持仓
	 */
	private Integer ydPosition;
	/**
	 * 持仓数量
	 */
	private Integer position;
	/**
	 * 多头冻结
	 */
	private Integer longFrozen;
	/**
	 * 空头冻结
	 */
	private Integer shortFrozen;
	/**
	 * 开仓冻结金额
	 */
	private Double longFrozenAmount;
	/**
	 * 开仓冻结金额
	 */
	private Double shortFrozenAmount;
	/**
	 * 开仓数量
	 */
	private Double openVolume;
	/**
	 * 平仓数量
	 */
	private Integer closeVolume;
	/**
	 * 平仓金额
	 */
	private Double closeAmount;
	/**
	 * 开仓金额
	 */
	private Double openAmount;
	/**
	 * 持仓成本
	 */
	private Double positionCost;
	/**
	 *
	 */
	private Double useMargin;
	/**
	 * 冻结的保证金
	 */
	private Double frozenMargin;
	/**
	 * 冻结资金
	 */
	private Double frozenCash;
	/**
	 * 冻结的手续费
	 */
	private Double frozenCommission;
	/**
	 * 资金差额
	 */
	private Double cashIn;
	/**
	 * 手续费
	 */
	private Double commission;
	/**
	 * 平仓盈亏
	 */
	private Double closeProfit;
	/**
	 * 持仓盈亏
	 */
	private Double positionProfit;
	/**
	 * 上一次结算价
	 */
	private Double preSettlementPrice;
	/**
	 * 结算价
	 */
	private Double settlementPrice;
	/**
	 *
	 */
	private Date tradingDay;
	/**
	 * 结算编号
	 */
	private Integer settlementId;
	/**
	 * 开仓成本
	 */
	private Double openCost;
	/**
	 * 交易所保证金
	 */
	private Double exchangeMargin;
	/**
	 * 组合成交形成的持仓
	 */
	private Integer combPosition;
	/**
	 * 组合多头冻结
	 */
	private Integer combLongFrozen;
	/**
	 *
	 */
	private Integer combShortFrozen;
	/**
	 * 逐日盯市平仓盈亏
	 */
	private Double closeProfitByDate;
	/**
	 * 逐笔对冲平仓盈亏
	 */
	private Double closeProfitByTrade;
	/**
	 * 今日持仓
	 */
	private Integer todayPosition;
	/**
	 * 保证金率
	 */
	private Double marginRateByMoney;
	/**
	 * 保证金率(按手数)
	 */
	private Integer marginRateByVolume;
	/**
	 * 执行冻结
	 */
	private Integer strikeFrozen;
	/**
	 * 执行冻结金额
	 */
	private Double strikeFrozenAmount;
	/**
	 * 放弃执行冻结
	 */
	private Integer abandonFrozen;
	/**
	 * 0,正常 1，待补单，2，待结算,3已结算
	 */
	private String fixStatus;
	/**
	 * 记录的日期
	 */
	private Date hisDate;
	/**
	 *
	 */
	private BigDecimal cost;

	/** 
	 *
	 */
	public Integer getId() {
		return id;
	}

	/** 
	 *
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 合约编号
	 */
	public String getInstrumentId() {
		return instrumentId;
	}

	/**
	 * 合约编号
	 */
	public void setInstrumentId(String instrumentId) {
		this.instrumentId = instrumentId;
	}

	/**
	 * 经纪公司代码
	 */
	public String getBrokerId() {
		return brokerId;
	}

	/**
	 * 经纪公司代码
	 */
	public void setBrokerId(String brokerId) {
		this.brokerId = brokerId;
	}

	/**
	 * 母账户ID
	 */
	public Integer getMasterId() {
		return masterId;
	}

	/**
	 * 母账户ID
	 */
	public void setMasterId(Integer masterId) {
		this.masterId = masterId;
	}

	/**
	 * 投资者代码
	 */
	public String getInvestorId() {
		return investorId;
	}

	/**
	 * 投资者代码
	 */
	public void setInvestorId(String investorId) {
		this.investorId = investorId;
	}

	/**
	 * 持仓多空方向 2是多 3是空
	 */
	public String getPosDrection() {
		return posDrection;
	}

	/**
	 * 持仓多空方向 2是多 3是空
	 */
	public void setPosDrection(String posDrection) {
		this.posDrection = posDrection;
	}

	/** 
	 *
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/** 
	 *
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/** 
	 *
	 */
	public String getHedgeFlag() {
		return hedgeFlag;
	}

	/** 
	 *
	 */
	public void setHedgeFlag(String hedgeFlag) {
		this.hedgeFlag = hedgeFlag;
	}

	/**
	 * 持仓日期历史持仓 2
	 */
	public String getPositionDate() {
		return positionDate;
	}

	/**
	 * 持仓日期历史持仓 2
	 */
	public void setPositionDate(String positionDate) {
		this.positionDate = positionDate;
	}

	/**
	 * 上日持仓
	 */
	public Integer getYdPosition() {
		return ydPosition;
	}

	/**
	 * 上日持仓
	 */
	public void setYdPosition(Integer ydPosition) {
		this.ydPosition = ydPosition;
	}

	/**
	 * 持仓数量
	 */
	public Integer getPosition() {
		return position;
	}

	/**
	 * 持仓数量
	 */
	public void setPosition(Integer position) {
		this.position = position;
	}

	/**
	 * 多头冻结
	 */
	public Integer getLongFrozen() {
		return longFrozen;
	}

	/**
	 * 多头冻结
	 */
	public void setLongFrozen(Integer longFrozen) {
		this.longFrozen = longFrozen;
	}

	/**
	 * 空头冻结
	 */
	public Integer getShortFrozen() {
		return shortFrozen;
	}

	/**
	 * 空头冻结
	 */
	public void setShortFrozen(Integer shortFrozen) {
		this.shortFrozen = shortFrozen;
	}

	/**
	 * 开仓冻结金额
	 */
	public Double getLongFrozenAmount() {
		return longFrozenAmount;
	}

	/**
	 * 开仓冻结金额
	 */
	public void setLongFrozenAmount(Double longFrozenAmount) {
		this.longFrozenAmount = longFrozenAmount;
	}

	/**
	 * 开仓冻结金额
	 */
	public Double getShortFrozenAmount() {
		return shortFrozenAmount;
	}

	/**
	 * 开仓冻结金额
	 */
	public void setShortFrozenAmount(Double shortFrozenAmount) {
		this.shortFrozenAmount = shortFrozenAmount;
	}

	/**
	 * 开仓数量
	 */
	public Double getOpenVolume() {
		return openVolume;
	}

	/**
	 * 开仓数量
	 */
	public void setOpenVolume(Double openVolume) {
		this.openVolume = openVolume;
	}

	/**
	 * 平仓数量
	 */
	public Integer getCloseVolume() {
		return closeVolume;
	}

	/**
	 * 平仓数量
	 */
	public void setCloseVolume(Integer closeVolume) {
		this.closeVolume = closeVolume;
	}

	/**
	 * 平仓金额
	 */
	public Double getCloseAmount() {
		return closeAmount;
	}

	/**
	 * 平仓金额
	 */
	public void setCloseAmount(Double closeAmount) {
		this.closeAmount = closeAmount;
	}

	/**
	 * 开仓金额
	 */
	public Double getOpenAmount() {
		return openAmount;
	}

	/**
	 * 开仓金额
	 */
	public void setOpenAmount(Double openAmount) {
		this.openAmount = openAmount;
	}

	/**
	 * 持仓成本
	 */
	public Double getPositionCost() {
		return positionCost;
	}

	/**
	 * 持仓成本
	 */
	public void setPositionCost(Double positionCost) {
		this.positionCost = positionCost;
	}

	/** 
	 *
	 */
	public Double getUseMargin() {
		return useMargin;
	}

	/** 
	 *
	 */
	public void setUseMargin(Double useMargin) {
		this.useMargin = useMargin;
	}

	/**
	 * 冻结的保证金
	 */
	public Double getFrozenMargin() {
		return frozenMargin;
	}

	/**
	 * 冻结的保证金
	 */
	public void setFrozenMargin(Double frozenMargin) {
		this.frozenMargin = frozenMargin;
	}

	/**
	 * 冻结资金
	 */
	public Double getFrozenCash() {
		return frozenCash;
	}

	/**
	 * 冻结资金
	 */
	public void setFrozenCash(Double frozenCash) {
		this.frozenCash = frozenCash;
	}

	/**
	 * 冻结的手续费
	 */
	public Double getFrozenCommission() {
		return frozenCommission;
	}

	/**
	 * 冻结的手续费
	 */
	public void setFrozenCommission(Double frozenCommission) {
		this.frozenCommission = frozenCommission;
	}

	/**
	 * 资金差额
	 */
	public Double getCashIn() {
		return cashIn;
	}

	/**
	 * 资金差额
	 */
	public void setCashIn(Double cashIn) {
		this.cashIn = cashIn;
	}

	/**
	 * 手续费
	 */
	public Double getCommission() {
		return commission;
	}

	/**
	 * 手续费
	 */
	public void setCommission(Double commission) {
		this.commission = commission;
	}

	/**
	 * 平仓盈亏
	 */
	public Double getCloseProfit() {
		return closeProfit;
	}

	/**
	 * 平仓盈亏
	 */
	public void setCloseProfit(Double closeProfit) {
		this.closeProfit = closeProfit;
	}

	/**
	 * 持仓盈亏
	 */
	public Double getPositionProfit() {
		return positionProfit;
	}

	/**
	 * 持仓盈亏
	 */
	public void setPositionProfit(Double positionProfit) {
		this.positionProfit = positionProfit;
	}

	/**
	 * 上一次结算价
	 */
	public Double getPreSettlementPrice() {
		return preSettlementPrice;
	}

	/**
	 * 上一次结算价
	 */
	public void setPreSettlementPrice(Double preSettlementPrice) {
		this.preSettlementPrice = preSettlementPrice;
	}

	/**
	 * 结算价
	 */
	public Double getSettlementPrice() {
		return settlementPrice;
	}

	/**
	 * 结算价
	 */
	public void setSettlementPrice(Double settlementPrice) {
		this.settlementPrice = settlementPrice;
	}

	/** 
	 *
	 */
	public Date getTradingDay() {
		return tradingDay;
	}

	/** 
	 *
	 */
	public void setTradingDay(Date tradingDay) {
		this.tradingDay = tradingDay;
	}

	/**
	 * 结算编号
	 */
	public Integer getSettlementId() {
		return settlementId;
	}

	/**
	 * 结算编号
	 */
	public void setSettlementId(Integer settlementId) {
		this.settlementId = settlementId;
	}

	/**
	 * 开仓成本
	 */
	public Double getOpenCost() {
		return openCost;
	}

	/**
	 * 开仓成本
	 */
	public void setOpenCost(Double openCost) {
		this.openCost = openCost;
	}

	/**
	 * 交易所保证金
	 */
	public Double getExchangeMargin() {
		return exchangeMargin;
	}

	/**
	 * 交易所保证金
	 */
	public void setExchangeMargin(Double exchangeMargin) {
		this.exchangeMargin = exchangeMargin;
	}

	/**
	 * 组合成交形成的持仓
	 */
	public Integer getCombPosition() {
		return combPosition;
	}

	/**
	 * 组合成交形成的持仓
	 */
	public void setCombPosition(Integer combPosition) {
		this.combPosition = combPosition;
	}

	/**
	 * 组合多头冻结
	 */
	public Integer getCombLongFrozen() {
		return combLongFrozen;
	}

	/**
	 * 组合多头冻结
	 */
	public void setCombLongFrozen(Integer combLongFrozen) {
		this.combLongFrozen = combLongFrozen;
	}

	/** 
	 *
	 */
	public Integer getCombShortFrozen() {
		return combShortFrozen;
	}

	/** 
	 *
	 */
	public void setCombShortFrozen(Integer combShortFrozen) {
		this.combShortFrozen = combShortFrozen;
	}

	/**
	 * 逐日盯市平仓盈亏
	 */
	public Double getCloseProfitByDate() {
		return closeProfitByDate;
	}

	/**
	 * 逐日盯市平仓盈亏
	 */
	public void setCloseProfitByDate(Double closeProfitByDate) {
		this.closeProfitByDate = closeProfitByDate;
	}

	/**
	 * 逐笔对冲平仓盈亏
	 */
	public Double getCloseProfitByTrade() {
		return closeProfitByTrade;
	}

	/**
	 * 逐笔对冲平仓盈亏
	 */
	public void setCloseProfitByTrade(Double closeProfitByTrade) {
		this.closeProfitByTrade = closeProfitByTrade;
	}

	/**
	 * 今日持仓
	 */
	public Integer getTodayPosition() {
		return todayPosition;
	}

	/**
	 * 今日持仓
	 */
	public void setTodayPosition(Integer todayPosition) {
		this.todayPosition = todayPosition;
	}

	/**
	 * 保证金率
	 */
	public Double getMarginRateByMoney() {
		return marginRateByMoney;
	}

	/**
	 * 保证金率
	 */
	public void setMarginRateByMoney(Double marginRateByMoney) {
		this.marginRateByMoney = marginRateByMoney;
	}

	/**
	 * 保证金率(按手数)
	 */
	public Integer getMarginRateByVolume() {
		return marginRateByVolume;
	}

	/**
	 * 保证金率(按手数)
	 */
	public void setMarginRateByVolume(Integer marginRateByVolume) {
		this.marginRateByVolume = marginRateByVolume;
	}

	/**
	 * 执行冻结
	 */
	public Integer getStrikeFrozen() {
		return strikeFrozen;
	}

	/**
	 * 执行冻结
	 */
	public void setStrikeFrozen(Integer strikeFrozen) {
		this.strikeFrozen = strikeFrozen;
	}

	/**
	 * 执行冻结金额
	 */
	public Double getStrikeFrozenAmount() {
		return strikeFrozenAmount;
	}

	/**
	 * 执行冻结金额
	 */
	public void setStrikeFrozenAmount(Double strikeFrozenAmount) {
		this.strikeFrozenAmount = strikeFrozenAmount;
	}

	/**
	 * 放弃执行冻结
	 */
	public Integer getAbandonFrozen() {
		return abandonFrozen;
	}

	/**
	 * 放弃执行冻结
	 */
	public void setAbandonFrozen(Integer abandonFrozen) {
		this.abandonFrozen = abandonFrozen;
	}

	/**
	 * 0,正常 1，待补单，2，待结算,3已结算
	 */
	public String getFixStatus() {
		return fixStatus;
	}

	/**
	 * 0,正常 1，待补单，2，待结算,3已结算
	 */
	public void setFixStatus(String fixStatus) {
		this.fixStatus = fixStatus;
	}

	/**
	 * 记录的日期
	 */
	public Date getHisDate() {
		return hisDate;
	}

	/**
	 * 记录的日期
	 */
	public void setHisDate(Date hisDate) {
		this.hisDate = hisDate;
	}

	/** 
	 *
	 */
	public BigDecimal getCost() {
		return cost;
	}

	/** 
	 *
	 */
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
}