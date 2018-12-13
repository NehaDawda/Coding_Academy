package pack_60_hibernate.pack_20_template;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;

import pack_60_hibernate.pack_common.Product;
import pack_60_hibernate.pack_common.ProductRepository;


// Using HibernateTemplate to guarantee accurate Session management.
// It ensures session is properly opened and closed and automatically participate in transaction.
// It does not have a method to give current session.
// But if you want to handle session methods which ofcourse are not exposed in HibernateTemplate,
// 		it is possible through call back.
// Template interfaces are thread safe and reusable thus can be used as an instance variable for an outer class.
public class HibernateProductRepository2 implements ProductRepository {

	private HibernateTemplate hibernateTemplate;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	public void add(Product product) {
		hibernateTemplate.save(product);		
	}
	
	public Product get(int productId) {
		Product product = (Product) hibernateTemplate.get(Product.class, productId);
		return product;
	}

	
	public List<Product> getAll() {
		List products = hibernateTemplate.find("from Product");
		return products;
	}
	
	public List<Product> getProductsByPrice(final double rangeLower){

		List products = hibernateTemplate.find("from Product p where p.price>=?", rangeLower);
	
		/*return this.hibernateTemplate.execute(new HibernateCallback() {

            public Object doInHibernate(Session session) {
                Criteria criteria = session.createCriteria(Product.class);
                criteria.add(Expression.ge("price", rangeLower));
                criteria.setMaxResults(6);
                return criteria.list();
            }
        });*/

		return products;
	}
}
