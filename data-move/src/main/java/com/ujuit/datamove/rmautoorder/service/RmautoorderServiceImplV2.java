package com.ujuit.datamove.rmautoorder.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.rmautoorder.model.Rmautoorder;

@Service
public class RmautoorderServiceImplV2 implements RmautoorderService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Rmautoorder rmautoorder) {
		daoEEx.insert(new DataItem(Rmautoorder.class, "insert"), rmautoorder);
		return rmautoorder.getId();
	}

	@Override
	public void update(Rmautoorder rmautoorder) {
		daoEEx.update(new DataItem(Rmautoorder.class, "update"), rmautoorder);
	}

	@Override
	public void insertBatch(List<Rmautoorder> list) {
		daoEEx.find(new DataItem(Rmautoorder.class, "insertBatch"), list);
	}

	@Override
	public Rmautoorder findById(Integer id) {
		return daoEEx.find(new DataItem(Rmautoorder.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Rmautoorder.class, "delete"), id);
	}

	@Override
	public List<Rmautoorder> queryAll() {
		return daoEEx.getDataList(new DataItem(Rmautoorder.class, "queryAll"));
	}
}