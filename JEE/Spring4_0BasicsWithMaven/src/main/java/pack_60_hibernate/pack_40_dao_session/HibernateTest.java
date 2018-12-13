package pack_60_hibernate.pack_40_dao_session;

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
		/*
		Product p = new Product();
		p.setName("Chandra\'s Content Management");
		p.setDescription("Complete solution");
		p.setPrice(200000.0);
		p.setQuantity(2);
		productRepository.add(p);
		*/
		System.out.println("Records from table...");
		for(Product pp:productRepository.getAll()){
			System.out.println(pp);
		}
	}
}
