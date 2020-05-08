package com.ujuit.datamove.masterfuturesdailyfond.model;

import java.math.BigDecimal;
import java.util.*;

/**
 * 主账户委托信息
 * 
 * @author shadow
 */
public class Masterfuturesdailyfond {
	/**
	 *
	 */
	private Integer id;
	/**
	 * 主账号ID
	 */
	private Integer masterId;
	/**
	 * 上次质押金额
	 */
	private BigDecimal preMortgage;
	/**
	 * 上次信用额度
	 */
	private BigDecimal preCredit;
	/**
	 * 上次存款额
	 */
	private BigDecimal preDeposit;
	/**
	 * 上次结算准备金
	 */
	private BigDecimal preBalance;
	/**
	 * 上次占用的保证金
	 */
	private BigDecimal preMargin;
	/**
	 * 利息基数
	 */
	private BigDecimal interestBase;
	/**
	 * 利息收入
	 */
	private BigDecimal interest;
	/**
	 * 入金金额
	 */
	private BigDecimal deposit;
	/**
	 * 出金金额
	 */
	private BigDecimal withdraw;
	/**
	 * 冻结的保证金
	 */
	private BigDecimal frozenMargin;
	/**
	 * 冻结的资金
	 */
	private BigDecimal frozenCash;
	/**
	 * 冻结的手续费
	 */
	private BigDecimal frozenCommission;
	/**
	 * 当前保证金总额
	 */
	private BigDecimal currMargin;
	/**
	 * 资金差额
	 */
	private BigDecimal cashIn;
	/**
	 * 手续费
	 */
	private BigDecimal commission;
	/**
	 * 平仓盈亏
	 */
	private BigDecimal closeProfit;
	/**
	 * 持仓盈亏
	 */
	private BigDecimal positionProfit;
	/**
	 * 期货结算准备金
	 */
	private BigDecimal balance;
	/**
	 * 可用资金
	 */
	private BigDecimal available;
	/**
	 * 可取资金
	 */
	private BigDecimal withdrawQuota;
	/**
	 * 基本准备金
	 */
	private BigDecimal reserve;
	/**
	 * 交易日
	 */
	private String tradingDay;
	/**
	 * 结算编号
	 */
	private Integer settlementId;
	/**
	 * 信用额度
	 */
	private BigDecimal credit;
	/**
	 * 质押金额
	 */
	private BigDecimal mortgage;
	/**
	 * 交易所保证金
	 */
	private BigDecimal exchangeMargin;
	/**
	 * 投资者交割保证金
	 */
	private BigDecimal deliveryMargin;
	/**
	 * 交易所交割保证金
	 */
	private BigDecimal exchangeDeliveryMargin;
	/**
	 * 保底期货结算准备金
	 */
	private BigDecimal reserveBalance;
	/**
	 * 币种代码
	 */
	private String currencyId;
	/**
	 * 上次货币质入金额
	 */
	private BigDecimal preFundMortgageIn;
	/**
	 * 上次货币质出金额
	 */
	private BigDecimal preFundMortgageOut;
	/**
	 * 货币质入金额
	 */
	private BigDecimal fundMortgageIn;
	/**
	 * 货币质出金额
	 */
	private BigDecimal fundMortgageOut;
	/**
	 * 货币质押余额
	 */
	private BigDecimal fundMortgageAvailable;
	/**
	 * 可质押货币金额
	 */
	private BigDecimal mortgageableFund;
	/**
	 * 特殊产品占用保证金
	 */
	private BigDecimal specProductMargin;
	/**
	 * 特殊产品冻结保证金
	 */
	private BigDecimal specProductFrozenMargin;
	/**
	 * 特殊产品手续费
	 */
	private BigDecimal specProductCommission;
	/**
	 * 特殊产品冻结手续费
	 */
	private BigDecimal specProductFrozenCommission;
	/**
	 * 特殊产品持仓盈亏
	 */
	private BigDecimal specProductPositionProfit;
	/**
	 * 特殊产品平仓盈亏
	 */
	private BigDecimal specProductCloseProfit;
	/**
	 * 根据持仓盈亏算法计算的特殊产品持仓盈亏
	 */
	private BigDecimal specProductPositionProfitByAlg;
	/**
	 * 特殊产品交易所保证金
	 */
	private BigDecimal specProductExchangeMargin;
	/**
	 * 记录的日期
	 */
	private Date hisDate;
	/**
	 * 初始权益
	 */
	private BigDecimal initEquity;
	/**
	 * 成本
	 */
	private BigDecimal capitalAmount;
	/**
	 * 0,未结算1，是已经结算
	 */
	private boolean settlementType;
	/**
	 * 出入金总和
	 */
	private BigDecimal depositWithdrawal;

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
	 * 上次质押金额
	 */
	public BigDecimal getPreMortgage() {
		return preMortgage;
	}

	/**
	 * 上次质押金额
	 */
	public void setPreMortgage(BigDecimal preMortgage) {
		this.preMortgage = preMortgage;
	}

	/**
	 * 上次信用额度
	 */
	public BigDecimal getPreCredit() {
		return preCredit;
	}

	/**
	 * 上次信用额度
	 */
	public void setPreCredit(BigDecimal preCredit) {
		this.preCredit = preCredit;
	}

	/**
	 * 上次存款额
	 */
	public BigDecimal getPreDeposit() {
		return preDeposit;
	}

	/**
	 * 上次存款额
	 */
	public void setPreDeposit(BigDecimal preDeposit) {
		this.preDeposit = preDeposit;
	}

	/**
	 * 上次结算准备金
	 */
	public BigDecimal getPreBalance() {
		return preBalance;
	}

	/**
	 * 上次结算准备金
	 */
	public void setPreBalance(BigDecimal preBalance) {
		this.preBalance = preBalance;
	}

	/**
	 * 上次占用的保证金
	 */
	public BigDecimal getPreMargin() {
		return preMargin;
	}

	/**
	 * 上次占用的保证金
	 */
	public void setPreMargin(BigDecimal preMargin) {
		this.preMargin = preMargin;
	}

	/**
	 * 利息基数
	 */
	public BigDecimal getInterestBase() {
		return interestBase;
	}

	/**
	 * 利息基数
	 */
	public void setInterestBase(BigDecimal interestBase) {
		this.interestBase = interestBase;
	}

	/**
	 * 利息收入
	 */
	public BigDecimal getInterest() {
		return interest;
	}

	/**
	 * 利息收入
	 */
	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	/**
	 * 入金金额
	 */
	public BigDecimal getDeposit() {
		return deposit;
	}

	/**
	 * 入金金额
	 */
	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}

	/**
	 * 出金金额
	 */
	public BigDecimal getWithdraw() {
		return withdraw;
	}

	/**
	 * 出金金额
	 */
	public void setWithdraw(BigDecimal withdraw) {
		this.withdraw = withdraw;
	}

	/**
	 * 冻结的保证金
	 */
	public BigDecimal getFrozenMargin() {
		return frozenMargin;
	}

	/**
	 * 冻结的保证金
	 */
	public void setFrozenMargin(BigDecimal frozenMargin) {
		this.frozenMargin = frozenMargin;
	}

	/**
	 * 冻结的资金
	 */
	public BigDecimal getFrozenCash() {
		return frozenCash;
	}

	/**
	 * 冻结的资金
	 */
	public void setFrozenCash(BigDecimal frozenCash) {
		this.frozenCash = frozenCash;
	}

	/**
	 * 冻结的手续费
	 */
	public BigDecimal getFrozenCommission() {
		return frozenCommission;
	}

	/**
	 * 冻结的手续费
	 */
	public void setFrozenCommission(BigDecimal frozenCommission) {
		this.frozenCommission = frozenCommission;
	}

	/**
	 * 当前保证金总额
	 */
	public BigDecimal getCurrMargin() {
		return currMargin;
	}

	/**
	 * 当前保证金总额
	 */
	public void setCurrMargin(BigDecimal currMargin) {
		this.currMargin = currMargin;
	}

	/**
	 * 资金差额
	 */
	public BigDecimal getCashIn() {
		return cashIn;
	}

	/**
	 * 资金差额
	 */
	public void setCashIn(BigDecimal cashIn) {
		this.cashIn = cashIn;
	}

	/**
	 * 手续费
	 */
	public BigDecimal getCommission() {
		return commission;
	}

	/**
	 * 手续费
	 */
	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	/**
	 * 平仓盈亏
	 */
	public BigDecimal getCloseProfit() {
		return closeProfit;
	}

	/**
	 * 平仓盈亏
	 */
	public void setCloseProfit(BigDecimal closeProfit) {
		this.closeProfit = closeProfit;
	}

	/**
	 * 持仓盈亏
	 */
	public BigDecimal getPositionProfit() {
		return positionProfit;
	}

	/**
	 * 持仓盈亏
	 */
	public void setPositionProfit(BigDecimal positionProfit) {
		this.positionProfit = positionProfit;
	}

	/**
	 * 期货结算准备金
	 */
	public BigDecimal getBalance() {
		return balance;
	}

	/**
	 * 期货结算准备金
	 */
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	/**
	 * 可用资金
	 */
	public BigDecimal getAvailable() {
		return available;
	}

	/**
	 * 可用资金
	 */
	public void setAvailable(BigDecimal available) {
		this.available = available;
	}

	/**
	 * 可取资金
	 */
	public BigDecimal getWithdrawQuota() {
		return withdrawQuota;
	}

	/**
	 * 可取资金
	 */
	public void setWithdrawQuota(BigDecimal withdrawQuota) {
		this.withdrawQuota = withdrawQuota;
	}

	/**
	 * 基本准备金
	 */
	public BigDecimal getReserve() {
		return reserve;
	}

	/**
	 * 基本准备金
	 */
	public void setReserve(BigDecimal reserve) {
		this.reserve = reserve;
	}

	/**
	 * 交易日
	 */
	public String getTradingDay() {
		return tradingDay;
	}

	/**
	 * 交易日
	 */
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
	 * 信用额度
	 */
	public BigDecimal getCredit() {
		return credit;
	}

	/**
	 * 信用额度
	 */
	public void setCredit(BigDecimal credit) {
		this.credit = credit;
	}

	/**
	 * 质押金额
	 */
	public BigDecimal getMortgage() {
		return mortgage;
	}

	/**
	 * 质押金额
	 */
	public void setMortgage(BigDecimal mortgage) {
		this.mortgage = mortgage;
	}

	/**
	 * 交易所保证金
	 */
	public BigDecimal getExchangeMargin() {
		return exchangeMargin;
	}

	/**
	 * 交易所保证金
	 */
	public void setExchangeMargin(BigDecimal exchangeMargin) {
		this.exchangeMargin = exchangeMargin;
	}

	/**
	 * 投资者交割保证金
	 */
	public BigDecimal getDeliveryMargin() {
		return deliveryMargin;
	}

	/**
	 * 投资者交割保证金
	 */
	public void setDeliveryMargin(BigDecimal deliveryMargin) {
		this.deliveryMargin = deliveryMargin;
	}

	/**
	 * 交易所交割保证金
	 */
	public BigDecimal getExchangeDeliveryMargin() {
		return exchangeDeliveryMargin;
	}

	/**
	 * 交易所交割保证金
	 */
	public void setExchangeDeliveryMargin(BigDecimal exchangeDeliveryMargin) {
		this.exchangeDeliveryMargin = exchangeDeliveryMargin;
	}

	/**
	 * 保底期货结算准备金
	 */
	public BigDecimal getReserveBalance() {
		return reserveBalance;
	}

	/**
	 * 保底期货结算准备金
	 */
	public void setReserveBalance(BigDecimal reserveBalance) {
		this.reserveBalance = reserveBalance;
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
	 * 上次货币质入金额
	 */
	public BigDecimal getPreFundMortgageIn() {
		return preFundMortgageIn;
	}

	/**
	 * 上次货币质入金额
	 */
	public void setPreFundMortgageIn(BigDecimal preFundMortgageIn) {
		this.preFundMortgageIn = preFundMortgageIn;
	}

	/**
	 * 上次货币质出金额
	 */
	public BigDecimal getPreFundMortgageOut() {
		return preFundMortgageOut;
	}

	/**
	 * 上次货币质出金额
	 */
	public void setPreFundMortgageOut(BigDecimal preFundMortgageOut) {
		this.preFundMortgageOut = preFundMortgageOut;
	}

	/**
	 * 货币质入金额
	 */
	public BigDecimal getFundMortgageIn() {
		return fundMortgageIn;
	}

	/**
	 * 货币质入金额
	 */
	public void setFundMortgageIn(BigDecimal fundMortgageIn) {
		this.fundMortgageIn = fundMortgageIn;
	}

	/**
	 * 货币质出金额
	 */
	public BigDecimal getFundMortgageOut() {
		return fundMortgageOut;
	}

	/**
	 * 货币质出金额
	 */
	public void setFundMortgageOut(BigDecimal fundMortgageOut) {
		this.fundMortgageOut = fundMortgageOut;
	}

	/**
	 * 货币质押余额
	 */
	public BigDecimal getFundMortgageAvailable() {
		return fundMortgageAvailable;
	}

	/**
	 * 货币质押余额
	 */
	public void setFundMortgageAvailable(BigDecimal fundMortgageAvailable) {
		this.fundMortgageAvailable = fundMortgageAvailable;
	}

	/**
	 * 可质押货币金额
	 */
	public BigDecimal getMortgageableFund() {
		return mortgageableFund;
	}

	/**
	 * 可质押货币金额
	 */
	public void setMortgageableFund(BigDecimal mortgageableFund) {
		this.mortgageableFund = mortgageableFund;
	}

	/**
	 * 特殊产品占用保证金
	 */
	public BigDecimal getSpecProductMargin() {
		return specProductMargin;
	}

	/**
	 * 特殊产品占用保证金
	 */
	public void setSpecProductMargin(BigDecimal specProductMargin) {
		this.specProductMargin = specProductMargin;
	}

	/**
	 * 特殊产品冻结保证金
	 */
	public BigDecimal getSpecProductFrozenMargin() {
		return specProductFrozenMargin;
	}

	/**
	 * 特殊产品冻结保证金
	 */
	public void setSpecProductFrozenMargin(BigDecimal specProductFrozenMargin) {
		this.specProductFrozenMargin = specProductFrozenMargin;
	}

	/**
	 * 特殊产品手续费
	 */
	public BigDecimal getSpecProductCommission() {
		return specProductCommission;
	}

	/**
	 * 特殊产品手续费
	 */
	public void setSpecProductCommission(BigDecimal specProductCommission) {
		this.specProductCommission = specProductCommission;
	}

	/**
	 * 特殊产品冻结手续费
	 */
	public BigDecimal getSpecProductFrozenCommission() {
		return specProductFrozenCommission;
	}

	/**
	 * 特殊产品冻结手续费
	 */
	public void setSpecProductFrozenCommission(BigDecimal specProductFrozenCommission) {
		this.specProductFrozenCommission = specProductFrozenCommission;
	}

	/**
	 * 特殊产品持仓盈亏
	 */
	public BigDecimal getSpecProductPositionProfit() {
		return specProductPositionProfit;
	}

	/**
	 * 特殊产品持仓盈亏
	 */
	public void setSpecProductPositionProfit(BigDecimal specProductPositionProfit) {
		this.specProductPositionProfit = specProductPositionProfit;
	}

	/**
	 * 特殊产品平仓盈亏
	 */
	public BigDecimal getSpecProductCloseProfit() {
		return specProductCloseProfit;
	}

	/**
	 * 特殊产品平仓盈亏
	 */
	public void setSpecProductCloseProfit(BigDecimal specProductCloseProfit) {
		this.specProductCloseProfit = specProductCloseProfit;
	}

	/**
	 * 根据持仓盈亏算法计算的特殊产品持仓盈亏
	 */
	public BigDecimal getSpecProductPositionProfitByAlg() {
		return specProductPositionProfitByAlg;
	}

	/**
	 * 根据持仓盈亏算法计算的特殊产品持仓盈亏
	 */
	public void setSpecProductPositionProfitByAlg(BigDecimal specProductPositionProfitByAlg) {
		this.specProductPositionProfitByAlg = specProductPositionProfitByAlg;
	}

	/**
	 * 特殊产品交易所保证金
	 */
	public BigDecimal getSpecProductExchangeMargin() {
		return specProductExchangeMargin;
	}

	/**
	 * 特殊产品交易所保证金
	 */
	public void setSpecProductExchangeMargin(BigDecimal specProductExchangeMargin) {
		this.specProductExchangeMargin = specProductExchangeMargin;
	}

	/**
	 * 记录的日期
	 */
	public Date getHisDate() {
		return hisDate;
	}

	/**
	 * 记录的日期
	 */
	public void setHisDate(Date hisDate) {
		this.hisDate = hisDate;
	}

	/**
	 * 初始权益
	 */
	public BigDecimal getInitEquity() {
		return initEquity;
	}

	/**
	 * 初始权益
	 */
	public void setInitEquity(BigDecimal initEquity) {
		this.initEquity = initEquity;
	}

	/**
	 * 成本
	 */
	public BigDecimal getCapitalAmount() {
		return capitalAmount;
	}

	/**
	 * 成本
	 */
	public void setCapitalAmount(BigDecimal capitalAmount) {
		this.capitalAmount = capitalAmount;
	}

	public boolean isSettlementType() {
		return settlementType;
	}

	public void setSettlementType(boolean settlementType) {
		this.settlementType = settlementType;
	}

	/**
	 * 出入金总和
	 */
	public BigDecimal getDepositWithdrawal() {
		return depositWithdrawal;
	}

	/**
	 * 出入金总和
	 */
	public void setDepositWithdrawal(BigDecimal depositWithdrawal) {
		this.depositWithdrawal = depositWithdrawal;
	}
}