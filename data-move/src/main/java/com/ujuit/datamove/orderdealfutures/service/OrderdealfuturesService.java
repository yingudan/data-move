package com.ujuit.datamove.orderdealfutures.service;

import com.ujuit.datamove.orderdealfutures.model.Orderdealfutures;
import java.util.List;

public interface OrderdealfuturesService {

	Integer insert(Orderdealfutures orderdealfutures);

	void update(Orderdealfutures orderdealfutures);

	void insertBatch(List<Orderdealfutures> list);

	void delete(Integer id);

	Orderdealfutures findById(Integer id);

	List<Orderdealfutures> queryAll();

}