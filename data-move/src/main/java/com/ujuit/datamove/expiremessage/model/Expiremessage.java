package com.ujuit.datamove.expiremessage.model;
import java.math.BigDecimal; 
import java.util.*; 
 
  
/**
 * 
 * @author shadow
 */ 
public class Expiremessage  {
	/**
	 *
	 */
	private Integer id;
	/**
	 *合约货股票代码
	 */
	private String code;
	/**
	 *类型
	 */
	private String type;
	/**
	 *到期日期数
	 */
	private Integer expireDay;
	/**
	 *
	 */
	private Date createTime;
	/**
	 *0,未读 1，已读
	 */
	private boolean status;
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
	 *合约货股票代码
	 */
	public String getCode() {
		return code;
	}
	/** 
	 *合约货股票代码
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/** 
	 *类型
	 */
	public String getType() {
		return type;
	}
	/** 
	 *类型
	 */
	public void setType(String type) {
		this.type = type;
	}
	/** 
	 *到期日期数
	 */
	public Integer getExpireDay() {
		return expireDay;
	}
	/** 
	 *到期日期数
	 */
	public void setExpireDay(Integer expireDay) {
		this.expireDay = expireDay;
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
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}