package com.ujuit.datamove.master.service;

import com.ujuit.datamove.master.model.Master;
import java.util.List;

public interface MasterService {

	Integer insert(Master master);

	void update(Master master);

	void insertBatch(List<Master> list);

	void delete(Integer id);

	Master findById(Integer id);

	/**
	 * 查询所有需要添加的主账户 new_id 为null
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月13日
	 */
	List<Master> queryAllAddMaster();

	/**
	 * 查询所有的账户
	 */
	List<Master> queryAllMaster();

	
}