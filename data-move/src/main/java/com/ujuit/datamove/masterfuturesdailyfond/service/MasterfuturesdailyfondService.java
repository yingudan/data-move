package com.ujuit.datamove.masterfuturesdailyfond.service;

import com.ujuit.datamove.masterfuturesdailyfond.model.Masterfuturesdailyfond;
import java.util.List;

public interface MasterfuturesdailyfondService {

	Integer insert(Masterfuturesdailyfond masterfuturesdailyfond);

	void update(Masterfuturesdailyfond masterfuturesdailyfond);

	void insertBatch(List<Masterfuturesdailyfond> list);

	void delete(Integer id);

	Masterfuturesdailyfond findById(Integer id);

	List<Masterfuturesdailyfond> queryAll();

}