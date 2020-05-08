package com.ujuit.datamove.subaccounttemp.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.subaccounttemp.model.Subaccounttemp;

@Service
public class SubaccounttempServiceImplV2 implements SubaccounttempService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Subaccounttemp subaccounttemp) {
		daoEEx.insert(new DataItem(Subaccounttemp.class, "insert"), subaccounttemp);
		return subaccounttemp.getId();
	}

	@Override
	public void update(Subaccounttemp subaccounttemp) {
		daoEEx.update(new DataItem(Subaccounttemp.class, "update"), subaccounttemp);
	}

	@Override
	public void insertBatch(List<Subaccounttemp> list) {
		daoEEx.find(new DataItem(Subaccounttemp.class, "insertBatch"), list);
	}

	@Override
	public Subaccounttemp findById(Integer id) {
		return daoEEx.find(new DataItem(Subaccounttemp.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Subaccounttemp.class, "delete"), id);
	}

	@Override
	public Subaccounttemp findBySubAccountId(Integer subAccountId) {
		return daoEEx.find(new DataItem(Subaccounttemp.class, "findBySubAccountId"),subAccountId);
	}
}