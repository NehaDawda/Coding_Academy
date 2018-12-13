package pack_70_transactions.pack_30_aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:pack_70_transactions\\pack_30_aop\\context.xml")

public class HibernateTest {

	@Autowired private ProductRepository productRepository;

	@Test
	public void testHibernate() {
		
		for(Product pp:productRepository.getAll()){
			System.out.println(pp);
		}

	}
}