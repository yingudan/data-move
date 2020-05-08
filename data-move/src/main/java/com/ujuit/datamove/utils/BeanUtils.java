package com.ujuit.datamove.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ujuit.datamove.client.model.Client;
import com.ujuit.datamove.master.model.Master;
import com.ujuit.datamove.orderfutures.model.Orderfutures;
import com.ujuit.datamove.subaccount.model.Subaccount;

public class BeanUtils {

	/**
	 * @author ripper[RipperF@hotmail.com]
	 */
	public static Map<Integer, Client> getClientMap(List<Client> clientList) {
		Map<Integer, Client> map = new HashMap<Integer, Client>();
		for (Client client : clientList) {
			map.put(client.getId(), client);
		}
		return map;
	}

	public static Map<Integer, Subaccount> getSubAccountMap(List<Subaccount> subAccountList) {
		Map<Integer, Subaccount> map = new HashMap<Integer, Subaccount>();
		for (Subaccount subaccount : subAccountList) {
			map.put(subaccount.getId(), subaccount);
		}
		return map;
	}

	public static Map<Integer, Master> getMasterMap(List<Master> queryAllMaster) {
		Map<Integer, Master> map = new HashMap<Integer, Master>();
		for (Master master : queryAllMaster) {
			map.put(master.getId(), master);
		}
		return map;
	}

	public static Map<Integer, Orderfutures> getOrderfutures(List<Orderfutures> allOrderfutures) {
		Map<Integer, Orderfutures> map = new HashMap<Integer, Orderfutures>();
		for (Orderfutures orderfutures : allOrderfutures) {
			map.put(orderfutures.getId(), orderfutures);
		}
		return map;
	}

}
