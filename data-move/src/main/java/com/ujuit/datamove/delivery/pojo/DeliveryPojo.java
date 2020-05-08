package com.ujuit.datamove.delivery.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_delivery", desc = "主账户对应主机地址记录")
@GenModel(packageName = "com.ujuit.datamove.delivery", modelName = "delivery")
public class DeliveryPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "交割日期", column = "trade_date", isnull = true)
	private Date tradeDate;

	@GenField(labelname = "合约号", column = "instrument_id", length = 20, isnull = true)
	private String instrumentId;

	@GenField(labelname = "(0,买，1卖)", column = "direction", length = 1, isnull = true)
	private String direction;

	@GenField(labelname = "交割手续费", column = "cost", isnull = true)
	private BigDecimal cost;

	@GenField(labelname = "保证金", column = "collateral", isnull = true)
	private BigDecimal collateral;

	@GenField(labelname = "平仓盈亏", column = "close_profit", isnull = true)
	private BigDecimal closeProfit;

	@GenField(labelname = "结算价", column = "settlement_price", isnull = true)
	private BigDecimal settlementPrice;

	@GenField(labelname = "", column = "create_time", isnull = true)
	private Date createTime;

	@GenField(labelname = "子账户id", column = "sub_account_id", isnull = true)
	private Integer subAccountId;

}