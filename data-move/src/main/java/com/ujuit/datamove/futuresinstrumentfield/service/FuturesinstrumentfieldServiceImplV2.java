package com.ujuit.datamove.futuresinstrumentfield.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.futuresinstrumentfield.model.Futuresinstrumentfield;

@Service
public class FuturesinstrumentfieldServiceImplV2 implements FuturesinstrumentfieldService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Futuresinstrumentfield futuresinstrumentfield) {
		daoEEx.insert(new DataItem(Futuresinstrumentfield.class, "insert"), futuresinstrumentfield);
		return futuresinstrumentfield.getId();
	}

	@Override
	public void update(Futuresinstrumentfield futuresinstrumentfield) {
		daoEEx.update(new DataItem(Futuresinstrumentfield.class, "update"), futuresinstrumentfield);
	}

	@Override
	public void insertBatch(List<Futuresinstrumentfield> list) {
		daoEEx.find(new DataItem(Futuresinstrumentfield.class, "insertBatch"), list);
	}

	@Override
	public Futuresinstrumentfield findById(Integer id) {
		return daoEEx.find(new DataItem(Futuresinstrumentfield.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Futuresinstrumentfield.class, "delete"), id);
	}

	@Override
	public List<Futuresinstrumentfield> queryAll() {
		return daoEEx.getDataList(new DataItem(Futuresinstrumentfield.class, "queryAll"));
	}
}