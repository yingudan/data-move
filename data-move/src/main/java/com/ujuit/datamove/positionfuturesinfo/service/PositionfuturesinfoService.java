package com.ujuit.datamove.positionfuturesinfo.service;

import com.ujuit.datamove.positionfuturesinfo.model.Positionfuturesinfo;
import java.util.List;

public interface PositionfuturesinfoService {

	Integer insert(Positionfuturesinfo positionfuturesinfo);

	void update(Positionfuturesinfo positionfuturesinfo);

	void insertBatch(List<Positionfuturesinfo> list);

	void delete(Integer id);

	Positionfuturesinfo findById(Integer id);

	List<Positionfuturesinfo> queryAll();

}