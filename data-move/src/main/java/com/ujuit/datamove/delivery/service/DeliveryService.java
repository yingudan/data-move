package com.ujuit.datamove.delivery.service;

import com.ujuit.datamove.delivery.model.Delivery;
import java.util.List;

public interface DeliveryService {

	Integer insert(Delivery delivery);

	void update(Delivery delivery);

	void insertBatch(List<Delivery> list);

	void delete(Integer id);

	Delivery findById(Integer id);

	List<Delivery> queryAll();

}