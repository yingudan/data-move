package com.ujuit.datamove.client.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ujuit.sysmanager.core.mybatis.Dao;
import com.ujuit.sysmanager.core.mybatis.DataItem;
import java.util.List;
import com.ujuit.datamove.client.model.Client;

/**
 * @depiction 默认为V4
 * @author ripper [RipperF@hotmail.com]
 * @date 2020年4月13日
 */
@Service
public class ClientServiceImpl implements ClientService {

	@Resource
	private Dao mapper;

	@Override
	public Integer insert(Client client) {
		mapper.insert(new DataItem(Client.class, "insert"), client);
		return client.getId();
	}

	@Override
	public void update(Client client) {
		mapper.update(new DataItem(Client.class, "update"), client);
	}

	@Override
	public void insertBatch(List<Client> list) {
		mapper.find(new DataItem(Client.class, "insertBatch"), list);
	}

	@Override
	public Client findById(Integer id) {
		return mapper.find(new DataItem(Client.class, "findById"), id);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(new DataItem(Client.class, "delete"), id);
	}

	@Override
	public List<Client> queryAllClientV2() {
		return null;
	}

	@Override
	public List<Client> queryAllClient() {
		return null;
	}
}