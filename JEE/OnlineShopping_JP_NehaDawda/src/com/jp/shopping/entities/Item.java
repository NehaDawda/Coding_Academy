package com.jp.shopping.entities;

public class Item {
	private String itemId;
	private String name;
	private String category = "Electronics";
	private double price;
	private int itemInStock;
	
	public Item(String itemId, String name, String category, double price, int itemInStock) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.category = category;
		this.price = price;
		this.itemInStock = itemInStock;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getItemInStock() {
		return itemInStock;
	}

	public void setItemInStock(int itemInStock) {
		this.itemInStock = itemInStock;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", category=" + category + ", price=" + price
				+ ", itemInStock=" + itemInStock + "]";
	}
}
