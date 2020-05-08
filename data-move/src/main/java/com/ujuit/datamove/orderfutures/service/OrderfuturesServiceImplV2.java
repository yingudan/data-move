package com.ujuit.datamove.orderfutures.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.orderfutures.model.Orderfutures;

@Service
public class OrderfuturesServiceImplV2 implements OrderfuturesService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Orderfutures orderfutures) {
		daoEEx.insert(new DataItem(Orderfutures.class, "insert"), orderfutures);
		return orderfutures.getId();
	}

	@Override
	public void update(Orderfutures orderfutures) {
		daoEEx.update(new DataItem(Orderfutures.class, "update"), orderfutures);
	}

	@Override
	public void insertBatch(List<Orderfutures> list) {
		daoEEx.find(new DataItem(Orderfutures.class, "insertBatch"), list);
	}

	@Override
	public Orderfutures findById(Integer id) {
		return daoEEx.find(new DataItem(Orderfutures.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Orderfutures.class, "delete"), id);
	}

	@Override
	public List<Orderfutures> queryAllNeedAddOrderfutures() {
		return daoEEx.getDataList(new DataItem(Orderfutures.class, "queryAllNeedAddOrderfutures"));
	}
}