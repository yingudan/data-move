package com.ujuit.datamove.master.model;

import java.math.BigDecimal;
import java.util.*;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 主账户信息
 * 
 * @author shadow
 */
public class Master {
	/**
	 * id
	 */
	private Integer id;
	/**
	 * 类型（1证券2期货）
	 */
	private String type;
	/**
	 * 所属公司
	 */
	private String company;
	/**
	 * 初始资金
	 */
	private BigDecimal initialcapital;
	/**
	 * 可用资金
	 */
	private BigDecimal availablecapital;
	/**
	 * 状态（1非冻结 0冻结）
	 */
	private String status;
	/**
	 * 资金账号
	 */
	private String account;
	/**
	 * 登录密码
	 */
	private String password;
	/**
	 * 期货公司
	 */
	private String futurescompany;
	/**
	 * 所属券商
	 */
	private String theirbroker;
	/**
	 * 保证金
	 */
	private BigDecimal collateral;
	/**
	 * 营业厅Id
	 */
	private Integer tsbid;
	/**
	 * 证券id
	 */
	private Integer tsinfoid;
	/**
	 * 0可分配子账户 1，不可以分配子账户
	 */
	private boolean tab;
	/**
	 * 配资(可配)
	 */
	private BigDecimal disposition;
	/**
	 * 交易类型 华宝1 交易通2 爱建3 模拟 0
	 */
	private Integer tradeType;
	/**
	 * 交易账号
	 */
	private String tradeAccount;
	/**
	 * 通讯密码
	 */
	private String tradePassword;
	/**
	 * 是否信用账号 0不是 1是
	 */
	private boolean credit;
	/**
	 * 成本
	 */
	private BigDecimal capitalAmount;
	/**
	 * 到期时间
	 */
	private String overTime;
	/**
	 * 虚拟总资金只用于出入金记录
	 */
	private BigDecimal virtualAllmoney;
	/**
	 * 虚拟可配
	 */
	private BigDecimal virtualDisposition;
	/**
	 * 账户备注
	 */
	private String descrp;
	/**
	 * 创建日期
	 */
	private Date createTime;
	/**
	 * 期货公司id
	 */
	private Integer futureCompanyId;
	/**
	 * 母账户异常状态 0:正常 1：异常
	 */
	private String exceptionStatus;
	/**
	 *
	 */
	private String category;
	/**
	 *
	 */
	private BigDecimal thirdcapital;
	/**
	 * 异常信息描述
	 */
	private String exceptionMessage;
	/**
	 * 0、正常1、异常
	 */
	private String loginExceptionStatus;
	/**
	 * 登录异常描述
	 */
	private String loginExceptionMessage;
	/**
	 * 账户组id
	 */
	private Integer masterGroupId;
	/**
	 * 认证码
	 */
	private String authCode;
	/**
	 * appid
	 */
	private String appId;
	/**
	 * secret_key
	 */
	private String secretKey;
	/**
	 * 用户端产品信息
	 */
	private String userProductInfo;
	/**
	 * 份数
	 */
	private BigDecimal parts;

	/**
	 * 
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
	 * 类型（1证券2期货）
	 */
	public String getType() {
		return type;
	}

	/**
	 * 类型（1证券2期货）
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 所属公司
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * 所属公司
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * 初始资金
	 */
	public BigDecimal getInitialcapital() {
		return initialcapital;
	}

	/**
	 * 初始资金
	 */
	public void setInitialcapital(BigDecimal initialcapital) {
		this.initialcapital = initialcapital;
	}

	/**
	 * 可用资金
	 */
	public BigDecimal getAvailablecapital() {
		return availablecapital;
	}

	/**
	 * 可用资金
	 */
	public void setAvailablecapital(BigDecimal availablecapital) {
		this.availablecapital = availablecapital;
	}

	/**
	 * 状态（1非冻结 0冻结）
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 状态（1非冻结 0冻结）
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 资金账号
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * 资金账号
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * 登录密码
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 登录密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 期货公司
	 */
	public String getFuturescompany() {
		return futurescompany;
	}

	/**
	 * 期货公司
	 */
	public void setFuturescompany(String futurescompany) {
		this.futurescompany = futurescompany;
	}

	/**
	 * 所属券商
	 */
	public String getTheirbroker() {
		return theirbroker;
	}

	/**
	 * 所属券商
	 */
	public void setTheirbroker(String theirbroker) {
		this.theirbroker = theirbroker;
	}

	/**
	 * 保证金
	 */
	public BigDecimal getCollateral() {
		return collateral;
	}

	/**
	 * 保证金
	 */
	public void setCollateral(BigDecimal collateral) {
		this.collateral = collateral;
	}

	/**
	 * 营业厅Id
	 */
	public Integer getTsbid() {
		return tsbid;
	}

	/**
	 * 营业厅Id
	 */
	public void setTsbid(Integer tsbid) {
		this.tsbid = tsbid;
	}

	/**
	 * 证券id
	 */
	public Integer getTsinfoid() {
		return tsinfoid;
	}

	/**
	 * 证券id
	 */
	public void setTsinfoid(Integer tsinfoid) {
		this.tsinfoid = tsinfoid;
	}

	/**
	 * 配资(可配)
	 */
	public BigDecimal getDisposition() {
		return disposition;
	}

	/**
	 * 配资(可配)
	 */
	public void setDisposition(BigDecimal disposition) {
		this.disposition = disposition;
	}

	/**
	 * 交易类型 华宝1 交易通2 爱建3 模拟 0
	 */
	public Integer getTradeType() {
		return tradeType;
	}

	/**
	 * 交易类型 华宝1 交易通2 爱建3 模拟 0
	 */
	public void setTradeType(Integer tradeType) {
		this.tradeType = tradeType;
	}

	/**
	 * 交易账号
	 */
	public String getTradeAccount() {
		return tradeAccount;
	}

	/**
	 * 交易账号
	 */
	public void setTradeAccount(String tradeAccount) {
		this.tradeAccount = tradeAccount;
	}

	/**
	 * 通讯密码
	 */
	public String getTradePassword() {
		return tradePassword;
	}

	/**
	 * 通讯密码
	 */
	public void setTradePassword(String tradePassword) {
		this.tradePassword = tradePassword;
	}

	public boolean isTab() {
		return tab;
	}

	public void setTab(boolean tab) {
		this.tab = tab;
	}

	public boolean isCredit() {
		return credit;
	}

	public void setCredit(boolean credit) {
		this.credit = credit;
	}

	/**
	 * 成本
	 */
	public BigDecimal getCapitalAmount() {
		return capitalAmount;
	}

	/**
	 * 成本
	 */
	public void setCapitalAmount(BigDecimal capitalAmount) {
		this.capitalAmount = capitalAmount;
	}

	/**
	 * 到期时间
	 */
	public String getOverTime() {
		return overTime;
	}

	/**
	 * 到期时间
	 */
	public void setOverTime(String overTime) {
		this.overTime = overTime;
	}

	/**
	 * 虚拟总资金只用于出入金记录
	 */
	public BigDecimal getVirtualAllmoney() {
		return virtualAllmoney;
	}

	/**
	 * 虚拟总资金只用于出入金记录
	 */
	public void setVirtualAllmoney(BigDecimal virtualAllmoney) {
		this.virtualAllmoney = virtualAllmoney;
	}

	/**
	 * 虚拟可配
	 */
	public BigDecimal getVirtualDisposition() {
		return virtualDisposition;
	}

	/**
	 * 虚拟可配
	 */
	public void setVirtualDisposition(BigDecimal virtualDisposition) {
		this.virtualDisposition = virtualDisposition;
	}

	/**
	 * 账户备注
	 */
	public String getDescrp() {
		return descrp;
	}

	/**
	 * 账户备注
	 */
	public void setDescrp(String descrp) {
		this.descrp = descrp;
	}

	/**
	 * 创建日期
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 创建日期
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 期货公司id
	 */
	public Integer getFutureCompanyId() {
		return futureCompanyId;
	}

	/**
	 * 期货公司id
	 */
	public void setFutureCompanyId(Integer futureCompanyId) {
		this.futureCompanyId = futureCompanyId;
	}

	/**
	 * 母账户异常状态 0:正常 1：异常
	 */
	public String getExceptionStatus() {
		return exceptionStatus;
	}

	/**
	 * 母账户异常状态 0:正常 1：异常
	 */
	public void setExceptionStatus(String exceptionStatus) {
		this.exceptionStatus = exceptionStatus;
	}

	/** 
	 *
	 */
	public String getCategory() {
		return category;
	}

	/** 
	 *
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/** 
	 *
	 */
	public BigDecimal getThirdcapital() {
		return thirdcapital;
	}

	/** 
	 *
	 */
	public void setThirdcapital(BigDecimal thirdcapital) {
		this.thirdcapital = thirdcapital;
	}

	/**
	 * 异常信息描述
	 */
	public String getExceptionMessage() {
		return exceptionMessage;
	}

	/**
	 * 异常信息描述
	 */
	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	/**
	 * 0、正常1、异常
	 */
	public String getLoginExceptionStatus() {
		return loginExceptionStatus;
	}

	/**
	 * 0、正常1、异常
	 */
	public void setLoginExceptionStatus(String loginExceptionStatus) {
		this.loginExceptionStatus = loginExceptionStatus;
	}

	/**
	 * 登录异常描述
	 */
	public String getLoginExceptionMessage() {
		return loginExceptionMessage;
	}

	/**
	 * 登录异常描述
	 */
	public void setLoginExceptionMessage(String loginExceptionMessage) {
		this.loginExceptionMessage = loginExceptionMessage;
	}

	/**
	 * 账户组id
	 */
	public Integer getMasterGroupId() {
		return masterGroupId;
	}

	/**
	 * 账户组id
	 */
	public void setMasterGroupId(Integer masterGroupId) {
		this.masterGroupId = masterGroupId;
	}

	/**
	 * 认证码
	 */
	public String getAuthCode() {
		return authCode;
	}

	/**
	 * 认证码
	 */
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	/**
	 * appid
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * appid
	 */
	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * secret_key
	 */
	public String getSecretKey() {
		return secretKey;
	}

	/**
	 * secret_key
	 */
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	/**
	 * 用户端产品信息
	 */
	public String getUserProductInfo() {
		return userProductInfo;
	}

	/**
	 * 用户端产品信息
	 */
	public void setUserProductInfo(String userProductInfo) {
		this.userProductInfo = userProductInfo;
	}

	/**
	 * 份数
	 */
	public BigDecimal getParts() {
		return parts;
	}

	/**
	 * 份数
	 */
	public void setParts(BigDecimal parts) {
		this.parts = parts;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}