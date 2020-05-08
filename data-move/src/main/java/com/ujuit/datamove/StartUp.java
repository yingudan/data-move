package com.ujuit.datamove;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

public class StartUp {

	public static ApplicationContext context;

	public static TransImpl transImpl;

	public static void main(String[] args) {
		try {
			UsdsRequstService.init(); // 加入内部异常系统
			context = new ClassPathXmlApplicationContext("classpath*:*Context.xml");// 实例化Spring容器
			transImpl = SpringContextUtils.getBean(TransImpl.class);
//			transImpl.moveDealgoldmaster();// 主账户出入金记录
			MoveImpotent();//第一步          可以重复
//			transImpl.moveMasterbaseinfo();// 主账户对应主机地址记录
//			MoveMasterInfo();//主账户相关数据
//			MoveSubAccountInfo();//子账户相关数据
			MoveOther();//其他数据
		} catch (Exception e) {
			ULogger.error(LoggerType.ERROR, "启动错误", e);
		}
		ULogger.error(LoggerType.ERROR, "datamove执行完成----");
	}

	public static void MoveImpotent() {
//		transImpl.moveClient();
//		transImpl.moveMaster();
		transImpl.moveSubAccount();
//		transImpl.moveOrderfutures();
	}

	/**
	 * 移动主账户相关
	 */
	public static void MoveMasterInfo() {
		transImpl.moveMasterTemp();// 主账户临时记录
		transImpl.moveHissettlement();// 主账户历史结算
		transImpl.moveMasterfuturesdailyfond();
		transImpl.moveCtphissettlefund();// ctp结算单
		transImpl.moveDealgoldmaster();// 主账户出入金记录
		transImpl.moveMasterfuturesdailyorder();// order_source num=10
		transImpl.moveMasterfuturesdailyposition();
		transImpl.moveDailymastergroupassets();
		ULogger.error(LoggerType.ALL, "MoveMasterInfo-------------success");
	}

	/**
	 * 移动子账户
	 */
	public static void MoveSubAccountInfo() {
		transImpl.moveSubAccountTemp();
		transImpl.movePositionFuturesInfo();// 子账户持仓明细
		transImpl.movePositionFutures();// 子账户持仓信息
		transImpl.moveHispositionfutures();
		transImpl.moveRmmonitor();
		transImpl.moveRmautoorder();
		transImpl.moveInstrumentoptional();
		transImpl.moveDealgold();// 子账户出入金记录
		transImpl.moveHissettleService();
		ULogger.error(LoggerType.ALL, "MoveSubAccountInfo-------------success");
	}

	/**
	 * 移动其他数据
	 */
	public static void MoveOther() {
//		transImpl.moveOrderdealFutures();// 委托成交
//		transImpl.moveProfitdetails();// 账户手续费
//		transImpl.moveDelivery();// 交割单
//		transImpl.moveExpiremessage();
//		transImpl.moveTriggercondition();// 不太确定是否会出错
		transImpl.moveFutruebasic();// 设置值 set global max_allowed_packet = 10*1024*1024
		ULogger.error(LoggerType.ALL, "MoveSubAccountInfo-------------success");
	}

}
