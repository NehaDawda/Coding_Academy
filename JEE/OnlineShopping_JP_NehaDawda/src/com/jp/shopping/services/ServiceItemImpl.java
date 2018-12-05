package com.jp.shopping.services;

import java.util.ArrayList;

import com.jp.shopping.dao.DaoItem;
import com.jp.shopping.dao.DaoItemImpl;
import com.jp.shopping.entities.Item;
import com.jp.shopping.exception.ShoppingException;

public class ServiceItemImpl implements ServiceItem{
	private DaoItem daoItem;
	
	public ServiceItemImpl() throws ShoppingException{
		daoItem = new DaoItemImpl();
	}
	
	@Override
	public ArrayList<Item> getItemList() throws ShoppingException {
		return daoItem.getItemList();
	}

	@Override
	public Item getItemDetails(String itemId) throws ShoppingException {
		return daoItem.getItemDetails(itemId);
	}

	@Override
	public boolean updateItemInStock(Item item) throws ShoppingException {
		return daoItem.updateItemInStock(item);
	}

}
