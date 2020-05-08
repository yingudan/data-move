package com.ujuit.datamove.expiremessage.service;

import java.util.List;

import com.ujuit.datamove.expiremessage.model.Expiremessage;

public interface ExpiremessageService {

	Integer insert(Expiremessage expiremessage);

	void update(Expiremessage expiremessage);

	void insertBatch(List<Expiremessage> list);

	void delete(Integer id);

	Expiremessage findById(Integer id);

	List<Expiremessage> queryAll();

}