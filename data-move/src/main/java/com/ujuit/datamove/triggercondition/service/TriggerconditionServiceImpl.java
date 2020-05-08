package com.ujuit.datamove.triggercondition.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.triggercondition.model.Triggercondition;

@Service
public class TriggerconditionServiceImpl implements TriggerconditionService {

	@Resource
	private Dao mapper;

	@Override
	public Integer insert(Triggercondition triggercondition) {
		mapper.insert(new DataItem(Triggercondition.class, "insert"), triggercondition);
		return triggercondition.getId();
	}

	@Override
	public void update(Triggercondition triggercondition) {
		mapper.update(new DataItem(Triggercondition.class, "update"), triggercondition);
	}

	@Override
	public void insertBatch(List<Triggercondition> list) {
		mapper.find(new DataItem(Triggercondition.class, "insertBatch"), list);
	}

	@Override
	public Triggercondition findById(Integer id) {
		return mapper.find(new DataItem(Triggercondition.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(new DataItem(Triggercondition.class, "delete"), id);
	}

	@Override
	public List<Triggercondition> queryAll() {
		return null;
	}
}