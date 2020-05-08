package com.ujuit.datamove.cffexoperates.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_cffex_operates", desc = "交易记录关联表")
@GenModel(packageName = "com.ujuit.datamove.cffexoperates", modelName = "cffexoperates")
public class CffexOperatesPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "id", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "委托表id(外键)", column = "order_id", isnull = false)
	private Integer orderId;

	@GenField(labelname = "主账户方向", column = "direction", length = 1, isnull = true)
	private String direction;

	@GenField(labelname = "开平标志类型(0、开仓1、平仓2、强平3、平今4、平昨5、强减6本地强平）", column = "position_type", length = 1, isnull = true)
	private String positionType;

	@GenField(labelname = "create_time", column = "create_time", isnull = false)
	private Date createTime;

	@GenField(labelname = "主账号ID", column = "master_id", isnull = true)
	private Integer masterId;

	@GenField(labelname = "所在交易日", column = "trade_day", isnull = true)
	private Date tradeDay;

	@GenField(labelname = "前置机ID", column = "front_id", isnull = true)
	private Integer frontId;

	@GenField(labelname = "会话ID", column = "session_id", isnull = true)
	private Integer sessionId;

	@GenField(labelname = "order_ref", column = "order_ref", length = 30, isnull = true)
	private String orderRef;

	@GenField(labelname = "委托数量", column = "number", isnull = false)
	private Integer number;

	@GenField(labelname = "", column = "status", length = 2, isnull = true)
	private String status;

	@GenField(labelname = "", column = "status_desc", length = 50, isnull = true)
	private String statusDesc;

	@GenField(labelname = "总成交数量", column = "deal_total_number", isnull = true)
	private Integer dealTotalNumber;

	@GenField(labelname = "总成交金额", column = "deal_total_amount", isnull = true)
	private BigDecimal dealTotalAmount;

	@GenField(labelname = "", column = "exchange_id", length = 10, isnull = true)
	private String exchangeId;

	@GenField(labelname = "", column = "order_sys_id", length = 50, isnull = true)
	private String orderSysId;

	@GenField(labelname = "普通平仓下单冻结持仓明细ID", column = "close_position_detail_id", isnull = true)
	private Integer closePositionDetailId;

}