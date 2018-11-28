package com.jp.hr.services;

import java.util.ArrayList;

import com.jp.hr.daos.DaoProduct;
import com.jp.hr.daos.DaoProductImpl;
import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;

public class ServiceProductImpl implements ServiceProduct{
	private DaoProduct daoProduct;

	public ServiceProductImpl(){
		daoProduct = new DaoProductImpl();
	}
	@Override
	public ArrayList<Product> getProductList() throws HrException {
		return daoProduct.getProductList();
	}

	@Override
	public Product getProductDetails(int productId) throws HrException {
		return daoProduct.getProductDetails(productId);
	}

	@Override
	public boolean addNewProduct(Product p) throws HrException {
		return daoProduct.insertNewProduct(p);
	}
	@Override
	public boolean updateProductDetails(Product p) throws HrException {
		return daoProduct.updateProduct(p);
	}
	@Override
	public boolean removeProduct(int productId) throws HrException {
		return daoProduct.deleteProduct(productId);
	}
	
}
