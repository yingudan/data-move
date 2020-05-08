package com.ujuit.datamove.ctphissettlefund.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.ctphissettlefund.model.Ctphissettlefund;

@Service
public class CtphissettlefundServiceImplV2 implements CtphissettlefundService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Ctphissettlefund ctphissettlefund) {
		daoEEx.insert(new DataItem(Ctphissettlefund.class, "insert"), ctphissettlefund);
		return ctphissettlefund.getId();
	}

	@Override
	public void update(Ctphissettlefund ctphissettlefund) {
		daoEEx.update(new DataItem(Ctphissettlefund.class, "update"), ctphissettlefund);
	}

	@Override
	public void insertBatch(List<Ctphissettlefund> list) {
		daoEEx.find(new DataItem(Ctphissettlefund.class, "insertBatch"), list);
	}

	@Override
	public Ctphissettlefund findById(Integer id) {
		return daoEEx.find(new DataItem(Ctphissettlefund.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Ctphissettlefund.class, "delete"), id);
	}

	@Override
	public List<Ctphissettlefund> queryAll() {
		return daoEEx.getDataList(new DataItem(Ctphissettlefund.class, "queryAll"));
	}
}