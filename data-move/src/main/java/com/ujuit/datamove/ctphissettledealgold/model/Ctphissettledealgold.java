package com.ujuit.datamove.ctphissettledealgold.model;
import java.math.BigDecimal; 
import java.util.*; 
 
  
/**
 * ctp账户出入金
 * @author shadow
 */ 
public class Ctphissettledealgold  {
	/**
	 *
	 */
	private Integer id;
	/**
	 *母账户id
	 */
	private Integer masterId;
	/**
	 *
	 */
	private Date tradeDate;
	/**
	 *类型
	 */
	private String type;
	/**
	 *出入金金额
	 */
	private BigDecimal deposit_withdrawal;
	/**
	 *备注
	 */
	private String note;
	/**
	 *创建时间
	 */
	private Date createTime;
	/**
	 *方向   1：入金   2：出金
	 */
	private String direction;
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
	 *母账户id
	 */
	public Integer getMasterId() {
		return masterId;
	}
	/** 
	 *母账户id
	 */
	public void setMasterId(Integer masterId) {
		this.masterId = masterId;
	}
	/** 
	 *
	 */
	public Date getTradeDate() {
		return tradeDate;
	}
	/** 
	 *
	 */
	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
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
	 *出入金金额
	 */
	public BigDecimal getDeposit_withdrawal() {
		return deposit_withdrawal;
	}
	/** 
	 *出入金金额
	 */
	public void setDeposit_withdrawal(BigDecimal deposit_withdrawal) {
		this.deposit_withdrawal = deposit_withdrawal;
	}
	/** 
	 *备注
	 */
	public String getNote() {
		return note;
	}
	/** 
	 *备注
	 */
	public void setNote(String note) {
		this.note = note;
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
	/** 
	 *方向   1：入金   2：出金
	 */
	public String getDirection() {
		return direction;
	}
	/** 
	 *方向   1：入金   2：出金
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}
}