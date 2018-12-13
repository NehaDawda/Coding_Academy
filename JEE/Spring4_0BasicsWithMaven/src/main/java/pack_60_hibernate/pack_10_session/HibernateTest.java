package pack_60_hibernate.pack_10_session;
/*
 * Need following libraries...
		Basics, Context, Hibernate, Transaction, AOP, DB, jtaLib and drivers
		And jUnit library to run client side code.
 */
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pack_60_hibernate.pack_common.Product;
import pack_60_hibernate.pack_common.ProductRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:pack_60_hibernate\\pack_common\\context.xml")

public class HibernateTest {

	@Autowired private ProductRepository productRepository;

	@Test
	public void testHibernate() {
		
		/* For adding new record.  Confirm that this record is not existing in DB
		Product p = new Product();
		p.setId(2);
		p.setName("Spring in Action");
		p.setDescription("Compl. solution");
		p.setPrice(300.0);
		p.setQuantity(2);
		productRepository.add(p);
		*/
		
		/*
		Product p1 = productRepository.get(2);
		System.out.println(p1);
		*/
		System.out.println("**********All");
		
		for(Product pp:productRepository.getAll()){
			System.out.println(pp);
		}
		
		
		/*
		System.out.println("**********OnRange");
		for(Product pp:productRepository.getProductsByPrice(10000)){
			System.out.println(pp);
		}
		*/
	}
}