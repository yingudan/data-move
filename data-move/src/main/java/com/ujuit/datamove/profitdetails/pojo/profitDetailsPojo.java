package com.ujuit.datamove.profitdetails.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_profit_details", desc = "账户手续费 ")
@GenModel(packageName = "com.ujuit.datamove.profitdetails", modelName = "profitdetails")
public class profitDetailsPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "编码ID", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "金额", column = "amount", isnull = false)
	private BigDecimal amount;

	@GenField(labelname = "创建日期", column = "create_time", isnull = true)
	private Date create_time;

	@GenField(labelname = "0、无风险利率(平台利息)    1、手续费  2、交易所手续费退还  3.第三方下单申报费损失", column = "type", length = 1, isnull = false)
	private String type;

	@GenField(labelname = "备注信息", column = "remark", length = 100, isnull = true)
	private String remark;

	@GenField(labelname = "母账户ID", column = "master_id", isnull = true)
	private Integer masterId;

	@GenField(labelname = "子账号ID", column = "sub_account_id", isnull = true)
	private Integer subAccountId;

	@GenField(labelname = "记录日期", column = "record_date", isnull = true)
	private Date recordDate;

}