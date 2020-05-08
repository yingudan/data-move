package com.ujuit.datamove.dailymasterassets.service;

import com.ujuit.datamove.dailymasterassets.model.Dailymasterassets;
import java.util.List;

/**
 * V2里面
 * @depiction 
 * @author ripper [RipperF@hotmail.com]
 * @date 2020年4月20日
 */
public interface DailymasterassetsService {

	Integer insert(Dailymasterassets dailymasterassets);

	void update(Dailymasterassets dailymasterassets);

	void insertBatch(List<Dailymasterassets> list);

	void delete(Integer id);

	Dailymasterassets findById(Integer id);

	List<Dailymasterassets> queryAll();

}