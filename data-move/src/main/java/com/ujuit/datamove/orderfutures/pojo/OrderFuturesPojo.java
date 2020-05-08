package com.ujuit.datamove.orderfutures.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_order_futures", desc = "子账户信息")
@GenModel(packageName = "com.ujuit.datamove.orderfutures", modelName = "orderfutures")
public class OrderFuturesPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "id", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "股票名称", column = "name", length = 50, isnull = true)
	private String name;

	@GenField(labelname = "股票编码", column = "code", length = 10, isnull = true)
	private String code;

	@GenField(labelname = "申请人ID", column = "sub_account_id", isnull = true)
	private Integer subAccountId;

	@GenField(labelname = "委托时间", column = "entrust_time", isnull = true)
	private Date entrustTime;

	@GenField(labelname = "委托金额", column = "entrust_price", isnull = true)
	private BigDecimal entrustPrice;

	@GenField(labelname = "下单数量", column = "entrust_number", isnull = true)
	private Integer entrustNumber;

	@GenField(labelname = "类型(0,买，1卖)", column = "direction", length = 1, isnull = true)
	private String direction;

	@GenField(labelname = "开平标志类型(0、开仓1、平仓2、强平3、平今4、平昨5、强减6本地强平）", column = "position_type", length = 1, isnull = true)
	private String positionType;

	@GenField(labelname = "报单价格条件（0.委托价 1.排队价   2.对手价  3.市价  4.最新价 5.超价）", column = "price_type", length = 1, isnull = true)
	private String priceType;

	@GenField(labelname = "强平原因", column = "force_close_reason", length = 200, isnull = true)
	private String forceCloseReason;

	@GenField(labelname = "投机套保标志类型(1.投机  2.套利  3.套保5.做市商)", column = "hedge_flag_type", length = 1, isnull = true)
	private String hedgeFlagType;

	@GenField(labelname = "状态0、全部成交 1，部分成交, 2、部分撤单 3、已申报4、未申报 5、撤单 a、未知 b、未触发 c、已触发", column = "status", length = 2, isnull = true)
	private String status;

	@GenField(labelname = "状态描述/交易描述", column = "status_desc", length = 50, isnull = true)
	private String statusDesc;

	@GenField(labelname = "撤单数量", column = "cancel_number", isnull = true)
	private Integer cancelNumber;

	@GenField(labelname = "成交总数", column = "total_deal_number", isnull = true)
	private Integer totalDealNumber;

	@GenField(labelname = "累计成交金额", column = "total_deal_amount", isnull = true)
	private BigDecimal totalDealAmount;

	@GenField(labelname = "客户端标记", column = "client_tab", length = 50, isnull = true)
	private String clientTab;

	@GenField(labelname = "测得类型（1，用户撤单，0系统撤单）", column = "cancel_type", length = 2, isnull = true)
	private String cancelType;

	@GenField(labelname = "撤单日期", column = "cancel_time", isnull = true)
	private Date cancelTime;

	@GenField(labelname = "手续费", column = "cost", isnull = false)
	private BigDecimal cost;

	@GenField(labelname = "备注描述 /交易描述", column = "remarks", length = 255, isnull = true)
	private String remarks;

	@GenField(labelname = "平仓盈亏", column = "close_position_profit", isnull = true)
	private BigDecimal closePositionProfit;

	@GenField(labelname = "冻结保证金", column = "frozen_collateral", isnull = true)
	private BigDecimal frozenCollateral;

	@GenField(labelname = "创建日期", column = "create_time", isnull = true)
	private Date createTime;

	@GenField(labelname = "更新时间", column = "update_time", isnull = true)
	private Date updateTime;

	@GenField(labelname = "冻结手续费", column = "frozen_cost", isnull = true)
	private BigDecimal frozenCost;

	@GenField(labelname = "", column = "exchange_id", length = 60, isnull = true)
	private String exchangeId;

	@GenField(labelname = "保证金", column = "collateral", isnull = true)
	private BigDecimal collateral;

	@GenField(labelname = "下单来源 1.用户手动下单  2.策略下单  3.条件单  4.止盈单 5.止损单  6.定时平仓  ", column = "order_source_type", length = 1, isnull = true)
	private String orderSourceType;

	@GenField(labelname = "下单来源 详细信息（预留字段）", column = "order_source_type_info", length = 20, isnull = true)
	private String orderSourceTypeInfo;

	@GenField(labelname = "开仓后的平仓标志（0，未操作，1操作部分2、完成）", column = "close_position_flag", length = 1, isnull = true)
	private String closePositionFlag;

	@GenField(labelname = "可用仓位", column = "surplus_close_number", isnull = true)
	private Integer surplusCloseNumber;

	@GenField(labelname = "剩余仓位", column = "close_number", isnull = true)
	private Integer closeNumber;

	@GenField(labelname = "1策略系统、2交易客户端、3交易信号系统4、风控 5、系统自动平仓8、手动强平、7补单、8、手动 9自动强平", column = "source_type", isnull = true)
	private Integer sourceType;

	@GenField(labelname = "信号为信息ID策略和客户端(1、普通、2高频)为类型", column = "source_id", isnull = true)
	private Integer sourceId;

	@GenField(labelname = "条件备注", column = "cond_remark", length = 255, isnull = true)
	private String condRemark;

	@GenField(labelname = "", column = "order_ref", isnull = true)
	private Integer orderRef;

	@GenField(labelname = "申报费用", column = "report_fee", isnull = true)
	private BigDecimal reportFee;

	@GenField(labelname = "ctp订单号", column = "order_sys_id", length = 50, isnull = true)
	private String orderSysId;

	@GenField(labelname = "最后成交时间", column = "last_deal_time", isnull = true)
	private Date lastDealTime;

	@GenField(labelname = "当日平仓盈亏", column = "today_close_position_profit", isnull = true)
	private BigDecimal todayClosePositionProfit;

	@GenField(labelname = "", column = "uuid", length = 50, isnull = true)
	private String uuid;

	@GenField(labelname = "", column = "exchange", length = 10, isnull = true)
	private String exchange;

	@GenField(labelname = "报单编号 合约号 OrderSysID", column = "contract_no", length = 50, isnull = true)
	private String contractNo;

	@GenField(labelname = "成交编码", column = "deal_no", length = 50, isnull = true)
	private String dealNo;

	@GenField(labelname = "", column = "front_id", isnull = true)
	private Integer frontId;

	@GenField(labelname = "", column = "session_id", isnull = true)
	private Integer sessionId;

	@GenField(labelname = "昨日结算价", column = "last_settlement_price", isnull = true)
	private BigDecimal lastSettlementPrice;

	@GenField(labelname = "母账户id", column = "masterId", isnull = true)
	private Integer masterid;

}