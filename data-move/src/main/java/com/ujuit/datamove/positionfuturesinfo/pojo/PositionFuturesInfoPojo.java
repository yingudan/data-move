package com.ujuit.datamove.positionfuturesinfo.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_position_futures_info", desc = "持仓明细")
@GenModel(packageName = "com.ujuit.datamove.positionfuturesinfo", modelName = "positionfuturesinfo")
public class PositionFuturesInfoPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "子账户id", column = "sub_account_id", isnull = false)
	private Integer subAccountId;

	@GenField(labelname = "1.投机、  2.套保", column = "hedge_flag", isnull = true)
	private Integer hedgeFlag;

	@GenField(labelname = "交易所", column = "exchange", length = 10, isnull = true)
	private String exchange;

	@GenField(labelname = "品种", column = "product", length = 10, isnull = true)
	private String product;

	@GenField(labelname = "合约号", column = "instrument_id", length = 20, isnull = true)
	private String instrumentId;

	@GenField(labelname = "数目", column = "num", isnull = true)
	private Integer num;

	@GenField(labelname = "开仓价", column = "open_price", isnull = true)
	private BigDecimal openPrice;

	@GenField(labelname = "开仓时间", column = "open_time", isnull = true)
	private Date openTime;

	@GenField(labelname = "开仓日期", column = "open_date", isnull = true)
	private Date openDate;

	@GenField(labelname = "0.买  1.卖", column = "direction", length = 1, isnull = true)
	private String direction;

	@GenField(labelname = "保证金", column = "collateral", isnull = true)
	private BigDecimal collateral;

	@GenField(labelname = "昨结算", column = "pre_settlement_price", isnull = true)
	private BigDecimal preSettlementPrice;

	@GenField(labelname = "创建时间", column = "create_time", isnull = false)
	private Date createTime;

	@GenField(labelname = "成交ID", column = "deal_order_id", isnull = true)
	private Integer dealOrderId;

	@GenField(labelname = "交易所sys_id", column = "order_sys_id", length = 50, isnull = true)
	private String orderSysId;

}