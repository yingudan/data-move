package com.ujuit.datamove.dailymasterassets.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "daily_master_assets", desc = "主账户历史资金纪录 ")
@GenModel(packageName = "com.ujuit.datamove.dailymasterassets", modelName = "dailymasterassets")
public class DailyMasterAssetsPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "母账户id", column = "t_master_id", isnull = true)
	private Integer tMasterId;

	@GenField(labelname = "总资产", column = "total_assets", isnull = true)
	private BigDecimal totalAssets;

	@GenField(labelname = "成本", column = "capital_amount", isnull = true)
	private BigDecimal capitalAmount;

	@GenField(labelname = "记录的历史日期", column = "his_date", isnull = true)
	private Date hisDate;

	@GenField(labelname = "利润", column = "profit", isnull = true)
	private BigDecimal profit;

	@GenField(labelname = "可配资金", column = "disposition", isnull = true)
	private BigDecimal disposition;

}