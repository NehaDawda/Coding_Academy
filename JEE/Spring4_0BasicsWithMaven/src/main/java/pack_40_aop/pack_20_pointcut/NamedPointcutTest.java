package pack_40_aop.pack_20_pointcut;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pack_40_aop.pack_20_pointcut.pack_service.CustomerService;
import pack_40_aop.pack_20_pointcut.pack_service.Order;
import pack_40_aop.pack_20_pointcut.pack_service.OrderService;
/*
 * Example 32: Named point cuts.
 * 1. Loose coupling between pointcuts and advisors.
 * 2. Hiding pointcuts from adivsors.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:pack_40_aop\\pack_20_pointcut\\context.xml")
public class NamedPointcutTest {

	@Autowired private OrderService orderService;
	@Autowired private CustomerService customerService;
	
	@Test
	public void testNamedPointcuts() {
		orderService.placeOrder(new Order());
		customerService.applyForChequeBook(12345);
	}
}
