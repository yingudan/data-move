package com.ujuit.datamove.masterfuturesdailyorder.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_master_futures_daily_order", desc = "主账户委托信息")
@GenModel(packageName = "com.ujuit.datamove.masterfuturesdailyorder", modelName = "masterfuturesdailyorder")
public class MasterFuturesDailyOrderPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "经纪公司代码", column = "broker_id", length = 10, isnull = true)
	private String brokerId;

	@GenField(labelname = "投资者代码", column = "investor_id", length = 30, isnull = true)
	private String investorId;

	@GenField(labelname = "合约代码", column = "instrument_id", length = 20, isnull = true)
	private String instrumentId;

	@GenField(labelname = "", column = "order_ref", length = 50, isnull = true)
	private String orderRef;

	@GenField(labelname = "用户代码", column = "user_id", length = 50, isnull = true)
	private String userId;

	@GenField(labelname = "报单价格条件", column = "order_price_type", length = 1, isnull = true)
	private String orderPriceType;

	@GenField(labelname = "买卖方向", column = "direction", length = 1, isnull = true)
	private String direction;

	@GenField(labelname = "组合开平标志", column = "comb_offset_flag", length = 1, isnull = true)
	private String combOffsetFlag;

	@GenField(labelname = "组合投机套保标志", column = "comb_hedge_flag", length = 10, isnull = true)
	private String combHedgeFlag;

	@GenField(labelname = "价格", column = "limit_price", isnull = true)
	private Double limitPrice;

	@GenField(labelname = "数量", column = "volume_total_original", isnull = true)
	private Integer volumeTotalOriginal;

	@GenField(labelname = "有效期类型", column = "time_condition", length = 1, isnull = true)
	private String timeCondition;

	@GenField(labelname = "GTD日期", column = "gtd_date", length = 10, isnull = true)
	private String gtdDate;

	@GenField(labelname = "成交量类型", column = "volume_condition", length = 1, isnull = true)
	private String volumeCondition;

	@GenField(labelname = "最小成交量", column = "min_volume", isnull = true)
	private Integer minVolume;

	@GenField(labelname = "触发条件", column = "contingent_condition", length = 1, isnull = true)
	private String contingentCondition;

	@GenField(labelname = "止损价", column = "stop_price", isnull = true)
	private Double stopPrice;

	@GenField(labelname = "强平原因", column = "force_close_reason", length = 10, isnull = true)
	private String forceCloseReason;

	@GenField(labelname = "自动挂起标志", column = "auto_suspend", isnull = true)
	private Short autoSuspend;

	@GenField(labelname = "业务单元", column = "business_unit", length = 50, isnull = true)
	private String businessUnit;

	@GenField(labelname = "请求编号", column = "request_id", isnull = true)
	private Integer requestId;

	@GenField(labelname = "本地报单编号", column = "order_local_id", length = 50, isnull = true)
	private String orderLocalId;

	@GenField(labelname = "交易所代码", column = "exchange_id", length = 10, isnull = true)
	private String exchangeId;

	@GenField(labelname = "会员代码", column = "participant_id", length = 50, isnull = true)
	private String participantId;

	@GenField(labelname = "客户代码", column = "client_id", length = 10, isnull = true)
	private String clientId;

	@GenField(labelname = "合约在交易所的代码", column = "exchange_inst_id", length = 10, isnull = true)
	private String exchangeInstId;

	@GenField(labelname = "交易所交易员代码", column = "trader_id", length = 50, isnull = true)
	private String traderId;

	@GenField(labelname = "安装编号", column = "install_id", isnull = true)
	private Integer installId;

	@GenField(labelname = "报单提交状态", column = "order_submit_status", length = 1, isnull = true)
	private String orderSubmitStatus;

	@GenField(labelname = "报单提示序号", column = "notify_sequence", isnull = true)
	private Integer notifySequence;

	@GenField(labelname = "交易日", column = "trading_day", isnull = true)
	private Date tradingDay;

	@GenField(labelname = "结算编号", column = "settlement_id", isnull = true)
	private Integer settlementId;

	@GenField(labelname = "保单编号", column = "order_sys_id", length = 50, isnull = true)
	private String orderSysId;

	@GenField(labelname = "报单来源", column = "order_source", length = 1, isnull = true)
	private String orderSource;

	@GenField(labelname = "报单状态", column = "order_status", length = 1, isnull = true)
	private String orderStatus;

	@GenField(labelname = "报单类型", column = "order_type", length = 1, isnull = true)
	private String orderType;

	@GenField(labelname = "今成交数量", column = "volume_traded", isnull = true)
	private Integer volumeTraded;

	@GenField(labelname = "剩余数量", column = "volume_total", isnull = true)
	private Integer volumeTotal;

	@GenField(labelname = "报单日期", column = "insert_date", isnull = true)
	private Date insertDate;

	@GenField(labelname = "", column = "insert_time", isnull = true)
	private Date insertTime;

	@GenField(labelname = "激活时间", column = "active_time", length = 10, isnull = true)
	private String activeTime;

	@GenField(labelname = " 挂起时间", column = "suspend_time", length = 10, isnull = true)
	private String suspendTime;

	@GenField(labelname = "最后修改时间", column = "update_time", length = 10, isnull = true)
	private String updateTime;

	@GenField(labelname = "撤销时间", column = "cancel_time", length = 20, isnull = true)
	private String cancelTime;

	@GenField(labelname = "最后修改交易所交易员代码", column = "active_trader_id", length = 10, isnull = true)
	private String activeTraderId;

	@GenField(labelname = "结算会员编号", column = "clearing_part_id", length = 10, isnull = true)
	private String clearingPartId;

	@GenField(labelname = "序号", column = "sequence_no", isnull = true)
	private Integer sequenceNo;

	@GenField(labelname = "前置编号", column = "front_id", isnull = true)
	private Integer frontId;

	@GenField(labelname = "会话编号", column = "session_id", isnull = true)
	private Integer sessionId;

	@GenField(labelname = "用户端产品信息", column = "user_product_info", length = 255, isnull = true)
	private String userProductInfo;

	@GenField(labelname = "状态信息", column = "status_msg", length = 255, isnull = true)
	private String statusMsg;

	@GenField(labelname = "", column = "active_user_id", length = 10, isnull = true)
	private String activeUserId;

	@GenField(labelname = "用户强评标志", column = "user_force_close", isnull = true)
	private Short userForceClose;

	@GenField(labelname = "经纪公司报单编号", column = "broker_order_seq", isnull = true)
	private Integer brokerOrderSeq;

	@GenField(labelname = "相关报单", column = "relative_order_sys_id", length = 10, isnull = true)
	private String relativeOrderSysId;

	@GenField(labelname = "郑商所成交数量", column = "zce_total_traded_volume", isnull = true)
	private Integer zceTotalTradedVolume;

	@GenField(labelname = "营业部编号", column = "branch_id", length = 50, isnull = true)
	private String branchId;

	@GenField(labelname = "互换单标志", column = "swap_order", isnull = true)
	private Short swapOrder;

	@GenField(labelname = "投资单元代码", column = "invest_unit_id", length = 50, isnull = true)
	private String investUnitId;

	@GenField(labelname = "资金账号", column = "account_id", length = 10, isnull = true)
	private String accountId;

	@GenField(labelname = "币种代码", column = "currency_id", length = 10, isnull = true)
	private String currencyId;

	@GenField(labelname = "IP地址", column = "ip_address", length = 20, isnull = true)
	private String ipAddress;

	@GenField(labelname = "", column = "mac_address", length = 36, isnull = true)
	private String macAddress;

	@GenField(labelname = "母账户id", column = "master_id", isnull = true)
	private Integer masterId;

	@GenField(labelname = "0,正常 1，待补单，2，待结算,3已结算", column = "fix_status", length = 1, isnull = true)
	private String fixStatus;

	@GenField(labelname = "t_order_futures 的ID", column = "order_id", isnull = true)
	private Integer orderId;

	@GenField(labelname = "", column = "cost", isnull = true)
	private BigDecimal cost;

	@GenField(labelname = "记录日期", column = "his_date", isnull = true)
	private Date hisDate;

}