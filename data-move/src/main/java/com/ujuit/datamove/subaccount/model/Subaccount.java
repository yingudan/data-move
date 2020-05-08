package com.ujuit.datamove.subaccount.model;

import java.math.BigDecimal;
import java.util.*;

/**
 * 子账户信息
 * 
 * @author shadow
 */
public class Subaccount {
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
	 * 账号金额(总资产)
	 */
	private BigDecimal amount;
	/**
	 * 可用金额
	 */
	private BigDecimal surplusAmount;
	/**
	 * 状态锁定（lock_status 1，锁定 0 未锁定）
	 */
	private String lockStatus;
	/**
	 * 成本
	 */
	private BigDecimal capitalAmount;
	/**
	 * 用户账号
	 */
	private String userNo;
	/**
	 * 交易类型(1证券 2期货)
	 */
	private String type;
	/**
	 * 保证金率id
	 */
	private Integer tCollateralId;
	/**
	 * 手续费率id
	 */
	private Integer tCommissionId;
	/**
	 * 客户账号id
	 */
	private Integer tClientId;
	/**
	 * 保证金(用户资金)
	 */
	private BigDecimal collateral;
	/**
	 * 配资(公司资金)
	 */
	private BigDecimal disposition;
	/**
	 * 开户日期
	 */
	private Date create_date;
	/**
	 *
	 */
	private String mark;
	/**
	 * 是否强制平仓(0未平仓 1平仓)
	 */
	private String closePosition;
	/**
	 * 初始保证金(用户初始资金)
	 */
	private BigDecimal initcollateral;
	/**
	 * 配资配股 1配资 2 配股
	 */
	private String category;
	/**
	 * 初始资金(第一次配置时的总资金)
	 */
	private BigDecimal initAmount;
	/**
	 * 静态权益（期货）
	 */
	private BigDecimal preAssets;
	/**
	 * 上一日结存 （用于缓存记录）
	 */
	private BigDecimal preAmount;
	/**
	 * 账户组id
	 */
	private Integer masterGroupId;
	/**
	 * 单元id
	 */
	private Integer unitId;
	/**
	 *
	 */
	private BigDecimal parts;
	/**
	 *
	 */
	private BigDecimal deposit;
	/**
	 *
	 */
	private BigDecimal withdraw;
	/**
	 *
	 */
	private BigDecimal withdrawAndDeposit;
	/**
	 * 账户强平状态标识 0正常 1待强平 2已强平
	 */
	private String closePositionStatus;
	
	
	/**
	 * 对应v4中的id
	 */
	private Integer newId;

	
	
	
	public Integer getNewId() {
		return newId;
	}

	public void setNewId(Integer newId) {
		this.newId = newId;
	}

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
	 * 账号金额(总资产)
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * 账号金额(总资产)
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
	 * 状态锁定（lock_status 1，锁定 0 未锁定）
	 */
	public String getLockStatus() {
		return lockStatus;
	}

	/**
	 * 状态锁定（lock_status 1，锁定 0 未锁定）
	 */
	public void setLockStatus(String lockStatus) {
		this.lockStatus = lockStatus;
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
	 * 交易类型(1证券 2期货)
	 */
	public String getType() {
		return type;
	}

	/**
	 * 交易类型(1证券 2期货)
	 */
	public void setType(String type) {
		this.type = type;
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
	 * 客户账号id
	 */
	public Integer getTClientId() {
		return tClientId;
	}

	/**
	 * 客户账号id
	 */
	public void setTClientId(Integer tClientId) {
		this.tClientId = tClientId;
	}

	/**
	 * 保证金(用户资金)
	 */
	public BigDecimal getCollateral() {
		return collateral;
	}

	/**
	 * 保证金(用户资金)
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
	 * 开户日期
	 */
	public Date getCreate_date() {
		return create_date;
	}

	/**
	 * 开户日期
	 */
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	/** 
	 *
	 */
	public String getMark() {
		return mark;
	}

	/** 
	 *
	 */
	public void setMark(String mark) {
		this.mark = mark;
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
	 * 初始保证金(用户初始资金)
	 */
	public BigDecimal getInitcollateral() {
		return initcollateral;
	}

	/**
	 * 初始保证金(用户初始资金)
	 */
	public void setInitcollateral(BigDecimal initcollateral) {
		this.initcollateral = initcollateral;
	}

	/**
	 * 配资配股 1配资 2 配股
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * 配资配股 1配资 2 配股
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * 初始资金(第一次配置时的总资金)
	 */
	public BigDecimal getInitAmount() {
		return initAmount;
	}

	/**
	 * 初始资金(第一次配置时的总资金)
	 */
	public void setInitAmount(BigDecimal initAmount) {
		this.initAmount = initAmount;
	}

	/**
	 * 静态权益（期货）
	 */
	public BigDecimal getPreAssets() {
		return preAssets;
	}

	/**
	 * 静态权益（期货）
	 */
	public void setPreAssets(BigDecimal preAssets) {
		this.preAssets = preAssets;
	}

	/**
	 * 上一日结存 （用于缓存记录）
	 */
	public BigDecimal getPreAmount() {
		return preAmount;
	}

	/**
	 * 上一日结存 （用于缓存记录）
	 */
	public void setPreAmount(BigDecimal preAmount) {
		this.preAmount = preAmount;
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
	 * 单元id
	 */
	public Integer getUnitId() {
		return unitId;
	}

	/**
	 * 单元id
	 */
	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}

	/** 
	 *
	 */
	public BigDecimal getParts() {
		return parts;
	}

	/** 
	 *
	 */
	public void setParts(BigDecimal parts) {
		this.parts = parts;
	}

	/** 
	 *
	 */
	public BigDecimal getDeposit() {
		return deposit;
	}

	/** 
	 *
	 */
	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}

	/** 
	 *
	 */
	public BigDecimal getWithdraw() {
		return withdraw;
	}

	/** 
	 *
	 */
	public void setWithdraw(BigDecimal withdraw) {
		this.withdraw = withdraw;
	}

	/** 
	 *
	 */
	public BigDecimal getWithdrawAndDeposit() {
		return withdrawAndDeposit;
	}

	/** 
	 *
	 */
	public void setWithdrawAndDeposit(BigDecimal withdrawAndDeposit) {
		this.withdrawAndDeposit = withdrawAndDeposit;
	}

	/**
	 * 账户强平状态标识 0正常 1待强平 2已强平
	 */
	public String getClosePositionStatus() {
		return closePositionStatus;
	}

	/**
	 * 账户强平状态标识 0正常 1待强平 2已强平
	 */
	public void setClosePositionStatus(String closePositionStatus) {
		this.closePositionStatus = closePositionStatus;
	}

	@Override
	public String toString() {
		return "Subaccount [id=" + id + ", userId=" + userId + ", masterAccountId=" + masterAccountId + ", amount="
				+ amount + ", surplusAmount=" + surplusAmount + ", lockStatus=" + lockStatus + ", capitalAmount="
				+ capitalAmount + ", userNo=" + userNo + ", type=" + type + ", tCollateralId=" + tCollateralId
				+ ", tCommissionId=" + tCommissionId + ", tClientId=" + tClientId + ", collateral=" + collateral
				+ ", disposition=" + disposition + ", create_date=" + create_date + ", mark=" + mark
				+ ", closePosition=" + closePosition + ", initcollateral=" + initcollateral + ", category=" + category
				+ ", initAmount=" + initAmount + ", preAssets=" + preAssets + ", preAmount=" + preAmount
				+ ", masterGroupId=" + masterGroupId + ", unitId=" + unitId + ", parts=" + parts + ", deposit="
				+ deposit + ", withdraw=" + withdraw + ", withdrawAndDeposit=" + withdrawAndDeposit
				+ ", closePositionStatus=" + closePositionStatus + ", newId=" + newId + "]";
	}

	
}