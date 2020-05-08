package com.ujuit.datamove.ctphissettledealgold.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.ctphissettledealgold.model.Ctphissettledealgold;

@Service
public class CtphissettledealgoldServiceImplV2 implements CtphissettledealgoldService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Ctphissettledealgold ctphissettledealgold) {
		daoEEx.insert(new DataItem(Ctphissettledealgold.class, "insert"), ctphissettledealgold);
		return ctphissettledealgold.getId();
	}

	@Override
	public void update(Ctphissettledealgold ctphissettledealgold) {
		daoEEx.update(new DataItem(Ctphissettledealgold.class, "update"), ctphissettledealgold);
	}

	@Override
	public void insertBatch(List<Ctphissettledealgold> list) {
		daoEEx.find(new DataItem(Ctphissettledealgold.class, "insertBatch"), list);
	}

	@Override
	public Ctphissettledealgold findById(Integer id) {
		return daoEEx.find(new DataItem(Ctphissettledealgold.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Ctphissettledealgold.class, "delete"), id);
	}

	@Override
	public List<Ctphissettledealgold> queryAll() {
		return daoEEx.getDataList(new DataItem(Ctphissettledealgold.class, "queryAll"));
	}
}