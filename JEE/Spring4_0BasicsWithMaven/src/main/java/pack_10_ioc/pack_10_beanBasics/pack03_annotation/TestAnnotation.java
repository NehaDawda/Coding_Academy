package pack_10_ioc.pack_10_beanBasics.pack03_annotation;

/* This exercise demonstrates how spring framework facilitate object creation
 * by specifying details of object within configuration file.
 * It also demonstrates the ways to initialize object state.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* Example 3. To configure singleton and prototype beans through annotations.
* Spring provides factory for beans.
* 		Observe 'componentScan' in context.xml
* 
* 		Observe @Component annotation to declare a bean and add into context.
* 
* 		Observe @Scope to declared bean as Singleton or prototype.
* 		The scope attribute in xml file or @Scope annotation meet the purpose of definition.
* 
* 		Observe, @Value annotation.
* 		This annotation on field initializes field first than setter methods.
* 		This annotation on setter method overrides field initialization.
* 
* 	Hashcode observation:
 * 	* Hashcode for Prototype bean from constructor and at client (CustomerCart) are matching.
 * 	* Hashcode for Singleton bean from constructor and at client (GlobalInvestment) are matching.
 * 	Inference: Scope does not lead to Proxy.
 * 
 * Lazy/Eager observations...
 * 	* All singleton beans created EAGER while loading of container.
 * 	* All prototype beans created on demand.
*/

public class TestAnnotation {
	public static void main(String[] args) {
		
		ApplicationContext ctx = null;
		
		///*  // Configuration at relative path
		String filePathRelative = "pack_10_ioc\\pack_10_beanBasics\\pack03_annotation\\context.xml";
		ctx = new ClassPathXmlApplicationContext(filePathRelative);
		
		System.out.println("Container ready.");
		///*
		// Statefull bean
		CustomerCart   cartBean1 = (CustomerCart) ctx.getBean("custCart");
		CustomerCart   cartBean2 = (CustomerCart) ctx.getBean("custCart");
		System.out.println("Hashcode prototype Bean 1: "+cartBean1.hashCode());
		System.out.println("Hashcode prototype Bean 2: "+cartBean2.hashCode());
		//*/
		
		///*
		// Stateless bean
		GlobalInvestment   beanResource1 = (GlobalInvestment) ctx.getBean("resourceBean");
		GlobalInvestment   beanResource2 = (GlobalInvestment) ctx.getBean("resourceBean");
		System.out.println("Hashcode singleton Bean 1: "+beanResource1.hashCode());
		System.out.println("Hashcode singleton Bean 2: "+beanResource2.hashCode());
		//*/
		
		///*
		// Observe, @Value annotation.
		System.out.println(beanResource1);
		
		//*/
		// New version declares ApplicationContext as AutoCloseable.  Better close it.
		ConfigurableApplicationContext cctx = (ConfigurableApplicationContext) ctx;
		cctx.close();
	}
}