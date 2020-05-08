package com.ujuit.datamove.subaccount.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.subaccount.model.Subaccount;

@Service
public class SubaccountServiceImpl implements SubaccountService {

	@Resource
	private Dao mapper;

	@Override
	public Integer insert(Subaccount subaccount) {
		mapper.insert(new DataItem(Subaccount.class, "insert"), subaccount);
		return subaccount.getId();
	}

	@Override
	public void update(Subaccount subaccount) {
		mapper.update(new DataItem(Subaccount.class, "update"), subaccount);
	}

	@Override
	public void insertBatch(List<Subaccount> list) {
		mapper.find(new DataItem(Subaccount.class, "insertBatch"), list);
	}

	@Override
	public Subaccount findById(Integer id) {
		return mapper.find(new DataItem(Subaccount.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(new DataItem(Subaccount.class, "delete"), id);
	}

	@Override
	public List<Subaccount> queryAllAddSubAccount() {
		return null;
	}

	@Override
	public List<Subaccount> queryAll() {
		return null;
	}
}