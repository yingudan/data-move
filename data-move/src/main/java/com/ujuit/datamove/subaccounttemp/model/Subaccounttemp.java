package com.ujuit.datamove.subaccounttemp.model;

import java.math.BigDecimal;
import java.util.*;

/**
 * 子账户信息
 * 
 * @author shadow
 */
public class Subaccounttemp {
	/**
	 * 子账户ID
	 */
	private Integer id;
	/**
	 * 登录用户ID（外键）
	 */
	private Integer userId;
	/**
	 * 主账号
	 */
	private Integer masterAccountId;
	/**
	 * 开户日期
	 */
	private Date createDate;
	/**
	 * 交易类型
	 */
	private String type;
	/**
	 * 备注
	 */
	private String mark;
	/**
	 * 保证金率id
	 */
	private Integer tCollateralId;
	/**
	 * 手续费率id
	 */
	private Integer tCommissionId;
	/**
	 * 客户账号
	 */
	private Integer tClientId;
	/**
	 * 保证金(客户资金)
	 */
	private BigDecimal collateral;
	/**
	 * 配资(公司资金)
	 */
	private BigDecimal disposition;
	/**
	 * 账号总金额
	 */
	private BigDecimal amount;
	/**
	 * 可用金额
	 */
	private BigDecimal surplusAmount;
	/**
	 * 状态锁定（ 1，锁定 0 未锁定）
	 */
	private String lockStatus;
	/**
	 * 成本(初始资金)
	 */
	private BigDecimal capitalAmount;
	/**
	 * 正式表子账户id
	 */
	private Integer tSubAccountId;
	/**
	 * 用户账号
	 */
	private String userNo;
	/**
	 * 是否强制平仓(0未平仓 1平仓)
	 */
	private String closePosition;
	/**
	 * 配资配股
	 */
	private String category;
	/**
	 * 账户组id
	 */
	private Integer masterGroupId;
	/**
	 * 账户组id
	 */
	private Integer accountGroupId;

	/**
	 * 子账户ID
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 子账户ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 登录用户ID（外键）
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * 登录用户ID（外键）
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * 主账号
	 */
	public Integer getMasterAccountId() {
		return masterAccountId;
	}

	/**
	 * 主账号
	 */
	public void setMasterAccountId(Integer masterAccountId) {
		this.masterAccountId = masterAccountId;
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
	 * 交易类型
	 */
	public String getType() {
		return type;
	}

	/**
	 * 交易类型
	 */
	public void setType(String type) {
		this.type = type;
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
	 * 保证金率id
	 */
	public Integer getTCollateralId() {
		return tCollateralId;
	}

	/**
	 * 保证金率id
	 */
	public void setTCollateralId(Integer tCollateralId) {
		this.tCollateralId = tCollateralId;
	}

	/**
	 * 手续费率id
	 */
	public Integer getTCommissionId() {
		return tCommissionId;
	}

	/**
	 * 手续费率id
	 */
	public void setTCommissionId(Integer tCommissionId) {
		this.tCommissionId = tCommissionId;
	}

	/**
	 * 客户账号
	 */
	public Integer getTClientId() {
		return tClientId;
	}

	/**
	 * 客户账号
	 */
	public void setTClientId(Integer tClientId) {
		this.tClientId = tClientId;
	}

	/**
	 * 保证金(客户资金)
	 */
	public BigDecimal getCollateral() {
		return collateral;
	}

	/**
	 * 保证金(客户资金)
	 */
	public void setCollateral(BigDecimal collateral) {
		this.collateral = collateral;
	}

	/**
	 * 配资(公司资金)
	 */
	public BigDecimal getDisposition() {
		return disposition;
	}

	/**
	 * 配资(公司资金)
	 */
	public void setDisposition(BigDecimal disposition) {
		this.disposition = disposition;
	}

	/**
	 * 账号总金额
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * 账号总金额
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * 可用金额
	 */
	public BigDecimal getSurplusAmount() {
		return surplusAmount;
	}

	/**
	 * 可用金额
	 */
	public void setSurplusAmount(BigDecimal surplusAmount) {
		this.surplusAmount = surplusAmount;
	}

	/**
	 * 状态锁定（ 1，锁定 0 未锁定）
	 */
	public String getLockStatus() {
		return lockStatus;
	}

	/**
	 * 状态锁定（ 1，锁定 0 未锁定）
	 */
	public void setLockStatus(String lockStatus) {
		this.lockStatus = lockStatus;
	}

	/**
	 * 成本(初始资金)
	 */
	public BigDecimal getCapitalAmount() {
		return capitalAmount;
	}

	/**
	 * 成本(初始资金)
	 */
	public void setCapitalAmount(BigDecimal capitalAmount) {
		this.capitalAmount = capitalAmount;
	}

	/**
	 * 正式表子账户id
	 */
	public Integer getTSubAccountId() {
		return tSubAccountId;
	}

	/**
	 * 正式表子账户id
	 */
	public void setTSubAccountId(Integer tSubAccountId) {
		this.tSubAccountId = tSubAccountId;
	}

	/**
	 * 用户账号
	 */
	public String getUserNo() {
		return userNo;
	}

	/**
	 * 用户账号
	 */
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	/**
	 * 是否强制平仓(0未平仓 1平仓)
	 */
	public String getClosePosition() {
		return closePosition;
	}

	/**
	 * 是否强制平仓(0未平仓 1平仓)
	 */
	public void setClosePosition(String closePosition) {
		this.closePosition = closePosition;
	}

	/**
	 * 配资配股
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * 配资配股
	 */
	public void setCategory(String category) {
		this.category = category;
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
	 * 账户组id
	 */
	public Integer getAccountGroupId() {
		return accountGroupId;
	}

	/**
	 * 账户组id
	 */
	public void setAccountGroupId(Integer accountGroupId) {
		this.accountGroupId = accountGroupId;
	}
}