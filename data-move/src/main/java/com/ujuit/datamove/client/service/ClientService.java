package com.ujuit.datamove.client.service;

import com.ujuit.datamove.client.model.Client;
import java.util.List;

public interface ClientService {

	Integer insert(Client client);

	void update(Client client);

	void insertBatch(List<Client> list);

	void delete(Integer id);

	Client findById(Integer id);

	/**
	 * 查询所有V2里的客户信息 newId为null 需要添加到V4里的
	 */
	List<Client> queryAllClientV2();

	/**
	 * 查询V2里的所有客户信息用于做缓存 
	 */
	List<Client> queryAllClient();

}