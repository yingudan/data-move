package com.ujuit.datamove.hissettle.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.hissettle.model.Hissettle;

@Service
public class HissettleServiceImplV2 implements HissettleService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Hissettle hissettle) {
		daoEEx.insert(new DataItem(Hissettle.class, "insert"), hissettle);
		return hissettle.getId();
	}

	@Override
	public void update(Hissettle hissettle) {
		daoEEx.update(new DataItem(Hissettle.class, "update"), hissettle);
	}

	@Override
	public void insertBatch(List<Hissettle> list) {
		daoEEx.find(new DataItem(Hissettle.class, "insertBatch"), list);
	}

	@Override
	public Hissettle findById(Integer id) {
		return daoEEx.find(new DataItem(Hissettle.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Hissettle.class, "delete"), id);
	}

	@Override
	public List<Hissettle> queryAll() {
		return daoEEx.getDataList(new DataItem(Hissettle.class, "queryAll"));
	}

}