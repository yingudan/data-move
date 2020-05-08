package com.ujuit.datamove.expiremessage.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.expiremessage.model.Expiremessage;

@Service
public class ExpiremessageServiceImpl implements ExpiremessageService {

	@Resource
	private Dao mapper;

	@Override
	public Integer insert(Expiremessage expiremessage) {
		mapper.insert(new DataItem(Expiremessage.class, "insert"), expiremessage);
		return expiremessage.getId();
	}

	@Override
	public void update(Expiremessage expiremessage) {
		mapper.update(new DataItem(Expiremessage.class, "update"), expiremessage);
	}

	@Override
	public void insertBatch(List<Expiremessage> list) {
		mapper.find(new DataItem(Expiremessage.class, "insertBatch"), list);
	}

	@Override
	public Expiremessage findById(Integer id) {
		return mapper.find(new DataItem(Expiremessage.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(new DataItem(Expiremessage.class, "delete"), id);
	}

	@Override
	public List<Expiremessage> queryAll() {
		return null;
	}
}