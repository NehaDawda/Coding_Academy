package pack_30_more_ioc.pack_02_118NSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.test.context.ContextConfiguration;

/*
 * Example 23: Spring support for message bundling.
 * 1. The MessageSourceAware interface introduces container callback method within a bean.
 * 2. The MessageSource is injected within bean which is responsible to provide local support
 */
//@ContextConfiguration(locations="classpath:pack_30_more_ioc\\pack_02_118NSupport\\context.xml")
public class MessageSourceTest {

	@Autowired
	public static OrderProcessingService orderProcessing;
	
	public static void main(String[] argv) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("pack_30_more_ioc\\pack_02_118NSupport\\context.xml");
		
		//@Autowired
		OrderProcessingService orderProcessing = ctx.getBean(OrderProcessingService.class);
		try {
			orderProcessing.placeOrder(5);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
