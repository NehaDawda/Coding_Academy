package com.jp.shopping.services;

import com.jp.shopping.entities.Order;
import com.jp.shopping.exception.ShoppingException;

public interface ServiceOrder {
	public boolean createNewOrder(Order order) throws ShoppingException;
}
