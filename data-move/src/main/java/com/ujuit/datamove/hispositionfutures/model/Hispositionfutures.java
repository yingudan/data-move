package com.ujuit.datamove.hispositionfutures.model;
import java.math.BigDecimal; 
import java.util.*; 
 
  
/**
 * 子账户历史持仓
 * @author shadow
 */ 
public class Hispositionfutures  {
	/**
	 *id
	 */
	private Integer id;
	/**
	 *名称
	 */
	private String name;
	/**
	 *编码
	 */
	private String code;
	/**
	 *子账号ID
	 */
	private Integer subAccountId;
	/**
	 *持仓总数
	 */
	private Integer totalNumber;
	/**
	 *今仓
	 */
	private Integer todayNumber;
	/**
	 *可用持仓
	 */
	private Integer surplusTotalNumber;
	/**
	 *今可用
	 */
	private Integer todaySurplusTotalNumber;
	/**
	 *买卖方向 0买(做多) 1卖（做空）
	 */
	private String direction;
	/**
	 *持仓均价
	 */
	private BigDecimal price;
	/**
	 *开仓均价
	 */
	private BigDecimal openPrice;
	/**
	 *保证金
	 */
	private BigDecimal collateral;
	/**
	 *投机套保标志类型(1.投机  2.套利  3.套保5.做市商)
	 */
	private String hedgeFlagType;
	/**
	 *最后成交时间
	 */
	private Date lastDealTime;
	/**
	 *昨日结算价
	 */
	private BigDecimal lastSettlementPrice;
	/**
	 *今日持仓均价
	 */
	private BigDecimal todayPrice;
	/**
	 *结算日期
	 */
	private Date hisDate;
	/**
	 *持仓盈亏
	 */
	private BigDecimal positionProfit;
	/**
	 *
	 */
	private Date createTime;
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
	 *名称
	 */
	public String getName() {
		return name;
	}
	/** 
	 *名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/** 
	 *编码
	 */
	public String getCode() {
		return code;
	}
	/** 
	 *编码
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/** 
	 *子账号ID
	 */
	public Integer getSubAccountId() {
		return subAccountId;
	}
	/** 
	 *子账号ID
	 */
	public void setSubAccountId(Integer subAccountId) {
		this.subAccountId = subAccountId;
	}
	/** 
	 *持仓总数
	 */
	public Integer getTotalNumber() {
		return totalNumber;
	}
	/** 
	 *持仓总数
	 */
	public void setTotalNumber(Integer totalNumber) {
		this.totalNumber = totalNumber;
	}
	/** 
	 *今仓
	 */
	public Integer getTodayNumber() {
		return todayNumber;
	}
	/** 
	 *今仓
	 */
	public void setTodayNumber(Integer todayNumber) {
		this.todayNumber = todayNumber;
	}
	/** 
	 *可用持仓
	 */
	public Integer getSurplusTotalNumber() {
		return surplusTotalNumber;
	}
	/** 
	 *可用持仓
	 */
	public void setSurplusTotalNumber(Integer surplusTotalNumber) {
		this.surplusTotalNumber = surplusTotalNumber;
	}
	/** 
	 *今可用
	 */
	public Integer getTodaySurplusTotalNumber() {
		return todaySurplusTotalNumber;
	}
	/** 
	 *今可用
	 */
	public void setTodaySurplusTotalNumber(Integer todaySurplusTotalNumber) {
		this.todaySurplusTotalNumber = todaySurplusTotalNumber;
	}
	/** 
	 *买卖方向 0买(做多) 1卖（做空）
	 */
	public String getDirection() {
		return direction;
	}
	/** 
	 *买卖方向 0买(做多) 1卖（做空）
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}
	/** 
	 *持仓均价
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/** 
	 *持仓均价
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/** 
	 *开仓均价
	 */
	public BigDecimal getOpenPrice() {
		return openPrice;
	}
	/** 
	 *开仓均价
	 */
	public void setOpenPrice(BigDecimal openPrice) {
		this.openPrice = openPrice;
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
	 *投机套保标志类型(1.投机  2.套利  3.套保5.做市商)
	 */
	public String getHedgeFlagType() {
		return hedgeFlagType;
	}
	/** 
	 *投机套保标志类型(1.投机  2.套利  3.套保5.做市商)
	 */
	public void setHedgeFlagType(String hedgeFlagType) {
		this.hedgeFlagType = hedgeFlagType;
	}
	/** 
	 *最后成交时间
	 */
	public Date getLastDealTime() {
		return lastDealTime;
	}
	/** 
	 *最后成交时间
	 */
	public void setLastDealTime(Date lastDealTime) {
		this.lastDealTime = lastDealTime;
	}
	/** 
	 *昨日结算价
	 */
	public BigDecimal getLastSettlementPrice() {
		return lastSettlementPrice;
	}
	/** 
	 *昨日结算价
	 */
	public void setLastSettlementPrice(BigDecimal lastSettlementPrice) {
		this.lastSettlementPrice = lastSettlementPrice;
	}
	/** 
	 *今日持仓均价
	 */
	public BigDecimal getTodayPrice() {
		return todayPrice;
	}
	/** 
	 *今日持仓均价
	 */
	public void setTodayPrice(BigDecimal todayPrice) {
		this.todayPrice = todayPrice;
	}
	/** 
	 *结算日期
	 */
	public Date getHisDate() {
		return hisDate;
	}
	/** 
	 *结算日期
	 */
	public void setHisDate(Date hisDate) {
		this.hisDate = hisDate;
	}
	/** 
	 *持仓盈亏
	 */
	public BigDecimal getPositionProfit() {
		return positionProfit;
	}
	/** 
	 *持仓盈亏
	 */
	public void setPositionProfit(BigDecimal positionProfit) {
		this.positionProfit = positionProfit;
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
}