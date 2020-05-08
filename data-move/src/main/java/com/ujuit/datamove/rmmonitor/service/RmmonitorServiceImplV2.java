package com.ujuit.datamove.rmmonitor.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.rmmonitor.model.Rmmonitor;

@Service
public class RmmonitorServiceImplV2 implements RmmonitorService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Rmmonitor rmmonitor) {
		daoEEx.insert(new DataItem(Rmmonitor.class, "insert"), rmmonitor);
		return rmmonitor.getId();
	}

	@Override
	public void update(Rmmonitor rmmonitor) {
		daoEEx.update(new DataItem(Rmmonitor.class, "update"), rmmonitor);
	}

	@Override
	public void insertBatch(List<Rmmonitor> list) {
		daoEEx.find(new DataItem(Rmmonitor.class, "insertBatch"), list);
	}

	@Override
	public Rmmonitor findById(Integer id) {
		return daoEEx.find(new DataItem(Rmmonitor.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Rmmonitor.class, "delete"), id);
	}

	@Override
	public List<Rmmonitor> queryAll() {
		return daoEEx.getDataList(new DataItem(Rmmonitor.class, "queryAll"));
	}
}