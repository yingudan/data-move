package com.ujuit.datamove.ctphissettlefund.service;

import com.ujuit.datamove.ctphissettlefund.model.Ctphissettlefund;
import java.util.List;

public interface CtphissettlefundService {

	Integer insert(Ctphissettlefund ctphissettlefund);

	void update(Ctphissettlefund ctphissettlefund);

	void insertBatch(List<Ctphissettlefund> list);

	void delete(Integer id);

	Ctphissettlefund findById(Integer id);

	List<Ctphissettlefund> queryAll();

}