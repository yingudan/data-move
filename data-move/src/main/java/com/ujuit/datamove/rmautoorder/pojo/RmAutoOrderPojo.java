package com.ujuit.datamove.rmautoorder.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_rm_auto_order", desc = "")
@GenModel(packageName = "com.ujuit.datamove.rmautoorder", modelName = "rmautoorder")
public class RmAutoOrderPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "子账户id", column = "sub_account_id", isnull = true)
	private Integer subAccountId;

	@GenField(labelname = "多少跳", column = "tick_num", isnull = true)
	private Integer tickNum;

	@GenField(labelname = "创建时间", column = "create_time", isnull = true)
	private Date createTime;

	@GenField(labelname = "最后修改时间", column = "last_modify_time", isnull = true)
	private Date lastModifyTime;

}