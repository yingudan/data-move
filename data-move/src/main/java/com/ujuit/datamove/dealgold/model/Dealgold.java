package com.ujuit.datamove.dealgold.model;
import java.math.BigDecimal; 
import java.util.*; 
 
  
/**
 * 子账户出入金记录
 * @author shadow
 */ 
public class Dealgold  {
	/**
	 *id
	 */
	private Integer id;
	/**
	 *账户id
	 */
	private Integer subAccountId;
	/**
	 *类型(1入金 2出金)
	 */
	private String type;
	/**
	 *出入金时间
	 */
	private Date creareTime;
	/**
	 *保证金金额(用户资金)
	 */
	private BigDecimal cashDeposit;
	/**
	 *配资金额(公司资金)
	 */
	private BigDecimal disposition;
	/**
	 *1出入金  2修改成本 3出入虚拟资金
	 */
	private String thetype;
	/**
	 *
	 */
	private Integer stockNum;
	/**
	 *
	 */
	private String stockCode;
	/**
	 *操作后用户资金
	 */
	private BigDecimal afterCollateral;
	/**
	 *操作后的公司资金
	 */
	private BigDecimal afterDisposition;
	/**
	 *
	 */
	private BigDecimal money;
	/**
	 *
	 */
	private BigDecimal totalAssets;
	/**
	 *
	 */
	private String remarks;
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
	public Integer getSubAccountId() {
		return subAccountId;
	}
	/** 
	 *账户id
	 */
	public void setSubAccountId(Integer subAccountId) {
		this.subAccountId = subAccountId;
	}
	/** 
	 *类型(1入金 2出金)
	 */
	public String getType() {
		return type;
	}
	/** 
	 *类型(1入金 2出金)
	 */
	public void setType(String type) {
		this.type = type;
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
	 *保证金金额(用户资金)
	 */
	public BigDecimal getCashDeposit() {
		return cashDeposit;
	}
	/** 
	 *保证金金额(用户资金)
	 */
	public void setCashDeposit(BigDecimal cashDeposit) {
		this.cashDeposit = cashDeposit;
	}
	/** 
	 *配资金额(公司资金)
	 */
	public BigDecimal getDisposition() {
		return disposition;
	}
	/** 
	 *配资金额(公司资金)
	 */
	public void setDisposition(BigDecimal disposition) {
		this.disposition = disposition;
	}
	/** 
	 *1出入金  2修改成本 3出入虚拟资金
	 */
	public String getThetype() {
		return thetype;
	}
	/** 
	 *1出入金  2修改成本 3出入虚拟资金
	 */
	public void setThetype(String thetype) {
		this.thetype = thetype;
	}
	/** 
	 *
	 */
	public Integer getStockNum() {
		return stockNum;
	}
	/** 
	 *
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
	 *操作后用户资金
	 */
	public BigDecimal getAfterCollateral() {
		return afterCollateral;
	}
	/** 
	 *操作后用户资金
	 */
	public void setAfterCollateral(BigDecimal afterCollateral) {
		this.afterCollateral = afterCollateral;
	}
	/** 
	 *操作后的公司资金
	 */
	public BigDecimal getAfterDisposition() {
		return afterDisposition;
	}
	/** 
	 *操作后的公司资金
	 */
	public void setAfterDisposition(BigDecimal afterDisposition) {
		this.afterDisposition = afterDisposition;
	}
	/** 
	 *
	 */
	public BigDecimal getMoney() {
		return money;
	}
	/** 
	 *
	 */
	public void setMoney(BigDecimal money) {
		this.money = money;
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
	 *
	 */
	public String getRemarks() {
		return remarks;
	}
	/** 
	 *
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}