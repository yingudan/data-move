package com.ujuit.datamove.orderfutures.service;

import com.ujuit.datamove.orderfutures.model.Orderfutures;
import java.util.List;

public interface OrderfuturesService {

	Integer insert(Orderfutures orderfutures);

	void update(Orderfutures orderfutures);

	void insertBatch(List<Orderfutures> list);

	void delete(Integer id);

	Orderfutures findById(Integer id);

	/**
	 * 获取需要迁移的数据
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	List<Orderfutures> queryAllNeedAddOrderfutures();

}