package com.ujuit.datamove.subaccount.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_sub_account", desc = "子账户信息")
@GenModel(packageName = "com.ujuit.datamove.subaccount", modelName = "subaccount")
public class subAccountPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "子账户ID", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "登录用户ID（外键）", column = "user_id", isnull = false)
	private Integer userId;

	@GenField(labelname = "主账号", column = "master_account_id", isnull = true)
	private Integer masterAccountId;

	@GenField(labelname = "账号金额(总资产)", column = "amount", isnull = false)
	private BigDecimal amount;

	@GenField(labelname = "可用金额", column = "surplus_amount", isnull = false)
	private BigDecimal surplusAmount;

	@GenField(labelname = "状态锁定（lock_status 1，锁定 0 未锁定）", column = "lock_status", length = 1, isnull = true)
	private String lockStatus;

	@GenField(labelname = "成本", column = "capital_amount", isnull = false)
	private BigDecimal capitalAmount;

	@GenField(labelname = "用户账号", column = "user_no", length = 12, isnull = true)
	private String userNo;

	@GenField(labelname = "交易类型(1证券  2期货)", column = "type", length = 1, isnull = true)
	private String type;

	@GenField(labelname = "保证金率id", column = "t_collateral_id", isnull = true)
	private Integer tCollateralId;

	@GenField(labelname = "手续费率id", column = "t_commission_id", isnull = true)
	private Integer tCommissionId;

	@GenField(labelname = "客户账号id", column = "t_client_id", isnull = true)
	private Integer tClientId;

	@GenField(labelname = "保证金(用户资金)", column = "collateral", isnull = true)
	private BigDecimal collateral;

	@GenField(labelname = "配资(公司资金)", column = "disposition", isnull = false)
	private BigDecimal disposition;

	@GenField(labelname = "开户日期", column = "create_date", isnull = true)
	private Date create_date;

	@GenField(labelname = "", column = "mark", length = 255, isnull = true)
	private String mark;

	@GenField(labelname = "是否强制平仓(0未平仓  1平仓)", column = "close_position", length = 1, isnull = true)
	private String closePosition;

	@GenField(labelname = "初始保证金(用户初始资金)", column = "initcollateral", isnull = true)
	private BigDecimal initcollateral;

	@GenField(labelname = "配资配股 1配资 2 配股", column = "category", length = 1, isnull = true)
	private String category;

	@GenField(labelname = "初始资金(第一次配置时的总资金)", column = "init_amount", isnull = true)
	private BigDecimal initAmount;

	@GenField(labelname = "静态权益（期货）", column = "pre_assets", isnull = true)
	private BigDecimal preAssets;

	@GenField(labelname = "上一日结存 （用于缓存记录）", column = "pre_amount", isnull = true)
	private BigDecimal preAmount;

	@GenField(labelname = "账户组id", column = "master_group_id", isnull = true)
	private Integer masterGroupId;

	@GenField(labelname = "单元id", column = "unit_id", isnull = true)
	private Integer unitId;

	@GenField(labelname = "", column = "parts", isnull = true)
	private BigDecimal parts;

	@GenField(labelname = "", column = "deposit", isnull = false)
	private BigDecimal deposit;

	@GenField(labelname = "", column = "withdraw", isnull = false)
	private BigDecimal withdraw;

	@GenField(labelname = "", column = "withdraw_and_deposit", isnull = false)
	private BigDecimal withdrawAndDeposit;

	@GenField(labelname = "账户强平状态标识 0正常 1待强平 2已强平", column = "close_position_status", length = 1, isnull = true)
	private String closePositionStatus;

	@GenField(labelname = "最近结算日期", column = "settle_date", isnull = true)
	private Date settleDate;

}