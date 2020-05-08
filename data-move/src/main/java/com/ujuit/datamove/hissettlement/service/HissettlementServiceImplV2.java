package com.ujuit.datamove.hissettlement.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.hissettlement.model.Hissettlement;

@Service
public class HissettlementServiceImplV2 implements HissettlementService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Hissettlement hissettlement) {
		daoEEx.insert(new DataItem(Hissettlement.class, "insert"), hissettlement);
		return hissettlement.getId();
	}

	@Override
	public void update(Hissettlement hissettlement) {
		daoEEx.update(new DataItem(Hissettlement.class, "update"), hissettlement);
	}

	@Override
	public void insertBatch(List<Hissettlement> list) {
		daoEEx.find(new DataItem(Hissettlement.class, "insertBatch"), list);
	}

	@Override
	public Hissettlement findById(Integer id) {
		return daoEEx.find(new DataItem(Hissettlement.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Hissettlement.class, "delete"), id);
	}

	@Override
	public List<Hissettlement> queryAll() {
		return daoEEx.getDataList(new DataItem(Hissettlement.class, "queryAll"));
	}
}