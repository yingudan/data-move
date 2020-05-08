package com.ujuit.datamove;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ujuit.datamove.client.service.ClientServiceImpl;
import com.ujuit.datamove.client.service.ClientServiceImplV2;
import com.ujuit.datamove.master.model.Master;
import com.ujuit.datamove.transfer.service.TransImpl;
import com.ujuit.sysmanager.util.SpringContextUtils;
import com.ujuit.usds.sdk.constant.LoggerType;
import com.ujuit.usds.sdk.service.ULogger;
import com.ujuit.usds.sdk.service.UsdsRequstService;

/**
 * 
 * @depiction 新版子账户动态风控
 * @author ripper [RipperF@hotmail.com]
 * @date 2020年3月19日
 */

public class StartUpTest {

	public static ApplicationContext context;
	public static ClientServiceImpl clientServiceImpl;
	public static ClientServiceImplV2 clientServiceImplV2;
	public static TransImpl transImpl;

	public static void main(String[] args) {
		// 加入内部异常系统
		try {
			UsdsRequstService.init();
			context = new ClassPathXmlApplicationContext("classpath*:*Context.xml");// 实例化Spring容器
			transImpl = SpringContextUtils.getBean(TransImpl.class);
			
			List<Master> queryMasterInfo = transImpl.queryMasterInfo();
			System.out.println(queryMasterInfo.size());
			System.out.println(queryMasterInfo);
			
		} catch (Exception e) {
			ULogger.error(LoggerType.ERROR, "启动错误", e);
		}
//		ULogger.error(LoggerType.ERROR, "datamove执行完成----");
	}

	public static void MoveImpotent() {
//		transImpl.moveClient();
//		transImpl.moveMaster();
//		transImpl.moveSubAccount();
//		transImpl.moveOrderfutures();
	}

	public static void MoveAll() {
		transImpl.moveMasterTemp();
//		transImpl.moveSubAccountTemp();

//		transImpl.movePositionFuturesInfo();
//		transImpl.movePositionFutures();
//		transImpl.moveOrderdealFutures();
		transImpl.moveHissettlement();
		transImpl.moveMasterfuturesdailyfond();

		transImpl.moveCtphissettlefund();
		transImpl.moveMasterfuturesdailyposition();

//		transImpl.moveHispositionfutures();
//		transImpl.moveProfitdetails();
//		transImpl.moveMasterbaseinfo();

//		transImpl.moveDelivery();
//		transImpl.moveDealgold();
//		transImpl.moveDealgoldmaster();
//		transImpl.moveRmmonitor();
//		transImpl.moveRmautoorder();
		transImpl.moveDailymastergroupassets();

//		transImpl.moveExpiremessage();
//		transImpl.moveInstrumentoptional();
//		transImpl.moveTriggercondition();// 不太确定是否会出错
		transImpl.moveFutruebasic();// 设置值 set global max_allowed_packet = 10*1024*1024
		transImpl.moveMasterfuturesdailyorder();// order_source num=10
		transImpl.moveHissettleService();

	}
}
