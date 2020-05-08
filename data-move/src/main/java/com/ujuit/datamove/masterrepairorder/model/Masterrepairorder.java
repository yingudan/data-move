package com.ujuit.datamove.masterrepairorder.model;

import java.math.BigDecimal;
import java.util.*;

/**
 * 111
 * 
 * @author shadow
 */
public class Masterrepairorder {
	/**
	 *
	 */
	private Integer masterOrderId;
	/**
	 *
	 */
	private Integer childOrderId;
	/**
	 *
	 */
	private Date createTime;

	/** 
	 *
	 */
	public Integer getMasterOrderId() {
		return masterOrderId;
	}

	/** 
	 *
	 */
	public void setMasterOrderId(Integer masterOrderId) {
		this.masterOrderId = masterOrderId;
	}

	/** 
	 *
	 */
	public Integer getChildOrderId() {
		return childOrderId;
	}

	/** 
	 *
	 */
	public void setChildOrderId(Integer childOrderId) {
		this.childOrderId = childOrderId;
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
}