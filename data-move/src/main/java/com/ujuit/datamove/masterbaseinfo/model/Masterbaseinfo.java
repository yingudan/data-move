package com.ujuit.datamove.masterbaseinfo.model;
import java.math.BigDecimal; 
import java.util.*; 
 
  
/**
 * 主账户对应主机地址记录
 * @author shadow
 */ 
public class Masterbaseinfo  {
	/**
	 *
	 */
	private Integer id;
	/**
	 *主账户id
	 */
	private Integer masterId;
	/**
	 *
	 */
	private String hostIp;
	/**
	 *
	 */
	private String hostPort;
	/**
	 *
	 */
	private String hostMac;
	/** 
	 *
	 */
	public Integer getId() {
		return id;
	}
	/** 
	 *
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/** 
	 *主账户id
	 */
	public Integer getMasterId() {
		return masterId;
	}
	/** 
	 *主账户id
	 */
	public void setMasterId(Integer masterId) {
		this.masterId = masterId;
	}
	/** 
	 *
	 */
	public String getHostIp() {
		return hostIp;
	}
	/** 
	 *
	 */
	public void setHostIp(String hostIp) {
		this.hostIp = hostIp;
	}
	/** 
	 *
	 */
	public String getHostPort() {
		return hostPort;
	}
	/** 
	 *
	 */
	public void setHostPort(String hostPort) {
		this.hostPort = hostPort;
	}
	/** 
	 *
	 */
	public String getHostMac() {
		return hostMac;
	}
	/** 
	 *
	 */
	public void setHostMac(String hostMac) {
		this.hostMac = hostMac;
	}
}