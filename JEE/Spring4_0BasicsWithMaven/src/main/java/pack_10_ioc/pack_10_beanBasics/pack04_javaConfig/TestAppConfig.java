package pack_10_ioc.pack_10_beanBasics.pack04_javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * Observe:
 * 		Why this approach?
 * 		* Individual Annotated beans can not give bird's eye view of all beans in Spring.
 * 		* Bean creation may not be a straight forward process.  May involve multiple statements.
 * 
 * 	1. A single java class configuring beans and their scopes.
 * 	2. The @Value in GlobalInvestment at field and at property level.
 * 	3. 		Despite of bean is created using 'new' operator, @Value annotation takes action.
 * 			@Value annotation on setter enforces calling a setter even if it is not called explicitly.
 * 	4.		The '@Value property' is executed lazily at last.
 * 	5. The setter method if called explicitly is executed eagerly.
 */
public class TestAppConfig {

	public static void main(String[] argv) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Container loaded.");
		
		System.out.println("Bean set 1...");
		GlobalInvestment investService1 = ctx.getBean("resourceBean", GlobalInvestment.class);
		CustomerCart cart1 = ctx.getBean("custCart", CustomerCart.class);
		
		System.out.println("\tClient side Global Investment:"+investService1.hashCode());
		System.out.println("\tClient side CustomerCart:"+cart1.hashCode());
		
		System.out.println("Bean set 2...");
		GlobalInvestment investService2 = ctx.getBean("resourceBean", GlobalInvestment.class);
		CustomerCart cart2 = ctx.getBean("custCart", CustomerCart.class);
		
		System.out.println("\tClient side Global Investment:"+investService2.hashCode());
		System.out.println("\tClient side EmpBean:"+cart2.hashCode());
		
		System.out.println(investService1);
		
		// New version declares ApplicationContext as AutoCloseable.  Better close it.
		ConfigurableApplicationContext cctx = (ConfigurableApplicationContext) ctx;
		cctx.close();
	}
}
