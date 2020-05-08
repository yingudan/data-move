package com.ujuit.datamove.positionfuturesinfo.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.positionfuturesinfo.model.Positionfuturesinfo;

@Service
public class PositionfuturesinfoServiceImplV2 implements PositionfuturesinfoService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Positionfuturesinfo positionfuturesinfo) {
		daoEEx.insert(new DataItem(Positionfuturesinfo.class, "insert"), positionfuturesinfo);
		return positionfuturesinfo.getId();
	}

	@Override
	public void update(Positionfuturesinfo positionfuturesinfo) {
		daoEEx.update(new DataItem(Positionfuturesinfo.class, "update"), positionfuturesinfo);
	}

	@Override
	public void insertBatch(List<Positionfuturesinfo> list) {
		daoEEx.find(new DataItem(Positionfuturesinfo.class, "insertBatch"), list);
	}

	@Override
	public Positionfuturesinfo findById(Integer id) {
		return daoEEx.find(new DataItem(Positionfuturesinfo.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Positionfuturesinfo.class, "delete"), id);
	}

	@Override
	public List<Positionfuturesinfo> queryAll() {
		return daoEEx.getDataList(new DataItem(Positionfuturesinfo.class, "queryAll"));
	}
}