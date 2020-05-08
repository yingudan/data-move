package com.ujuit.datamove.rmmonitor.model;
import java.math.BigDecimal; 
import java.util.*; 
 
  
/**
 * 
 * @author shadow
 */ 
public class Rmmonitor  {
	/**
	 *
	 */
	private Integer id;
	/**
	 *子账户id
	 */
	private Integer subAccountId;
	/**
	 *是否监控
	 */
	private String isMonitor;
	/**
	 *类型 1：自动报单
	 */
	private String type;
	/**
	 *创建时间
	 */
	private Date createTime;
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
	 *子账户id
	 */
	public Integer getSubAccountId() {
		return subAccountId;
	}
	/** 
	 *子账户id
	 */
	public void setSubAccountId(Integer subAccountId) {
		this.subAccountId = subAccountId;
	}
	/** 
	 *是否监控
	 */
	public String getIsMonitor() {
		return isMonitor;
	}
	/** 
	 *是否监控
	 */
	public void setIsMonitor(String isMonitor) {
		this.isMonitor = isMonitor;
	}
	/** 
	 *类型 1：自动报单
	 */
	public String getType() {
		return type;
	}
	/** 
	 *类型 1：自动报单
	 */
	public void setType(String type) {
		this.type = type;
	}
	/** 
	 *创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/** 
	 *创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}