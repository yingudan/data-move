package com.ujuit.datamove.positionfutures.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.positionfutures.model.Positionfutures;

@Service
public class PositionfuturesServiceImplV2 implements PositionfuturesService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Positionfutures positionfutures) {
		daoEEx.insert(new DataItem(Positionfutures.class, "insert"), positionfutures);
		return positionfutures.getId();
	}

	@Override
	public void update(Positionfutures positionfutures) {
		daoEEx.update(new DataItem(Positionfutures.class, "update"), positionfutures);
	}

	@Override
	public void insertBatch(List<Positionfutures> list) {
		daoEEx.find(new DataItem(Positionfutures.class, "insertBatch"), list);
	}

	@Override
	public Positionfutures findById(Integer id) {
		return daoEEx.find(new DataItem(Positionfutures.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Positionfutures.class, "delete"), id);
	}

	@Override
	public List<Positionfutures> queryAllPositionfutures() {
		return daoEEx.getDataList(new DataItem(Positionfutures.class, "queryAllPositionfutures"));
	}
}