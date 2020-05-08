package com.ujuit.datamove.orderdealfutures.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.orderdealfutures.model.Orderdealfutures;

@Service
public class OrderdealfuturesServiceImpl implements OrderdealfuturesService {

	@Resource
	private Dao mapper;

	@Override
	public Integer insert(Orderdealfutures orderdealfutures) {
		mapper.insert(new DataItem(Orderdealfutures.class, "insert"), orderdealfutures);
		return orderdealfutures.getId();
	}

	@Override
	public void update(Orderdealfutures orderdealfutures) {
		mapper.update(new DataItem(Orderdealfutures.class, "update"), orderdealfutures);
	}

	@Override
	public void insertBatch(List<Orderdealfutures> list) {
		mapper.find(new DataItem(Orderdealfutures.class, "insertBatch"), list);
	}

	@Override
	public Orderdealfutures findById(Integer id) {
		return mapper.find(new DataItem(Orderdealfutures.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(new DataItem(Orderdealfutures.class, "delete"), id);
	}

	@Override
	public List<Orderdealfutures> queryAll() {
		return null;

	}
}