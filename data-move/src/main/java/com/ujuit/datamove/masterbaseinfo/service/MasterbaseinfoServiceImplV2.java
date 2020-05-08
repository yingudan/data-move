package com.ujuit.datamove.masterbaseinfo.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.masterbaseinfo.model.Masterbaseinfo;

@Service
public class MasterbaseinfoServiceImplV2 implements MasterbaseinfoService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Masterbaseinfo masterbaseinfo) {
		daoEEx.insert(new DataItem(Masterbaseinfo.class, "insert"), masterbaseinfo);
		return masterbaseinfo.getId();
	}

	@Override
	public void update(Masterbaseinfo masterbaseinfo) {
		daoEEx.update(new DataItem(Masterbaseinfo.class, "update"), masterbaseinfo);
	}

	@Override
	public void insertBatch(List<Masterbaseinfo> list) {
		daoEEx.find(new DataItem(Masterbaseinfo.class, "insertBatch"), list);
	}

	@Override
	public Masterbaseinfo findById(Integer id) {
		return daoEEx.find(new DataItem(Masterbaseinfo.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Masterbaseinfo.class, "delete"), id);
	}

	@Override
	public List<Masterbaseinfo> queryAll() {
		return daoEEx.getDataList(new DataItem(Masterbaseinfo.class, "queryAll"));
	}
}