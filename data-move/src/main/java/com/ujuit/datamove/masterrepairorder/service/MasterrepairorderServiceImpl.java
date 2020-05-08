package com.ujuit.datamove.masterrepairorder.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.masterrepairorder.model.Masterrepairorder;

@Service
public class MasterrepairorderServiceImpl implements MasterrepairorderService {

	@Resource
	private Dao mapper;

	@Override
	public Integer insert(Masterrepairorder masterrepairorder) {
		mapper.insert(new DataItem(Masterrepairorder.class, "insert"), masterrepairorder);
		return null;
	}

	@Override
	public void update(Masterrepairorder masterrepairorder) {
		mapper.update(new DataItem(Masterrepairorder.class, "update"), masterrepairorder);
	}

	@Override
	public void insertBatch(List<Masterrepairorder> list) {
		mapper.find(new DataItem(Masterrepairorder.class, "insertBatch"), list);
	}

	@Override
	public Masterrepairorder findById(Integer masterOrderId) {
		return mapper.find(new DataItem(Masterrepairorder.class, "findById"), masterOrderId);
	}

	@Override
	public void delete(Integer masterOrderId) {
		mapper.delete(new DataItem(Masterrepairorder.class, "delete"), masterOrderId);
	}

	@Override
	public List<Masterrepairorder> queryAll() {
		return null;
	}
}