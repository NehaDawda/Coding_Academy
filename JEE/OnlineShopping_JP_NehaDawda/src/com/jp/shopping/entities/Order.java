package com.jp.shopping.entities;

import java.util.ArrayList;

public class Order {
	private int customerId;
	private int orderId;
	private ArrayList<Item> items;
	
	public Order(int customerId, int orderId, ArrayList<Item> items) {
		super();
		this.customerId = customerId;
		this.orderId = orderId;
		this.items = items;
	}

	public Order(int customerId, ArrayList<Item> items) {
		super();
		this.customerId = customerId;
		this.items = items;
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Order [customerId=" + customerId + ", orderId=" + orderId + ", items=" + items + "]";
	}
}
