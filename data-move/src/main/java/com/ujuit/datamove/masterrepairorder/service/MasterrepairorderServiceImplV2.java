package com.ujuit.datamove.masterrepairorder.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.masterrepairorder.model.Masterrepairorder;

@Service
public class MasterrepairorderServiceImplV2 implements MasterrepairorderService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Masterrepairorder masterrepairorder) {
		daoEEx.insert(new DataItem(Masterrepairorder.class, "insert"), masterrepairorder);
		return null;
	}

	@Override
	public void update(Masterrepairorder masterrepairorder) {
		daoEEx.update(new DataItem(Masterrepairorder.class, "update"), masterrepairorder);
	}

	@Override
	public void insertBatch(List<Masterrepairorder> list) {
		daoEEx.find(new DataItem(Masterrepairorder.class, "insertBatch"), list);
	}

	@Override
	public Masterrepairorder findById(Integer masterOrderId) {
		return daoEEx.find(new DataItem(Masterrepairorder.class, "findById"), masterOrderId);
	}

	@Override
	public void delete(Integer masterOrderId) {
		daoEEx.delete(new DataItem(Masterrepairorder.class, "delete"), masterOrderId);
	}

	@Override
	public List<Masterrepairorder> queryAll() {
		return daoEEx.getDataList(new DataItem(Masterrepairorder.class, "queryAll"));
	}
}