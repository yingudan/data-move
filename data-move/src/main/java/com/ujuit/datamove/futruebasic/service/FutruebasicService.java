package com.ujuit.datamove.futruebasic.service;

import com.ujuit.datamove.futruebasic.model.Futruebasic;
import java.util.List;

public interface FutruebasicService {

	Integer insert(Futruebasic futruebasic);

	void update(Futruebasic futruebasic);

	void insertBatch(List<Futruebasic> list);

	void delete(Integer id);

	Futruebasic findById(Integer id);

	List<Futruebasic> queryAll();

	Futruebasic findByMasterId(Integer masterId);

}