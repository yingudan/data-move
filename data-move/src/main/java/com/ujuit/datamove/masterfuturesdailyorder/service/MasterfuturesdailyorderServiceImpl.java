package com.ujuit.datamove.masterfuturesdailyorder.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.masterfuturesdailyorder.model.Masterfuturesdailyorder;

@Service
public class MasterfuturesdailyorderServiceImpl implements MasterfuturesdailyorderService {

	@Resource
	private Dao mapper;

	@Override
	public Integer insert(Masterfuturesdailyorder masterfuturesdailyorder) {
		mapper.insert(new DataItem(Masterfuturesdailyorder.class, "insert"), masterfuturesdailyorder);
		return masterfuturesdailyorder.getId();
	}

	@Override
	public void update(Masterfuturesdailyorder masterfuturesdailyorder) {
		mapper.update(new DataItem(Masterfuturesdailyorder.class, "update"), masterfuturesdailyorder);
	}

	@Override
	public void insertBatch(List<Masterfuturesdailyorder> list) {
		mapper.find(new DataItem(Masterfuturesdailyorder.class, "insertBatch"), list);
	}

	@Override
	public Masterfuturesdailyorder findById(Integer id) {
		return mapper.find(new DataItem(Masterfuturesdailyorder.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(new DataItem(Masterfuturesdailyorder.class, "delete"), id);
	}

	@Override
	public List<Masterfuturesdailyorder> queryAll() {
		return null;
	}
}