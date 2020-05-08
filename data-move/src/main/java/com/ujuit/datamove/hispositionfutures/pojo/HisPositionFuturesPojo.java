package com.ujuit.datamove.hispositionfutures.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_his_position_futures", desc = "子账户历史持仓")
@GenModel(packageName = "com.ujuit.datamove.hispositionfutures", modelName = "hispositionfutures")
public class HisPositionFuturesPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "id", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "名称", column = "name", length = 50, isnull = true)
	private String name;

	@GenField(labelname = "编码", column = "code", length = 20, isnull = true)
	private String code;

	@GenField(labelname = "子账号ID", column = "sub_account_id", isnull = true)
	private Integer subAccountId;

	@GenField(labelname = "持仓总数", column = "total_number", isnull = true)
	private Integer totalNumber;

	@GenField(labelname = "今仓", column = "today_number", isnull = true)
	private Integer todayNumber;

	@GenField(labelname = "可用持仓", column = "surplus_total_number", isnull = true)
	private Integer surplusTotalNumber;

	@GenField(labelname = "今可用", column = "today_surplus_total_number", isnull = true)
	private Integer todaySurplusTotalNumber;

	@GenField(labelname = "买卖方向 0买(做多) 1卖（做空）", column = "direction", length = 1, isnull = true)
	private String direction;

	@GenField(labelname = "持仓均价", column = "price", isnull = true)
	private BigDecimal price;

	@GenField(labelname = "开仓均价", column = "open_price", isnull = true)
	private BigDecimal openPrice;

	@GenField(labelname = "保证金", column = "collateral", isnull = true)
	private BigDecimal collateral;

	@GenField(labelname = "投机套保标志类型(1.投机  2.套利  3.套保5.做市商)", column = "hedge_flag_type", length = 1, isnull = true)
	private String hedgeFlagType;

	@GenField(labelname = "最后成交时间", column = "last_deal_time", isnull = true)
	private Date lastDealTime;

	@GenField(labelname = "昨日结算价", column = "last_settlement_price", isnull = true)
	private BigDecimal lastSettlementPrice;

	@GenField(labelname = "今日持仓均价", column = "today_price", isnull = true)
	private BigDecimal todayPrice;

	@GenField(labelname = "结算日期", column = "his_date", isnull = true)
	private Date hisDate;

	@GenField(labelname = "持仓盈亏", column = "position_profit", isnull = true)
	private BigDecimal positionProfit;

	@GenField(labelname = "", column = "create_time", isnull = true)
	private Date createTime;

}