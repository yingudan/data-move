package com.ujuit.datamove.dealgoldmaster.service;

import com.ujuit.datamove.dealgoldmaster.model.Dealgoldmaster;
import java.util.List;

public interface DealgoldmasterService {

	Integer insert(Dealgoldmaster dealgoldmaster);

	void update(Dealgoldmaster dealgoldmaster);

	void insertBatch(List<Dealgoldmaster> list);

	void delete(Integer id);

	Dealgoldmaster findById(Integer id);

	List<Dealgoldmaster> queryAll();

}