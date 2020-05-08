package com.ujuit.datamove.orderdealfutures.model;
import java.math.BigDecimal; 
import java.util.*; 
 
  
/**
 * 委托成交
 * @author shadow
 */ 
public class Orderdealfutures  {
	/**
	 *id
	 */
	private Integer id;
	/**
	 *委托ID
	 */
	private Integer orderId;
	/**
	 *成交时间
	 */
	private Date dealTime;
	/**
	 *成交数量
	 */
	private Integer dealNumber;
	/**
	 *成交金额
	 */
	private BigDecimal dealPrice;
	/**
	 *成交编号
	 */
	private String dealNo;
	/**
	 *备注信息
	 */
	private String remark;
	/**
	 *日期
	 */
	private Date createTime;
	/**
	 *手续费
	 */
	private BigDecimal cost;
	/**
	 *平仓盈亏
	 */
	private BigDecimal closePositionProfit;
	/**
	 *保证金
	 */
	private BigDecimal collateral;
	/**
	 *当日平仓盈亏
	 */
	private BigDecimal todayClosePositionProfit;
	/**
	 *
	 */
	private String orderSysId;
	/**
	 *
	 */
	private String exchangeId;
	/**
	 *成交方向0买1卖
	 */
	private String direction;
	/**
	 *开平标志0开仓  1平仓  2 强平  3平今 4平昨 5强减 6本地强平
	 */
	private String offsetFlag;
	/** 
	 *id
	 */
	public Integer getId() {
		return id;
	}
	/** 
	 *id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/** 
	 *委托ID
	 */
	public Integer getOrderId() {
		return orderId;
	}
	/** 
	 *委托ID
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	/** 
	 *成交时间
	 */
	public Date getDealTime() {
		return dealTime;
	}
	/** 
	 *成交时间
	 */
	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}
	/** 
	 *成交数量
	 */
	public Integer getDealNumber() {
		return dealNumber;
	}
	/** 
	 *成交数量
	 */
	public void setDealNumber(Integer dealNumber) {
		this.dealNumber = dealNumber;
	}
	/** 
	 *成交金额
	 */
	public BigDecimal getDealPrice() {
		return dealPrice;
	}
	/** 
	 *成交金额
	 */
	public void setDealPrice(BigDecimal dealPrice) {
		this.dealPrice = dealPrice;
	}
	/** 
	 *成交编号
	 */
	public String getDealNo() {
		return dealNo;
	}
	/** 
	 *成交编号
	 */
	public void setDealNo(String dealNo) {
		this.dealNo = dealNo;
	}
	/** 
	 *备注信息
	 */
	public String getRemark() {
		return remark;
	}
	/** 
	 *备注信息
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/** 
	 *日期
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/** 
	 *日期
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/** 
	 *手续费
	 */
	public BigDecimal getCost() {
		return cost;
	}
	/** 
	 *手续费
	 */
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	/** 
	 *平仓盈亏
	 */
	public BigDecimal getClosePositionProfit() {
		return closePositionProfit;
	}
	/** 
	 *平仓盈亏
	 */
	public void setClosePositionProfit(BigDecimal closePositionProfit) {
		this.closePositionProfit = closePositionProfit;
	}
	/** 
	 *保证金
	 */
	public BigDecimal getCollateral() {
		return collateral;
	}
	/** 
	 *保证金
	 */
	public void setCollateral(BigDecimal collateral) {
		this.collateral = collateral;
	}
	/** 
	 *当日平仓盈亏
	 */
	public BigDecimal getTodayClosePositionProfit() {
		return todayClosePositionProfit;
	}
	/** 
	 *当日平仓盈亏
	 */
	public void setTodayClosePositionProfit(BigDecimal todayClosePositionProfit) {
		this.todayClosePositionProfit = todayClosePositionProfit;
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
	 *成交方向0买1卖
	 */
	public String getDirection() {
		return direction;
	}
	/** 
	 *成交方向0买1卖
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}
	/** 
	 *开平标志0开仓  1平仓  2 强平  3平今 4平昨 5强减 6本地强平
	 */
	public String getOffsetFlag() {
		return offsetFlag;
	}
	/** 
	 *开平标志0开仓  1平仓  2 强平  3平今 4平昨 5强减 6本地强平
	 */
	public void setOffsetFlag(String offsetFlag) {
		this.offsetFlag = offsetFlag;
	}
}