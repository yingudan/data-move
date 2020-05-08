package com.ujuit.datamove.masterfuturesdailyorder.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 主账户委托信息
 * 
 * @author shadow
 */
public class Masterfuturesdailyorder {
	/**
	 *
	 */
	private Integer id;
	/**
	 * 经纪公司代码
	 */
	private String brokerId;
	/**
	 * 投资者代码
	 */
	private String investorId;
	/**
	 * 合约代码
	 */
	private String instrumentId;
	/**
	 *
	 */
	private String orderRef;
	/**
	 * 用户代码
	 */
	private String userId;
	/**
	 * 报单价格条件
	 */
	private String orderPriceType;
	/**
	 * 买卖方向
	 */
	private String direction;
	/**
	 * 组合开平标志
	 */
	private String combOffsetFlag;
	/**
	 * 组合投机套保标志
	 */
	private String combHedgeFlag;
	/**
	 * 价格
	 */
	private Double limitPrice;
	/**
	 * 数量
	 */
	private Integer volumeTotalOriginal;
	/**
	 * 有效期类型
	 */
	private String timeCondition;
	/**
	 * GTD日期
	 */
	private String gtdDate;
	/**
	 * 成交量类型
	 */
	private String volumeCondition;
	/**
	 * 最小成交量
	 */
	private Integer minVolume;
	/**
	 * 触发条件
	 */
	private String contingentCondition;
	/**
	 * 止损价
	 */
	private Double stopPrice;
	/**
	 * 强平原因
	 */
	private String forceCloseReason;
	/**
	 * 自动挂起标志
	 */
	private boolean autoSuspend;
	/**
	 * 业务单元
	 */
	private String businessUnit;
	/**
	 * 请求编号
	 */
	private Integer requestId;
	/**
	 * 本地报单编号
	 */
	private String orderLocalId;
	/**
	 * 交易所代码
	 */
	private String exchangeId;
	/**
	 * 会员代码
	 */
	private String participantId;
	/**
	 * 客户代码
	 */
	private String clientId;
	/**
	 * 合约在交易所的代码
	 */
	private String exchangeInstId;
	/**
	 * 交易所交易员代码
	 */
	private String traderId;
	/**
	 * 安装编号
	 */
	private Integer installId;
	/**
	 * 报单提交状态
	 */
	private String orderSubmitStatus;
	/**
	 * 报单提示序号
	 */
	private Integer notifySequence;
	/**
	 * 交易日
	 */
	private String tradingDay;
	/**
	 * 结算编号
	 */
	private Integer settlementId;
	/**
	 * 保单编号
	 */
	private String orderSysId;
	/**
	 * 报单来源
	 */
	private String orderSource;
	/**
	 * 报单状态
	 */
	private String orderStatus;
	/**
	 * 报单类型
	 */
	private String orderType;
	/**
	 * 今成交数量
	 */
	private Integer volumeTraded;
	/**
	 * 剩余数量
	 */
	private Integer volumeTotal;
	/**
	 * 报单日期
	 */
	private Date insertDate;
	/**
	 *
	 */
	private Date insertTime;
	/**
	 * 激活时间
	 */
	private String activeTime;
	/**
	 * 挂起时间
	 */
	private String suspendTime;
	/**
	 * 最后修改时间
	 */
	private String updateTime;
	/**
	 * 撤销时间
	 */
	private String cancelTime;
	/**
	 * 最后修改交易所交易员代码
	 */
	private String activeTraderId;
	/**
	 * 结算会员编号
	 */
	private String clearingPartId;
	/**
	 * 序号
	 */
	private Integer sequenceNo;
	/**
	 * 前置编号
	 */
	private Integer frontId;
	/**
	 * 会话编号
	 */
	private Integer sessionId;
	/**
	 * 用户端产品信息
	 */
	private String userProductInfo;
	/**
	 * 状态信息
	 */
	private String statusMsg;
	/**
	 *
	 */
	private String activeUserId;
	/**
	 * 用户强评标志
	 */
	private boolean userForceClose;
	/**
	 * 经纪公司报单编号
	 */
	private Integer brokerOrderSeq;
	/**
	 * 相关报单
	 */
	private String relativeOrderSysId;
	/**
	 * 郑商所成交数量
	 */
	private Integer zceTotalTradedVolume;
	/**
	 * 营业部编号
	 */
	private String branchId;
	/**
	 * 互换单标志
	 */
	private boolean swapOrder;
	/**
	 * 投资单元代码
	 */
	private String investUnitId;
	/**
	 * 资金账号
	 */
	private String accountId;
	/**
	 * 币种代码
	 */
	private String currencyId;
	/**
	 * IP地址
	 */
	private String ipAddress;
	/**
	 *
	 */
	private String macAddress;
	/**
	 * 母账户id
	 */
	private Integer masterId;
	/**
	 * 0,正常 1，待补单，2，待结算,3已结算
	 */
	private String fixStatus;
	/**
	 * t_order_futures 的ID
	 */
	private Integer orderId;
	/**
	 *
	 */
	private BigDecimal cost;
	/**
	 * 记录日期
	 */
	private Date hisDate;

	/** 
	 *
	 */
	public Integer getId() {
		return id;
	}

	/** 
	 *
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 经纪公司代码
	 */
	public String getBrokerId() {
		return brokerId;
	}

	/**
	 * 经纪公司代码
	 */
	public void setBrokerId(String brokerId) {
		this.brokerId = brokerId;
	}

	/**
	 * 投资者代码
	 */
	public String getInvestorId() {
		return investorId;
	}

	/**
	 * 投资者代码
	 */
	public void setInvestorId(String investorId) {
		this.investorId = investorId;
	}

	/**
	 * 合约代码
	 */
	public String getInstrumentId() {
		return instrumentId;
	}

	/**
	 * 合约代码
	 */
	public void setInstrumentId(String instrumentId) {
		this.instrumentId = instrumentId;
	}

	/** 
	 *
	 */
	public String getOrderRef() {
		return orderRef;
	}

	/** 
	 *
	 */
	public void setOrderRef(String orderRef) {
		this.orderRef = orderRef;
	}

	/**
	 * 用户代码
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 用户代码
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * 报单价格条件
	 */
	public String getOrderPriceType() {
		return orderPriceType;
	}

	/**
	 * 报单价格条件
	 */
	public void setOrderPriceType(String orderPriceType) {
		this.orderPriceType = orderPriceType;
	}

	/**
	 * 买卖方向
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * 买卖方向
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * 组合开平标志
	 */
	public String getCombOffsetFlag() {
		return combOffsetFlag;
	}

	/**
	 * 组合开平标志
	 */
	public void setCombOffsetFlag(String combOffsetFlag) {
		this.combOffsetFlag = combOffsetFlag;
	}

	/**
	 * 组合投机套保标志
	 */
	public String getCombHedgeFlag() {
		return combHedgeFlag;
	}

	/**
	 * 组合投机套保标志
	 */
	public void setCombHedgeFlag(String combHedgeFlag) {
		this.combHedgeFlag = combHedgeFlag;
	}

	/**
	 * 价格
	 */
	public Double getLimitPrice() {
		return limitPrice;
	}

	/**
	 * 价格
	 */
	public void setLimitPrice(Double limitPrice) {
		this.limitPrice = limitPrice;
	}

	/**
	 * 数量
	 */
	public Integer getVolumeTotalOriginal() {
		return volumeTotalOriginal;
	}

	/**
	 * 数量
	 */
	public void setVolumeTotalOriginal(Integer volumeTotalOriginal) {
		this.volumeTotalOriginal = volumeTotalOriginal;
	}

	/**
	 * 有效期类型
	 */
	public String getTimeCondition() {
		return timeCondition;
	}

	/**
	 * 有效期类型
	 */
	public void setTimeCondition(String timeCondition) {
		this.timeCondition = timeCondition;
	}

	/**
	 * GTD日期
	 */
	public String getGtdDate() {
		return gtdDate;
	}

	/**
	 * GTD日期
	 */
	public void setGtdDate(String gtdDate) {
		this.gtdDate = gtdDate;
	}

	/**
	 * 成交量类型
	 */
	public String getVolumeCondition() {
		return volumeCondition;
	}

	/**
	 * 成交量类型
	 */
	public void setVolumeCondition(String volumeCondition) {
		this.volumeCondition = volumeCondition;
	}

	/**
	 * 最小成交量
	 */
	public Integer getMinVolume() {
		return minVolume;
	}

	/**
	 * 最小成交量
	 */
	public void setMinVolume(Integer minVolume) {
		this.minVolume = minVolume;
	}

	/**
	 * 触发条件
	 */
	public String getContingentCondition() {
		return contingentCondition;
	}

	/**
	 * 触发条件
	 */
	public void setContingentCondition(String contingentCondition) {
		this.contingentCondition = contingentCondition;
	}

	/**
	 * 止损价
	 */
	public Double getStopPrice() {
		return stopPrice;
	}

	/**
	 * 止损价
	 */
	public void setStopPrice(Double stopPrice) {
		this.stopPrice = stopPrice;
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
	 * 业务单元
	 */
	public String getBusinessUnit() {
		return businessUnit;
	}

	/**
	 * 业务单元
	 */
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	/**
	 * 请求编号
	 */
	public Integer getRequestId() {
		return requestId;
	}

	/**
	 * 请求编号
	 */
	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}

	/**
	 * 本地报单编号
	 */
	public String getOrderLocalId() {
		return orderLocalId;
	}

	/**
	 * 本地报单编号
	 */
	public void setOrderLocalId(String orderLocalId) {
		this.orderLocalId = orderLocalId;
	}

	/**
	 * 交易所代码
	 */
	public String getExchangeId() {
		return exchangeId;
	}

	/**
	 * 交易所代码
	 */
	public void setExchangeId(String exchangeId) {
		this.exchangeId = exchangeId;
	}

	/**
	 * 会员代码
	 */
	public String getParticipantId() {
		return participantId;
	}

	/**
	 * 会员代码
	 */
	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}

	/**
	 * 客户代码
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * 客户代码
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	/**
	 * 合约在交易所的代码
	 */
	public String getExchangeInstId() {
		return exchangeInstId;
	}

	/**
	 * 合约在交易所的代码
	 */
	public void setExchangeInstId(String exchangeInstId) {
		this.exchangeInstId = exchangeInstId;
	}

	/**
	 * 交易所交易员代码
	 */
	public String getTraderId() {
		return traderId;
	}

	/**
	 * 交易所交易员代码
	 */
	public void setTraderId(String traderId) {
		this.traderId = traderId;
	}

	/**
	 * 安装编号
	 */
	public Integer getInstallId() {
		return installId;
	}

	/**
	 * 安装编号
	 */
	public void setInstallId(Integer installId) {
		this.installId = installId;
	}

	/**
	 * 报单提交状态
	 */
	public String getOrderSubmitStatus() {
		return orderSubmitStatus;
	}

	/**
	 * 报单提交状态
	 */
	public void setOrderSubmitStatus(String orderSubmitStatus) {
		this.orderSubmitStatus = orderSubmitStatus;
	}

	/**
	 * 报单提示序号
	 */
	public Integer getNotifySequence() {
		return notifySequence;
	}

	/**
	 * 报单提示序号
	 */
	public void setNotifySequence(Integer notifySequence) {
		this.notifySequence = notifySequence;
	}

	
	public String getTradingDay() {
		return tradingDay;
	}

	public void setTradingDay(String tradingDay) {
		this.tradingDay = tradingDay;
	}

	/**
	 * 结算编号
	 */
	public Integer getSettlementId() {
		return settlementId;
	}

	/**
	 * 结算编号
	 */
	public void setSettlementId(Integer settlementId) {
		this.settlementId = settlementId;
	}

	/**
	 * 保单编号
	 */
	public String getOrderSysId() {
		return orderSysId;
	}

	/**
	 * 保单编号
	 */
	public void setOrderSysId(String orderSysId) {
		this.orderSysId = orderSysId;
	}

	/**
	 * 报单来源
	 */
	public String getOrderSource() {
		return orderSource;
	}

	/**
	 * 报单来源
	 */
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	/**
	 * 报单状态
	 */
	public String getOrderStatus() {
		return orderStatus;
	}

	/**
	 * 报单状态
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * 报单类型
	 */
	public String getOrderType() {
		return orderType;
	}

	/**
	 * 报单类型
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	/**
	 * 今成交数量
	 */
	public Integer getVolumeTraded() {
		return volumeTraded;
	}

	/**
	 * 今成交数量
	 */
	public void setVolumeTraded(Integer volumeTraded) {
		this.volumeTraded = volumeTraded;
	}

	/**
	 * 剩余数量
	 */
	public Integer getVolumeTotal() {
		return volumeTotal;
	}

	/**
	 * 剩余数量
	 */
	public void setVolumeTotal(Integer volumeTotal) {
		this.volumeTotal = volumeTotal;
	}

	/**
	 * 报单日期
	 */
	public Date getInsertDate() {
		return insertDate;
	}

	/**
	 * 报单日期
	 */
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	/** 
	 *
	 */
	public Date getInsertTime() {
		return insertTime;
	}

	/** 
	 *
	 */
	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

	/**
	 * 激活时间
	 */
	public String getActiveTime() {
		return activeTime;
	}

	/**
	 * 激活时间
	 */
	public void setActiveTime(String activeTime) {
		this.activeTime = activeTime;
	}

	/**
	 * 挂起时间
	 */
	public String getSuspendTime() {
		return suspendTime;
	}

	/**
	 * 挂起时间
	 */
	public void setSuspendTime(String suspendTime) {
		this.suspendTime = suspendTime;
	}

	/**
	 * 最后修改时间
	 */
	public String getUpdateTime() {
		return updateTime;
	}

	/**
	 * 最后修改时间
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 撤销时间
	 */
	public String getCancelTime() {
		return cancelTime;
	}

	/**
	 * 撤销时间
	 */
	public void setCancelTime(String cancelTime) {
		this.cancelTime = cancelTime;
	}

	/**
	 * 最后修改交易所交易员代码
	 */
	public String getActiveTraderId() {
		return activeTraderId;
	}

	/**
	 * 最后修改交易所交易员代码
	 */
	public void setActiveTraderId(String activeTraderId) {
		this.activeTraderId = activeTraderId;
	}

	/**
	 * 结算会员编号
	 */
	public String getClearingPartId() {
		return clearingPartId;
	}

	/**
	 * 结算会员编号
	 */
	public void setClearingPartId(String clearingPartId) {
		this.clearingPartId = clearingPartId;
	}

	/**
	 * 序号
	 */
	public Integer getSequenceNo() {
		return sequenceNo;
	}

	/**
	 * 序号
	 */
	public void setSequenceNo(Integer sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

	/**
	 * 前置编号
	 */
	public Integer getFrontId() {
		return frontId;
	}

	/**
	 * 前置编号
	 */
	public void setFrontId(Integer frontId) {
		this.frontId = frontId;
	}

	/**
	 * 会话编号
	 */
	public Integer getSessionId() {
		return sessionId;
	}

	/**
	 * 会话编号
	 */
	public void setSessionId(Integer sessionId) {
		this.sessionId = sessionId;
	}

	/**
	 * 用户端产品信息
	 */
	public String getUserProductInfo() {
		return userProductInfo;
	}

	/**
	 * 用户端产品信息
	 */
	public void setUserProductInfo(String userProductInfo) {
		this.userProductInfo = userProductInfo;
	}

	/**
	 * 状态信息
	 */
	public String getStatusMsg() {
		return statusMsg;
	}

	/**
	 * 状态信息
	 */
	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}

	/** 
	 *
	 */
	public String getActiveUserId() {
		return activeUserId;
	}

	/** 
	 *
	 */
	public void setActiveUserId(String activeUserId) {
		this.activeUserId = activeUserId;
	}

	/**
	 * 经纪公司报单编号
	 */
	public Integer getBrokerOrderSeq() {
		return brokerOrderSeq;
	}

	/**
	 * 经纪公司报单编号
	 */
	public void setBrokerOrderSeq(Integer brokerOrderSeq) {
		this.brokerOrderSeq = brokerOrderSeq;
	}

	/**
	 * 相关报单
	 */
	public String getRelativeOrderSysId() {
		return relativeOrderSysId;
	}

	/**
	 * 相关报单
	 */
	public void setRelativeOrderSysId(String relativeOrderSysId) {
		this.relativeOrderSysId = relativeOrderSysId;
	}

	/**
	 * 郑商所成交数量
	 */
	public Integer getZceTotalTradedVolume() {
		return zceTotalTradedVolume;
	}

	/**
	 * 郑商所成交数量
	 */
	public void setZceTotalTradedVolume(Integer zceTotalTradedVolume) {
		this.zceTotalTradedVolume = zceTotalTradedVolume;
	}

	/**
	 * 营业部编号
	 */
	public String getBranchId() {
		return branchId;
	}

	/**
	 * 营业部编号
	 */
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public boolean isAutoSuspend() {
		return autoSuspend;
	}

	public void setAutoSuspend(boolean autoSuspend) {
		this.autoSuspend = autoSuspend;
	}

	public boolean isUserForceClose() {
		return userForceClose;
	}

	public void setUserForceClose(boolean userForceClose) {
		this.userForceClose = userForceClose;
	}

	public boolean isSwapOrder() {
		return swapOrder;
	}

	public void setSwapOrder(boolean swapOrder) {
		this.swapOrder = swapOrder;
	}

	/**
	 * 投资单元代码
	 */
	public String getInvestUnitId() {
		return investUnitId;
	}

	/**
	 * 投资单元代码
	 */
	public void setInvestUnitId(String investUnitId) {
		this.investUnitId = investUnitId;
	}

	/**
	 * 资金账号
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * 资金账号
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	/**
	 * 币种代码
	 */
	public String getCurrencyId() {
		return currencyId;
	}

	/**
	 * 币种代码
	 */
	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}

	/**
	 * IP地址
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * IP地址
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/** 
	 *
	 */
	public String getMacAddress() {
		return macAddress;
	}

	/** 
	 *
	 */
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * 母账户id
	 */
	public Integer getMasterId() {
		return masterId;
	}

	/**
	 * 母账户id
	 */
	public void setMasterId(Integer masterId) {
		this.masterId = masterId;
	}

	/**
	 * 0,正常 1，待补单，2，待结算,3已结算
	 */
	public String getFixStatus() {
		return fixStatus;
	}

	/**
	 * 0,正常 1，待补单，2，待结算,3已结算
	 */
	public void setFixStatus(String fixStatus) {
		this.fixStatus = fixStatus;
	}

	/**
	 * t_order_futures 的ID
	 */
	public Integer getOrderId() {
		return orderId;
	}

	/**
	 * t_order_futures 的ID
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	/** 
	 *
	 */
	public BigDecimal getCost() {
		return cost;
	}

	/** 
	 *
	 */
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	/**
	 * 记录日期
	 */
	public Date getHisDate() {
		return hisDate;
	}

	/**
	 * 记录日期
	 */
	public void setHisDate(Date hisDate) {
		this.hisDate = hisDate;
	}
}