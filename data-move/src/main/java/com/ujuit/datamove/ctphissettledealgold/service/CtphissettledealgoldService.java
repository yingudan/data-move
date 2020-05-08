package com.ujuit.datamove.ctphissettledealgold.service;

import com.ujuit.datamove.ctphissettledealgold.model.Ctphissettledealgold;
import java.util.List;

public interface CtphissettledealgoldService {

	Integer insert(Ctphissettledealgold ctphissettledealgold);

	void update(Ctphissettledealgold ctphissettledealgold);

	void insertBatch(List<Ctphissettledealgold> list);

	void delete(Integer id);

	Ctphissettledealgold findById(Integer id);
	
	List<Ctphissettledealgold>queryAll();

}