package com.ujuit.datamove.master.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_master", desc = "主账户信息")
@GenModel(packageName = "com.ujuit.datamove.master", modelName = "master")
public class MasterPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "id", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "类型（1证券2期货）", column = "type", length = 1, isnull = true)
	private String type;

	@GenField(labelname = "所属公司", column = "company", length = 50, isnull = true)
	private String company;

	@GenField(labelname = "初始资金", column = "initialCapital", isnull = true)
	private BigDecimal initialcapital;

	@GenField(labelname = "可用资金", column = "availableCapital", isnull = true)
	private BigDecimal availablecapital;

	@GenField(labelname = "状态（1非冻结 0冻结）", column = "status", length = 1, isnull = true)
	private String status;

	@GenField(labelname = "资金账号", column = "account", length = 20, isnull = true)
	private String account;

	@GenField(labelname = "登录密码", column = "password", length = 20, isnull = true)
	private String password;

	@GenField(labelname = "期货公司", column = "futuresCompany", length = 20, isnull = true)
	private String futurescompany;

	@GenField(labelname = "所属券商", column = "theirBroker", length = 20, isnull = true)
	private String theirbroker;

	@GenField(labelname = "保证金", column = "collateral", isnull = true)
	private BigDecimal collateral;

	@GenField(labelname = "营业厅Id", column = "tsbId", isnull = true)
	private Integer tsbid;

	@GenField(labelname = "证券id", column = "tsInfoId", isnull = true)
	private Integer tsinfoid;

	@GenField(labelname = "0可分配子账户 1，不可以分配子账户", column = "tab", isnull = true)
	private Short tab;

	@GenField(labelname = "配资(可配)", column = "disposition", isnull = true)
	private BigDecimal disposition;

	@GenField(labelname = "交易类型  华宝1  交易通2 爱建3  模拟 0", column = "trade_type", isnull = true)
	private Integer tradeType;

	@GenField(labelname = "交易账号", column = "trade_account", length = 50, isnull = true)
	private String tradeAccount;

	@GenField(labelname = "通讯密码", column = "trade_password", length = 50, isnull = true)
	private String tradePassword;

	@GenField(labelname = "是否信用账号  0不是  1是", column = "credit", isnull = true)
	private boolean credit;

	@GenField(labelname = "成本", column = "capital_amount", isnull = true)
	private BigDecimal capitalAmount;

	@GenField(labelname = "到期时间", column = "over_time", length = 30, isnull = true)
	private String overTime;

	@GenField(labelname = "虚拟总资金只用于出入金记录", column = "virtual_allmoney", isnull = false)
	private BigDecimal virtualAllmoney;

	@GenField(labelname = "虚拟可配", column = "virtual_disposition", isnull = false)
	private BigDecimal virtualDisposition;

	@GenField(labelname = "账户备注", column = "descrp", length = 20, isnull = true)
	private String descrp;

	@GenField(labelname = "创建日期", column = "create_time", isnull = true)
	private Date createTime;

	@GenField(labelname = "期货公司id", column = "future_company_id", isnull = true)
	private Integer futureCompanyId;

	@GenField(labelname = "母账户异常状态 0:正常  1：异常", column = "exception_status", length = 1, isnull = true)
	private String exceptionStatus;

	@GenField(labelname = "", column = "category", length = 50, isnull = true)
	private String category;

	@GenField(labelname = "", column = "thirdCapital", isnull = true)
	private BigDecimal thirdcapital;

	@GenField(labelname = "异常信息描述", column = "exception_message", length = 255, isnull = true)
	private String exceptionMessage;

	@GenField(labelname = "0、正常1、异常", column = "login_exception_status", length = 1, isnull = true)
	private String loginExceptionStatus;

	@GenField(labelname = "登录异常描述", column = "login_exception_message", length = 255, isnull = true)
	private String loginExceptionMessage;

	@GenField(labelname = "账户组id", column = "master_group_id", isnull = true)
	private Integer masterGroupId;

	@GenField(labelname = "认证码", column = "auth_code", length = 50, isnull = true)
	private String authCode;

	@GenField(labelname = "appid", column = "app_id", length = 50, isnull = true)
	private String appId;

	@GenField(labelname = "secret_key", column = "secret_key", length = 36, isnull = true)
	private String secretKey;

	@GenField(labelname = "用户端产品信息", column = "user_product_info", length = 50, isnull = true)
	private String userProductInfo;

	@GenField(labelname = "份数", column = "parts", isnull = true)
	private BigDecimal parts;

}