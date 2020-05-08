package com.ujuit.datamove.profitdetails.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.profitdetails.model.Profitdetails;

@Service
public class ProfitdetailsServiceImpl implements ProfitdetailsService {

	@Resource
	private Dao mapper;

	@Override
	public Integer insert(Profitdetails profitdetails) {
		mapper.insert(new DataItem(Profitdetails.class, "insert"), profitdetails);
		return profitdetails.getId();
	}

	@Override
	public void update(Profitdetails profitdetails) {
		mapper.update(new DataItem(Profitdetails.class, "update"), profitdetails);
	}

	@Override
	public void insertBatch(List<Profitdetails> list) {
		mapper.find(new DataItem(Profitdetails.class, "insertBatch"), list);
	}

	@Override
	public Profitdetails findById(Integer id) {
		return mapper.find(new DataItem(Profitdetails.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(new DataItem(Profitdetails.class, "delete"), id);
	}

	@Override
	public List<Profitdetails> queryAll() {
		return null;
	}
}