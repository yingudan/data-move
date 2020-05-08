package com.ujuit.datamove.hissettlement.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.hissettlement.model.Hissettlement;

@Service
public class HissettlementServiceImpl implements HissettlementService {

	@Resource
	private Dao mapper;

	@Override
	public Integer insert(Hissettlement hissettlement) {
		mapper.insert(new DataItem(Hissettlement.class, "insert"), hissettlement);
		return hissettlement.getId();
	}

	@Override
	public void update(Hissettlement hissettlement) {
		mapper.update(new DataItem(Hissettlement.class, "update"), hissettlement);
	}

	@Override
	public void insertBatch(List<Hissettlement> list) {
		mapper.find(new DataItem(Hissettlement.class, "insertBatch"), list);
	}

	@Override
	public Hissettlement findById(Integer id) {
		return mapper.find(new DataItem(Hissettlement.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(new DataItem(Hissettlement.class, "delete"), id);
	}

	@Override
	public List<Hissettlement> queryAll() {
		return null;
	}
}