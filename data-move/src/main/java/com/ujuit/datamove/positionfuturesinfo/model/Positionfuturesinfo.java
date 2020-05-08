package com.ujuit.datamove.positionfuturesinfo.model;
import java.math.BigDecimal; 
import java.util.*; 
 
  
/**
 * 持仓明细
 * @author shadow
 */ 
public class Positionfuturesinfo  {
	/**
	 *
	 */
	private Integer id;
	/**
	 *子账户id
	 */
	private Integer subAccountId;
	/**
	 *1.投机、  2.套保
	 */
	private Integer hedgeFlag;
	/**
	 *交易所
	 */
	private String exchange;
	/**
	 *品种
	 */
	private String product;
	/**
	 *合约号
	 */
	private String instrumentId;
	/**
	 *数目
	 */
	private Integer num;
	/**
	 *开仓价
	 */
	private BigDecimal openPrice;
	/**
	 *开仓时间
	 */
	private Date openTime;
	/**
	 *开仓日期
	 */
	private Date openDate;
	/**
	 *0.买  1.卖
	 */
	private String direction;
	/**
	 *保证金
	 */
	private BigDecimal collateral;
	/**
	 *昨结算
	 */
	private BigDecimal preSettlementPrice;
	/**
	 *创建时间
	 */
	private Date createTime;
	/**
	 *成交ID
	 */
	private Integer dealOrderId;
	/**
	 *交易所sys_id
	 */
	private String orderSysId;
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
	/** 
	 *1.投机、  2.套保
	 */
	public Integer getHedgeFlag() {
		return hedgeFlag;
	}
	/** 
	 *1.投机、  2.套保
	 */
	public void setHedgeFlag(Integer hedgeFlag) {
		this.hedgeFlag = hedgeFlag;
	}
	/** 
	 *交易所
	 */
	public String getExchange() {
		return exchange;
	}
	/** 
	 *交易所
	 */
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	/** 
	 *品种
	 */
	public String getProduct() {
		return product;
	}
	/** 
	 *品种
	 */
	public void setProduct(String product) {
		this.product = product;
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
	 *数目
	 */
	public Integer getNum() {
		return num;
	}
	/** 
	 *数目
	 */
	public void setNum(Integer num) {
		this.num = num;
	}
	/** 
	 *开仓价
	 */
	public BigDecimal getOpenPrice() {
		return openPrice;
	}
	/** 
	 *开仓价
	 */
	public void setOpenPrice(BigDecimal openPrice) {
		this.openPrice = openPrice;
	}
	/** 
	 *开仓时间
	 */
	public Date getOpenTime() {
		return openTime;
	}
	/** 
	 *开仓时间
	 */
	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}
	/** 
	 *开仓日期
	 */
	public Date getOpenDate() {
		return openDate;
	}
	/** 
	 *开仓日期
	 */
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	/** 
	 *0.买  1.卖
	 */
	public String getDirection() {
		return direction;
	}
	/** 
	 *0.买  1.卖
	 */
	public void setDirection(String direction) {
		this.direction = direction;
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
	 *昨结算
	 */
	public BigDecimal getPreSettlementPrice() {
		return preSettlementPrice;
	}
	/** 
	 *昨结算
	 */
	public void setPreSettlementPrice(BigDecimal preSettlementPrice) {
		this.preSettlementPrice = preSettlementPrice;
	}
	/** 
	 *创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/** 
	 *创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/** 
	 *成交ID
	 */
	public Integer getDealOrderId() {
		return dealOrderId;
	}
	/** 
	 *成交ID
	 */
	public void setDealOrderId(Integer dealOrderId) {
		this.dealOrderId = dealOrderId;
	}
	/** 
	 *交易所sys_id
	 */
	public String getOrderSysId() {
		return orderSysId;
	}
	/** 
	 *交易所sys_id
	 */
	public void setOrderSysId(String orderSysId) {
		this.orderSysId = orderSysId;
	}
}