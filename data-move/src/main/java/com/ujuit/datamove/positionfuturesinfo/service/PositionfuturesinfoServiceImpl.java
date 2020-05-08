package com.ujuit.datamove.positionfuturesinfo.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.positionfuturesinfo.model.Positionfuturesinfo;

@Service
public class PositionfuturesinfoServiceImpl implements PositionfuturesinfoService {

	@Resource
	private Dao mapper;

	@Override
	public Integer insert(Positionfuturesinfo positionfuturesinfo) {
		mapper.insert(new DataItem(Positionfuturesinfo.class, "insert"), positionfuturesinfo);
		return positionfuturesinfo.getId();
	}

	@Override
	public void update(Positionfuturesinfo positionfuturesinfo) {
		mapper.update(new DataItem(Positionfuturesinfo.class, "update"), positionfuturesinfo);
	}

	@Override
	public void insertBatch(List<Positionfuturesinfo> list) {
		mapper.find(new DataItem(Positionfuturesinfo.class, "insertBatch"), list);
	}

	@Override
	public Positionfuturesinfo findById(Integer id) {
		return mapper.find(new DataItem(Positionfuturesinfo.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(new DataItem(Positionfuturesinfo.class, "delete"), id);
	}

	@Override
	public List<Positionfuturesinfo> queryAll() {
		return null;
	}
}