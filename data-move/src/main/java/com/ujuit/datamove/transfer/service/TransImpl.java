package com.ujuit.datamove.transfer.service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.ujuit.datamove.client.model.Client;
import com.ujuit.datamove.client.service.ClientService;
import com.ujuit.datamove.client.service.ClientServiceImpl;
import com.ujuit.datamove.client.service.ClientServiceImplV2;
import com.ujuit.datamove.ctphissettledealgold.model.Ctphissettledealgold;
import com.ujuit.datamove.ctphissettledealgold.service.CtphissettledealgoldService;
import com.ujuit.datamove.ctphissettledealgold.service.CtphissettledealgoldServiceImpl;
import com.ujuit.datamove.ctphissettledealgold.service.CtphissettledealgoldServiceImplV2;
import com.ujuit.datamove.ctphissettlefund.model.Ctphissettlefund;
import com.ujuit.datamove.ctphissettlefund.service.CtphissettlefundService;
import com.ujuit.datamove.ctphissettlefund.service.CtphissettlefundServiceImpl;
import com.ujuit.datamove.ctphissettlefund.service.CtphissettlefundServiceImplV2;
import com.ujuit.datamove.dailymasterassets.model.Dailymasterassets;
import com.ujuit.datamove.dailymasterassets.service.DailymasterassetsService;
import com.ujuit.datamove.dailymastergroupassets.model.Dailymastergroupassets;
import com.ujuit.datamove.dailymastergroupassets.service.DailymastergroupassetsService;
import com.ujuit.datamove.dealgold.model.Dealgold;
import com.ujuit.datamove.dealgold.service.DealgoldService;
import com.ujuit.datamove.dealgold.service.DealgoldServiceImpl;
import com.ujuit.datamove.dealgold.service.DealgoldServiceImplV2;
import com.ujuit.datamove.dealgoldmaster.model.Dealgoldmaster;
import com.ujuit.datamove.dealgoldmaster.service.DealgoldmasterService;
import com.ujuit.datamove.dealgoldmaster.service.DealgoldmasterServiceImpl;
import com.ujuit.datamove.dealgoldmaster.service.DealgoldmasterServiceImplV2;
import com.ujuit.datamove.delivery.model.Delivery;
import com.ujuit.datamove.delivery.service.DeliveryService;
import com.ujuit.datamove.delivery.service.DeliveryServiceImpl;
import com.ujuit.datamove.delivery.service.DeliveryServiceImplV2;
import com.ujuit.datamove.expiremessage.model.Expiremessage;
import com.ujuit.datamove.expiremessage.service.ExpiremessageService;
import com.ujuit.datamove.expiremessage.service.ExpiremessageServiceImpl;
import com.ujuit.datamove.expiremessage.service.ExpiremessageServiceImplV2;
import com.ujuit.datamove.futruebasic.model.Futruebasic;
import com.ujuit.datamove.futruebasic.service.FutruebasicService;
import com.ujuit.datamove.futruebasic.service.FutruebasicServiceImpl;
import com.ujuit.datamove.futruebasic.service.FutruebasicServiceImplV2;
import com.ujuit.datamove.futuresinstrumentfield.model.Futuresinstrumentfield;
import com.ujuit.datamove.futuresinstrumentfield.service.FuturesinstrumentfieldService;
import com.ujuit.datamove.futuresinstrumentfield.service.FuturesinstrumentfieldServiceImpl;
import com.ujuit.datamove.futuresinstrumentfield.service.FuturesinstrumentfieldServiceImplV2;
import com.ujuit.datamove.hispositionfutures.model.Hispositionfutures;
import com.ujuit.datamove.hispositionfutures.service.HispositionfuturesService;
import com.ujuit.datamove.hispositionfutures.service.HispositionfuturesServiceImpl;
import com.ujuit.datamove.hispositionfutures.service.HispositionfuturesServiceImplV2;
import com.ujuit.datamove.hissettle.model.Hissettle;
import com.ujuit.datamove.hissettle.service.HissettleService;
import com.ujuit.datamove.hissettle.service.HissettleServiceImpl;
import com.ujuit.datamove.hissettle.service.HissettleServiceImplV2;
import com.ujuit.datamove.hissettlement.model.Hissettlement;
import com.ujuit.datamove.hissettlement.service.HissettlementService;
import com.ujuit.datamove.hissettlement.service.HissettlementServiceImpl;
import com.ujuit.datamove.hissettlement.service.HissettlementServiceImplV2;
import com.ujuit.datamove.instrumentoptional.model.Instrumentoptional;
import com.ujuit.datamove.instrumentoptional.service.InstrumentoptionalService;
import com.ujuit.datamove.instrumentoptional.service.InstrumentoptionalServiceImpl;
import com.ujuit.datamove.instrumentoptional.service.InstrumentoptionalServiceImplV2;
import com.ujuit.datamove.master.model.Master;
import com.ujuit.datamove.master.service.MasterService;
import com.ujuit.datamove.master.service.MasterServiceImpl;
import com.ujuit.datamove.master.service.MasterServiceImplV2;
import com.ujuit.datamove.masterbaseinfo.model.Masterbaseinfo;
import com.ujuit.datamove.masterbaseinfo.service.MasterbaseinfoService;
import com.ujuit.datamove.masterbaseinfo.service.MasterbaseinfoServiceImpl;
import com.ujuit.datamove.masterbaseinfo.service.MasterbaseinfoServiceImplV2;
import com.ujuit.datamove.masterfuturesdailyfond.model.Masterfuturesdailyfond;
import com.ujuit.datamove.masterfuturesdailyfond.service.MasterfuturesdailyfondService;
import com.ujuit.datamove.masterfuturesdailyfond.service.MasterfuturesdailyfondServiceImpl;
import com.ujuit.datamove.masterfuturesdailyfond.service.MasterfuturesdailyfondServiceImplV2;
import com.ujuit.datamove.masterfuturesdailyorder.model.Masterfuturesdailyorder;
import com.ujuit.datamove.masterfuturesdailyorder.service.MasterfuturesdailyorderService;
import com.ujuit.datamove.masterfuturesdailyorder.service.MasterfuturesdailyorderServiceImpl;
import com.ujuit.datamove.masterfuturesdailyorder.service.MasterfuturesdailyorderServiceImplV2;
import com.ujuit.datamove.masterfuturesdailyposition.model.Masterfuturesdailyposition;
import com.ujuit.datamove.masterfuturesdailyposition.service.MasterfuturesdailypositionService;
import com.ujuit.datamove.masterfuturesdailyposition.service.MasterfuturesdailypositionServiceImpl;
import com.ujuit.datamove.masterfuturesdailyposition.service.MasterfuturesdailypositionServiceImplV2;
import com.ujuit.datamove.mastertemp.model.Mastertemp;
import com.ujuit.datamove.mastertemp.service.MastertempService;
import com.ujuit.datamove.mastertemp.service.MastertempServiceImpl;
import com.ujuit.datamove.mastertemp.service.MastertempServiceImplV2;
import com.ujuit.datamove.orderdealfutures.model.Orderdealfutures;
import com.ujuit.datamove.orderdealfutures.service.OrderdealfuturesService;
import com.ujuit.datamove.orderdealfutures.service.OrderdealfuturesServiceImpl;
import com.ujuit.datamove.orderdealfutures.service.OrderdealfuturesServiceImplV2;
import com.ujuit.datamove.orderfutures.model.Orderfutures;
import com.ujuit.datamove.orderfutures.service.OrderfuturesService;
import com.ujuit.datamove.orderfutures.service.OrderfuturesServiceImpl;
import com.ujuit.datamove.orderfutures.service.OrderfuturesServiceImplV2;
import com.ujuit.datamove.positionfutures.model.Positionfutures;
import com.ujuit.datamove.positionfutures.service.PositionfuturesService;
import com.ujuit.datamove.positionfutures.service.PositionfuturesServiceImpl;
import com.ujuit.datamove.positionfutures.service.PositionfuturesServiceImplV2;
import com.ujuit.datamove.positionfuturesinfo.model.Positionfuturesinfo;
import com.ujuit.datamove.positionfuturesinfo.service.PositionfuturesinfoService;
import com.ujuit.datamove.positionfuturesinfo.service.PositionfuturesinfoServiceImpl;
import com.ujuit.datamove.positionfuturesinfo.service.PositionfuturesinfoServiceImplV2;
import com.ujuit.datamove.profitdetails.model.Profitdetails;
import com.ujuit.datamove.profitdetails.service.ProfitdetailsService;
import com.ujuit.datamove.profitdetails.service.ProfitdetailsServiceImpl;
import com.ujuit.datamove.profitdetails.service.ProfitdetailsServiceImplV2;
import com.ujuit.datamove.rmautoorder.model.Rmautoorder;
import com.ujuit.datamove.rmautoorder.service.RmautoorderService;
import com.ujuit.datamove.rmautoorder.service.RmautoorderServiceImpl;
import com.ujuit.datamove.rmautoorder.service.RmautoorderServiceImplV2;
import com.ujuit.datamove.rmmonitor.model.Rmmonitor;
import com.ujuit.datamove.rmmonitor.service.RmmonitorService;
import com.ujuit.datamove.rmmonitor.service.RmmonitorServiceImpl;
import com.ujuit.datamove.rmmonitor.service.RmmonitorServiceImplV2;
import com.ujuit.datamove.subaccount.model.Subaccount;
import com.ujuit.datamove.subaccount.service.SubaccountService;
import com.ujuit.datamove.subaccount.service.SubaccountServiceImpl;
import com.ujuit.datamove.subaccount.service.SubaccountServiceImplV2;
import com.ujuit.datamove.subaccounttemp.model.Subaccounttemp;
import com.ujuit.datamove.subaccounttemp.service.SubaccounttempService;
import com.ujuit.datamove.subaccounttemp.service.SubaccounttempServiceImpl;
import com.ujuit.datamove.subaccounttemp.service.SubaccounttempServiceImplV2;
import com.ujuit.datamove.triggercondition.model.Triggercondition;
import com.ujuit.datamove.triggercondition.service.TriggerconditionService;
import com.ujuit.datamove.triggercondition.service.TriggerconditionServiceImpl;
import com.ujuit.datamove.triggercondition.service.TriggerconditionServiceImplV2;
import com.ujuit.datamove.utils.BeanUtils;
import com.ujuit.datamove.utils.BusinessUtil;
import com.ujuit.sysmanager.util.Res;
import com.ujuit.usds.sdk.constant.LoggerType;
import com.ujuit.usds.sdk.service.ULogger;

/**
 * @depiction
 * @author ripper [RipperF@hotmail.com]
 * @date 2020年4月13日
 */
@Service
public class TransImpl {

	public static Integer masterGroupId = Integer.valueOf(Res.getProperties("masterGroupId"));

	@Resource(type = ClientServiceImplV2.class)
	private ClientService clientServiceV2;

	@Resource(type = ClientServiceImpl.class)
	private ClientService clientService;

	@Resource(type = MasterServiceImplV2.class)
	private MasterService masterServiceV2;

	@Resource(type = MasterServiceImpl.class)
	private MasterService masterService;

	@Resource(type = MastertempServiceImpl.class)
	private MastertempService mastertempService;

	@Resource(type = MastertempServiceImplV2.class)
	private MastertempService mastertempServiceV2;

	@Resource(type = SubaccountServiceImpl.class)
	private SubaccountService subaccountService;

	@Resource(type = SubaccountServiceImplV2.class)
	private SubaccountService subaccountServiceV2;

	@Resource(type = SubaccounttempServiceImpl.class)
	private SubaccounttempService subaccounttempService;

	@Resource(type = SubaccounttempServiceImplV2.class)
	private SubaccounttempService subaccounttempServiceV2;

	@Resource(type = OrderfuturesServiceImpl.class)
	private OrderfuturesService orderfuturesService;

	@Resource(type = OrderfuturesServiceImplV2.class)
	private OrderfuturesService orderfuturesServiceV2;

	@Resource(type = PositionfuturesServiceImpl.class)
	private PositionfuturesService positionfuturesService;

	@Resource(type = PositionfuturesServiceImplV2.class)
	private PositionfuturesService positionfuturesServiceV2;

	@Resource(type = PositionfuturesinfoServiceImpl.class)
	private PositionfuturesinfoService positionfuturesinfoService;

	@Resource(type = PositionfuturesinfoServiceImplV2.class)
	private PositionfuturesinfoService positionfuturesinfoServiceV2;

	@Resource(type = OrderdealfuturesServiceImpl.class)
	private OrderdealfuturesService orderdealfuturesService;

	@Resource(type = OrderdealfuturesServiceImplV2.class)
	private OrderdealfuturesService orderdealfuturesServiceV2;

	@Resource(type = MasterfuturesdailyorderServiceImpl.class)
	private MasterfuturesdailyorderService masterfuturesdailyorderService;

	@Resource(type = MasterfuturesdailyorderServiceImplV2.class)
	private MasterfuturesdailyorderService masterfuturesdailyorderServiceV2;

	@Resource(type = HissettlementServiceImpl.class)
	private HissettlementService hissettlementService;

	@Resource(type = HissettlementServiceImplV2.class)
	private HissettlementService hissettlementServiceV2;

	@Resource(type = MasterfuturesdailyfondServiceImpl.class)
	private MasterfuturesdailyfondService masterfuturesdailyfondService;

	@Resource(type = MasterfuturesdailyfondServiceImplV2.class)
	private MasterfuturesdailyfondService masterfuturesdailyfondServiceV2;

	@Resource(type = CtphissettlefundServiceImpl.class)
	private CtphissettlefundService ctphissettlefundService;

	@Resource(type = CtphissettlefundServiceImplV2.class)
	private CtphissettlefundService ctphissettlefundServiceV2;

	@Resource(type = MasterfuturesdailypositionServiceImpl.class)
	private MasterfuturesdailypositionService masterfuturesdailypositionService;

	@Resource(type = MasterfuturesdailypositionServiceImplV2.class)
	private MasterfuturesdailypositionService masterfuturesdailypositionServiceV2;

	@Resource(type = HispositionfuturesServiceImpl.class)
	private HispositionfuturesService hispositionfuturesService;

	@Resource(type = HispositionfuturesServiceImplV2.class)
	private HispositionfuturesService hispositionfuturesServiceV2;

	@Resource(type = MasterbaseinfoServiceImpl.class)
	private MasterbaseinfoService masterbaseinfoService;

	@Resource(type = MasterbaseinfoServiceImplV2.class)
	private MasterbaseinfoService masterbaseinfoServiceV2;

	@Resource(type = DeliveryServiceImpl.class)
	private DeliveryService deliveryService;

	@Resource(type = DeliveryServiceImplV2.class)
	private DeliveryService deliveryServiceV2;

	@Resource(type = FuturesinstrumentfieldServiceImpl.class)
	private FuturesinstrumentfieldService futuresinstrumentfieldService;

	@Resource(type = FuturesinstrumentfieldServiceImplV2.class)
	private FuturesinstrumentfieldService futuresinstrumentfieldServiceV2;

	@Resource(type = DealgoldmasterServiceImpl.class)
	private DealgoldmasterService dealgoldmasterService;

	@Resource(type = DealgoldmasterServiceImplV2.class)
	private DealgoldmasterService dealgoldmasterServiceV2;

	@Resource(type = DealgoldServiceImpl.class)
	private DealgoldService dealgoldService;

	@Resource(type = DealgoldServiceImplV2.class)
	private DealgoldService dealgoldServiceV2;

	@Resource(type = FutruebasicServiceImpl.class)
	private FutruebasicService futruebasicService;

	@Resource(type = FutruebasicServiceImplV2.class)
	private FutruebasicService futruebasicServiceV2;

	@Resource(type = InstrumentoptionalServiceImpl.class)
	private InstrumentoptionalService instrumentoptionalService;

	@Resource(type = InstrumentoptionalServiceImplV2.class)
	private InstrumentoptionalService instrumentoptionalServiceV2;

	@Resource(type = RmautoorderServiceImpl.class)
	private RmautoorderService rmautoorderService;

	@Resource(type = RmautoorderServiceImplV2.class)
	private RmautoorderService rmautoorderServiceV2;

	@Resource(type = RmmonitorServiceImpl.class)
	private RmmonitorService rmmonitorService;

	@Resource(type = RmmonitorServiceImplV2.class)
	private RmmonitorService rmmonitorServiceV2;

	@Resource(type = ProfitdetailsServiceImpl.class)
	private ProfitdetailsService profitdetailsService;

	@Resource(type = ProfitdetailsServiceImplV2.class)
	private ProfitdetailsService profitdetailsServiceV2;

	@Resource(type = TriggerconditionServiceImpl.class)
	private TriggerconditionService triggerconditionService;

	@Resource(type = TriggerconditionServiceImplV2.class)
	private TriggerconditionService triggerconditionServiceV2;

	@Resource(type = ExpiremessageServiceImpl.class)
	private ExpiremessageService expiremessageService;

	@Resource(type = ExpiremessageServiceImplV2.class)
	private ExpiremessageService expiremessageServiceV2;

	@Resource(type = CtphissettledealgoldServiceImpl.class)
	private CtphissettledealgoldService ctphissettledealgoldService;

	@Resource(type = CtphissettledealgoldServiceImplV2.class)
	private CtphissettledealgoldService ctphissettledealgoldServiceV2;

	@Resource
	private DailymasterassetsService dailymasterassetsService;// 103单对单

	@Resource
	private DailymastergroupassetsService dailymastergroupassetsService;// 合成组

	@Resource(type = HissettleServiceImpl.class)
	private HissettleService hissettleService;

	@Resource(type = HissettleServiceImplV2.class)
	private HissettleService hissettleServiceV2;

	
	
	public List<Master> queryMasterInfo() {
		return masterServiceV2.queryAllAddMaster();
	}

	/**
	 * 客户信息迁移 缺陷 没有做事务回滚处理
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月13日
	 */
	public void moveClient() {
		try {
			List<Client> queryAllClientV2 = clientServiceV2.queryAllClientV2();// 获取需要添加的账户
			for (Client client : queryAllClientV2) {
				Integer oldId = client.getId();
				String oldAccount = client.getAccount();
				client.setAccount(oldAccount + "V4");
				Integer newId = clientService.insert(client);
				client.setAccount(null);
				client.setNewId(newId);
				client.setId(oldId);
				clientServiceV2.update(client);
				ULogger.error(LoggerType.ALL, "addClient----newId==" + newId);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 主账户数据迁移
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月13日
	 */
	public void moveMaster() {
		try {
			List<Master> queryAllAddMaster = masterServiceV2.queryAllAddMaster();
			for (Master master : queryAllAddMaster) {
				Integer oldId = master.getId();
				master.setMasterGroupId(masterGroupId);
				master.setCreateTime(new Date());
				master.setAccount(master.getAccount() + "V2");
				Integer newId = masterService.insert(master);
				master.setNewId(newId);
				master.setId(oldId);
				master.setCreateTime(null);
				masterServiceV2.update(master);
				ULogger.error(LoggerType.ALL, "addeMaster----newId==" + newId);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 迁移主账户临时表记录
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月13日
	 */
	public void moveMasterTemp() {
		try {
			List<Master> queryAllMaster = masterServiceV2.queryAllMaster();
			for (Master master : queryAllMaster) {
				Mastertemp mastertemp = mastertempServiceV2.findByMasterId(master.getId());
				if (mastertemp != null && master.getNewId() != null) {
					mastertemp.setMasterGroupId(masterGroupId);
					mastertemp.setMasterid(master.getNewId());
					Integer insert = mastertempService.insert(mastertemp);
					ULogger.error(LoggerType.ALL, "addMastertemp----Id==" + insert);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 迁移子账户相关数据
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月13日
	 */
	public void moveSubAccount() {
		try {
			List<Subaccount> queryAllAddSubAccount = subaccountServiceV2.queryAllAddSubAccount();// 需要添加到v4中的子账户
			List<Client> queryAllClient = clientServiceV2.queryAllClient();
			Map<Integer, Client> clientMap = BeanUtils.getClientMap(queryAllClient);// 缓存客户信息
			Map<Integer, Master> masterMap = BeanUtils.getMasterMap(masterServiceV2.queryAllMaster());
			for (Subaccount subaccount : queryAllAddSubAccount) {
				Master master = masterMap.get(subaccount.getMasterAccountId());
				if (master != null) {
					Integer oldId = subaccount.getId();
					Integer userId = subaccount.getUserId();// 原来的客户信息
					Client client = clientMap.get(userId);
					if (client != null) {
						subaccount.setUserId(client.getNewId());
						subaccount.setTClientId(client.getNewId());// 设置为v4对应的id
					} else {
						ULogger.error(LoggerType.ALL, "v2客户信息有误clientId==" + userId);
					}
					subaccount.setMasterAccountId(null);
					subaccount.setMasterGroupId(masterGroupId);
					subaccount.setUserNo(subaccount.getUserNo() + "V2");
					subaccount.setCreate_date(new Date());
					Integer newId = subaccountService.insert(subaccount);
					subaccount.setNewId(newId);
					subaccount.setId(oldId);
					subaccount.setMasterGroupId(null);
					subaccount.setUserNo(null);
					subaccount.setCreate_date(null);
					subaccount.setUserId(null);
					subaccount.setTClientId(null);
					subaccountServiceV2.update(subaccount);
					ULogger.error(LoggerType.ALL, "addSubaccount----newId==" + newId);
				}
			}
			ULogger.error(LoggerType.ALL, "moveSubAccount----------success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 迁移临时子账户表
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月13日
	 */
	public void moveSubAccountTemp() {
		try {// 只要有效的数据
			List<Subaccount> queryAllAddSubAccount = subaccountServiceV2.queryAll();
			List<Client> queryAllClient = clientServiceV2.queryAllClient();
			Map<Integer, Client> clientMap = BeanUtils.getClientMap(queryAllClient);// 缓存客户信息
			for (Subaccount subaccount : queryAllAddSubAccount) {
				Subaccounttemp subaccounttemp = subaccounttempServiceV2.findBySubAccountId(subaccount.getId());
				if (subaccounttemp != null && subaccount.getNewId() != null) {
					subaccounttemp.setTSubAccountId(subaccount.getNewId());// 获取到对应v4的id
					subaccounttemp.setCreateDate(new Date());
					Client client = clientMap.get(subaccount.getTClientId());
					if (client != null) {
						subaccounttemp.setUserId(client.getNewId());
						subaccounttemp.setTClientId(client.getNewId());
					}
					subaccounttemp.setUserNo(subaccounttemp.getUserNo() + "V2");
					subaccounttemp.setMasterGroupId(masterGroupId);
					Integer insert = subaccounttempService.insert(subaccounttemp);
					ULogger.error(LoggerType.ALL, "addsubaccounttemp----newId==" + insert);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 迁移委托表
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	public void moveOrderfutures() {
		try {
			List<Orderfutures> queryAllNeedAddOrderfutures = orderfuturesServiceV2.queryAllNeedAddOrderfutures();// 有效的委托order_sys_id不为null
			Map<Integer, Subaccount> subAccountMap = BeanUtils.getSubAccountMap(subaccountServiceV2.queryAll());
			Map<Integer, Master> masterMap = BeanUtils.getMasterMap(masterServiceV2.queryAllMaster());
			for (Orderfutures orderfutures : queryAllNeedAddOrderfutures) {// 问题没有对应的主账户
				Integer masterId = orderfutures.getMasterid();
				Integer subAccountId = orderfutures.getSubAccountId();
				Master master = masterMap.get(masterId);
				if (master != null && master.getNewId() != null) {// 主账户为有效账户
					Integer oldId = orderfutures.getId();
					orderfutures.setMasterid(master.getNewId());
					Subaccount subaccount = subAccountMap.get(subAccountId);
					orderfutures.setSubAccountId(subaccount.getNewId());
					Integer newId = orderfuturesService.insert(orderfutures);
					orderfutures.setId(oldId);
					orderfutures.setSubAccountId(null);
					orderfutures.setMasterid(null);
					orderfutures.setNewId(newId);
					orderfuturesServiceV2.update(orderfutures);
					ULogger.error(LoggerType.ALL, "addOrderfutures----Id==" + newId);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 持仓信息迁移
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	public void movePositionFutures() {
		try {
			Map<Integer, Subaccount> subAccountMap = BeanUtils.getSubAccountMap(subaccountServiceV2.queryAll());
			List<Positionfutures> queryAllPositionfutures = positionfuturesServiceV2.queryAllPositionfutures();
			List<Positionfutures> addList = new ArrayList<>();
			for (int i = 0; i < queryAllPositionfutures.size(); i++) {
				Positionfutures positionfuture = queryAllPositionfutures.get(i);
				Subaccount subaccount = subAccountMap.get(positionfuture.getSubAccountId());
				if (subaccount != null && subaccount.getNewId() != null && subaccount.getId() > 198) {
					positionfuture.setSubAccountId(subaccount.getNewId());
					addList.add(positionfuture);
					if (i % 400 == 399) {
						positionfuturesService.insertBatch(addList);
						addList.clear();
					}
				}
			}
			if (addList.size() > 0) {
				positionfuturesService.insertBatch(addList);
			}
			ULogger.error(LoggerType.ALL, "movePositionFutures----success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 持仓明细迁移
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	public void movePositionFuturesInfo() {
		try {
			List<Subaccount> subAccountList = subaccountServiceV2.queryAll();
			Map<Integer, Subaccount> subAccountMap = BeanUtils.getSubAccountMap(subAccountList);
			List<Positionfuturesinfo> queryAll = positionfuturesinfoServiceV2.queryAll();
			List<Positionfuturesinfo> addList = new ArrayList<>();
			for (int i = 0; i < queryAll.size(); i++) {
				Positionfuturesinfo positionfuturesinfo = queryAll.get(i);
				Subaccount subaccount = subAccountMap.get(positionfuturesinfo.getSubAccountId());
				if (subaccount != null && subaccount.getNewId() != null) {
					positionfuturesinfo.setSubAccountId(subaccount.getNewId());
					addList.add(positionfuturesinfo);
					if (i % 400 == 399) {
						positionfuturesinfoService.insertBatch(addList);
						addList.clear();
					}
				}
			}
			if (addList.size() > 0) {
				positionfuturesinfoService.insertBatch(addList);
			}
			ULogger.error(LoggerType.ALL, "movePositionFuturesInfo----success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 迁移委托成交
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	public void moveOrderdealFutures() {
		try {
			List<Orderfutures> queryAllNeedAddOrderfutures = orderfuturesServiceV2.queryAllNeedAddOrderfutures();// 委托成交
			Map<Integer, Orderfutures> orderfuturesMap = BeanUtils.getOrderfutures(queryAllNeedAddOrderfutures);
			List<Orderdealfutures> queryAll = orderdealfuturesServiceV2.queryAll();// 获取所有的委托成交
			for (Orderdealfutures orderdealfutures : queryAll) {
				Orderfutures orderfutures = orderfuturesMap.get(orderdealfutures.getOrderId());
				if (orderfutures != null && orderfutures.getNewId() != null) {
					orderdealfutures.setOrderId(orderfutures.getNewId());
					Integer insert = orderdealfuturesService.insert(orderdealfutures);
					ULogger.error(LoggerType.ALL, "addOrderdealFutures----Id==" + insert);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 迁移主账户委托信息
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	public void moveMasterfuturesdailyorder() {
		try {
			List<Masterfuturesdailyorder> queryAll = masterfuturesdailyorderServiceV2.queryAll();
			Map<Integer, Master> masterMap = BeanUtils.getMasterMap(masterServiceV2.queryAllMaster());// 主账户map
			List<Masterfuturesdailyorder> addList = new ArrayList<>();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			for (int i = 0; i < queryAll.size(); i++) {
				Masterfuturesdailyorder masterfuturesdailyorder = queryAll.get(i);
				Integer masterId = masterfuturesdailyorder.getMasterId();
				Master master = masterMap.get(masterId);
				if (master != null && master.getNewId() != null) {
					masterfuturesdailyorder.setMasterId(master.getNewId());
					Integer insert = masterfuturesdailyorderService.insert(masterfuturesdailyorder);
					addList.add(masterfuturesdailyorder);
					if (i % 400 == 399) {
						masterfuturesdailyorderService.insertBatch(addList);
						addList.clear();
					}
					ULogger.error(LoggerType.ALL, "addMasterfuturesdailyorder----Id==" + insert);
				}
			}
			if (addList.size() > 0) {
				masterfuturesdailyorderService.insertBatch(addList);
			}
			ULogger.error(LoggerType.ALL, "moveMasterfuturesdailyorder----success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 迁移主账户历史结算
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	public void moveHissettlement() {
		try {
			List<Hissettlement> queryAll = hissettlementServiceV2.queryAll();
			Map<Integer, Master> masterMap = BeanUtils.getMasterMap(masterServiceV2.queryAllMaster());// 主账户map
			List<Hissettlement> addList = new ArrayList<>();
			for (int i = 0; i < queryAll.size(); i++) {
				Hissettlement hissettlement = queryAll.get(i);
				Integer masterId = hissettlement.getMasterId();
				Master master = masterMap.get(masterId);
				if (master != null && master.getNewId() != null) {
					hissettlement.setMasterId(master.getNewId());
					addList.add(hissettlement);
					if (i % 400 == 399) {
						hissettlementService.insertBatch(addList);
						addList.clear();
					}
				}
			}
			if (addList.size() > 0) {
				hissettlementService.insertBatch(addList);
			}
			ULogger.error(LoggerType.ALL, "moveHissettlement----success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	public void moveMasterfuturesdailyfond() {
		try {
			List<Masterfuturesdailyfond> queryAll = masterfuturesdailyfondServiceV2.queryAll();
			Map<Integer, Master> masterMap = BeanUtils.getMasterMap(masterServiceV2.queryAllMaster());// 主账户map
			List<Masterfuturesdailyfond> addList = new ArrayList<>();
			for (int i = 0; i < queryAll.size(); i++) {
				Masterfuturesdailyfond masterfuturesdailyfond = queryAll.get(i);
				Integer masterId = masterfuturesdailyfond.getMasterId();
				Master master = masterMap.get(masterId);
				if (master != null && master.getNewId() != null) {
					masterfuturesdailyfond.setMasterId(master.getNewId());
					addList.add(masterfuturesdailyfond);
					if (i % 400 == 399) {
						masterfuturesdailyfondService.insertBatch(addList);
						addList.clear();
					}
				}
			}
			if (addList.size() > 0) {
				masterfuturesdailyfondService.insertBatch(addList);
			}
			ULogger.error(LoggerType.ALL, "moveMasterfuturesdailyfond----success");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	public void moveCtphissettlefund() {
		try {
			List<Ctphissettlefund> queryAll = ctphissettlefundServiceV2.queryAll();
			Map<Integer, Master> masterMap = BeanUtils.getMasterMap(masterServiceV2.queryAllMaster());// 主账户map
			List<Ctphissettlefund> addList = new ArrayList<>();
			for (int i = 0; i < queryAll.size(); i++) {
				Ctphissettlefund ctphissettlefund = queryAll.get(i);
				Integer masterId = ctphissettlefund.getMasterId();
				Master master = masterMap.get(masterId);
				if (master != null && master.getNewId() != null) {
					ctphissettlefund.setMasterId(master.getNewId());
					addList.add(ctphissettlefund);
					if (i % 400 == 399) {
						ctphissettlefundService.insertBatch(addList);
						addList.clear();
					}
				}
			}
			if (addList.size() > 0) {
				ctphissettlefundService.insertBatch(addList);
			}
			ULogger.error(LoggerType.ALL, "moveCtphissettlefund----success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	public void moveMasterfuturesdailyposition() {
		try {
			List<Masterfuturesdailyposition> queryAll = masterfuturesdailypositionServiceV2.queryAll();
			Map<Integer, Master> masterMap = BeanUtils.getMasterMap(masterServiceV2.queryAllMaster());// 主账户map
			List<Masterfuturesdailyposition> addList = new ArrayList<>();
			for (int i = 0; i < queryAll.size(); i++) {
				Masterfuturesdailyposition masterfuturesdailyposition = queryAll.get(i);
				Integer masterId = masterfuturesdailyposition.getMasterId();
				Master master = masterMap.get(masterId);
				if (master != null && master.getNewId() != null) {
					masterfuturesdailyposition.setMasterId(master.getNewId());
					addList.add(masterfuturesdailyposition);
					if (i % 400 == 399) {
						masterfuturesdailypositionService.insertBatch(addList);
						addList.clear();
					}
				}
			}
			if (addList.size() > 0) {
				masterfuturesdailypositionService.insertBatch(addList);
			}
			ULogger.error(LoggerType.ALL, "moveMasterfuturesdailyposition----success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	public void moveHispositionfutures() {
		try {
			List<Hispositionfutures> queryAll = hispositionfuturesServiceV2.queryAll();
			Map<Integer, Subaccount> subAccountMap = BeanUtils.getSubAccountMap(subaccountServiceV2.queryAll());// 子账户map
			List<Hispositionfutures> addList = new ArrayList<>();
			for (int i = 0; i < queryAll.size(); i++) {
				Hispositionfutures hispositionfuture = queryAll.get(i);
				Integer subAccountId = hispositionfuture.getSubAccountId();
				Subaccount subaccount = subAccountMap.get(subAccountId);
				if (subaccount != null && subaccount.getNewId() != null) {
					hispositionfuture.setSubAccountId(subaccount.getNewId());
					addList.add(hispositionfuture);
					if (i % 400 == 399) {
						hispositionfuturesService.insertBatch(addList);
						addList.clear();
					}
				}
			}
			if (addList.size() > 0) {
				hispositionfuturesService.insertBatch(addList);
			}
			ULogger.error(LoggerType.ALL, "moveHispositionfutures----success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 主账户对应主机地址记录
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	public void moveMasterbaseinfo() {
		try {
			List<Masterbaseinfo> queryAll = masterbaseinfoServiceV2.queryAll();
			Map<Integer, Master> masterMap = BeanUtils.getMasterMap(masterServiceV2.queryAllMaster());// 主账户map
			List<Masterbaseinfo> addList = new ArrayList<>();
			for (int i = 0; i < queryAll.size(); i++) {
				Masterbaseinfo masterbaseinfo = queryAll.get(i);
				Integer masterId = masterbaseinfo.getMasterId();
				Master master = masterMap.get(masterId);
				if (master != null && master.getNewId() != null) {
					masterbaseinfo.setMasterId(master.getNewId());
					addList.add(masterbaseinfo);
					if (i % 400 == 399) {
						masterbaseinfoService.insertBatch(addList);
						addList.clear();
					}
				}
			}
			if (addList.size() > 0) {
				masterbaseinfoService.insertBatch(addList);
			}
			ULogger.error(LoggerType.ALL, "moveMasterbaseinfo----success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 交割单
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	public void moveDelivery() {
		try {
			List<Delivery> queryAll = deliveryServiceV2.queryAll();
			Map<Integer, Subaccount> subAccountMap = BeanUtils.getSubAccountMap(subaccountServiceV2.queryAll());// 子账户map
			List<Delivery> addList = new ArrayList<>();
			for (int i = 0; i < queryAll.size(); i++) {
				Delivery delivery = queryAll.get(i);
				Integer subAccountId = delivery.getSubAccountId();
				Subaccount subaccount = subAccountMap.get(subAccountId);
				if (subaccount != null && subaccount.getNewId() != null) {
					delivery.setSubAccountId(subaccount.getNewId());
					addList.add(delivery);
					if (i % 400 == 399) {
						deliveryService.insertBatch(addList);
						addList.clear();
					}
				}
			}
			if (addList.size() > 0) {
				deliveryService.insertBatch(addList);
			}
			ULogger.error(LoggerType.ALL, "moveDelivery----success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 合约基本信息
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	public void moveFuturesinstrumentfield() {
		try {
			List<Futuresinstrumentfield> queryAll = futuresinstrumentfieldServiceV2.queryAll();
			List<Futuresinstrumentfield> addList = new ArrayList<>();
			for (Futuresinstrumentfield futuresinstrumentfield : queryAll) {
				addList.add(futuresinstrumentfield);
			}
			futuresinstrumentfieldService.insertBatch(addList);
			ULogger.error(LoggerType.ALL, "moveFuturesinstrumentfield----success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 主账户出入金记录
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	public void moveDealgoldmaster() {
		try {
			List<Dealgoldmaster> queryAll = dealgoldmasterServiceV2.queryAll();
			Map<Integer, Master> masterMap = BeanUtils.getMasterMap(masterServiceV2.queryAllMaster());// 主账户map
			List<Dealgoldmaster> addList = new ArrayList<>();
			for (int i = 0; i < queryAll.size(); i++) {
				Dealgoldmaster dealgoldmaster = queryAll.get(i);
				Integer masterId = dealgoldmaster.getAccountId();
				Master master = masterMap.get(masterId);
				if (master != null && master.getNewId() != null) {
					dealgoldmaster.setAccountId(master.getNewId());
					addList.add(dealgoldmaster);
					if (i % 400 == 399) {
						dealgoldmasterService.insertBatch(addList);
						addList.clear();
					}
				}
			}
			if (addList.size() > 0) {
				dealgoldmasterService.insertBatch(addList);
			}
			ULogger.error(LoggerType.ALL, "moveDealgoldmaster----success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	public void moveDealgold() {
		try {
			List<Dealgold> queryAll = dealgoldServiceV2.queryAll();
			Map<Integer, Subaccount> subAccountMap = BeanUtils.getSubAccountMap(subaccountServiceV2.queryAll());// 子账户map
			List<Dealgold> addList = new ArrayList<>();
			for (int i = 0; i < queryAll.size(); i++) {
				Dealgold dealgold = queryAll.get(i);
				Integer subAccountId = dealgold.getSubAccountId();
				Subaccount subaccount = subAccountMap.get(subAccountId);
				if (subaccount != null && subaccount.getNewId() != null) {
					dealgold.setSubAccountId(subaccount.getNewId());
					addList.add(dealgold);
					if (i % 400 == 399) {
						dealgoldService.insertBatch(addList);
						addList.clear();
					}
				}
			}
			if (addList.size() > 0) {
				dealgoldService.insertBatch(addList);
			}
			ULogger.error(LoggerType.ALL, "moveDealgold----success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 合约基本信息
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	public void moveFutruebasic() {
		try {
//			List<Futruebasic> queryAll = futruebasicServiceV2.queryAll();
			Map<Integer, Master> masterMap = BeanUtils.getMasterMap(masterServiceV2.queryAllMaster());// 主账户map
			Set<Integer> keySet = masterMap.keySet();
			List<Futruebasic> addList = new ArrayList<>();
			for (Integer masterId : keySet) {
				Master master = masterMap.get(masterId);
				if (master.getNewId() != null) {
					Futruebasic findByMasterId = futruebasicServiceV2.findByMasterId(masterId);
					if (findByMasterId != null) {
						findByMasterId.setMasterId(master.getNewId());
						addList.add(findByMasterId);
					}
				}
			}
			if (addList.size() > 0) {
				futruebasicService.insertBatch(addList);
			}
			ULogger.error(LoggerType.ALL, "moveFutruebasic----success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	public void moveInstrumentoptional() {
		try {
			List<Instrumentoptional> queryAll = instrumentoptionalServiceV2.queryAll();
			Map<Integer, Subaccount> subAccountMap = BeanUtils.getSubAccountMap(subaccountServiceV2.queryAll());// 子账户map
			List<Instrumentoptional> addList = new ArrayList<>();
			for (int i = 0; i < queryAll.size(); i++) {
				Instrumentoptional instrumentoptional = queryAll.get(i);
				Integer subAccountId = instrumentoptional.getSubAccountId();
				Subaccount subaccount = subAccountMap.get(subAccountId);
				if (subaccount != null && subaccount.getNewId() != null) {
					instrumentoptional.setSubAccountId(subaccount.getNewId());
					addList.add(instrumentoptional);
					if (i % 400 == 399) {
						instrumentoptionalService.insertBatch(addList);
						addList.clear();
					}
				}
			}
			if (addList.size() > 0) {
				instrumentoptionalService.insertBatch(addList);
			}
			ULogger.error(LoggerType.ALL, "moveInstrumentoptional----success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	public void moveRmautoorder() {
		try {
			List<Rmautoorder> queryAll = rmautoorderServiceV2.queryAll();
			Map<Integer, Subaccount> subAccountMap = BeanUtils.getSubAccountMap(subaccountServiceV2.queryAll());// 子账户map
			List<Rmautoorder> addList = new ArrayList<>();
			for (int i = 0; i < queryAll.size(); i++) {
				Rmautoorder rmautoorder = queryAll.get(i);
				Integer subAccountId = rmautoorder.getSubAccountId();
				Subaccount subaccount = subAccountMap.get(subAccountId);
				if (subaccount != null && subaccount.getNewId() != null) {
					rmautoorder.setSubAccountId(subaccount.getNewId());
					if (i % 400 == 399) {
						rmautoorderService.insertBatch(addList);
						addList.clear();
					}
				}
			}
			if (addList.size() > 0) {
				rmautoorderService.insertBatch(addList);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	public void moveRmmonitor() {
		try {
			List<Rmmonitor> queryAll = rmmonitorServiceV2.queryAll();
			Map<Integer, Subaccount> subAccountMap = BeanUtils.getSubAccountMap(subaccountServiceV2.queryAll());// 子账户map
			List<Rmmonitor> addList = new ArrayList<>();
			for (int i = 0; i < queryAll.size(); i++) {
				Rmmonitor rmmonitor = queryAll.get(i);
				Integer subAccountId = rmmonitor.getSubAccountId();
				Subaccount subaccount = subAccountMap.get(subAccountId);
				if (subaccount != null && subaccount.getNewId() != null) {
					rmmonitor.setSubAccountId(subaccount.getNewId());
					if (i % 400 == 399) {
						rmmonitorService.insertBatch(addList);
						addList.clear();
					}
				}
			}
			if (addList.size() > 0) {
				rmmonitorService.insertBatch(addList);
			}
			ULogger.error(LoggerType.ALL, "moveRmmonitor----success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 迁移主账户委托信息
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	public void moveProfitdetails() {
		try {
			List<Profitdetails> queryAll = profitdetailsServiceV2.queryAll();
			Map<Integer, Master> masterMap = BeanUtils.getMasterMap(masterServiceV2.queryAllMaster());// 主账户map
			Map<Integer, Subaccount> subAccountMap = BeanUtils.getSubAccountMap(subaccountServiceV2.queryAll());// 子账户map
			List<Profitdetails> addList = new ArrayList<>();
			for (int i = 0; i < queryAll.size(); i++) {
				Profitdetails masterfuturesdailyorder = queryAll.get(i);
				Integer masterId = masterfuturesdailyorder.getMasterId();
				Master master = masterMap.get(masterId);
				if (master != null && master.getNewId() != null) {
					Subaccount subaccount = subAccountMap.get(masterfuturesdailyorder.getSubAccountId());
					if (subaccount != null) {
						masterfuturesdailyorder.setSubAccountId(subaccount.getNewId());
					}
					masterfuturesdailyorder.setMasterId(master.getNewId());
					addList.add(masterfuturesdailyorder);
					if (i % 400 == 399) {
						profitdetailsService.insertBatch(addList);
						addList.clear();
					}
				}
			}
			if (addList.size() > 0) {
				profitdetailsService.insertBatch(addList);
			}
			ULogger.error(LoggerType.ALL, "moveProfitdetails----success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 条件单
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	public void moveTriggercondition() {
		try {
			List<Triggercondition> queryAll = triggerconditionServiceV2.queryAll();
			Map<Integer, Subaccount> subAccountMap = BeanUtils.getSubAccountMap(subaccountServiceV2.queryAll());
			Map<Integer, Orderfutures> orderfuturesMap = BeanUtils
					.getOrderfutures(orderfuturesServiceV2.queryAllNeedAddOrderfutures());
			List<Triggercondition> addList = new ArrayList<>();
			for (int i = 0; i < queryAll.size(); i++) {
				Triggercondition triggercondition = queryAll.get(i);

				Subaccount subaccount = subAccountMap.get(triggercondition.getSubAccountId());
				if (subaccount != null && subaccount.getNewId() != null && subaccount.getId() > 195) {
					triggercondition.setSubAccountId(subaccount.getNewId());
					if (!StringUtils.isEmpty(triggercondition.getTargetOrderId())) {
						Orderfutures orderfutures = orderfuturesMap
								.get(Integer.valueOf(triggercondition.getTargetOrderId()));
						if (orderfutures != null) {
							triggercondition.setTargetOrderId(orderfutures.getNewId() + "");
						}
					}

					addList.add(triggercondition);
					if (i % 400 == 399) {
						triggerconditionService.insertBatch(addList);
						addList.clear();
					}
				}
			}
			if (addList.size() > 0) {
				triggerconditionService.insertBatch(addList);
			}
			ULogger.error(LoggerType.ALL, "moveTriggercondition----success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void moveExpiremessage() {
		try {
			List<Expiremessage> queryAll = expiremessageServiceV2.queryAll();
			List<Expiremessage> addList = new ArrayList<Expiremessage>();
			for (Expiremessage expiremessage : queryAll) {
				addList.add(expiremessage);
			}
			if (addList.size() > 0) {
				expiremessageService.insertBatch(addList);
			}
			ULogger.error(LoggerType.ALL, "moveExpiremessage----success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void moveCtphissettledealgold() {
		try {
			List<Ctphissettledealgold> queryAll = ctphissettledealgoldServiceV2.queryAll();
			List<Ctphissettledealgold> addList = new ArrayList<Ctphissettledealgold>();
			for (Ctphissettledealgold ctphissettledealgold : queryAll) {
				addList.add(ctphissettledealgold);
			}
			if (addList.size() > 0) {
				ctphissettledealgoldService.insertBatch(addList);
			}
			ULogger.error(LoggerType.ALL, "moveCtphissettledealgold----success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月20日
	 */
	public void moveDailymastergroupassets() {
		try {
			List<Dailymasterassets> queryAll = dailymasterassetsService.queryAll();
			Map<Date, List<Dailymasterassets>> map = new HashMap<Date, List<Dailymasterassets>>();
			for (Dailymasterassets dailymasterassets : queryAll) {
				Date hisDate = dailymasterassets.getHisDate();
				List<Dailymasterassets> oldList = map.get(hisDate);
				if (oldList == null) {
					List<Dailymasterassets> temp = new ArrayList<Dailymasterassets>();
					temp.add(dailymasterassets);
					map.put(hisDate, temp);
				} else {
					oldList.add(dailymasterassets);
				}
			}
			List<Master> queryAllMaster = masterServiceV2.queryAllMaster();// 找到有newid的账户
			List<Integer> oldMasterIds = new ArrayList<Integer>();// 缓存移植过来的主账户id
			for (Master master : queryAllMaster) {
				if (master.getNewId() != null) {
					oldMasterIds.add(master.getId());
				}
			}
			List<Dailymastergroupassets> addList = new ArrayList<Dailymastergroupassets>();
			Set<Date> keySet = map.keySet();
			for (Date hisDate : keySet) {
				List<Dailymasterassets> list = map.get(hisDate);
				Dailymastergroupassets temp = new Dailymastergroupassets();
				temp.setMasterGroupId(masterGroupId);
				temp.setHisDate(hisDate);
				BigDecimal totailAssets = BigDecimal.ZERO;
				BigDecimal capitailAmount = BigDecimal.ZERO;
				for (Dailymasterassets dailymasterassets : list) {
					Integer tMasterId = dailymasterassets.getTMasterId();
					if (oldMasterIds.contains(tMasterId)) {
						totailAssets = BusinessUtil.AddMoney(totailAssets, dailymasterassets.getTotalAssets());
						capitailAmount = BusinessUtil.AddMoney(capitailAmount, dailymasterassets.getCapitalAmount());
					}
				}
				temp.setTotalAssets(totailAssets);
				temp.setCapitalAmount(capitailAmount);
				addList.add(temp);
			}
			if (addList.size() > 0) {
				dailymastergroupassetsService.insertBatch(addList);
			}
			ULogger.error(LoggerType.ALL, "moveDailymastergroupassets----success");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 子账户历史结算
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	public void moveHissettleService() {
		try {
			Map<Integer, Subaccount> subAccountMap = BeanUtils.getSubAccountMap(subaccountServiceV2.queryAll());
			List<Hissettle> hissettleList = hissettleServiceV2.queryAll();
			List<Hissettle> addList = new ArrayList<>();
			for (int i = 0; i < hissettleList.size(); i++) {
				Hissettle hissettle = hissettleList.get(i);
				Subaccount subaccount = subAccountMap.get(hissettle.getSubAccountId());
				if (subaccount != null && subaccount.getNewId() != null) {
					hissettle.setSubAccountId(subaccount.getNewId());
					addList.add(hissettle);
					if (i % 400 == 399) {
						hissettleService.insertBatch(addList);
						addList.clear();
					}
				}
			}
			if (addList.size() > 0) {
				hissettleService.insertBatch(addList);
			}
			ULogger.error(LoggerType.ALL, "moveHissettle----success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
