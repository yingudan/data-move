package com.ujuit.datamove.positionfutures.service;

import com.ujuit.datamove.positionfutures.model.Positionfutures;
import java.util.List;

public interface PositionfuturesService {

	Integer insert(Positionfutures positionfutures);

	void update(Positionfutures positionfutures);

	void insertBatch(List<Positionfutures> list);

	void delete(Integer id);

	Positionfutures findById(Integer id);

	List<Positionfutures> queryAllPositionfutures();

}