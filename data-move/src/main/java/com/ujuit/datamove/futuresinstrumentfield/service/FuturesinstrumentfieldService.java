package com.ujuit.datamove.futuresinstrumentfield.service;

import com.ujuit.datamove.futuresinstrumentfield.model.Futuresinstrumentfield;
import java.util.List;

public interface FuturesinstrumentfieldService {

	Integer insert(Futuresinstrumentfield futuresinstrumentfield);

	void update(Futuresinstrumentfield futuresinstrumentfield);

	void insertBatch(List<Futuresinstrumentfield> list);

	void delete(Integer id);

	Futuresinstrumentfield findById(Integer id);

	List<Futuresinstrumentfield> queryAll();

}