package com.jp.shopping.services;

import java.util.ArrayList;

import com.jp.shopping.entities.Item;
import com.jp.shopping.exception.ShoppingException;

public interface ServiceItem {
	public ArrayList<Item> getItemList() throws ShoppingException;
	public Item getItemDetails(String itemId) throws ShoppingException;
	public boolean updateItemInStock(Item item) throws ShoppingException;
}