package com.ujuit.datamove.futuresinstrumentfield.model;

import java.math.BigDecimal;
import java.util.*;

/**
 * 合约基本信息
 * 
 * @author shadow
 */
public class Futuresinstrumentfield {
	/**
	 * id
	 */
	private Integer id;
	/**
	 * 合约基本信息
	 */
	private String content;
	/**
	 * 日期
	 */
	private Date tradeDate;
	/**
	 *
	 */
	private Date updateTime;
	/**
	 * 0、false未启动检查，1 true已经启动检查
	 */
	private boolean check;

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
	 * 合约基本信息
	 */
	public String getContent() {
		return content;
	}

	/**
	 * 合约基本信息
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * 日期
	 */
	public Date getTradeDate() {
		return tradeDate;
	}

	/**
	 * 日期
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

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

}