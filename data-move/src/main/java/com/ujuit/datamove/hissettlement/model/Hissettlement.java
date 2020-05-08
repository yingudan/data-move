package com.ujuit.datamove.hissettlement.model;

import java.math.BigDecimal;
import java.util.*;

/**
 * 主账户委托信息
 * 
 * @author shadow
 */
public class Hissettlement {
	/**
	 *
	 */
	private Integer id;
	/**
	 *
	 */
	private Date tradeDate;
	/**
	 *
	 */
	private Integer masterId;
	/**
	 *
	 */
	private String hisRecord;
	/**
	 * 比对状态 1：比对过 其他：未必对过
	 */
	private String compareStatus;

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
	 *
	 */
	public Integer getMasterId() {
		return masterId;
	}

	/** 
	 *
	 */
	public void setMasterId(Integer masterId) {
		this.masterId = masterId;
	}

	/** 
	 *
	 */
	public String getHisRecord() {
		return hisRecord;
	}

	/** 
	 *
	 */
	public void setHisRecord(String hisRecord) {
		this.hisRecord = hisRecord;
	}

	/**
	 * 比对状态 1：比对过 其他：未必对过
	 */
	public String getCompareStatus() {
		return compareStatus;
	}

	/**
	 * 比对状态 1：比对过 其他：未必对过
	 */
	public void setCompareStatus(String compareStatus) {
		this.compareStatus = compareStatus;
	}
}