package com.jp.hr.services;

import java.util.List;

import com.jp.hr.daos.DaoProduct;
import com.jp.hr.daos.DaoProductImpl;
import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;

public class ServiceProductImpl implements ServiceProduct{
	private DaoProduct daoProduct;

	public ServiceProductImpl() throws HrException{
		daoProduct = new DaoProductImpl();
	}
	@Override
	public List<Product> getProductList() throws HrException {
		return daoProduct.getProductList();
	}

	@Override
	public Product getProductDetails(int productId) throws HrException {
		return daoProduct.getProductDetails(productId);
	}

	@Override
	public int addNewProduct(Product p) throws HrException {
		daoProduct.beginTransaction();
		int productId = daoProduct.insertNewProduct(p);
		daoProduct.commitTransaction();
		return productId;
	}
	
	@Override
	public int updateProductDetails(Product p) throws HrException {
		daoProduct.beginTransaction();
		int productId = daoProduct.updateProduct(p);
		daoProduct.commitTransaction();
		return productId;
	}
	
	@Override
	public int removeProduct(int productId) throws HrException {
		daoProduct.beginTransaction();
		int id = daoProduct.deleteProduct(productId);
		daoProduct.commitTransaction();
		return id;
	}
	
}
