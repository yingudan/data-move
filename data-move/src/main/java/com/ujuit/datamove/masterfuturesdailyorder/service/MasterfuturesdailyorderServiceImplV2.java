package com.ujuit.datamove.masterfuturesdailyorder.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.masterfuturesdailyorder.model.Masterfuturesdailyorder;

@Service
public class MasterfuturesdailyorderServiceImplV2 implements MasterfuturesdailyorderService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Masterfuturesdailyorder masterfuturesdailyorder) {
		daoEEx.insert(new DataItem(Masterfuturesdailyorder.class, "insert"), masterfuturesdailyorder);
		return masterfuturesdailyorder.getId();
	}

	@Override
	public void update(Masterfuturesdailyorder masterfuturesdailyorder) {
		daoEEx.update(new DataItem(Masterfuturesdailyorder.class, "update"), masterfuturesdailyorder);
	}

	@Override
	public void insertBatch(List<Masterfuturesdailyorder> list) {
		daoEEx.find(new DataItem(Masterfuturesdailyorder.class, "insertBatch"), list);
	}

	@Override
	public Masterfuturesdailyorder findById(Integer id) {
		return daoEEx.find(new DataItem(Masterfuturesdailyorder.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Masterfuturesdailyorder.class, "delete"), id);
	}

	@Override
	public List<Masterfuturesdailyorder> queryAll() {
		return daoEEx.getDataList(new DataItem(Masterfuturesdailyorder.class, "queryAll"));
	}
}