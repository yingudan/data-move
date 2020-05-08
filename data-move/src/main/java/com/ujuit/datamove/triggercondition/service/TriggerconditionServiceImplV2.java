package com.ujuit.datamove.triggercondition.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.triggercondition.model.Triggercondition;

@Service
public class TriggerconditionServiceImplV2 implements TriggerconditionService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Triggercondition triggercondition) {
		daoEEx.insert(new DataItem(Triggercondition.class, "insert"), triggercondition);
		return triggercondition.getId();
	}

	@Override
	public void update(Triggercondition triggercondition) {
		daoEEx.update(new DataItem(Triggercondition.class, "update"), triggercondition);
	}

	@Override
	public void insertBatch(List<Triggercondition> list) {
		daoEEx.find(new DataItem(Triggercondition.class, "insertBatch"), list);
	}

	@Override
	public Triggercondition findById(Integer id) {
		return daoEEx.find(new DataItem(Triggercondition.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Triggercondition.class, "delete"), id);
	}

	@Override
	public List<Triggercondition> queryAll() {
		return daoEEx.getDataList(new DataItem(Triggercondition.class, "queryAll"));
	}
}