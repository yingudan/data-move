package com.ujuit.datamove.hispositionfutures.service;

import com.ujuit.datamove.hispositionfutures.model.Hispositionfutures;
import java.util.List;

public interface HispositionfuturesService {

	Integer insert(Hispositionfutures hispositionfutures);

	void update(Hispositionfutures hispositionfutures);

	void insertBatch(List<Hispositionfutures> list);

	void delete(Integer id);

	Hispositionfutures findById(Integer id);

	List<Hispositionfutures> queryAll();

}