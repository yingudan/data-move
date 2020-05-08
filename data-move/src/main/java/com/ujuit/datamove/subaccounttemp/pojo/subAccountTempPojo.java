package com.ujuit.datamove.subaccounttemp.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_sub_account_temp", desc = "子账户信息")
@GenModel(packageName = "com.ujuit.datamove.subaccounttemp", modelName = "subaccounttemp")
public class subAccountTempPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "子账户ID", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "登录用户ID（外键）", column = "user_id", isnull = true)
	private Integer userId;

	@GenField(labelname = "主账号", column = "master_account_id", isnull = true)
	private Integer masterAccountId;

	@GenField(labelname = "开户日期", column = "create_date", isnull = true)
	private Date createDate;

	@GenField(labelname = "交易类型", column = "type", length = 1, isnull = true)
	private String type;

	@GenField(labelname = "备注", column = "mark", length = 50, isnull = true)
	private String mark;

	@GenField(labelname = "保证金率id", column = "t_collateral_id", isnull = true)
	private Integer tCollateralId;

	@GenField(labelname = "手续费率id", column = "t_commission_id", isnull = true)
	private Integer tCommissionId;

	@GenField(labelname = "客户账号", column = "t_client_id", isnull = true)
	private Integer tClientId;

	@GenField(labelname = "保证金(客户资金)", column = "collateral", isnull = true)
	private BigDecimal collateral;

	@GenField(labelname = "配资(公司资金)", column = "disposition", isnull = true)
	private BigDecimal disposition;

	@GenField(labelname = "账号总金额", column = "amount", isnull = false)
	private BigDecimal amount;

	@GenField(labelname = "可用金额", column = "surplus_amount", isnull = false)
	private BigDecimal surplusAmount;

	@GenField(labelname = "状态锁定（ 1，锁定 0 未锁定）", column = "lock_status", length = 1, isnull = true)
	private String lockStatus;

	@GenField(labelname = "成本(初始资金)", column = "capital_amount", isnull = false)
	private BigDecimal capitalAmount;

	@GenField(labelname = "正式表子账户id", column = "t_sub_account_id", isnull = true)
	private Integer tSubAccountId;

	@GenField(labelname = "用户账号", column = "user_no", length = 10, isnull = true)
	private String userNo;

	@GenField(labelname = "是否强制平仓(0未平仓   1平仓)", column = "close_position", length = 1, isnull = true)
	private String closePosition;

	@GenField(labelname = "配资配股", column = "category", length = 1, isnull = true)
	private String category;

	@GenField(labelname = "账户组id", column = "master_group_id", isnull = true)
	private Integer masterGroupId;

	@GenField(labelname = "账户组id", column = "account_group_id", isnull = true)
	private Integer accountGroupId;

}