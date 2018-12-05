/**
 * 
 */
package com.jpm.mtm.client;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import com.jpm.mtm.entities.Order;
import com.jpm.mtm.entities.Product;
import com.jpm.mtm.util.JPAUtil;

/**
 * @author Neha
 *
 */
public class OTMClient {
	public static void main(String[] args) {
		//Step 1: obtain entityManager object
		EntityManager entityManager = JPAUtil.getEntityManager();
		
		//create the object to be persisted
		//--product obj
		Product elecProduct = new Product();
		elecProduct.setProductId(101L);
		elecProduct.setProductName("LED TV");
		elecProduct.setProductPrice(45000.88);
		
		Product beautyProduct = new Product();
		beautyProduct.setProductId(102L);
		beautyProduct.setProductName("Face Wash");
		beautyProduct.setProductPrice(80.88);
		
		Product babyProduct = new Product();
		babyProduct.setProductId(103L);
		babyProduct.setProductName("Pampers");
		babyProduct.setProductPrice(15.75);
		
		Product eleProduct = new Product();
		eleProduct.setProductId(104L);
		eleProduct.setProductName("CFL Bulb");
		eleProduct.setProductPrice(250.55);
		
		
		//--order obj
		Order order1 = new Order();
		order1.setOrderId(1L);
		order1.setPurchaseDate(new Date());
		
		Set<Product> products = new HashSet<>();
		products.add(elecProduct);
		products.add(beautyProduct);
		products.add(babyProduct);
		products.add(eleProduct);
		
		order1.setProducts(products);
		
		Order order2 = new Order();
		order2.setOrderId(2L);
		order2.setPurchaseDate(new Date());
		order2.setProducts(products);
		
		Set<Order> orders = new HashSet<>();
		orders.add(order1);
		orders.add(order2);
		
		elecProduct.setOrders(orders);
		beautyProduct.setOrders(orders);
		babyProduct.setOrders(orders);
		eleProduct.setOrders(orders);
		
		entityManager.getTransaction().begin();
		
		//save orders using entity manager
		entityManager.persist(order1);
		entityManager.persist(order2);
		
		//commit transaction
		entityManager.getTransaction().commit();
		
		//close em
		entityManager.close();
	}

}
