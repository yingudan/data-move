package com.ujuit.datamove.masterbaseinfo.service;

import com.ujuit.datamove.masterbaseinfo.model.Masterbaseinfo;
import java.util.List;

public interface MasterbaseinfoService {

	Integer insert(Masterbaseinfo masterbaseinfo);

	void update(Masterbaseinfo masterbaseinfo);

	void insertBatch(List<Masterbaseinfo> list);

	void delete(Integer id);

	Masterbaseinfo findById(Integer id);

	List<Masterbaseinfo> queryAll();

}