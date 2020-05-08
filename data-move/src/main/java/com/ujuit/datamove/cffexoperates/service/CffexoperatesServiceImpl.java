package com.ujuit.datamove.cffexoperates.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.cffexoperates.model.Cffexoperates;

@Service
public class CffexoperatesServiceImpl implements CffexoperatesService {

	@Resource
	private Dao mapper;

	@Override
	public Integer insert(Cffexoperates cffexoperates) {
		mapper.insert(new DataItem(Cffexoperates.class, "insert"), cffexoperates);
		return cffexoperates.getId();
	}

	@Override
	public void update(Cffexoperates cffexoperates) {
		mapper.update(new DataItem(Cffexoperates.class, "update"), cffexoperates);
	}

	@Override
	public void insertBatch(List<Cffexoperates> list) {
		mapper.find(new DataItem(Cffexoperates.class, "insertBatch"), list);
	}

	@Override
	public Cffexoperates findById(Integer id) {
		return mapper.find(new DataItem(Cffexoperates.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(new DataItem(Cffexoperates.class, "delete"), id);
	}
}