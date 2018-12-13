package pack_40_aop.pack_10_aspect.pack_15_proxyFactoryBean;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pack_40_aop.pack_10_aspect.pack_joinpoints.pack_buss.BusinessComponent;
import pack_40_aop.pack_10_aspect.pack_joinpoints.pack_buss.BusinessInterface;
import pack_40_aop.pack_10_aspect.pack_joinpoints.pack_cust.CustomerService;


/* Example 28: AOP configured in xml for Proxy Factory bean.
 * 1. The advice in implementing interface- MethodInterceptor
 * 2. The MethodInterceptor is imposing implementation of invoke(MethodInvocation call).
 * 3. The XML configuration is defining ProxyFactoryBean which needs Advices and target.
 * 4. It also needs interfaces to create a proxy.
 * 5. Observe how multple advices are given.  Their order in list decides their order of invocation.
 * 
 */
public class Test1 {

	public static void main(String[] args)  {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("pack_40_aop\\pack_10_aspect\\pack_15_proxyFactoryBean\\context.xml");
		
		CustomerService cs = (CustomerService) ctx.getBean("proxyCustomerService");
		
		// Methods not set with advice
		cs.stopCheque(1010101L, 123456);
		System.out.println("****************************");
		cs.transfer(1, 2, 100);
		System.out.println("****************************");
		cs.applyForChequeBook(10101010L);
		System.out.println("****************************");
		cs.applyForCreditCard("Chandra", "Mumbai");
		
		
		BusinessInterface bc = (BusinessInterface) ctx.getBean("bussService");
		bc.someBusinessMethod();
	}
}