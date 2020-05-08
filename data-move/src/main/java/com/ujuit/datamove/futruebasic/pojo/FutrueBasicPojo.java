package com.ujuit.datamove.futruebasic.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_futrue_basic", desc = "子账户历史持仓")
@GenModel(packageName = "com.ujuit.datamove.futruebasic", modelName = "futruebasic")
public class FutrueBasicPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "id", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "合约保证金率和手续费率", column = "content", isnull = true)
	private String content;

	@GenField(labelname = "类型 1.期货 2.期货期权 3.组合 4.即期 5.期转现 6.现货期权", column = "type", length = 1, isnull = false)
	private String type;

	@GenField(labelname = "主账号标识", column = "master_id", isnull = true)
	private Integer masterId;

	@GenField(labelname = "日期", column = "trade_date", isnull = false)
	private Date tradeDate;

	@GenField(labelname = "", column = "update_time", isnull = true)
	private Date updateTime;

	@GenField(labelname = "0，主力次主力采集完成1、已经采集完成", column = "status", isnull = false)
	private Integer status;

	@GenField(labelname = "0,真实账户1、内部账户", column = "master_type", isnull = true)
	private Integer masterType;

}