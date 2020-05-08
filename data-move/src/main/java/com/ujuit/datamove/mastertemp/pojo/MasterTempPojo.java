package com.ujuit.datamove.mastertemp.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_master_temp", desc = "主账户信息")
@GenModel(packageName = "com.ujuit.datamove.mastertemp", modelName = "mastertemp")
public class MasterTempPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "id", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "类型（1证券 2期货）", column = "type", length = 1, isnull = true)
	private String type;

	@GenField(labelname = "所属公司", column = "company", length = 50, isnull = true)
	private String company;

	@GenField(labelname = "初始资金", column = "initialCapital", isnull = true)
	private BigDecimal initialcapital;

	@GenField(labelname = "可用资金", column = "availableCapital", isnull = true)
	private BigDecimal availablecapital;

	@GenField(labelname = "状态0 为冻结  1为正常", column = "status", length = 1, isnull = true)
	private String status;

	@GenField(labelname = "资金账号", column = "account", length = 20, isnull = true)
	private String account;

	@GenField(labelname = "登录密码", column = "password", length = 20, isnull = true)
	private String password;

	@GenField(labelname = "期货公司", column = "futuresCompany", length = 20, isnull = true)
	private String futurescompany;

	@GenField(labelname = "所属券商", column = "theirBroker", length = 20, isnull = true)
	private String theirbroker;

	@GenField(labelname = "对应主账号表id", column = "masterId", isnull = true)
	private Integer masterid;

	@GenField(labelname = "营业部id", column = "tsbId", isnull = true)
	private Integer tsbid;

	@GenField(labelname = "券商ID", column = "tsInfoId", isnull = true)
	private Integer tsinfoid;

	@GenField(labelname = "配资(可配资金)", column = "disposition", isnull = true)
	private BigDecimal disposition;

	@GenField(labelname = "0可分配子账户 1，不可以分配子账户", column = "tab", isnull = true)
	private boolean tab;

	@GenField(labelname = "交易类型  华宝1  交易通2 爱建3  模拟 0", column = "trade_type", isnull = true)
	private Integer tradeType;

	@GenField(labelname = "交易账号", column = "trade_account", length = 50, isnull = true)
	private String tradeAccount;

	@GenField(labelname = "通讯密码", column = "trade_password", length = 50, isnull = true)
	private String tradePassword;

	@GenField(labelname = "是否信用账号  0不是  1是", column = "credit", isnull = true)
	private boolean credit;

	@GenField(labelname = "期货公司id", column = "future_company_id", isnull = true)
	private Integer futureCompanyId;

	@GenField(labelname = "成本", column = "capital_amount", isnull = true)
	private BigDecimal capitalAmount;

	@GenField(labelname = "到期时间", column = "over_time", length = 30, isnull = true)
	private String overTime;

	@GenField(labelname = "", column = "create_time", isnull = true)
	private Date createTime;

	@GenField(labelname = "虚拟总资金", column = "virtual_allmoney", isnull = true)
	private BigDecimal virtualAllmoney;

	@GenField(labelname = "虚拟可配", column = "virtual_disposition", isnull = true)
	private BigDecimal virtualDisposition;

	@GenField(labelname = "账户备注", column = "descrp", length = 50, isnull = true)
	private String descrp;

	@GenField(labelname = "母账户异常状态 0:正常  1：异常", column = "exception_status", length = 1, isnull = true)
	private String exceptionStatus;

	@GenField(labelname = "账户组id", column = "master_group_id", isnull = true)
	private Integer masterGroupId;

	@GenField(labelname = "", column = "host_ip", length = 50, isnull = true)
	private String hostIp;

	@GenField(labelname = "", column = "host_port", length = 50, isnull = true)
	private String hostPort;

	@GenField(labelname = "", column = "host_mac", length = 255, isnull = true)
	private String hostMac;

	@GenField(labelname = "认证码", column = "auth_code", length = 50, isnull = true)
	private String authCode;

	@GenField(labelname = "app_id", column = "app_id", length = 50, isnull = true)
	private String appId;

	@GenField(labelname = "用户端产品信息", column = "user_product_info", length = 50, isnull = true)
	private String userProductInfo;

}