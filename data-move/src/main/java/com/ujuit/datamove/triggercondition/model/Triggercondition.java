package com.ujuit.datamove.triggercondition.model;
import java.math.BigDecimal; 
import java.util.*; 
 
  
/**
 * 主账户对应主机地址记录
 * @author shadow
 */ 
public class Triggercondition  {
	/**
	 *
	 */
	private Integer id;
	/**
	 *合约代码
	 */
	private String stockCode;
	/**
	 *合约名
	 */
	private String stockName;
	/**
	 *类型(0,买，1卖)
	 */
	private String direction;
	/**
	 *开平标志类型(0、开仓1、平仓2、强平3、平今4、平昨5、强减6本地强平）
	 */
	private String positionType;
	/**
	 *报单价格条件（0.委托价 1.排队价   2.对手价  3.市价  4.最新价 5.超价）
	 */
	private String priceType;
	/**
	 *投机套保标志类型(1.投机  2.套利  3.套保5.做市商)
	 */
	private String hedgeFlagType;
	/**
	 *价格
	 */
	private BigDecimal entrustPrice;
	/**
	 *手数
	 */
	private Integer entrustNumber;
	/**
	 *类型 1.条件单  2.止盈单  3.止损单
	 */
	private String type;
	/**
	 *状态 1 运行中   2 暂停    3作废
	 */
	private String runStatus;
	/**
	 *是否触发 1 已出发  0 未触发
	 */
	private String isTiggered;
	/**
	 *触发条件  1 >  2 >=   3<    4 <=
	 */
	private String tiggerCondition;
	/**
	 *触发值(价钱)
	 */
	private BigDecimal tiggerValue;
	/**
	 *止盈止损 对应的 委托单号
	 */
	private Integer sourceOrderId;
	/**
	 *条件达到后下的委托单id
	 */
	private String targetOrderId;
	/**
	 *创建时间
	 */
	private Date createTime;
	/**
	 *最后修改时间
	 */
	private Date lastmodifyTime;
	/**
	 *子账户id
	 */
	private Integer subAccountId;
	/**
	 *逻辑删除标记（0 未删除   1已删除）
	 */
	private String deleteFlag;
	/**
	 *客户端标记
	 */
	private String clientTab;
	/**
	 *条件单报单价格条件（0.委托价 1.排队价   2.对手价  3.市价  4.最新价 5.超价）
	 */
	private String tiggerPriceType;
	/**
	 *1策略系统、2交易客户端、3交易信号系统4、风控 5、系统自动平仓
	 */
	private Integer sourceType;
	/**
	 *信号为信息ID策略和客户端(1、普通、2高频)为类型
	 */
	private Integer sourceId;
	/**
	 *订单状态   0 未下单 ， 1 已下单 ， 2 下单成功   3 下单失败
	 */
	private Integer orderStatus;
	/**
	 *下单次数
	 */
	private Integer orderTimes;
	/**
	 *最后一次触发时间
	 */
	private Date lastTriggerTime;
	/**
	 *数据库更新时间
	 */
	private Date modifyTime;
	/**
	 *
	 */
	private String remark;
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
	 *合约代码
	 */
	public String getStockCode() {
		return stockCode;
	}
	/** 
	 *合约代码
	 */
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	/** 
	 *合约名
	 */
	public String getStockName() {
		return stockName;
	}
	/** 
	 *合约名
	 */
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	/** 
	 *类型(0,买，1卖)
	 */
	public String getDirection() {
		return direction;
	}
	/** 
	 *类型(0,买，1卖)
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}
	/** 
	 *开平标志类型(0、开仓1、平仓2、强平3、平今4、平昨5、强减6本地强平）
	 */
	public String getPositionType() {
		return positionType;
	}
	/** 
	 *开平标志类型(0、开仓1、平仓2、强平3、平今4、平昨5、强减6本地强平）
	 */
	public void setPositionType(String positionType) {
		this.positionType = positionType;
	}
	/** 
	 *报单价格条件（0.委托价 1.排队价   2.对手价  3.市价  4.最新价 5.超价）
	 */
	public String getPriceType() {
		return priceType;
	}
	/** 
	 *报单价格条件（0.委托价 1.排队价   2.对手价  3.市价  4.最新价 5.超价）
	 */
	public void setPriceType(String priceType) {
		this.priceType = priceType;
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
	 *价格
	 */
	public BigDecimal getEntrustPrice() {
		return entrustPrice;
	}
	/** 
	 *价格
	 */
	public void setEntrustPrice(BigDecimal entrustPrice) {
		this.entrustPrice = entrustPrice;
	}
	/** 
	 *手数
	 */
	public Integer getEntrustNumber() {
		return entrustNumber;
	}
	/** 
	 *手数
	 */
	public void setEntrustNumber(Integer entrustNumber) {
		this.entrustNumber = entrustNumber;
	}
	/** 
	 *类型 1.条件单  2.止盈单  3.止损单
	 */
	public String getType() {
		return type;
	}
	/** 
	 *类型 1.条件单  2.止盈单  3.止损单
	 */
	public void setType(String type) {
		this.type = type;
	}
	/** 
	 *状态 1 运行中   2 暂停    3作废
	 */
	public String getRunStatus() {
		return runStatus;
	}
	/** 
	 *状态 1 运行中   2 暂停    3作废
	 */
	public void setRunStatus(String runStatus) {
		this.runStatus = runStatus;
	}
	/** 
	 *是否触发 1 已出发  0 未触发
	 */
	public String getIsTiggered() {
		return isTiggered;
	}
	/** 
	 *是否触发 1 已出发  0 未触发
	 */
	public void setIsTiggered(String isTiggered) {
		this.isTiggered = isTiggered;
	}
	/** 
	 *触发条件  1 >  2 >=   3<    4 <=
	 */
	public String getTiggerCondition() {
		return tiggerCondition;
	}
	/** 
	 *触发条件  1 >  2 >=   3<    4 <=
	 */
	public void setTiggerCondition(String tiggerCondition) {
		this.tiggerCondition = tiggerCondition;
	}
	/** 
	 *触发值(价钱)
	 */
	public BigDecimal getTiggerValue() {
		return tiggerValue;
	}
	/** 
	 *触发值(价钱)
	 */
	public void setTiggerValue(BigDecimal tiggerValue) {
		this.tiggerValue = tiggerValue;
	}
	/** 
	 *止盈止损 对应的 委托单号
	 */
	public Integer getSourceOrderId() {
		return sourceOrderId;
	}
	/** 
	 *止盈止损 对应的 委托单号
	 */
	public void setSourceOrderId(Integer sourceOrderId) {
		this.sourceOrderId = sourceOrderId;
	}
	/** 
	 *条件达到后下的委托单id
	 */
	public String getTargetOrderId() {
		return targetOrderId;
	}
	/** 
	 *条件达到后下的委托单id
	 */
	public void setTargetOrderId(String targetOrderId) {
		this.targetOrderId = targetOrderId;
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
	 *最后修改时间
	 */
	public Date getLastmodifyTime() {
		return lastmodifyTime;
	}
	/** 
	 *最后修改时间
	 */
	public void setLastmodifyTime(Date lastmodifyTime) {
		this.lastmodifyTime = lastmodifyTime;
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
	 *逻辑删除标记（0 未删除   1已删除）
	 */
	public String getDeleteFlag() {
		return deleteFlag;
	}
	/** 
	 *逻辑删除标记（0 未删除   1已删除）
	 */
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	/** 
	 *客户端标记
	 */
	public String getClientTab() {
		return clientTab;
	}
	/** 
	 *客户端标记
	 */
	public void setClientTab(String clientTab) {
		this.clientTab = clientTab;
	}
	/** 
	 *条件单报单价格条件（0.委托价 1.排队价   2.对手价  3.市价  4.最新价 5.超价）
	 */
	public String getTiggerPriceType() {
		return tiggerPriceType;
	}
	/** 
	 *条件单报单价格条件（0.委托价 1.排队价   2.对手价  3.市价  4.最新价 5.超价）
	 */
	public void setTiggerPriceType(String tiggerPriceType) {
		this.tiggerPriceType = tiggerPriceType;
	}
	/** 
	 *1策略系统、2交易客户端、3交易信号系统4、风控 5、系统自动平仓
	 */
	public Integer getSourceType() {
		return sourceType;
	}
	/** 
	 *1策略系统、2交易客户端、3交易信号系统4、风控 5、系统自动平仓
	 */
	public void setSourceType(Integer sourceType) {
		this.sourceType = sourceType;
	}
	/** 
	 *信号为信息ID策略和客户端(1、普通、2高频)为类型
	 */
	public Integer getSourceId() {
		return sourceId;
	}
	/** 
	 *信号为信息ID策略和客户端(1、普通、2高频)为类型
	 */
	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}
	/** 
	 *订单状态   0 未下单 ， 1 已下单 ， 2 下单成功   3 下单失败
	 */
	public Integer getOrderStatus() {
		return orderStatus;
	}
	/** 
	 *订单状态   0 未下单 ， 1 已下单 ， 2 下单成功   3 下单失败
	 */
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
	/** 
	 *下单次数
	 */
	public Integer getOrderTimes() {
		return orderTimes;
	}
	/** 
	 *下单次数
	 */
	public void setOrderTimes(Integer orderTimes) {
		this.orderTimes = orderTimes;
	}
	/** 
	 *最后一次触发时间
	 */
	public Date getLastTriggerTime() {
		return lastTriggerTime;
	}
	/** 
	 *最后一次触发时间
	 */
	public void setLastTriggerTime(Date lastTriggerTime) {
		this.lastTriggerTime = lastTriggerTime;
	}
	/** 
	 *数据库更新时间
	 */
	public Date getModifyTime() {
		return modifyTime;
	}
	/** 
	 *数据库更新时间
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	/** 
	 *
	 */
	public String getRemark() {
		return remark;
	}
	/** 
	 *
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
}