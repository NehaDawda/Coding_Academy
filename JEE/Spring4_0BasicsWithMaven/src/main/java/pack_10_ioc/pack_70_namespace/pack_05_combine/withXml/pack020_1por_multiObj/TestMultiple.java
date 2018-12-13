package pack_10_ioc.pack_70_namespace.pack_05_combine.withXml.pack020_1por_multiObj;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*Example 15: Use of property place holders.
 * Vital observations:
 * 	* Allows one property overriders to define values for more than one beans.
 */
public class TestMultiple {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
        "pack_10_ioc\\pack_70_namespace\\pack_05_combine\\withXml\\pack020_1por_multiObj\\ContextMain.xml");
		
		System.out.println("Container loaded.");
	
		ServiceA serviceA = (ServiceA) ctx.getBean("serviceA");
		System.out.println(serviceA);
		
		ServiceB serviceB = (ServiceB) ctx.getBean("serviceB");
		System.out.println(serviceB);
		
		ctx.close();
	}
}
