package com.ujuit.datamove.utils;

import java.math.BigDecimal;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.ujuit.stockquotation.model.TdfMarketDataHolder;

/**
 * @Description 业务工具类
 * 
 * @author <a href="mailto:odenpan@gmail.com">Oden Pan</a>
 * @date 2017年8月16日
 * @company 有据信息技术有限公司
 * @version 1.0
 */
public final class BusinessUtil {

	public final static String buy = "0";
	public final static String sale = "1";

	private final static BigDecimal tenThousand = new BigDecimal(10000);
	private final static SimpleDateFormat f_sqlTime = new SimpleDateFormat("HH:mm:ss");

	public static Time getNowTime() {
		return java.sql.Time.valueOf(f_sqlTime.format(new Date()));
	}


	/**
	 * 是否需要处理 true 代表需要风控，false代表不需要风控
	 * 
	 * @param codeMap
	 * @param isall
	 * @param code
	 * @return
	 * @date 2017年8月17日
	 * @author <a href="mailto:odenpan@gmail.com">Oden Pan</a>
	 */
	public static final boolean isCode(Map<String, String> codeMap, boolean isall, String code) {
		if (isall || codeMap.containsKey(code))
			return true;
		return false;

	}

	/**
	 * @param nowTime
	 *            -当前时间
	 * @param startTime
	 *            -开始时间
	 * @param endTime
	 *            -结束时间
	 * @return true 代表需要强平 false 不需要强平
	 * @date 2017年8月16日
	 * @author <a href="mailto:odenpan@gmail.com">Oden Pan</a>
	 */
	public static final boolean resultType(Time nowTime, Time startTime, Time endTime) {

		if ((startTime == null || nowTime.getTime() >= startTime.getTime())
				&& (endTime == null || nowTime.getTime() <= endTime.getTime())) {

			return true;

		}
		return false;
	}

	/**
	 * 10000毫厘=1元
	 * 
	 * @param n
	 * @return
	 * @date 2017年8月17日
	 * @author <a href="mailto:odenpan@gmail.com">Oden Pan</a>
	 */
	public final static BigDecimal getRmbUnit(int n) {

		return getRmbUnit(new BigDecimal(n));
	}

	/**
	 * 10000毫厘=1元
	 * 
	 * @param n
	 * @return
	 * @date 2017年8月17日
	 * @author <a href="mailto:odenpan@gmail.com">Oden Pan</a>
	 */
	public final static BigDecimal getRmbUnit(BigDecimal n) {
		return n.divide(tenThousand);
	}

	/**
	 * BigDecimal 加法防止空对象报错
	 * 
	 * @author shandowF
	 * @date 2018年1月23日
	 *
	 */
	public static final BigDecimal AddMoney(BigDecimal a, BigDecimal b) {
		if (a == null) {
			a = BigDecimal.ZERO;
		}
		if (b == null) {
			b = BigDecimal.ZERO;
		}
		return a.add(b);
	}

	/**
	 * BigDecimal减法 防止报错
	 */
	public static final BigDecimal SubMoney(BigDecimal a, BigDecimal b) {
		if (a == null) {
			a = BigDecimal.ZERO;
		}
		if (b == null) {
			b = BigDecimal.ZERO;
		}
		return a.subtract(b).setScale(4, BigDecimal.ROUND_DOWN);
	}

	/**
	 * BigDecimal减法 防止报错
	 */
	public static final BigDecimal SubMoney(BigDecimal a, BigDecimal b, Integer num) {
		if (a == null) {
			a = BigDecimal.ZERO;
		}
		if (b == null) {
			b = BigDecimal.ZERO;
		}
		return a.subtract(b).setScale(num, BigDecimal.ROUND_DOWN);
	}

	/**
	 * 数字加法防止报错
	 * 
	 * @author shandowF
	 * @date 2018年1月24日
	 *
	 */
	public static final Integer addNum(Integer a, Integer b) {
		if (a == null) {
			a = 0;
		}
		if (b == null) {
			b = 0;
		}
		return a + b;
	}

	/**
	 * 数字减法防止报错
	 * 
	 * @author shandowF
	 * @date 2018年1月24日
	 *
	 */
	public static final Integer subNum(Integer a, Integer b) {
		if (a == null) {
			a = 0;
		}
		if (b == null) {
			b = 0;
		}
		return a - b;
	}

	public static final BigDecimal divide(BigDecimal a, BigDecimal b) {
		if (a == null) {
			return BigDecimal.ZERO;
		}
		if (b == null) {
			return BigDecimal.ZERO;
		}
		if (BigDecimal.ZERO.compareTo(b) == 0) {
			return BigDecimal.ZERO;
		}
		return a.divide(b, 2, BigDecimal.ROUND_HALF_UP);
	}

	public static final BigDecimal divide(BigDecimal a, BigDecimal b, Integer theNum) {
		if (a == null) {
			return BigDecimal.ZERO;
		}
		if (b == null) {
			return BigDecimal.ZERO;
		}
		if (BigDecimal.ZERO.compareTo(b) == 0) {
			return BigDecimal.ZERO;
		}
		return a.divide(b, theNum, BigDecimal.ROUND_HALF_UP);
	}

	public static final BigDecimal mulMoney(BigDecimal price, Integer num) {
		if (price == null) {
			return BigDecimal.ZERO;
		}
		if (num == null || num == 0) {
			return BigDecimal.ZERO;
		}
		return price.multiply(new BigDecimal(num));
	}

	/**
	 * getBigDecimal转换防止报错
	 * 
	 * @author shandowF
	 * @Date 2018年12月3日
	 * @param bd
	 * @return
	 */
	public static BigDecimal getBigDecimal(String decimal) {
		if (StringUtils.isEmpty(decimal)) {
			return BigDecimal.ZERO;
		}
		BigDecimal bigDecimal = BigDecimal.ZERO;
		try {
			bigDecimal = new BigDecimal(decimal);
		} catch (Exception e) {
		}
		return bigDecimal;
	}

	/**
	 * 设置BigDecimal 值
	 * 
	 * @author shandowF
	 * @Date 2019年3月25日
	 * @param decimal
	 * @param num
	 * @param BigDecimalType
	 * @return
	 */
	public static BigDecimal getBigDecimalScale(String decimal, Integer newScale, int roundingMode) {
		BigDecimal bigDecimal = getBigDecimal(decimal);
		return bigDecimal.setScale(newScale, roundingMode);
	}

	/**
	 * @author shandowF
	 * @Date 2019年1月8日 返回较小的值
	 */
	public static BigDecimal getSmallDecimal(BigDecimal a, BigDecimal b) {
		if (a == null) {
			a = BigDecimal.ZERO;
		}
		if (b == null) {
			b = BigDecimal.ZERO;
		}
		if (a.compareTo(b) > -1) {
			return a;
		}
		return b;
	}

	/**
	 * 将账户id与账户类型设置为唯一标识
	 */
	public static String getUniqueKey(Integer accountId, Integer accountType) {
		return accountId + "_" + accountType;
	}

	public static String getUniqueKey(Integer accountId, Integer accountType, Integer followId, Integer followType) {
		return accountId + "_" + accountType + "_" + followId + "_" + followType;
	}

	
	public static void main(String[] args) {
		BigDecimal needDisposition = new BigDecimal("12.6199999");
		System.out.println(needDisposition.setScale(2, BigDecimal.ROUND_DOWN));
	}
}
