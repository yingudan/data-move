package com.ujuit.datamove.expiremessage.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_expire_message", desc = "")
@GenModel(packageName = "com.ujuit.datamove.expiremessage", modelName = "expiremessage")
public class ExpireMessagePojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "合约货股票代码", column = "code", length = 10, isnull = false)
	private String code;

	@GenField(labelname = "类型", column = "type", length = 1, isnull = false)
	private String type;

	@GenField(labelname = "到期日期数", column = "expire_day", isnull = true)
	private Integer expireDay;

	@GenField(labelname = "", column = "create_time", isnull = false)
	private Date createTime;

	@GenField(labelname = "0,未读 1，已读", column = "status", isnull = false)
	private Short status;

}