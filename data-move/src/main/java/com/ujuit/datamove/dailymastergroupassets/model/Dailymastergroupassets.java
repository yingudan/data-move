package com.ujuit.datamove.dailymastergroupassets.model;
import java.math.BigDecimal; 
import java.util.*; 
 
  
/**
 * 主账户历史资金纪录 
 * @author shadow
 */ 
public class Dailymastergroupassets  {
	/**
	 *
	 */
	private Integer id;
	/**
	 *账户组
	 */
	private Integer masterGroupId;
	/**
	 *总资产
	 */
	private BigDecimal totalAssets;
	/**
	 *成本
	 */
	private BigDecimal capitalAmount;
	/**
	 *记录的历史日期
	 */
	private Date hisDate;
	/**
	 *利润
	 */
	private BigDecimal profit;
	/**
	 *可配资金
	 */
	private BigDecimal disposition;
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
	 *账户组
	 */
	public Integer getMasterGroupId() {
		return masterGroupId;
	}
	/** 
	 *账户组
	 */
	public void setMasterGroupId(Integer masterGroupId) {
		this.masterGroupId = masterGroupId;
	}
	/** 
	 *总资产
	 */
	public BigDecimal getTotalAssets() {
		return totalAssets;
	}
	/** 
	 *总资产
	 */
	public void setTotalAssets(BigDecimal totalAssets) {
		this.totalAssets = totalAssets;
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
	/** 
	 *记录的历史日期
	 */
	public Date getHisDate() {
		return hisDate;
	}
	/** 
	 *记录的历史日期
	 */
	public void setHisDate(Date hisDate) {
		this.hisDate = hisDate;
	}
	/** 
	 *利润
	 */
	public BigDecimal getProfit() {
		return profit;
	}
	/** 
	 *利润
	 */
	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}
	/** 
	 *可配资金
	 */
	public BigDecimal getDisposition() {
		return disposition;
	}
	/** 
	 *可配资金
	 */
	public void setDisposition(BigDecimal disposition) {
		this.disposition = disposition;
	}
}