package com.ujuit.datamove.delivery.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.delivery.model.Delivery;

@Service
public class DeliveryServiceImpl implements DeliveryService {

	@Resource
	private Dao mapper;

	@Override
	public Integer insert(Delivery delivery) {
		mapper.insert(new DataItem(Delivery.class, "insert"), delivery);
		return delivery.getId();
	}

	@Override
	public void update(Delivery delivery) {
		mapper.update(new DataItem(Delivery.class, "update"), delivery);
	}

	@Override
	public void insertBatch(List<Delivery> list) {
		mapper.find(new DataItem(Delivery.class, "insertBatch"), list);
	}

	@Override
	public Delivery findById(Integer id) {
		return mapper.find(new DataItem(Delivery.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(new DataItem(Delivery.class, "delete"), id);
	}

	@Override
	public List<Delivery> queryAll() {
		return null;
	}
}