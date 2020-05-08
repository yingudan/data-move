package com.ujuit.datamove.delivery.model;
import java.math.BigDecimal; 
import java.util.*; 
 
  
/**
 * 主账户对应主机地址记录
 * @author shadow
 */ 
public class Delivery  {
	/**
	 *
	 */
	private Integer id;
	/**
	 *交割日期
	 */
	private Date tradeDate;
	/**
	 *合约号
	 */
	private String instrumentId;
	/**
	 *(0,买，1卖)
	 */
	private String direction;
	/**
	 *交割手续费
	 */
	private BigDecimal cost;
	/**
	 *保证金
	 */
	private BigDecimal collateral;
	/**
	 *平仓盈亏
	 */
	private BigDecimal closeProfit;
	/**
	 *结算价
	 */
	private BigDecimal settlementPrice;
	/**
	 *
	 */
	private Date createTime;
	/**
	 *子账户id
	 */
	private Integer subAccountId;
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
	 *交割日期
	 */
	public Date getTradeDate() {
		return tradeDate;
	}
	/** 
	 *交割日期
	 */
	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}
	/** 
	 *合约号
	 */
	public String getInstrumentId() {
		return instrumentId;
	}
	/** 
	 *合约号
	 */
	public void setInstrumentId(String instrumentId) {
		this.instrumentId = instrumentId;
	}
	/** 
	 *(0,买，1卖)
	 */
	public String getDirection() {
		return direction;
	}
	/** 
	 *(0,买，1卖)
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}
	/** 
	 *交割手续费
	 */
	public BigDecimal getCost() {
		return cost;
	}
	/** 
	 *交割手续费
	 */
	public void setCost(BigDecimal cost) {
		this.cost = cost;
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
	 *平仓盈亏
	 */
	public BigDecimal getCloseProfit() {
		return closeProfit;
	}
	/** 
	 *平仓盈亏
	 */
	public void setCloseProfit(BigDecimal closeProfit) {
		this.closeProfit = closeProfit;
	}
	/** 
	 *结算价
	 */
	public BigDecimal getSettlementPrice() {
		return settlementPrice;
	}
	/** 
	 *结算价
	 */
	public void setSettlementPrice(BigDecimal settlementPrice) {
		this.settlementPrice = settlementPrice;
	}
	/** 
	 *
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/** 
	 *
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/** 
	 *子账户id
	 */
	public Integer getSubAccountId() {
		return subAccountId;
	}
	/** 
	 *子账户id
	 */
	public void setSubAccountId(Integer subAccountId) {
		this.subAccountId = subAccountId;
	}
}