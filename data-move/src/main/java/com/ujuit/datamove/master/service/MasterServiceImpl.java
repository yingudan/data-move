package com.ujuit.datamove.master.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;

import java.math.BigDecimal;
import java.util.List;
import com.ujuit.datamove.master.model.Master;

@Service
public class MasterServiceImpl implements MasterService {

	@Resource
	private Dao mapper;

	@Override
	public Integer insert(Master master) {

		mapper.insert(new DataItem(Master.class, "insert"), master);
		return master.getId();
	}

	@Override
	public void update(Master master) {
		mapper.update(new DataItem(Master.class, "update"), master);
	}

	@Override
	public void insertBatch(List<Master> list) {
		mapper.find(new DataItem(Master.class, "insertBatch"), list);
	}

	@Override
	public Master findById(Integer id) {
		return mapper.find(new DataItem(Master.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(new DataItem(Master.class, "delete"), id);
	}

	@Override
	public List<Master> queryAllAddMaster() {
		return null;
	}

	@Override
	public List<Master> queryAllMaster() {
		return null;
	}
}