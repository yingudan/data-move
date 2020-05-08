package com.ujuit.datamove.masterrepairorder.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_master_repair_order", desc = "111")
@GenModel(packageName = "com.ujuit.datamove.masterrepairorder", modelName = "masterrepairorder")
public class MasterRepairOrderPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "", column = "master_order_id", isnull = false)
	private Integer masterOrderId;

	@GenField(labelname = "", column = "child_order_id", isnull = false)
	private Integer childOrderId;

	@GenField(labelname = "", column = "create_time", isnull = true)
	private Date createTime;

}