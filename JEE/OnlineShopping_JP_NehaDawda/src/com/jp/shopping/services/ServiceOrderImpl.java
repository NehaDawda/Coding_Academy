package com.jp.shopping.services;

import com.jp.shopping.dao.DaoOrder;
import com.jp.shopping.dao.DaoOrderImpl;
import com.jp.shopping.entities.Order;
import com.jp.shopping.exception.ShoppingException;

public class ServiceOrderImpl implements ServiceOrder{
	private DaoOrder daoOrder;
	
	public ServiceOrderImpl() throws ShoppingException{
		daoOrder = new DaoOrderImpl();
	}
	@Override
	public boolean createNewOrder(Order order) throws ShoppingException {
		return daoOrder.insertNewOrder(order);
	}

}
