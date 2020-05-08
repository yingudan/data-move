package com.ujuit.datamove.instrumentoptional.service;

import com.ujuit.datamove.instrumentoptional.model.Instrumentoptional;
import java.util.List;

public interface InstrumentoptionalService {

	Integer insert(Instrumentoptional instrumentoptional);

	void update(Instrumentoptional instrumentoptional);

	void insertBatch(List<Instrumentoptional> list);

	void delete(Integer id);

	Instrumentoptional findById(Integer id);

	List<Instrumentoptional> queryAll();

}