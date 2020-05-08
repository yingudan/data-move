package com.ujuit.datamove.instrumentoptional.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_instrument_optional", desc = "合约基本信息")
@GenModel(packageName = "com.ujuit.datamove.instrumentoptional", modelName = "instrumentoptional")
public class InstrumentOptionalPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "", column = "instrument_id", length = 8, isnull = true)
	private String instrumentId;

	@GenField(labelname = "", column = "sub_account_id", isnull = true)
	private Integer subAccountId;

	@GenField(labelname = "", column = "create_time", isnull = true)
	private Date createTime;

	@GenField(labelname = "0,未交割1交割", column = "expire", length = 1, isnull = false)
	private Date expire;

}