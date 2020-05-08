package com.ujuit.datamove.cffexoperates.model;

import java.math.BigDecimal;
import java.util.*;

/**
 * 交易记录关联表
 * 
 * @author shadow
 */
public class Cffexoperates {
	/**
	 * id
	 */
	private Integer id;
	/**
	 * 委托表id(外键)
	 */
	private Integer orderId;
	/**
	 * 主账户方向
	 */
	private String direction;
	/**
	 * 开平标志类型(0、开仓1、平仓2、强平3、平今4、平昨5、强减6本地强平）
	 */
	private String positionType;
	/**
	 * create_time
	 */
	private Date createTime;
	/**
	 * 主账号ID
	 */
	private Integer masterId;
	/**
	 * 所在交易日
	 */
	private Date tradeDay;
	/**
	 * 前置机ID
	 */
	private Integer frontId;
	/**
	 * 会话ID
	 */
	private Integer sessionId;
	/**
	 * order_ref
	 */
	private String orderRef;
	/**
	 * 委托数量
	 */
	private Integer number;
	/**
	 *
	 */
	private String status;
	/**
	 *
	 */
	private String statusDesc;
	/**
	 * 总成交数量
	 */
	private Integer dealTotalNumber;
	/**
	 * 总成交金额
	 */
	private BigDecimal dealTotalAmount;
	/**
	 *
	 */
	private String exchangeId;
	/**
	 *
	 */
	private String orderSysId;
	/**
	 * 普通平仓下单冻结持仓明细ID
	 */
	private Integer closePositionDetailId;

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
	 * 委托表id(外键)
	 */
	public Integer getOrderId() {
		return orderId;
	}

	/**
	 * 委托表id(外键)
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	/**
	 * 主账户方向
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * 主账户方向
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
	 * create_time
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * create_time
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 主账号ID
	 */
	public Integer getMasterId() {
		return masterId;
	}

	/**
	 * 主账号ID
	 */
	public void setMasterId(Integer masterId) {
		this.masterId = masterId;
	}

	/**
	 * 所在交易日
	 */
	public Date getTradeDay() {
		return tradeDay;
	}

	/**
	 * 所在交易日
	 */
	public void setTradeDay(Date tradeDay) {
		this.tradeDay = tradeDay;
	}

	/**
	 * 前置机ID
	 */
	public Integer getFrontId() {
		return frontId;
	}

	/**
	 * 前置机ID
	 */
	public void setFrontId(Integer frontId) {
		this.frontId = frontId;
	}

	/**
	 * 会话ID
	 */
	public Integer getSessionId() {
		return sessionId;
	}

	/**
	 * 会话ID
	 */
	public void setSessionId(Integer sessionId) {
		this.sessionId = sessionId;
	}

	/**
	 * order_ref
	 */
	public String getOrderRef() {
		return orderRef;
	}

	/**
	 * order_ref
	 */
	public void setOrderRef(String orderRef) {
		this.orderRef = orderRef;
	}

	/**
	 * 委托数量
	 */
	public Integer getNumber() {
		return number;
	}

	/**
	 * 委托数量
	 */
	public void setNumber(Integer number) {
		this.number = number;
	}

	/** 
	 *
	 */
	public String getStatus() {
		return status;
	}

	/** 
	 *
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/** 
	 *
	 */
	public String getStatusDesc() {
		return statusDesc;
	}

	/** 
	 *
	 */
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	/**
	 * 总成交数量
	 */
	public Integer getDealTotalNumber() {
		return dealTotalNumber;
	}

	/**
	 * 总成交数量
	 */
	public void setDealTotalNumber(Integer dealTotalNumber) {
		this.dealTotalNumber = dealTotalNumber;
	}

	/**
	 * 总成交金额
	 */
	public BigDecimal getDealTotalAmount() {
		return dealTotalAmount;
	}

	/**
	 * 总成交金额
	 */
	public void setDealTotalAmount(BigDecimal dealTotalAmount) {
		this.dealTotalAmount = dealTotalAmount;
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
	 *
	 */
	public String getOrderSysId() {
		return orderSysId;
	}

	/** 
	 *
	 */
	public void setOrderSysId(String orderSysId) {
		this.orderSysId = orderSysId;
	}

	/**
	 * 普通平仓下单冻结持仓明细ID
	 */
	public Integer getClosePositionDetailId() {
		return closePositionDetailId;
	}

	/**
	 * 普通平仓下单冻结持仓明细ID
	 */
	public void setClosePositionDetailId(Integer closePositionDetailId) {
		this.closePositionDetailId = closePositionDetailId;
	}
}