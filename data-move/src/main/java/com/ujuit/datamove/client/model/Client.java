package com.ujuit.datamove.client.model;

import java.math.BigDecimal;
import java.util.*;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 客户信息
 * 
 * @author shadow
 */
public class Client {
	/**
	 * id
	 */
	private Integer id;
	/**
	 * 开户日期
	 */
	private Date createDate;
	/**
	 * 备注
	 */
	private String mark;
	/**
	 * 客户账户
	 */
	private String account;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 客户姓名
	 */
	private String userName;
	/**
	 * 交易组id
	 */
	private Integer tGroupId;
	/**
	 *
	 */
	private BigDecimal totalAssets;
	/**
	 *
	 */
	private BigDecimal totalRevenue;
	/**
	 *
	 */
	private String type;
	
	/**
	 * 对应到v4数据库中的id
	 */
	private Integer newId;

	
	
	public Integer getNewId() {
		return newId;
	}

	public void setNewId(Integer newId) {
		this.newId = newId;
	}

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
	 * 开户日期
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * 开户日期
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * 备注
	 */
	public String getMark() {
		return mark;
	}

	/**
	 * 备注
	 */
	public void setMark(String mark) {
		this.mark = mark;
	}

	/**
	 * 客户账户
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * 客户账户
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * 密码
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 客户姓名
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 客户姓名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 交易组id
	 */
	public Integer getTGroupId() {
		return tGroupId;
	}

	/**
	 * 交易组id
	 */
	public void setTGroupId(Integer tGroupId) {
		this.tGroupId = tGroupId;
	}

	/** 
	 *
	 */
	public BigDecimal getTotalAssets() {
		return totalAssets;
	}

	/** 
	 *
	 */
	public void setTotalAssets(BigDecimal totalAssets) {
		this.totalAssets = totalAssets;
	}

	/** 
	 *
	 */
	public BigDecimal getTotalRevenue() {
		return totalRevenue;
	}

	/** 
	 *
	 */
	public void setTotalRevenue(BigDecimal totalRevenue) {
		this.totalRevenue = totalRevenue;
	}

	/** 
	 *
	 */
	public String getType() {
		return type;
	}

	/** 
	 *
	 */
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}