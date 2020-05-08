package com.ujuit.datamove.triggercondition.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_trigger_condition", desc = "主账户对应主机地址记录")
@GenModel(packageName = "com.ujuit.datamove.triggercondition", modelName = "triggercondition")
public class TriggerConditionPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "合约代码", column = "stock_code", length = 20, isnull = false)
	private String stockCode;

	@GenField(labelname = "合约名", column = "stock_name", length = 20, isnull = true)
	private String stockName;

	@GenField(labelname = "类型(0,买，1卖)", column = "direction", length = 1, isnull = false)
	private String direction;

	@GenField(labelname = "开平标志类型(0、开仓1、平仓2、强平3、平今4、平昨5、强减6本地强平）", column = "position_type", length = 1, isnull = true)
	private String positionType;

	@GenField(labelname = "报单价格条件（0.委托价 1.排队价   2.对手价  3.市价  4.最新价 5.超价）", column = "price_type", length = 1, isnull = true)
	private String priceType;

	@GenField(labelname = "投机套保标志类型(1.投机  2.套利  3.套保5.做市商)", column = "hedge_flag_type", length = 1, isnull = true)
	private String hedgeFlagType;

	@GenField(labelname = "价格", column = "entrust_price", isnull = true)
	private BigDecimal entrustPrice;

	@GenField(labelname = "手数", column = "entrust_number", isnull = true)
	private Integer entrustNumber;

	@GenField(labelname = "类型 1.条件单  2.止盈单  3.止损单", column = "type", length = 1, isnull = false)
	private String type;

	@GenField(labelname = "状态 1 运行中   2 暂停    3作废", column = "run_status", length = 1, isnull = false)
	private String runStatus;

	@GenField(labelname = "是否触发 1 已出发  0 未触发", column = "is_tiggered", length = 1, isnull = false)
	private String isTiggered;

	@GenField(labelname = "触发条件  1 >  2 >=   3<    4 <=", column = "tigger_condition", length = 1, isnull = true)
	private String tiggerCondition;

	@GenField(labelname = "触发值(价钱)", column = "tigger_value", isnull = true)
	private BigDecimal tiggerValue;

	@GenField(labelname = "止盈止损 对应的 委托单号", column = "source_order_id", isnull = true)
	private Integer sourceOrderId;

	@GenField(labelname = "条件达到后下的委托单id", column = "target_order_id", length = 32, isnull = true)
	private String targetOrderId;

	@GenField(labelname = "创建时间", column = "create_time", isnull = true)
	private Date createTime;

	@GenField(labelname = "最后修改时间", column = "lastmodify_time", isnull = true)
	private Date lastmodifyTime;

	@GenField(labelname = "子账户id", column = "sub_account_id", isnull = true)
	private Integer subAccountId;

	@GenField(labelname = "逻辑删除标记（0 未删除   1已删除）", column = "delete_flag", length = 1, isnull = false)
	private String deleteFlag;

	@GenField(labelname = "客户端标记", column = "client_tab", length = 50, isnull = true)
	private String clientTab;

	@GenField(labelname = "条件单报单价格条件（0.委托价 1.排队价   2.对手价  3.市价  4.最新价 5.超价）", column = "tigger_price_type", length = 1, isnull = true)
	private String tiggerPriceType;

	@GenField(labelname = "1策略系统、2交易客户端、3交易信号系统4、风控 5、系统自动平仓", column = "source_type", isnull = true)
	private Integer sourceType;

	@GenField(labelname = "信号为信息ID策略和客户端(1、普通、2高频)为类型", column = "source_id", isnull = true)
	private Integer sourceId;

	@GenField(labelname = "订单状态   0 未下单 ， 1 已下单 ， 2 下单成功   3 下单失败", column = "order_status", isnull = false)
	private Integer orderStatus;

	@GenField(labelname = "下单次数", column = "order_times", isnull = true)
	private Integer orderTimes;

	@GenField(labelname = "最后一次触发时间", column = "last_trigger_time", isnull = true)
	private Date lastTriggerTime;

	@GenField(labelname = "数据库更新时间", column = "modify_time", isnull = true)
	private Date modifyTime;

	@GenField(labelname = "", column = "remark", length = 65535, isnull = true)
	private String remark;

}