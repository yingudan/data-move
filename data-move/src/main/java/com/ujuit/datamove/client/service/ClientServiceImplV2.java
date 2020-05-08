package com.ujuit.datamove.client.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.client.model.Client;

@Service
public class ClientServiceImplV2 implements ClientService {

	@Resource(name = "daoEEx")
	private Dao daoEEx;

	@Override
	public Integer insert(Client client) {
		daoEEx.insert(new DataItem(Client.class, "insert"), client);
		return client.getId();
	}

	@Override
	public void update(Client client) {
		daoEEx.update(new DataItem(Client.class, "update"), client);
	}

	@Override
	public void insertBatch(List<Client> list) {
		daoEEx.find(new DataItem(Client.class, "insertBatch"), list);
	}

	@Override
	public Client findById(Integer id) {
		return daoEEx.find(new DataItem(Client.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		daoEEx.delete(new DataItem(Client.class, "delete"), id);
	}

	@Override
	public List<Client> queryAllClientV2() {
		return daoEEx.getDataList(new DataItem(Client.class, "queryAllClientV2"));
	}

	@Override
	public List<Client> queryAllClient() {
		return daoEEx.getDataList(new DataItem(Client.class, "queryAllClient"));
	}
}