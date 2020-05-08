package com.ujuit.datamove.delivery.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.delivery.model.Delivery;

@Service
public class DeliveryServiceImplV2 implements DeliveryService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;


	@Override
	public Integer insert(Delivery delivery) {
		daoEEx.insert(new DataItem(Delivery.class, "insert"), delivery);
		return delivery.getId();
	}

	@Override
	public void update(Delivery delivery) {
		daoEEx.update(new DataItem(Delivery.class, "update"), delivery);
	}

	@Override
	public void insertBatch(List<Delivery> list) {
		daoEEx.find(new DataItem(Delivery.class, "insertBatch"), list);
	}

	@Override
	public Delivery findById(Integer id) {
		return daoEEx.find(new DataItem(Delivery.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Delivery.class, "delete"), id);
	}

	@Override
	public List<Delivery> queryAll() {
		return daoEEx.getDataList(new DataItem(Delivery.class, "queryAll"));
	}
}