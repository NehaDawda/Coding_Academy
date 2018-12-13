package pack_60_hibernate.pack_40_dao_session;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import pack_60_hibernate.pack_common.Product;
import pack_60_hibernate.pack_common.ProductRepository;

//HibernateTemplate doesn't expose all the methods of the Hibernate Session interface
//So sometimes we end up writing more code when using HibernateTemplate
//HibernateDaoSupport provides direct access to underlying Session but this time
//no need to worry about session management issues
public class HibernateProductRepository4 extends HibernateDaoSupport implements ProductRepository {

	public void add(Product product) {
		Session session = this.getSession();
		Transaction tr = session.getTransaction();
		tr.begin();
		session.save(product);
		tr.commit();
		tr.rollback();
	}

	public Product get(int productId) {
		Product product = (Product) getHibernateTemplate().get(Product.class, productId);
		return product;
	}

	public List<Product> getAll() {
		
		List<Product> products = getHibernateTemplate().createQuery("from Product").list();
		return products;
	}
	
	public List<Product> getProductsByPrice(double rangeLower){

		List<Product> products = (List<Product>)getHibernateTemplate().find("from Product p where p.price>=?", rangeLower);
		return products;
	}
}
