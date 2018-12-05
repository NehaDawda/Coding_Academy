package com.jp.shopping.entities;

import java.util.ArrayList;

public class Cart {
	private ArrayList<Item> items;
	
	public Cart(ArrayList<Item> items) {
		super();
		this.items = items;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	public void addItems(Item item){
		this.items.add(item);
	}
}
