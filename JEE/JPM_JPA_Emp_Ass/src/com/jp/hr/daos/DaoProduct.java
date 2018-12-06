package com.jp.hr.daos;

import java.util.List;

import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;

public interface DaoProduct {
	public List<Product> getProductList() throws HrException;
	public Product getProductDetails(int productId) throws HrException;
	public int insertNewProduct(Product p) throws HrException;
	public int updateProduct(Product p) throws HrException;
	public int deleteProduct(int productId) throws HrException;
	
	public void commitTransaction();
	public void beginTransaction();
}
