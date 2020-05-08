package com.ujuit.datamove.dailymastergroupassets.service;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.dailymastergroupassets.model.Dailymastergroupassets;

@Service
public class DailymastergroupassetsServiceImpl implements DailymastergroupassetsService {

	@Resource
	private Dao mapper;

	@Override
	public Integer insert(Dailymastergroupassets dailymastergroupassets) {
		mapper.insert(new DataItem(Dailymastergroupassets.class,"insert"),dailymastergroupassets);
return dailymastergroupassets.getId();
	}

	@Override
	public void update(Dailymastergroupassets dailymastergroupassets) {
		mapper.update(new DataItem(Dailymastergroupassets.class,"update"),dailymastergroupassets);
	}

	@Override
	public void insertBatch(List<Dailymastergroupassets> list) {
		mapper.find(new DataItem(Dailymastergroupassets.class,"insertBatch"),list);
	}

	@Override
	public Dailymastergroupassets findById(Integer id){
		return mapper.find(new DataItem(Dailymastergroupassets.class,"findById"),id);
	}

	@Override
public void delete (Integer id){
 mapper.delete (new DataItem(Dailymastergroupassets.class,"delete"),id);
}}