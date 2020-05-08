package com.ujuit.datamove.dealgold.service;

import com.ujuit.datamove.dealgold.model.Dealgold;
import java.util.List;

public interface DealgoldService {

	Integer insert(Dealgold dealgold);

	void update(Dealgold dealgold);

	void insertBatch(List<Dealgold> list);

	void delete(Integer id);

	Dealgold findById(Integer id);

	List<Dealgold> queryAll();

}