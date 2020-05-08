package com.ujuit.datamove.futruebasic.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.futruebasic.model.Futruebasic;

@Service
public class FutruebasicServiceImpl implements FutruebasicService {

	@Resource
	private Dao mapper;

	@Override
	public Integer insert(Futruebasic futruebasic) {
		mapper.insert(new DataItem(Futruebasic.class, "insert"), futruebasic);
		return futruebasic.getId();
	}

	@Override
	public void update(Futruebasic futruebasic) {
		mapper.update(new DataItem(Futruebasic.class, "update"), futruebasic);
	}

	@Override
	public void insertBatch(List<Futruebasic> list) {
		mapper.find(new DataItem(Futruebasic.class, "insertBatch"), list);
	}

	@Override
	public Futruebasic findById(Integer id) {
		return mapper.find(new DataItem(Futruebasic.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(new DataItem(Futruebasic.class, "delete"), id);
	}

	@Override
	public List<Futruebasic> queryAll() {
		return null;
	}

	@Override
	public Futruebasic findByMasterId(Integer masterId) {
		return null;
	}
}