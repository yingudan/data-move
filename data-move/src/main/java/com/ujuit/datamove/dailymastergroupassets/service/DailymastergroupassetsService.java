package com.ujuit.datamove.dailymastergroupassets.service;
import com.ujuit.datamove.dailymastergroupassets.model.Dailymastergroupassets;
import java.util.List;

public interface DailymastergroupassetsService {

	Integer insert(Dailymastergroupassets dailymastergroupassets);

	void update(Dailymastergroupassets dailymastergroupassets);

	void insertBatch(List<Dailymastergroupassets> list);

 void delete (Integer id);

	Dailymastergroupassets findById(Integer id);

}