package com.ujuit.datamove.master.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.master.model.Master;

@Service
public class MasterServiceImplV2 implements MasterService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Master master) {
		daoEEx.insert(new DataItem(Master.class, "insert"), master);
		return master.getId();
	}

	@Override
	public void update(Master master) {
		daoEEx.update(new DataItem(Master.class, "update"), master);
	}

	@Override
	public void insertBatch(List<Master> list) {
		daoEEx.find(new DataItem(Master.class, "insertBatch"), list);
	}

	@Override
	public Master findById(Integer id) {
		return daoEEx.find(new DataItem(Master.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Master.class, "delete"), id);
	}

	@Override
	public List<Master> queryAllAddMaster() {
		return daoEEx.getDataList(new DataItem(Master.class, "queryAllAddMaster"));
	}

	@Override
	public List<Master> queryAllMaster() {
		return daoEEx.getDataList(new DataItem(Master.class, "queryAllMaster"));
	}
}