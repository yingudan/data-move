package com.ujuit.datamove.mastertemp.service;

import com.ujuit.datamove.mastertemp.model.Mastertemp;
import java.util.List;

public interface MastertempService {

	Integer insert(Mastertemp mastertemp);

	void update(Mastertemp mastertemp);

	void insertBatch(List<Mastertemp> list);

	void delete(Integer id);

	Mastertemp findById(Integer id);

	Mastertemp findByMasterId(Integer masterId);

}