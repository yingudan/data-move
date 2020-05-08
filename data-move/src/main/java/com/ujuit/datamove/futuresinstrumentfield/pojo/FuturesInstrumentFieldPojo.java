package com.ujuit.datamove.futuresinstrumentfield.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_futures_instrument_field", desc = "合约基本信息")
@GenModel(packageName = "com.ujuit.datamove.futuresinstrumentfield", modelName = "futuresinstrumentfield")
public class FuturesInstrumentFieldPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "id", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "合约基本信息", column = "content", isnull = true)
	private String content;

	@GenField(labelname = "日期", column = "trade_date", isnull = false)
	private Date tradeDate;

	@GenField(labelname = "", column = "update_time", isnull = true)
	private Date updateTime;

	@GenField(labelname = "0、false未启动检查，1 true已经启动检查", column = "check", isnull = true)
	private Short check;

}