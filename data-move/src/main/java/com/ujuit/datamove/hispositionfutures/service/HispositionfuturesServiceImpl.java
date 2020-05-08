package com.ujuit.datamove.hispositionfutures.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.hispositionfutures.model.Hispositionfutures;

@Service
public class HispositionfuturesServiceImpl implements HispositionfuturesService {

	@Resource
	private Dao mapper;

	@Override
	public Integer insert(Hispositionfutures hispositionfutures) {
		mapper.insert(new DataItem(Hispositionfutures.class, "insert"), hispositionfutures);
		return hispositionfutures.getId();
	}

	@Override
	public void update(Hispositionfutures hispositionfutures) {
		mapper.update(new DataItem(Hispositionfutures.class, "update"), hispositionfutures);
	}

	@Override
	public void insertBatch(List<Hispositionfutures> list) {
		mapper.find(new DataItem(Hispositionfutures.class, "insertBatch"), list);
	}

	@Override
	public Hispositionfutures findById(Integer id) {
		return mapper.find(new DataItem(Hispositionfutures.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(new DataItem(Hispositionfutures.class, "delete"), id);
	}

	@Override
	public List<Hispositionfutures> queryAll() {
		return null;
	}
}