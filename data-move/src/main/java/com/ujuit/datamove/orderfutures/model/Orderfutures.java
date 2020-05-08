package com.ujuit.datamove.orderfutures.model;

import java.math.BigDecimal;
import java.util.*;

/**
 * 子账户信息
 * 
 * @author shadow
 */
public class Orderfutures {
	/**
	 * id
	 */
	private Integer id;
	/**
	 * 股票名称
	 */
	private String name;
	/**
	 * 股票编码
	 */
	private String code;
	/**
	 * 申请人ID
	 */
	private Integer subAccountId;
	/**
	 * 委托时间
	 */
	private Date entrustTime;
	/**
	 * 委托金额
	 */
	private BigDecimal entrustPrice;
	/**
	 * 下单数量
	 */
	private Integer entrustNumber;
	/**
	 * 类型(0,买，1卖)
	 */
	private String direction;
	/**
	 * 开平标志类型(0、开仓1、平仓2、强平3、平今4、平昨5、强减6本地强平）
	 */
	private String positionType;
	/**
	 * 报单价格条件（0.委托价 1.排队价 2.对手价 3.市价 4.最新价 5.超价）
	 */
	private String priceType;
	/**
	 * 强平原因
	 */
	private String forceCloseReason;
	/**
	 * 投机套保标志类型(1.投机 2.套利 3.套保5.做市商)
	 */
	private String hedgeFlagType;
	/**
	 * 状态0、全部成交 1，部分成交, 2、部分撤单 3、已申报4、未申报 5、撤单 a、未知 b、未触发 c、已触发
	 */
	private String status;
	/**
	 * 状态描述/交易描述
	 */
	private String statusDesc;
	/**
	 * 撤单数量
	 */
	private Integer cancelNumber;
	/**
	 * 成交总数
	 */
	private Integer totalDealNumber;
	/**
	 * 累计成交金额
	 */
	private BigDecimal totalDealAmount;
	/**
	 * 客户端标记
	 */
	private String clientTab;
	/**
	 * 测得类型（1，用户撤单，0系统撤单）
	 */
	private String cancelType;
	/**
	 * 撤单日期
	 */
	private Date cancelTime;
	/**
	 * 手续费
	 */
	private BigDecimal cost;
	/**
	 * 备注描述 /交易描述
	 */
	private String remarks;
	/**
	 * 平仓盈亏
	 */
	private BigDecimal closePositionProfit;
	/**
	 * 冻结保证金
	 */
	private BigDecimal frozenCollateral;
	/**
	 * 创建日期
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 冻结手续费
	 */
	private BigDecimal frozenCost;
	/**
	 *
	 */
	private String exchangeId;
	/**
	 * 保证金
	 */
	private BigDecimal collateral;
	/**
	 * 下单来源 1.用户手动下单 2.策略下单 3.条件单 4.止盈单 5.止损单 6.定时平仓
	 */
	private String orderSourceType;
	/**
	 * 下单来源 详细信息（预留字段）
	 */
	private String orderSourceTypeInfo;
	/**
	 * 开仓后的平仓标志（0，未操作，1操作部分2、完成）
	 */
	private String closePositionFlag;
	/**
	 * 可用仓位
	 */
	private Integer surplusCloseNumber;
	/**
	 * 剩余仓位
	 */
	private Integer closeNumber;
	/**
	 * 1策略系统、2交易客户端、3交易信号系统4、风控 5、系统自动平仓8、手动强平、7补单、8、手动 9自动强平
	 */
	private Integer sourceType;
	/**
	 * 信号为信息ID策略和客户端(1、普通、2高频)为类型
	 */
	private Integer sourceId;
	/**
	 * 条件备注
	 */
	private String condRemark;
	/**
	 *
	 */
	private Integer orderRef;
	/**
	 * 申报费用
	 */
	private BigDecimal reportFee;
	/**
	 * ctp订单号
	 */
	private String orderSysId;
	/**
	 * 最后成交时间
	 */
	private Date lastDealTime;
	/**
	 * 当日平仓盈亏
	 */
	private BigDecimal todayClosePositionProfit;
	/**
	 *
	 */
	private String uuid;
	/**
	 *
	 */
	private String exchange;
	/**
	 * 报单编号 合约号 OrderSysID
	 */
	private String contractNo;
	/**
	 * 成交编码
	 */
	private String dealNo;
	/**
	 *
	 */
	private Integer frontId;
	/**
	 *
	 */
	private Integer sessionId;
	/**
	 * 昨日结算价
	 */
	private BigDecimal lastSettlementPrice;
	/**
	 * 母账户id
	 */
	private Integer masterid;

	/**
	 * 
	 */
	private Integer newId;

	public Integer getNewId() {
		return newId;
	}

	public void setNewId(Integer newId) {
		this.newId = newId;
	}

	/**
	 * id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 股票名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 股票名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 股票编码
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 股票编码
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 申请人ID
	 */
	public Integer getSubAccountId() {
		return subAccountId;
	}

	/**
	 * 申请人ID
	 */
	public void setSubAccountId(Integer subAccountId) {
		this.subAccountId = subAccountId;
	}

	/**
	 * 委托时间
	 */
	public Date getEntrustTime() {
		return entrustTime;
	}

	/**
	 * 委托时间
	 */
	public void setEntrustTime(Date entrustTime) {
		this.entrustTime = entrustTime;
	}

	/**
	 * 委托金额
	 */
	public BigDecimal getEntrustPrice() {
		return entrustPrice;
	}

	/**
	 * 委托金额
	 */
	public void setEntrustPrice(BigDecimal entrustPrice) {
		this.entrustPrice = entrustPrice;
	}

	/**
	 * 下单数量
	 */
	public Integer getEntrustNumber() {
		return entrustNumber;
	}

	/**
	 * 下单数量
	 */
	public void setEntrustNumber(Integer entrustNumber) {
		this.entrustNumber = entrustNumber;
	}

	/**
	 * 类型(0,买，1卖)
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * 类型(0,买，1卖)
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * 开平标志类型(0、开仓1、平仓2、强平3、平今4、平昨5、强减6本地强平）
	 */
	public String getPositionType() {
		return positionType;
	}

	/**
	 * 开平标志类型(0、开仓1、平仓2、强平3、平今4、平昨5、强减6本地强平）
	 */
	public void setPositionType(String positionType) {
		this.positionType = positionType;
	}

	/**
	 * 报单价格条件（0.委托价 1.排队价 2.对手价 3.市价 4.最新价 5.超价）
	 */
	public String getPriceType() {
		return priceType;
	}

	/**
	 * 报单价格条件（0.委托价 1.排队价 2.对手价 3.市价 4.最新价 5.超价）
	 */
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	/**
	 * 强平原因
	 */
	public String getForceCloseReason() {
		return forceCloseReason;
	}

	/**
	 * 强平原因
	 */
	public void setForceCloseReason(String forceCloseReason) {
		this.forceCloseReason = forceCloseReason;
	}

	/**
	 * 投机套保标志类型(1.投机 2.套利 3.套保5.做市商)
	 */
	public String getHedgeFlagType() {
		return hedgeFlagType;
	}

	/**
	 * 投机套保标志类型(1.投机 2.套利 3.套保5.做市商)
	 */
	public void setHedgeFlagType(String hedgeFlagType) {
		this.hedgeFlagType = hedgeFlagType;
	}

	/**
	 * 状态0、全部成交 1，部分成交, 2、部分撤单 3、已申报4、未申报 5、撤单 a、未知 b、未触发 c、已触发
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 状态0、全部成交 1，部分成交, 2、部分撤单 3、已申报4、未申报 5、撤单 a、未知 b、未触发 c、已触发
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 状态描述/交易描述
	 */
	public String getStatusDesc() {
		return statusDesc;
	}

	/**
	 * 状态描述/交易描述
	 */
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	/**
	 * 撤单数量
	 */
	public Integer getCancelNumber() {
		return cancelNumber;
	}

	/**
	 * 撤单数量
	 */
	public void setCancelNumber(Integer cancelNumber) {
		this.cancelNumber = cancelNumber;
	}

	/**
	 * 成交总数
	 */
	public Integer getTotalDealNumber() {
		return totalDealNumber;
	}

	/**
	 * 成交总数
	 */
	public void setTotalDealNumber(Integer totalDealNumber) {
		this.totalDealNumber = totalDealNumber;
	}

	/**
	 * 累计成交金额
	 */
	public BigDecimal getTotalDealAmount() {
		return totalDealAmount;
	}

	/**
	 * 累计成交金额
	 */
	public void setTotalDealAmount(BigDecimal totalDealAmount) {
		this.totalDealAmount = totalDealAmount;
	}

	/**
	 * 客户端标记
	 */
	public String getClientTab() {
		return clientTab;
	}

	/**
	 * 客户端标记
	 */
	public void setClientTab(String clientTab) {
		this.clientTab = clientTab;
	}

	/**
	 * 测得类型（1，用户撤单，0系统撤单）
	 */
	public String getCancelType() {
		return cancelType;
	}

	/**
	 * 测得类型（1，用户撤单，0系统撤单）
	 */
	public void setCancelType(String cancelType) {
		this.cancelType = cancelType;
	}

	/**
	 * 撤单日期
	 */
	public Date getCancelTime() {
		return cancelTime;
	}

	/**
	 * 撤单日期
	 */
	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}

	/**
	 * 手续费
	 */
	public BigDecimal getCost() {
		return cost;
	}

	/**
	 * 手续费
	 */
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	/**
	 * 备注描述 /交易描述
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * 备注描述 /交易描述
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * 平仓盈亏
	 */
	public BigDecimal getClosePositionProfit() {
		return closePositionProfit;
	}

	/**
	 * 平仓盈亏
	 */
	public void setClosePositionProfit(BigDecimal closePositionProfit) {
		this.closePositionProfit = closePositionProfit;
	}

	/**
	 * 冻结保证金
	 */
	public BigDecimal getFrozenCollateral() {
		return frozenCollateral;
	}

	/**
	 * 冻结保证金
	 */
	public void setFrozenCollateral(BigDecimal frozenCollateral) {
		this.frozenCollateral = frozenCollateral;
	}

	/**
	 * 创建日期
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 创建日期
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * 更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 冻结手续费
	 */
	public BigDecimal getFrozenCost() {
		return frozenCost;
	}

	/**
	 * 冻结手续费
	 */
	public void setFrozenCost(BigDecimal frozenCost) {
		this.frozenCost = frozenCost;
	}

	/** 
	 *
	 */
	public String getExchangeId() {
		return exchangeId;
	}

	/** 
	 *
	 */
	public void setExchangeId(String exchangeId) {
		this.exchangeId = exchangeId;
	}

	/**
	 * 保证金
	 */
	public BigDecimal getCollateral() {
		return collateral;
	}

	/**
	 * 保证金
	 */
	public void setCollateral(BigDecimal collateral) {
		this.collateral = collateral;
	}

	/**
	 * 下单来源 1.用户手动下单 2.策略下单 3.条件单 4.止盈单 5.止损单 6.定时平仓
	 */
	public String getOrderSourceType() {
		return orderSourceType;
	}

	/**
	 * 下单来源 1.用户手动下单 2.策略下单 3.条件单 4.止盈单 5.止损单 6.定时平仓
	 */
	public void setOrderSourceType(String orderSourceType) {
		this.orderSourceType = orderSourceType;
	}

	/**
	 * 下单来源 详细信息（预留字段）
	 */
	public String getOrderSourceTypeInfo() {
		return orderSourceTypeInfo;
	}

	/**
	 * 下单来源 详细信息（预留字段）
	 */
	public void setOrderSourceTypeInfo(String orderSourceTypeInfo) {
		this.orderSourceTypeInfo = orderSourceTypeInfo;
	}

	/**
	 * 开仓后的平仓标志（0，未操作，1操作部分2、完成）
	 */
	public String getClosePositionFlag() {
		return closePositionFlag;
	}

	/**
	 * 开仓后的平仓标志（0，未操作，1操作部分2、完成）
	 */
	public void setClosePositionFlag(String closePositionFlag) {
		this.closePositionFlag = closePositionFlag;
	}

	/**
	 * 可用仓位
	 */
	public Integer getSurplusCloseNumber() {
		return surplusCloseNumber;
	}

	/**
	 * 可用仓位
	 */
	public void setSurplusCloseNumber(Integer surplusCloseNumber) {
		this.surplusCloseNumber = surplusCloseNumber;
	}

	/**
	 * 剩余仓位
	 */
	public Integer getCloseNumber() {
		return closeNumber;
	}

	/**
	 * 剩余仓位
	 */
	public void setCloseNumber(Integer closeNumber) {
		this.closeNumber = closeNumber;
	}

	/**
	 * 1策略系统、2交易客户端、3交易信号系统4、风控 5、系统自动平仓8、手动强平、7补单、8、手动 9自动强平
	 */
	public Integer getSourceType() {
		return sourceType;
	}

	/**
	 * 1策略系统、2交易客户端、3交易信号系统4、风控 5、系统自动平仓8、手动强平、7补单、8、手动 9自动强平
	 */
	public void setSourceType(Integer sourceType) {
		this.sourceType = sourceType;
	}

	/**
	 * 信号为信息ID策略和客户端(1、普通、2高频)为类型
	 */
	public Integer getSourceId() {
		return sourceId;
	}

	/**
	 * 信号为信息ID策略和客户端(1、普通、2高频)为类型
	 */
	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}

	/**
	 * 条件备注
	 */
	public String getCondRemark() {
		return condRemark;
	}

	/**
	 * 条件备注
	 */
	public void setCondRemark(String condRemark) {
		this.condRemark = condRemark;
	}

	/** 
	 *
	 */
	public Integer getOrderRef() {
		return orderRef;
	}

	/** 
	 *
	 */
	public void setOrderRef(Integer orderRef) {
		this.orderRef = orderRef;
	}

	/**
	 * 申报费用
	 */
	public BigDecimal getReportFee() {
		return reportFee;
	}

	/**
	 * 申报费用
	 */
	public void setReportFee(BigDecimal reportFee) {
		this.reportFee = reportFee;
	}

	/**
	 * ctp订单号
	 */
	public String getOrderSysId() {
		return orderSysId;
	}

	/**
	 * ctp订单号
	 */
	public void setOrderSysId(String orderSysId) {
		this.orderSysId = orderSysId;
	}

	/**
	 * 最后成交时间
	 */
	public Date getLastDealTime() {
		return lastDealTime;
	}

	/**
	 * 最后成交时间
	 */
	public void setLastDealTime(Date lastDealTime) {
		this.lastDealTime = lastDealTime;
	}

	/**
	 * 当日平仓盈亏
	 */
	public BigDecimal getTodayClosePositionProfit() {
		return todayClosePositionProfit;
	}

	/**
	 * 当日平仓盈亏
	 */
	public void setTodayClosePositionProfit(BigDecimal todayClosePositionProfit) {
		this.todayClosePositionProfit = todayClosePositionProfit;
	}

	/** 
	 *
	 */
	public String getUuid() {
		return uuid;
	}

	/** 
	 *
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/** 
	 *
	 */
	public String getExchange() {
		return exchange;
	}

	/** 
	 *
	 */
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	/**
	 * 报单编号 合约号 OrderSysID
	 */
	public String getContractNo() {
		return contractNo;
	}

	/**
	 * 报单编号 合约号 OrderSysID
	 */
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	/**
	 * 成交编码
	 */
	public String getDealNo() {
		return dealNo;
	}

	/**
	 * 成交编码
	 */
	public void setDealNo(String dealNo) {
		this.dealNo = dealNo;
	}

	/** 
	 *
	 */
	public Integer getFrontId() {
		return frontId;
	}

	/** 
	 *
	 */
	public void setFrontId(Integer frontId) {
		this.frontId = frontId;
	}

	/** 
	 *
	 */
	public Integer getSessionId() {
		return sessionId;
	}

	/** 
	 *
	 */
	public void setSessionId(Integer sessionId) {
		this.sessionId = sessionId;
	}

	/**
	 * 昨日结算价
	 */
	public BigDecimal getLastSettlementPrice() {
		return lastSettlementPrice;
	}

	/**
	 * 昨日结算价
	 */
	public void setLastSettlementPrice(BigDecimal lastSettlementPrice) {
		this.lastSettlementPrice = lastSettlementPrice;
	}

	/**
	 * 母账户id
	 */
	public Integer getMasterid() {
		return masterid;
	}

	/**
	 * 母账户id
	 */
	public void setMasterid(Integer masterid) {
		this.masterid = masterid;
	}
}