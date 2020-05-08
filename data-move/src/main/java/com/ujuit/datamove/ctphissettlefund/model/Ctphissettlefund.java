package com.ujuit.datamove.ctphissettlefund.model;
import java.math.BigDecimal; 
import java.util.*; 
 
  
/**
 * 主账户根据ctp结算
 * @author shadow
 */ 
public class Ctphissettlefund  {
	/**
	 *
	 */
	private Integer id;
	/**
	 *
	 */
	private Integer masterId;
	/**
	 *
	 */
	private Date hisDate;
	/**
	 *
	 */
	private Date createTime;
	/**
	 *上一日总资产 ，期初结存 Balance b/f：
	 */
	private BigDecimal preBalance;
	/**
	 *
	 */
	private BigDecimal depositWithdrawal;
	/**
	 *期末总资产
	 */
	private BigDecimal endBalance;
	/**
	 *总资产/客户权益
	 */
	private BigDecimal balance;
	/**
	 *持仓盯市盈亏 MTM P/L
	 */
	private BigDecimal todayProfit;
	/**
	 *平仓盈亏
	 */
	private BigDecimal realized;
	/**
	 *手续费
	 */
	private BigDecimal commission;
	/**
	 *占用保证金
	 */
	private BigDecimal marginOccupied;
	/**
	 *行权手续费
	 */
	private BigDecimal exerciseFee;
	/**
	 *交割保证金
	 */
	private BigDecimal deliveryMargin;
	/**
	 *交割手续费
	 */
	private BigDecimal deliveryFee;
	/**
	 *市值权益 Market value(equity)
	 */
	private BigDecimal marketEquity;
	/**
	 *可用金额
	 */
	private BigDecimal fundAvail;
	/**
	 *净值
	 */
	private BigDecimal netWorth;
	/**
	 *份数
	 */
	private BigDecimal parts;
	/**
	 *当日盈亏
	 */
	private BigDecimal profit;
	/**
	 *总盈亏
	 */
	private BigDecimal profitTotal;
	/**
	 *当日盈亏率
	 */
	private BigDecimal profitRate;
	/**
	 *总盈亏率
	 */
	private BigDecimal profitTotalRate;
	/**
	 *成本
	 */
	private BigDecimal capitalAmount;
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
	 *
	 */
	public Integer getMasterId() {
		return masterId;
	}
	/** 
	 *
	 */
	public void setMasterId(Integer masterId) {
		this.masterId = masterId;
	}
	/** 
	 *
	 */
	public Date getHisDate() {
		return hisDate;
	}
	/** 
	 *
	 */
	public void setHisDate(Date hisDate) {
		this.hisDate = hisDate;
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
	 *上一日总资产 ，期初结存 Balance b/f：
	 */
	public BigDecimal getPreBalance() {
		return preBalance;
	}
	/** 
	 *上一日总资产 ，期初结存 Balance b/f：
	 */
	public void setPreBalance(BigDecimal preBalance) {
		this.preBalance = preBalance;
	}
	/** 
	 *
	 */
	public BigDecimal getDepositWithdrawal() {
		return depositWithdrawal;
	}
	/** 
	 *
	 */
	public void setDepositWithdrawal(BigDecimal depositWithdrawal) {
		this.depositWithdrawal = depositWithdrawal;
	}
	/** 
	 *期末总资产
	 */
	public BigDecimal getEndBalance() {
		return endBalance;
	}
	/** 
	 *期末总资产
	 */
	public void setEndBalance(BigDecimal endBalance) {
		this.endBalance = endBalance;
	}
	/** 
	 *总资产/客户权益
	 */
	public BigDecimal getBalance() {
		return balance;
	}
	/** 
	 *总资产/客户权益
	 */
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	/** 
	 *持仓盯市盈亏 MTM P/L
	 */
	public BigDecimal getTodayProfit() {
		return todayProfit;
	}
	/** 
	 *持仓盯市盈亏 MTM P/L
	 */
	public void setTodayProfit(BigDecimal todayProfit) {
		this.todayProfit = todayProfit;
	}
	/** 
	 *平仓盈亏
	 */
	public BigDecimal getRealized() {
		return realized;
	}
	/** 
	 *平仓盈亏
	 */
	public void setRealized(BigDecimal realized) {
		this.realized = realized;
	}
	/** 
	 *手续费
	 */
	public BigDecimal getCommission() {
		return commission;
	}
	/** 
	 *手续费
	 */
	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}
	/** 
	 *占用保证金
	 */
	public BigDecimal getMarginOccupied() {
		return marginOccupied;
	}
	/** 
	 *占用保证金
	 */
	public void setMarginOccupied(BigDecimal marginOccupied) {
		this.marginOccupied = marginOccupied;
	}
	/** 
	 *行权手续费
	 */
	public BigDecimal getExerciseFee() {
		return exerciseFee;
	}
	/** 
	 *行权手续费
	 */
	public void setExerciseFee(BigDecimal exerciseFee) {
		this.exerciseFee = exerciseFee;
	}
	/** 
	 *交割保证金
	 */
	public BigDecimal getDeliveryMargin() {
		return deliveryMargin;
	}
	/** 
	 *交割保证金
	 */
	public void setDeliveryMargin(BigDecimal deliveryMargin) {
		this.deliveryMargin = deliveryMargin;
	}
	/** 
	 *交割手续费
	 */
	public BigDecimal getDeliveryFee() {
		return deliveryFee;
	}
	/** 
	 *交割手续费
	 */
	public void setDeliveryFee(BigDecimal deliveryFee) {
		this.deliveryFee = deliveryFee;
	}
	/** 
	 *市值权益 Market value(equity)
	 */
	public BigDecimal getMarketEquity() {
		return marketEquity;
	}
	/** 
	 *市值权益 Market value(equity)
	 */
	public void setMarketEquity(BigDecimal marketEquity) {
		this.marketEquity = marketEquity;
	}
	/** 
	 *可用金额
	 */
	public BigDecimal getFundAvail() {
		return fundAvail;
	}
	/** 
	 *可用金额
	 */
	public void setFundAvail(BigDecimal fundAvail) {
		this.fundAvail = fundAvail;
	}
	/** 
	 *净值
	 */
	public BigDecimal getNetWorth() {
		return netWorth;
	}
	/** 
	 *净值
	 */
	public void setNetWorth(BigDecimal netWorth) {
		this.netWorth = netWorth;
	}
	/** 
	 *份数
	 */
	public BigDecimal getParts() {
		return parts;
	}
	/** 
	 *份数
	 */
	public void setParts(BigDecimal parts) {
		this.parts = parts;
	}
	/** 
	 *当日盈亏
	 */
	public BigDecimal getProfit() {
		return profit;
	}
	/** 
	 *当日盈亏
	 */
	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}
	/** 
	 *总盈亏
	 */
	public BigDecimal getProfitTotal() {
		return profitTotal;
	}
	/** 
	 *总盈亏
	 */
	public void setProfitTotal(BigDecimal profitTotal) {
		this.profitTotal = profitTotal;
	}
	/** 
	 *当日盈亏率
	 */
	public BigDecimal getProfitRate() {
		return profitRate;
	}
	/** 
	 *当日盈亏率
	 */
	public void setProfitRate(BigDecimal profitRate) {
		this.profitRate = profitRate;
	}
	/** 
	 *总盈亏率
	 */
	public BigDecimal getProfitTotalRate() {
		return profitTotalRate;
	}
	/** 
	 *总盈亏率
	 */
	public void setProfitTotalRate(BigDecimal profitTotalRate) {
		this.profitTotalRate = profitTotalRate;
	}
	/** 
	 *成本
	 */
	public BigDecimal getCapitalAmount() {
		return capitalAmount;
	}
	/** 
	 *成本
	 */
	public void setCapitalAmount(BigDecimal capitalAmount) {
		this.capitalAmount = capitalAmount;
	}
}