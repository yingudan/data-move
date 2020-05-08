package com.ujuit.datamove.rmmonitor.service;

import com.ujuit.datamove.rmmonitor.model.Rmmonitor;
import java.util.List;

public interface RmmonitorService {

	Integer insert(Rmmonitor rmmonitor);

	void update(Rmmonitor rmmonitor);

	void insertBatch(List<Rmmonitor> list);

	void delete(Integer id);

	Rmmonitor findById(Integer id);

	List<Rmmonitor> queryAll();

}