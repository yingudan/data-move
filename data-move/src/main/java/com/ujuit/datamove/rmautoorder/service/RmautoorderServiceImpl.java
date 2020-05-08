package com.ujuit.datamove.rmautoorder.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.rmautoorder.model.Rmautoorder;

@Service
public class RmautoorderServiceImpl implements RmautoorderService {

	@Resource
	private Dao mapper;

	@Override
	public Integer insert(Rmautoorder rmautoorder) {
		mapper.insert(new DataItem(Rmautoorder.class, "insert"), rmautoorder);
		return rmautoorder.getId();
	}

	@Override
	public void update(Rmautoorder rmautoorder) {
		mapper.update(new DataItem(Rmautoorder.class, "update"), rmautoorder);
	}

	@Override
	public void insertBatch(List<Rmautoorder> list) {
		mapper.find(new DataItem(Rmautoorder.class, "insertBatch"), list);
	}

	@Override
	public Rmautoorder findById(Integer id) {
		return mapper.find(new DataItem(Rmautoorder.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(new DataItem(Rmautoorder.class, "delete"), id);
	}

	@Override
	public List<Rmautoorder> queryAll() {
		return null;
	}
}