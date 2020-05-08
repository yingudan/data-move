package com.ujuit.datamove.ctphissettledealgold.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_ctp_hissettle_dealgold", desc = "ctp账户出入金")
@GenModel(packageName = "com.ujuit.datamove.ctphissettledealgold", modelName = "ctphissettledealgold")
public class CtpHissettleDealgoldPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "母账户id", column = "master_id", isnull = true)
	private Integer masterId;

	@GenField(labelname = "", column = "trade_date", isnull = true)
	private Date tradeDate;

	@GenField(labelname = "类型", column = "type", length = 50, isnull = true)
	private String type;

	@GenField(labelname = "出入金金额", column = "deposit_withdrawal", isnull = true)
	private BigDecimal deposit_withdrawal;

	@GenField(labelname = "备注", column = "note", length = 255, isnull = true)
	private String note;

	@GenField(labelname = "创建时间", column = "create_time", isnull = true)
	private Date createTime;

	@GenField(labelname = "方向   1：入金   2：出金", column = "direction", length = 255, isnull = true)
	private String direction;

}