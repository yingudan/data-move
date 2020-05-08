package com.ujuit.datamove.rmautoorder.model;
import java.math.BigDecimal; 
import java.util.*; 
 
  
/**
 * 
 * @author shadow
 */ 
public class Rmautoorder  {
	/**
	 *
	 */
	private Integer id;
	/**
	 *子账户id
	 */
	private Integer subAccountId;
	/**
	 *多少跳
	 */
	private Integer tickNum;
	/**
	 *创建时间
	 */
	private Date createTime;
	/**
	 *最后修改时间
	 */
	private Date lastModifyTime;
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
	 *多少跳
	 */
	public Integer getTickNum() {
		return tickNum;
	}
	/** 
	 *多少跳
	 */
	public void setTickNum(Integer tickNum) {
		this.tickNum = tickNum;
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
	 *最后修改时间
	 */
	public Date getLastModifyTime() {
		return lastModifyTime;
	}
	/** 
	 *最后修改时间
	 */
	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}
}