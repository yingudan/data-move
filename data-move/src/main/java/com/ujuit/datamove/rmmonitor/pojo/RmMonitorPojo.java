package com.ujuit.datamove.rmmonitor.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_rm_monitor", desc = "")
@GenModel(packageName = "com.ujuit.datamove.rmmonitor", modelName = "rmmonitor")
public class RmMonitorPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "子账户id", column = "sub_account_id", isnull = true)
	private Integer subAccountId;

	@GenField(labelname = "是否监控", column = "is_monitor", length = 1, isnull = true)
	private String isMonitor;

	@GenField(labelname = "类型 1：自动报单", column = "type", length = 1, isnull = true)
	private String type;

	@GenField(labelname = "创建时间", column = "create_time", isnull = true)
	private Date createTime;

}