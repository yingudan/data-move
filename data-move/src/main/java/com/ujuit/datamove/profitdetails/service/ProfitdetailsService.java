package com.ujuit.datamove.profitdetails.service;

import com.ujuit.datamove.profitdetails.model.Profitdetails;
import java.util.List;

public interface ProfitdetailsService {

	Integer insert(Profitdetails profitdetails);

	void update(Profitdetails profitdetails);

	void insertBatch(List<Profitdetails> list);

	void delete(Integer id);

	Profitdetails findById(Integer id);

	List<Profitdetails> queryAll();

}