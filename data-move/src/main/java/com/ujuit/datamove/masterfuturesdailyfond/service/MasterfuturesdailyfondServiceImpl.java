package com.ujuit.datamove.masterfuturesdailyfond.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.masterfuturesdailyfond.model.Masterfuturesdailyfond;

@Service
public class MasterfuturesdailyfondServiceImpl implements MasterfuturesdailyfondService {

	@Resource
	private Dao mapper;

	@Override
	public Integer insert(Masterfuturesdailyfond masterfuturesdailyfond) {
		mapper.insert(new DataItem(Masterfuturesdailyfond.class, "insert"), masterfuturesdailyfond);
		return masterfuturesdailyfond.getId();
	}

	@Override
	public void update(Masterfuturesdailyfond masterfuturesdailyfond) {
		mapper.update(new DataItem(Masterfuturesdailyfond.class, "update"), masterfuturesdailyfond);
	}

	@Override
	public void insertBatch(List<Masterfuturesdailyfond> list) {
		mapper.find(new DataItem(Masterfuturesdailyfond.class, "insertBatch"), list);
	}

	@Override
	public Masterfuturesdailyfond findById(Integer id) {
		return mapper.find(new DataItem(Masterfuturesdailyfond.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(new DataItem(Masterfuturesdailyfond.class, "delete"), id);
	}

	@Override
	public List<Masterfuturesdailyfond> queryAll() {
		return null;
	}
}