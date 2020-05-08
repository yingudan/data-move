package com.ujuit.datamove.client.pojo; 
import java.io.Serializable; 
import com.ujuit.datamove.createClass.gencode.annotation.GenField; 
import com.ujuit.datamove.createClass.gencode.annotation.GenModel; 
import com.ujuit.datamove.createClass.gencode.annotation.GenTable; 
import java.math.BigDecimal; 
import java.util.*; 
 
  
@GenTable(name="t_client",desc="客户信息") 
@GenModel(packageName="com.ujuit.datamove.client",modelName="client")  
public class ClientPojo implements Serializable{  

	private static final long serialVersionUID = 1L; 

	@GenField(labelname="id",column="id",id=true,isnull=false) 
	private Integer id; 

	@GenField(labelname="开户日期",column="create_date",isnull=true) 
	private Date createDate; 

	@GenField(labelname="备注",column="mark",length=50,isnull=true) 
	private String mark; 

	@GenField(labelname="客户账户",column="account",length=20,isnull=true) 
	private String account; 

	@GenField(labelname="密码",column="password",length=36,isnull=true) 
	private String password; 

	@GenField(labelname="客户姓名",column="user_name",length=20,isnull=true) 
	private String userName; 

	@GenField(labelname="交易组id",column="t_group_id",isnull=true) 
	private Integer tGroupId; 

	@GenField(labelname="",column="total_assets",isnull=true) 
	private BigDecimal totalAssets; 

	@GenField(labelname="",column="total_revenue",isnull=true) 
	private BigDecimal totalRevenue; 

	@GenField(labelname="",column="type",length=1,isnull=true) 
	private String type; 


}