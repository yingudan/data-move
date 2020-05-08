package com.ujuit.datamove.masterbaseinfo.pojo;

import java.io.Serializable;
import com.ujuit.datamove.createClass.gencode.annotation.GenField;
import com.ujuit.datamove.createClass.gencode.annotation.GenModel;
import com.ujuit.datamove.createClass.gencode.annotation.GenTable;
import java.math.BigDecimal;
import java.util.*;

@GenTable(name = "t_master_baseinfo", desc = "主账户对应主机地址记录")
@GenModel(packageName = "com.ujuit.datamove.masterbaseinfo", modelName = "masterbaseinfo")
public class MasterBaseinfoPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	@GenField(labelname = "", column = "id", id = true, isnull = false)
	private Integer id;

	@GenField(labelname = "主账户id", column = "master_id", isnull = true)
	private Integer masterId;

	@GenField(labelname = "", column = "host_ip", length = 50, isnull = true)
	private String hostIp;

	@GenField(labelname = "", column = "host_port", length = 50, isnull = true)
	private String hostPort;

	@GenField(labelname = "", column = "host_mac", length = 255, isnull = true)
	private String hostMac;

}