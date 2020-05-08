package com.ujuit.datamove.instrumentoptional.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.instrumentoptional.model.Instrumentoptional;

@Service
public class InstrumentoptionalServiceImplV2 implements InstrumentoptionalService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Instrumentoptional instrumentoptional) {
		daoEEx.insert(new DataItem(Instrumentoptional.class, "insert"), instrumentoptional);
		return instrumentoptional.getId();
	}

	@Override
	public void update(Instrumentoptional instrumentoptional) {
		daoEEx.update(new DataItem(Instrumentoptional.class, "update"), instrumentoptional);
	}

	@Override
	public void insertBatch(List<Instrumentoptional> list) {
		daoEEx.find(new DataItem(Instrumentoptional.class, "insertBatch"), list);
	}

	@Override
	public Instrumentoptional findById(Integer id) {
		return daoEEx.find(new DataItem(Instrumentoptional.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Instrumentoptional.class, "delete"), id);
	}

	@Override
	public List<Instrumentoptional> queryAll() {
		return daoEEx.getDataList(new DataItem(Instrumentoptional.class, "queryAll"));
	}
}