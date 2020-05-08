package com.ujuit.datamove.futruebasic.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.futruebasic.model.Futruebasic;

@Service
public class FutruebasicServiceImplV2 implements FutruebasicService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Futruebasic futruebasic) {
		daoEEx.insert(new DataItem(Futruebasic.class, "insert"), futruebasic);
		return futruebasic.getId();
	}

	@Override
	public void update(Futruebasic futruebasic) {
		daoEEx.update(new DataItem(Futruebasic.class, "update"), futruebasic);
	}

	@Override
	public void insertBatch(List<Futruebasic> list) {
		daoEEx.find(new DataItem(Futruebasic.class, "insertBatch"), list);
	}

	@Override
	public Futruebasic findById(Integer id) {
		return daoEEx.find(new DataItem(Futruebasic.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Futruebasic.class, "delete"), id);
	}

	@Override
	public List<Futruebasic> queryAll() {
		return daoEEx.getDataList(new DataItem(Futruebasic.class, "queryAll"));
	}

	@Override
	public Futruebasic findByMasterId(Integer masterId) {
		return daoEEx.find(new DataItem(Futruebasic.class, "findByMasterId"), masterId);
	}
}