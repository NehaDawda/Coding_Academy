package pack_10_ioc.pack_70_namespace.pack_05_combine.withXml.pack010_1ph_multiObj;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*Example 15: Use of property place holders.
 * Vital observations:
 * 	* Does not allow more than one Property place holder in one container.  
 * 		If given, recognizes first one and ignores second one.
 * 		Multiple objects can be populated from a Property place holder.
 * 			(Observe Service1 and Service2 populated from application1.property)
 * 		Multiple objects can procure same value from property place holder.
 */
public class TestMultiple {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
        "pack_10_ioc\\pack_70_namespace\\pack_05_combine\\withXml\\pack010_1ph_multiObj\\ContextMain.xml");
		
		System.out.println("Container loaded.");
		
		ServiceA service1 = (ServiceA) ctx.getBean("serviceA");
		System.out.println(service1);
		
		ServiceB service2 = (ServiceB) ctx.getBean("serviceB");
		System.out.println(service2);
		
		ctx.close();
	}
}
