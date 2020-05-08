package com.ujuit.datamove.dealgoldmaster.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_deal_gold_master", desc = "子账户出入金记录")
@GenModel(packageName = "com.ujuit.datamove.dealgoldmaster", modelName = "dealgoldmaster")
public class DealGoldMasterPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "id", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "账户id", column = "account_id", isnull = true)
	private Integer accountId;

	@GenField(labelname = "出入金(1入金 2出金)", column = "deal_gold", length = 20, isnull = true)
	private String deal_gold;

	@GenField(labelname = "类型(1为出入金 2为出入股 3出入虚拟资金)", column = "type", length = 1, isnull = true)
	private String type;

	@GenField(labelname = "金额", column = "money", isnull = true)
	private BigDecimal money;

	@GenField(labelname = "出入金时间", column = "creare_time", isnull = false)
	private Date creareTime;

	@GenField(labelname = "主账户剩余可配", column = "cash_deposit", isnull = true)
	private BigDecimal cashDeposit;

	@GenField(labelname = "出入股票数量", column = "stock_num", isnull = true)
	private Integer stockNum;

	@GenField(labelname = "", column = "stock_code", length = 30, isnull = true)
	private String stockCode;

	@GenField(labelname = "出入金后配资(可配)", column = "disposition", isnull = true)
	private BigDecimal disposition;

	@GenField(labelname = "出入金后成本", column = "capital_amount", isnull = true)
	private BigDecimal capitalAmount;

	@GenField(labelname = "", column = "name", length = 100, isnull = true)
	private String name;

	@GenField(labelname = "", column = "total_assets", isnull = true)
	private BigDecimal totalAssets;

	@GenField(labelname = "备注", column = "remarks", length = 100, isnull = true)
	private String remarks;

	@GenField(labelname = "1对内  2对外", column = "disposition_type", length = 1, isnull = true)
	private String dispositionType;

}