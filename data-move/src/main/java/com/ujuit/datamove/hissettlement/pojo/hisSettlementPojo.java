package com.ujuit.datamove.hissettlement.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.util.*;

@GenTable(name = "t_his_settlement", desc = "主账户委托信息")
@GenModel(packageName = "com.ujuit.datamove.hissettlement", modelName = "hissettlement")
public class hisSettlementPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "", column = "trade_date", isnull = true)
	private Date tradeDate;

	@GenField(labelname = "", column = "master_id", isnull = true)
	private Integer masterId;

	@GenField(labelname = "", column = "his_record", isnull = true)
	private String hisRecord;

	@GenField(labelname = "比对状态   1：比对过   其他：未必对过", column = "compare_status", length = 1, isnull = true)
	private String compareStatus;

}