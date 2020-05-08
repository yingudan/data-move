package com.ujuit.datamove.hissettlement.service;

import com.ujuit.datamove.hissettlement.model.Hissettlement;
import java.util.List;

public interface HissettlementService {

	Integer insert(Hissettlement hissettlement);

	void update(Hissettlement hissettlement);

	void insertBatch(List<Hissettlement> list);

	void delete(Integer id);

	Hissettlement findById(Integer id);

	List<Hissettlement> queryAll();

}