package com.ujuit.datamove.dealgoldmaster.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.dealgoldmaster.model.Dealgoldmaster;

@Service
public class DealgoldmasterServiceImpl implements DealgoldmasterService {

	@Resource
	private Dao mapper;

	@Override
	public Integer insert(Dealgoldmaster dealgoldmaster) {
		mapper.insert(new DataItem(Dealgoldmaster.class, "insert"), dealgoldmaster);
		return dealgoldmaster.getId();
	}

	@Override
	public void update(Dealgoldmaster dealgoldmaster) {
		mapper.update(new DataItem(Dealgoldmaster.class, "update"), dealgoldmaster);
	}

	@Override
	public void insertBatch(List<Dealgoldmaster> list) {
		mapper.find(new DataItem(Dealgoldmaster.class, "insertBatch"), list);
	}

	@Override
	public Dealgoldmaster findById(Integer id) {
		return mapper.find(new DataItem(Dealgoldmaster.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(new DataItem(Dealgoldmaster.class, "delete"), id);
	}

	@Override
	public List<Dealgoldmaster> queryAll() {
		return null;
	}
}