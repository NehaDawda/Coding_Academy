package pack_40_aop.pack_10_aspect.pack_20_configxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pack_40_aop.pack_10_aspect.pack_joinpoints.pack_buss.BusinessComponent;
import pack_40_aop.pack_10_aspect.pack_joinpoints.pack_buss.BusinessInterface;
import pack_40_aop.pack_10_aspect.pack_joinpoints.pack_cust.CustomerService;


/* Example 28: AOP configured in xml.
 * 1. Setting advice for join points defined by one pointcut.
 * 2. Setting multiple advices for join points defined by one pointcut.
 * 3. Setting multiple advices for join points defined by multiple pointcut.
 * 
 */
public class Test1 {

	public static void main(String[] args)  {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("pack_40_aop\\pack_10_aspect\\pack_20_configxml\\applicationContext1.xml");
		
		CustomerService cs = (CustomerService) ctx.getBean("customerService");
		
		// Methods not set with advice
		cs.stopCheque(1010101L, 123456);
		cs.transfer(1, 2, 100);
		
		// Methods set with Around advice with pointcut in Context
		cs.applyForChequeBook(10101010L);
		cs.applyForCreditCard("Chandra", "Mumbai");
		
		
		BusinessInterface bc = (BusinessInterface) ctx.getBean("bussService");
		bc.someBusinessMethod();
	}
}