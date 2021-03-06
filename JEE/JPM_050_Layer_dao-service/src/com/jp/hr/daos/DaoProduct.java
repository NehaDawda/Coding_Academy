package com.jp.hr.daos;

import java.util.ArrayList;

import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;

public interface DaoProduct {
	public ArrayList<Product> getProductList() throws HrException;
	public Product getProductDetails(int productId) throws HrException;
	public boolean insertNewProduct(Product p) throws HrException;
	public boolean updateProduct(Product p) throws HrException;
	public boolean deleteProduct(int productId) throws HrException;
}
