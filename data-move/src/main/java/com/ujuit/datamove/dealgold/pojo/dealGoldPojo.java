package com.ujuit.datamove.dealgold.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_deal_gold", desc = "子账户出入金记录")
@GenModel(packageName = "com.ujuit.datamove.dealgold", modelName = "dealgold")
public class dealGoldPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "id", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "账户id", column = "sub_account_id", isnull = true)
	private Integer subAccountId;

	@GenField(labelname = "类型(1入金 2出金)", column = "type", length = 1, isnull = true)
	private String type;

	@GenField(labelname = "出入金时间", column = "creare_time", isnull = false)
	private Date creareTime;

	@GenField(labelname = "保证金金额(用户资金)", column = "cash_deposit", isnull = true)
	private BigDecimal cashDeposit;

	@GenField(labelname = "配资金额(公司资金)", column = "disposition", isnull = true)
	private BigDecimal disposition;

	@GenField(labelname = "1出入金  2修改成本 3出入虚拟资金", column = "thetype", length = 1, isnull = true)
	private String thetype;

	@GenField(labelname = "", column = "stock_num", isnull = true)
	private Integer stockNum;

	@GenField(labelname = "", column = "stock_code", length = 30, isnull = true)
	private String stockCode;

	@GenField(labelname = "操作后用户资金", column = "after_collateral", isnull = true)
	private BigDecimal afterCollateral;

	@GenField(labelname = "操作后的公司资金", column = "after_disposition", isnull = true)
	private BigDecimal afterDisposition;

	@GenField(labelname = "", column = "money", isnull = true)
	private BigDecimal money;

	@GenField(labelname = "", column = "total_assets", isnull = true)
	private BigDecimal totalAssets;

	@GenField(labelname = "", column = "remarks", length = 100, isnull = true)
	private String remarks;

}