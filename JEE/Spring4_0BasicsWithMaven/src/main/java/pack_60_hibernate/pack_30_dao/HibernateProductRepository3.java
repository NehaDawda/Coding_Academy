package pack_60_hibernate.pack_30_dao;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import pack_60_hibernate.pack_common.Product;
import pack_60_hibernate.pack_common.ProductRepository;

//Using HibernateDaoSupport class to make it much more simpler.  The setter method for Session Factory comes from
// HibernateDaoSupport.

// It provides methods to handle session.  Thus unlike HibernateTemplate, need not handle callbacks.
public class HibernateProductRepository3 extends HibernateDaoSupport implements ProductRepository {

	public void add(Product product) {
		getHibernateTemplate().save(product);
	}

	public Product get(int productId) {
		Product product = (Product) getHibernateTemplate().get(Product.class, productId);
		return product;
	}

	public List<Product> getAll() {
		List products =  getHibernateTemplate().find("from Product");
		return products;
	}

	public List<Product> getProductsByPrice(double rangeLower){

		List<Product> products = (List<Product>) getHibernateTemplate().find("from Product p where p.price>=?", rangeLower);
		return products;
	}
}
