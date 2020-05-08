package com.ujuit.datamove.profitdetails.model;
import java.math.BigDecimal; 
import java.util.*; 
 
  
/**
 * 账户手续费 
 * @author shadow
 */ 
public class Profitdetails  {
	/**
	 *编码ID
	 */
	private Integer id;
	/**
	 *金额
	 */
	private BigDecimal amount;
	/**
	 *创建日期
	 */
	private Date create_time;
	/**
	 *0、无风险利率(平台利息)    1、手续费  2、交易所手续费退还  3.第三方下单申报费损失
	 */
	private String type;
	/**
	 *备注信息
	 */
	private String remark;
	/**
	 *母账户ID
	 */
	private Integer masterId;
	/**
	 *子账号ID
	 */
	private Integer subAccountId;
	/**
	 *记录日期
	 */
	private Date recordDate;
	/** 
	 *编码ID
	 */
	public Integer getId() {
		return id;
	}
	/** 
	 *编码ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/** 
	 *金额
	 */
	public BigDecimal getAmount() {
		return amount;
	}
	/** 
	 *金额
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	/** 
	 *创建日期
	 */
	public Date getCreate_time() {
		return create_time;
	}
	/** 
	 *创建日期
	 */
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	/** 
	 *0、无风险利率(平台利息)    1、手续费  2、交易所手续费退还  3.第三方下单申报费损失
	 */
	public String getType() {
		return type;
	}
	/** 
	 *0、无风险利率(平台利息)    1、手续费  2、交易所手续费退还  3.第三方下单申报费损失
	 */
	public void setType(String type) {
		this.type = type;
	}
	/** 
	 *备注信息
	 */
	public String getRemark() {
		return remark;
	}
	/** 
	 *备注信息
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/** 
	 *母账户ID
	 */
	public Integer getMasterId() {
		return masterId;
	}
	/** 
	 *母账户ID
	 */
	public void setMasterId(Integer masterId) {
		this.masterId = masterId;
	}
	/** 
	 *子账号ID
	 */
	public Integer getSubAccountId() {
		return subAccountId;
	}
	/** 
	 *子账号ID
	 */
	public void setSubAccountId(Integer subAccountId) {
		this.subAccountId = subAccountId;
	}
	/** 
	 *记录日期
	 */
	public Date getRecordDate() {
		return recordDate;
	}
	/** 
	 *记录日期
	 */
	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}
}