package com.ujuit.datamove.rmautoorder.service;

import com.ujuit.datamove.rmautoorder.model.Rmautoorder;
import java.util.List;

public interface RmautoorderService {

	Integer insert(Rmautoorder rmautoorder);

	void update(Rmautoorder rmautoorder);

	void insertBatch(List<Rmautoorder> list);

	void delete(Integer id);

	Rmautoorder findById(Integer id);

	List<Rmautoorder> queryAll();

}