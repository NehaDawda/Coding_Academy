package com.jp.shopping.dao;

import com.jp.shopping.entities.Order;
import com.jp.shopping.exception.ShoppingException;

public interface DaoOrder {
	public boolean insertNewOrder(Order order) throws ShoppingException;
}
