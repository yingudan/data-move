package com.ujuit.datamove.dailymasterassets.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.dailymasterassets.model.Dailymasterassets;

@Service
public class DailymasterassetsServiceImpl implements DailymasterassetsService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Dailymasterassets dailymasterassets) {
		daoEEx.insert(new DataItem(Dailymasterassets.class, "insert"), dailymasterassets);
		return dailymasterassets.getId();
	}

	@Override
	public void update(Dailymasterassets dailymasterassets) {
		daoEEx.update(new DataItem(Dailymasterassets.class, "update"), dailymasterassets);
	}

	@Override
	public void insertBatch(List<Dailymasterassets> list) {
		daoEEx.find(new DataItem(Dailymasterassets.class, "insertBatch"), list);
	}

	@Override
	public Dailymasterassets findById(Integer id) {
		return daoEEx.find(new DataItem(Dailymasterassets.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Dailymasterassets.class, "delete"), id);
	}

	@Override
	public List<Dailymasterassets> queryAll() {
		return daoEEx.getDataList(new DataItem(Dailymasterassets.class, "queryAll"));
	}
}