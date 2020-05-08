package com.ujuit.datamove.futruebasic.model;
import java.math.BigDecimal; 
import java.util.*; 
 
  
/**
 * 子账户历史持仓
 * @author shadow
 */ 
public class Futruebasic  {
	/**
	 *id
	 */
	private Integer id;
	/**
	 *合约保证金率和手续费率
	 */
	private String content;
	/**
	 *类型 1.期货 2.期货期权 3.组合 4.即期 5.期转现 6.现货期权
	 */
	private String type;
	/**
	 *主账号标识
	 */
	private Integer masterId;
	/**
	 *日期
	 */
	private Date tradeDate;
	/**
	 *
	 */
	private Date updateTime;
	/**
	 *0，主力次主力采集完成1、已经采集完成
	 */
	private Integer status;
	/**
	 *0,真实账户1、内部账户
	 */
	private Integer masterType;
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
	 *合约保证金率和手续费率
	 */
	public String getContent() {
		return content;
	}
	/** 
	 *合约保证金率和手续费率
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/** 
	 *类型 1.期货 2.期货期权 3.组合 4.即期 5.期转现 6.现货期权
	 */
	public String getType() {
		return type;
	}
	/** 
	 *类型 1.期货 2.期货期权 3.组合 4.即期 5.期转现 6.现货期权
	 */
	public void setType(String type) {
		this.type = type;
	}
	/** 
	 *主账号标识
	 */
	public Integer getMasterId() {
		return masterId;
	}
	/** 
	 *主账号标识
	 */
	public void setMasterId(Integer masterId) {
		this.masterId = masterId;
	}
	/** 
	 *日期
	 */
	public Date getTradeDate() {
		return tradeDate;
	}
	/** 
	 *日期
	 */
	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}
	/** 
	 *
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/** 
	 *
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/** 
	 *0，主力次主力采集完成1、已经采集完成
	 */
	public Integer getStatus() {
		return status;
	}
	/** 
	 *0，主力次主力采集完成1、已经采集完成
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/** 
	 *0,真实账户1、内部账户
	 */
	public Integer getMasterType() {
		return masterType;
	}
	/** 
	 *0,真实账户1、内部账户
	 */
	public void setMasterType(Integer masterType) {
		this.masterType = masterType;
	}
}