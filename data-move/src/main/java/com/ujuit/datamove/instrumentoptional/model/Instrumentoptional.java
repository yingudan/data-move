package com.ujuit.datamove.instrumentoptional.model;

import java.math.BigDecimal;
import java.util.*;

/**
 * 合约基本信息
 * 
 * @author shadow
 */
public class Instrumentoptional {
	/**
	 *
	 */
	private Integer id;
	/**
	 *
	 */
	private String instrumentId;
	/**
	 *
	 */
	private Integer subAccountId;
	/**
	 *
	 */
	private Date createTime;
	/**
	 * 0,未交割1交割
	 */
	private Date expire;

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
	public String getInstrumentId() {
		return instrumentId;
	}

	/** 
	 *
	 */
	public void setInstrumentId(String instrumentId) {
		this.instrumentId = instrumentId;
	}

	/** 
	 *
	 */
	public Integer getSubAccountId() {
		return subAccountId;
	}

	/** 
	 *
	 */
	public void setSubAccountId(Integer subAccountId) {
		this.subAccountId = subAccountId;
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

	/**
	 * 0,未交割1交割
	 */
	public Date getExpire() {
		return expire;
	}

	/**
	 * 0,未交割1交割
	 */
	public void setExpire(Date expire) {
		this.expire = expire;
	}
}