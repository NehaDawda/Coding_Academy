package com.jp.hr.services;

import java.util.List;

import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;

public interface ServiceProduct {
	public List<Product> getProductList() throws HrException;
	public Product getProductDetails(int productId) throws HrException;
	public int addNewProduct(Product p) throws HrException;
	public int updateProductDetails(Product p) throws HrException;
	public int removeProduct(int productId) throws HrException;
}
