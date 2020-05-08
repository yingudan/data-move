package com.ujuit.datamove.hissettle.service;

import com.ujuit.datamove.hissettle.model.Hissettle;
import java.util.List;

public interface HissettleService {

	Integer insert(Hissettle hissettle);

	void update(Hissettle hissettle);

	void insertBatch(List<Hissettle> list);

	void delete(Integer id);

	Hissettle findById(Integer id);

	List<Hissettle> queryAll();

}