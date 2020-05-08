package com.ujuit.datamove.orderfutures.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.orderfutures.model.Orderfutures;

@Service
public class OrderfuturesServiceImpl implements OrderfuturesService {

	@Resource
	private Dao mapper;

	@Override
	public Integer insert(Orderfutures orderfutures) {
		mapper.insert(new DataItem(Orderfutures.class, "insert"), orderfutures);
		return orderfutures.getId();
	}

	@Override
	public void update(Orderfutures orderfutures) {
		mapper.update(new DataItem(Orderfutures.class, "update"), orderfutures);
	}

	@Override
	public void insertBatch(List<Orderfutures> list) {
		mapper.find(new DataItem(Orderfutures.class, "insertBatch"), list);
	}

	@Override
	public Orderfutures findById(Integer id) {
		return mapper.find(new DataItem(Orderfutures.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(new DataItem(Orderfutures.class, "delete"), id);
	}

	@Override
	public List<Orderfutures> queryAllNeedAddOrderfutures() {
		return null;
	}
}