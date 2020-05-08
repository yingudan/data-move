package com.ujuit.datamove.masterrepairorder.service;

import com.ujuit.datamove.masterrepairorder.model.Masterrepairorder;
import java.util.List;

public interface MasterrepairorderService {

	Integer insert(Masterrepairorder masterrepairorder);

	void update(Masterrepairorder masterrepairorder);

	void insertBatch(List<Masterrepairorder> list);

	void delete(Integer masterOrderId);

	Masterrepairorder findById(Integer masterOrderId);

	List<Masterrepairorder> queryAll();

}