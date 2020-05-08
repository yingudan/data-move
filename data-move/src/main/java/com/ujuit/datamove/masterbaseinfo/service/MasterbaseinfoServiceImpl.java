package com.ujuit.datamove.masterbaseinfo.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.masterbaseinfo.model.Masterbaseinfo;

@Service
public class MasterbaseinfoServiceImpl implements MasterbaseinfoService {

	@Resource
	private Dao mapper;

	@Override
	public Integer insert(Masterbaseinfo masterbaseinfo) {
		mapper.insert(new DataItem(Masterbaseinfo.class, "insert"), masterbaseinfo);
		return masterbaseinfo.getId();
	}

	@Override
	public void update(Masterbaseinfo masterbaseinfo) {
		mapper.update(new DataItem(Masterbaseinfo.class, "update"), masterbaseinfo);
	}

	@Override
	public void insertBatch(List<Masterbaseinfo> list) {
		mapper.find(new DataItem(Masterbaseinfo.class, "insertBatch"), list);
	}

	@Override
	public Masterbaseinfo findById(Integer id) {
		return mapper.find(new DataItem(Masterbaseinfo.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(new DataItem(Masterbaseinfo.class, "delete"), id);
	}

	@Override
	public List<Masterbaseinfo> queryAll() {
		return null;
	}
}