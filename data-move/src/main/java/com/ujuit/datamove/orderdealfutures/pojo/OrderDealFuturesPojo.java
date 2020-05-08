package com.ujuit.datamove.orderdealfutures.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_order_deal_futures", desc = "委托成交")
@GenModel(packageName = "com.ujuit.datamove.orderdealfutures", modelName = "orderdealfutures")
public class OrderDealFuturesPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "id", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "委托ID", column = "order_id", isnull = true)
	private Integer orderId;

	@GenField(labelname = "成交时间", column = "deal_time", isnull = true)
	private Date dealTime;

	@GenField(labelname = "成交数量", column = "deal_number", isnull = true)
	private Integer dealNumber;

	@GenField(labelname = "成交金额", column = "deal_price", isnull = true)
	private BigDecimal dealPrice;

	@GenField(labelname = "成交编号", column = "deal_no", length = 50, isnull = true)
	private String dealNo;

	@GenField(labelname = "备注信息", column = "remark", length = 400, isnull = true)
	private String remark;

	@GenField(labelname = "日期", column = "create_time", isnull = true)
	private Date createTime;

	@GenField(labelname = "手续费", column = "cost", isnull = true)
	private BigDecimal cost;

	@GenField(labelname = "平仓盈亏", column = "close_position_profit", isnull = true)
	private BigDecimal closePositionProfit;

	@GenField(labelname = "保证金", column = "collateral", isnull = true)
	private BigDecimal collateral;

	@GenField(labelname = "当日平仓盈亏", column = "today_close_position_profit", isnull = true)
	private BigDecimal todayClosePositionProfit;

	@GenField(labelname = "", column = "order_sys_id", length = 20, isnull = true)
	private String orderSysId;

	@GenField(labelname = "", column = "exchange_id", length = 20, isnull = true)
	private String exchangeId;

	@GenField(labelname = "成交方向0买1卖", column = "direction", length = 1, isnull = true)
	private String direction;

	@GenField(labelname = "开平标志0开仓  1平仓  2 强平  3平今 4平昨 5强减 6本地强平", column = "offset_flag", length = 1, isnull = true)
	private String offsetFlag;

}