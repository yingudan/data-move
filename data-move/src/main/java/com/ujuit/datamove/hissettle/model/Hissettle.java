package com.ujuit.datamove.hissettle.model;

import java.math.BigDecimal;
import java.util.*;

/**
 * 主账户历史资金纪录
 * 
 * @author shadow
 */
public class Hissettle {
	/**
	 * id
	 */
	private Integer id;
	/**
	 * 子账户id
	 */
	private Integer subAccountId;
	/**
	 * 类型(1股票 2期货)
	 */
	private Integer type;
	/**
	 * 结算日期
	 */
	private Date hisDate;
	/**
	 * 初始权益
	 */
	private BigDecimal initEquity;
	/**
	 * 持仓盈亏
	 */
	private BigDecimal positionProfit;
	/**
	 * 出入金(入金)
	 */
	private BigDecimal dealGlod;
	/**
	 * 账号权益
	 */
	private BigDecimal totalAssets;
	/**
	 * 平仓盈亏
	 */
	private BigDecimal offsetProfit;
	/**
	 * 手续费
	 */
	private BigDecimal cost;
	/**
	 * 可用资金
	 */
	private BigDecimal surplusAmount;
	/**
	 * 可取资金
	 */
	private BigDecimal cashAmount;
	/**
	 * 用户资金
	 */
	private BigDecimal userAmount;
	/**
	 * 安全度
	 */
	private BigDecimal safetyLevel;
	/**
	 * 风险度
	 */
	private BigDecimal riskLevel;
	/**
	 * (出入金)出金
	 */
	private BigDecimal outDealGlod;
	/**
	 * 成本
	 */
	private BigDecimal capitalAmount;
	/**
	 * 当日结存
	 */
	private BigDecimal amount;
	/**
	 *
	 */
	private Date createTime;
	/**
	 * 期初结存（上一日结算后总资产）
	 */
	private BigDecimal preAssets;
	/**
	 *
	 */
	private BigDecimal netWorth;
	/**
	 *
	 */
	private BigDecimal parts;

	/**
	 * id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 子账户id
	 */
	public Integer getSubAccountId() {
		return subAccountId;
	}

	/**
	 * 子账户id
	 */
	public void setSubAccountId(Integer subAccountId) {
		this.subAccountId = subAccountId;
	}

	/**
	 * 类型(1股票 2期货)
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * 类型(1股票 2期货)
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * 结算日期
	 */
	public Date getHisDate() {
		return hisDate;
	}

	/**
	 * 结算日期
	 */
	public void setHisDate(Date hisDate) {
		this.hisDate = hisDate;
	}

	/**
	 * 初始权益
	 */
	public BigDecimal getInitEquity() {
		return initEquity;
	}

	/**
	 * 初始权益
	 */
	public void setInitEquity(BigDecimal initEquity) {
		this.initEquity = initEquity;
	}

	/**
	 * 持仓盈亏
	 */
	public BigDecimal getPositionProfit() {
		return positionProfit;
	}

	/**
	 * 持仓盈亏
	 */
	public void setPositionProfit(BigDecimal positionProfit) {
		this.positionProfit = positionProfit;
	}

	/**
	 * 出入金(入金)
	 */
	public BigDecimal getDealGlod() {
		return dealGlod;
	}

	/**
	 * 出入金(入金)
	 */
	public void setDealGlod(BigDecimal dealGlod) {
		this.dealGlod = dealGlod;
	}

	/**
	 * 账号权益
	 */
	public BigDecimal getTotalAssets() {
		return totalAssets;
	}

	/**
	 * 账号权益
	 */
	public void setTotalAssets(BigDecimal totalAssets) {
		this.totalAssets = totalAssets;
	}

	/**
	 * 平仓盈亏
	 */
	public BigDecimal getOffsetProfit() {
		return offsetProfit;
	}

	/**
	 * 平仓盈亏
	 */
	public void setOffsetProfit(BigDecimal offsetProfit) {
		this.offsetProfit = offsetProfit;
	}

	/**
	 * 手续费
	 */
	public BigDecimal getCost() {
		return cost;
	}

	/**
	 * 手续费
	 */
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	/**
	 * 可用资金
	 */
	public BigDecimal getSurplusAmount() {
		return surplusAmount;
	}

	/**
	 * 可用资金
	 */
	public void setSurplusAmount(BigDecimal surplusAmount) {
		this.surplusAmount = surplusAmount;
	}

	/**
	 * 可取资金
	 */
	public BigDecimal getCashAmount() {
		return cashAmount;
	}

	/**
	 * 可取资金
	 */
	public void setCashAmount(BigDecimal cashAmount) {
		this.cashAmount = cashAmount;
	}

	/**
	 * 用户资金
	 */
	public BigDecimal getUserAmount() {
		return userAmount;
	}

	/**
	 * 用户资金
	 */
	public void setUserAmount(BigDecimal userAmount) {
		this.userAmount = userAmount;
	}

	/**
	 * 安全度
	 */
	public BigDecimal getSafetyLevel() {
		return safetyLevel;
	}

	/**
	 * 安全度
	 */
	public void setSafetyLevel(BigDecimal safetyLevel) {
		this.safetyLevel = safetyLevel;
	}

	/**
	 * 风险度
	 */
	public BigDecimal getRiskLevel() {
		return riskLevel;
	}

	/**
	 * 风险度
	 */
	public void setRiskLevel(BigDecimal riskLevel) {
		this.riskLevel = riskLevel;
	}

	/**
	 * (出入金)出金
	 */
	public BigDecimal getOutDealGlod() {
		return outDealGlod;
	}

	/**
	 * (出入金)出金
	 */
	public void setOutDealGlod(BigDecimal outDealGlod) {
		this.outDealGlod = outDealGlod;
	}

	/**
	 * 成本
	 */
	public BigDecimal getCapitalAmount() {
		return capitalAmount;
	}

	/**
	 * 成本
	 */
	public void setCapitalAmount(BigDecimal capitalAmount) {
		this.capitalAmount = capitalAmount;
	}

	/**
	 * 当日结存
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * 当日结存
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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
	 * 期初结存（上一日结算后总资产）
	 */
	public BigDecimal getPreAssets() {
		return preAssets;
	}

	/**
	 * 期初结存（上一日结算后总资产）
	 */
	public void setPreAssets(BigDecimal preAssets) {
		this.preAssets = preAssets;
	}

	/** 
	 *
	 */
	public BigDecimal getNetWorth() {
		return netWorth;
	}

	/** 
	 *
	 */
	public void setNetWorth(BigDecimal netWorth) {
		this.netWorth = netWorth;
	}

	/** 
	 *
	 */
	public BigDecimal getParts() {
		return parts;
	}

	/** 
	 *
	 */
	public void setParts(BigDecimal parts) {
		this.parts = parts;
	}
}