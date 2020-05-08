package com.ujuit.datamove.mastertemp.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.mastertemp.model.Mastertemp;

@Service
public class MastertempServiceImpl implements MastertempService {

	@Resource
	private Dao mapper;

	@Override
	public Integer insert(Mastertemp mastertemp) {
		mapper.insert(new DataItem(Mastertemp.class, "insert"), mastertemp);
		return mastertemp.getId();
	}

	@Override
	public void update(Mastertemp mastertemp) {
		mapper.update(new DataItem(Mastertemp.class, "update"), mastertemp);
	}

	@Override
	public void insertBatch(List<Mastertemp> list) {
		mapper.find(new DataItem(Mastertemp.class, "insertBatch"), list);
	}

	@Override
	public Mastertemp findById(Integer id) {
		return mapper.find(new DataItem(Mastertemp.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(new DataItem(Mastertemp.class, "delete"), id);
	}

	@Override
	public Mastertemp findByMasterId(Integer masterId) {
		return null;
	}
}