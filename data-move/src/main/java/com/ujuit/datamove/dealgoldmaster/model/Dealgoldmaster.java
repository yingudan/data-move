package com.ujuit.datamove.dealgoldmaster.model;
import java.math.BigDecimal; 
import java.util.*; 
 
  
/**
 * 子账户出入金记录
 * @author shadow
 */ 
public class Dealgoldmaster  {
	/**
	 *id
	 */
	private Integer id;
	/**
	 *账户id
	 */
	private Integer accountId;
	/**
	 *出入金(1入金 2出金)
	 */
	private String deal_gold;
	/**
	 *类型(1为出入金 2为出入股 3出入虚拟资金)
	 */
	private String type;
	/**
	 *金额
	 */
	private BigDecimal money;
	/**
	 *出入金时间
	 */
	private Date creareTime;
	/**
	 *主账户剩余可配
	 */
	private BigDecimal cashDeposit;
	/**
	 *出入股票数量
	 */
	private Integer stockNum;
	/**
	 *
	 */
	private String stockCode;
	/**
	 *出入金后配资(可配)
	 */
	private BigDecimal disposition;
	/**
	 *出入金后成本
	 */
	private BigDecimal capitalAmount;
	/**
	 *
	 */
	private String name;
	/**
	 *
	 */
	private BigDecimal totalAssets;
	/**
	 *备注
	 */
	private String remarks;
	/**
	 *1对内  2对外
	 */
	private String dispositionType;
	/** 
	 *id
	 */
	public Integer getId() {
		return id;
	}
	/** 
	 *id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/** 
	 *账户id
	 */
	public Integer getAccountId() {
		return accountId;
	}
	/** 
	 *账户id
	 */
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	/** 
	 *出入金(1入金 2出金)
	 */
	public String getDeal_gold() {
		return deal_gold;
	}
	/** 
	 *出入金(1入金 2出金)
	 */
	public void setDeal_gold(String deal_gold) {
		this.deal_gold = deal_gold;
	}
	/** 
	 *类型(1为出入金 2为出入股 3出入虚拟资金)
	 */
	public String getType() {
		return type;
	}
	/** 
	 *类型(1为出入金 2为出入股 3出入虚拟资金)
	 */
	public void setType(String type) {
		this.type = type;
	}
	/** 
	 *金额
	 */
	public BigDecimal getMoney() {
		return money;
	}
	/** 
	 *金额
	 */
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	/** 
	 *出入金时间
	 */
	public Date getCreareTime() {
		return creareTime;
	}
	/** 
	 *出入金时间
	 */
	public void setCreareTime(Date creareTime) {
		this.creareTime = creareTime;
	}
	/** 
	 *主账户剩余可配
	 */
	public BigDecimal getCashDeposit() {
		return cashDeposit;
	}
	/** 
	 *主账户剩余可配
	 */
	public void setCashDeposit(BigDecimal cashDeposit) {
		this.cashDeposit = cashDeposit;
	}
	/** 
	 *出入股票数量
	 */
	public Integer getStockNum() {
		return stockNum;
	}
	/** 
	 *出入股票数量
	 */
	public void setStockNum(Integer stockNum) {
		this.stockNum = stockNum;
	}
	/** 
	 *
	 */
	public String getStockCode() {
		return stockCode;
	}
	/** 
	 *
	 */
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	/** 
	 *出入金后配资(可配)
	 */
	public BigDecimal getDisposition() {
		return disposition;
	}
	/** 
	 *出入金后配资(可配)
	 */
	public void setDisposition(BigDecimal disposition) {
		this.disposition = disposition;
	}
	/** 
	 *出入金后成本
	 */
	public BigDecimal getCapitalAmount() {
		return capitalAmount;
	}
	/** 
	 *出入金后成本
	 */
	public void setCapitalAmount(BigDecimal capitalAmount) {
		this.capitalAmount = capitalAmount;
	}
	/** 
	 *
	 */
	public String getName() {
		return name;
	}
	/** 
	 *
	 */
	public void setName(String name) {
		this.name = name;
	}
	/** 
	 *
	 */
	public BigDecimal getTotalAssets() {
		return totalAssets;
	}
	/** 
	 *
	 */
	public void setTotalAssets(BigDecimal totalAssets) {
		this.totalAssets = totalAssets;
	}
	/** 
	 *备注
	 */
	public String getRemarks() {
		return remarks;
	}
	/** 
	 *备注
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/** 
	 *1对内  2对外
	 */
	public String getDispositionType() {
		return dispositionType;
	}
	/** 
	 *1对内  2对外
	 */
	public void setDispositionType(String dispositionType) {
		this.dispositionType = dispositionType;
	}
}