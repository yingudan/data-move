package com.ujuit.datamove.masterfuturesdailyorder.service;

import com.ujuit.datamove.masterfuturesdailyorder.model.Masterfuturesdailyorder;
import java.util.List;

public interface MasterfuturesdailyorderService {

	Integer insert(Masterfuturesdailyorder masterfuturesdailyorder);

	void update(Masterfuturesdailyorder masterfuturesdailyorder);

	void insertBatch(List<Masterfuturesdailyorder> list);

	void delete(Integer id);

	Masterfuturesdailyorder findById(Integer id);

	/**
	 * 
	 * @author ripper [RipperF@hotmail.com]
	 * @date 2020年4月14日
	 */
	List<Masterfuturesdailyorder> queryAll();

}