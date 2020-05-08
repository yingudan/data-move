package com.ujuit.datamove.masterfuturesdailyposition.service;

import com.ujuit.datamove.masterfuturesdailyposition.model.Masterfuturesdailyposition;
import java.util.List;

public interface MasterfuturesdailypositionService {

	Integer insert(Masterfuturesdailyposition masterfuturesdailyposition);

	void update(Masterfuturesdailyposition masterfuturesdailyposition);

	void insertBatch(List<Masterfuturesdailyposition> list);

	void delete(Integer id);

	Masterfuturesdailyposition findById(Integer id);

	List<Masterfuturesdailyposition> queryAll();

}