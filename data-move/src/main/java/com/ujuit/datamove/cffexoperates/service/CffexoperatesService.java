package com.ujuit.datamove.cffexoperates.service;

import com.ujuit.datamove.cffexoperates.model.Cffexoperates;
import java.util.List;

public interface CffexoperatesService {

	Integer insert(Cffexoperates cffexoperates);

	void update(Cffexoperates cffexoperates);

	void insertBatch(List<Cffexoperates> list);

	void delete(Integer id);

	Cffexoperates findById(Integer id);

}