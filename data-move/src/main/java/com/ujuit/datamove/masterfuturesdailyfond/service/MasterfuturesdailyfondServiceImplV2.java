package com.ujuit.datamove.masterfuturesdailyfond.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.masterfuturesdailyfond.model.Masterfuturesdailyfond;

@Service
public class MasterfuturesdailyfondServiceImplV2 implements MasterfuturesdailyfondService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Masterfuturesdailyfond masterfuturesdailyfond) {
		daoEEx.insert(new DataItem(Masterfuturesdailyfond.class, "insert"), masterfuturesdailyfond);
		return masterfuturesdailyfond.getId();
	}

	@Override
	public void update(Masterfuturesdailyfond masterfuturesdailyfond) {
		daoEEx.update(new DataItem(Masterfuturesdailyfond.class, "update"), masterfuturesdailyfond);
	}

	@Override
	public void insertBatch(List<Masterfuturesdailyfond> list) {
		daoEEx.find(new DataItem(Masterfuturesdailyfond.class, "insertBatch"), list);
	}

	@Override
	public Masterfuturesdailyfond findById(Integer id) {
		return daoEEx.find(new DataItem(Masterfuturesdailyfond.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Masterfuturesdailyfond.class, "delete"), id);
	}

	@Override
	public List<Masterfuturesdailyfond> queryAll() {
		return daoEEx.getDataList(new DataItem(Masterfuturesdailyfond.class, "queryAll"));
	}
}