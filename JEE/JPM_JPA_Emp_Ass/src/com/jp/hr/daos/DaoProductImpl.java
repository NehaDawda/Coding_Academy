package com.jp.hr.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.utilities.JPAUtil;

public class DaoProductImpl implements DaoProduct{
	private EntityManager entityManager;
	
	public DaoProductImpl() throws HrException{
		entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public List<Product> getProductList() throws HrException {
		Query query = entityManager.createQuery("from Product");
		List<Product> productList = query.getResultList();
		return productList;
	}

	@Override
	public Product getProductDetails(int productId) throws HrException {
		return entityManager.find(Product.class, productId);
	}

	@Override
	public int insertNewProduct(Product p) throws HrException {
		entityManager.persist(p);
		return p.getProductId();
	}

	@Override
	public int updateProduct(Product p) throws HrException {
		entityManager.merge(p);
		return p.getProductId();
	}

	@Override
	public int deleteProduct(int productId) throws HrException {
		Product p = entityManager.find(Product.class, productId);
		entityManager.remove(p);
		return productId;
	}
	
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}
	
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	
	@Override
	protected void finalize() throws Throwable {
		entityManager.close();
	}
}
