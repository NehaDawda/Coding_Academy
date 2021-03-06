package com.jp.shopping.dao;

import java.util.ArrayList;

import com.jp.shopping.entities.Item;
import com.jp.shopping.exception.ShoppingException;

public interface DaoItem {
	public ArrayList<Item> getItemList() throws ShoppingException;
	public Item getItemDetails(String itemId) throws ShoppingException;
	public boolean updateItemInStock(Item item) throws ShoppingException;
}
