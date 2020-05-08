package com.ujuit.datamove.subaccounttemp.service;

import com.ujuit.datamove.subaccounttemp.model.Subaccounttemp;
import java.util.List;

public interface SubaccounttempService {

	Integer insert(Subaccounttemp subaccounttemp);

	void update(Subaccounttemp subaccounttemp);

	void insertBatch(List<Subaccounttemp> list);

	void delete(Integer id);

	Subaccounttemp findById(Integer id);

	Subaccounttemp findBySubAccountId(Integer subAccountId);

}