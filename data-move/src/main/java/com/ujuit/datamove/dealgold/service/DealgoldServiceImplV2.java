package com.ujuit.datamove.dealgold.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.dealgold.model.Dealgold;

@Service
public class DealgoldServiceImplV2 implements DealgoldService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Dealgold dealgold) {
		daoEEx.insert(new DataItem(Dealgold.class, "insert"), dealgold);
		return dealgold.getId();
	}

	@Override
	public void update(Dealgold dealgold) {
		daoEEx.update(new DataItem(Dealgold.class, "update"), dealgold);
	}

	@Override
	public void insertBatch(List<Dealgold> list) {
		daoEEx.find(new DataItem(Dealgold.class, "insertBatch"), list);
	}

	@Override
	public Dealgold findById(Integer id) {
		return daoEEx.find(new DataItem(Dealgold.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Dealgold.class, "delete"), id);
	}

	@Override
	public List<Dealgold> queryAll() {
		return daoEEx.getDataList(new DataItem(Dealgold.class, "queryAll"));
	}
}