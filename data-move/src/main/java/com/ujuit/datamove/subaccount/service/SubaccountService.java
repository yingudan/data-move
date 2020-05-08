package com.ujuit.datamove.subaccount.service;

import com.ujuit.datamove.subaccount.model.Subaccount;
import java.util.List;

public interface SubaccountService {

	Integer insert(Subaccount subaccount);

	void update(Subaccount subaccount);

	void insertBatch(List<Subaccount> list);

	void delete(Integer id);

	Subaccount findById(Integer id);

	/**
	 * 获取newId为null的
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	List<Subaccount> queryAllAddSubAccount();
	
	
	List<Subaccount>queryAll();
	

}