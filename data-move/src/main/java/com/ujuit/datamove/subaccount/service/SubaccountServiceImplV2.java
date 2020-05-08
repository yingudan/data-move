package com.ujuit.datamove.subaccount.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.subaccount.model.Subaccount;

@Service
public class SubaccountServiceImplV2 implements SubaccountService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Subaccount subaccount) {
		daoEEx.insert(new DataItem(Subaccount.class, "insert"), subaccount);
		return subaccount.getId();
	}

	@Override
	public void update(Subaccount subaccount) {
		daoEEx.update(new DataItem(Subaccount.class, "update"), subaccount);
	}

	@Override
	public void insertBatch(List<Subaccount> list) {
		daoEEx.find(new DataItem(Subaccount.class, "insertBatch"), list);
	}

	@Override
	public Subaccount findById(Integer id) {
		return daoEEx.find(new DataItem(Subaccount.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Subaccount.class, "delete"), id);
	}

	@Override
	public List<Subaccount> queryAllAddSubAccount() {
		return daoEEx.getDataList(new DataItem(Subaccount.class, "queryAllAddSubAccount"));
	}

	@Override
	public List<Subaccount> queryAll() {
		return daoEEx.getDataList(new DataItem(Subaccount.class, "queryAll"));
	}
}