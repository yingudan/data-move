package com.ujuit.datamove.masterfuturesdailyposition.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.masterfuturesdailyposition.model.Masterfuturesdailyposition;

@Service
public class MasterfuturesdailypositionServiceImplV2 implements MasterfuturesdailypositionService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Masterfuturesdailyposition masterfuturesdailyposition) {
		daoEEx.insert(new DataItem(Masterfuturesdailyposition.class, "insert"), masterfuturesdailyposition);
		return masterfuturesdailyposition.getId();
	}

	@Override
	public void update(Masterfuturesdailyposition masterfuturesdailyposition) {
		daoEEx.update(new DataItem(Masterfuturesdailyposition.class, "update"), masterfuturesdailyposition);
	}

	@Override
	public void insertBatch(List<Masterfuturesdailyposition> list) {
		daoEEx.find(new DataItem(Masterfuturesdailyposition.class, "insertBatch"), list);
	}

	@Override
	public Masterfuturesdailyposition findById(Integer id) {
		return daoEEx.find(new DataItem(Masterfuturesdailyposition.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Masterfuturesdailyposition.class, "delete"), id);
	}

	@Override
	public List<Masterfuturesdailyposition> queryAll() {
		return daoEEx.getDataList(new DataItem(Masterfuturesdailyposition.class, "queryAll"));
	}
}