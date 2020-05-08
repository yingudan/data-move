package com.ujuit.datamove.triggercondition.service;

import com.ujuit.datamove.triggercondition.model.Triggercondition;
import java.util.List;

public interface TriggerconditionService {

	Integer insert(Triggercondition triggercondition);

	void update(Triggercondition triggercondition);

	void insertBatch(List<Triggercondition> list);

	void delete(Integer id);

	Triggercondition findById(Integer id);

	List<Triggercondition> queryAll();

}