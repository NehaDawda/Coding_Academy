package pack_60_hibernate.pack_10_session;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import pack_60_hibernate.pack_common.Product;
import pack_60_hibernate.pack_common.ProductRepository;


//Using Spring just to inject the SessionFactory
//No need to use any Spring specific API

@Transactional
public class HibernateProductRepository1 implements ProductRepository {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void add(Product product) {
		Session session = sessionFactory.getCurrentSession();
		session.save(product);
	}

	public Product get(int productId) {
		Session session = sessionFactory.getCurrentSession();
		Product product = (Product) session.get(Product.class, productId);
		return product;
	}

	public List<Product> getAll() {
		Session session = sessionFactory.getCurrentSession();
		List<Product> products = session.createQuery("from Product").list();
		return products;
	}

	public List<Product> getProductsByPrice(double rangeLower) {
		
		Session session = sessionFactory.getCurrentSession();
		System.out.println("Session Hash code:"+session.hashCode());
		List<Product> products = session.createQuery("from Product where product_price = "+ rangeLower).list();
		return products;
	}
}
