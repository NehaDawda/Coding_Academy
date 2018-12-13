package pack_10_ioc.pack_10_beanBasics.pack02_context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*	ApplicationContext has more features than BeanFactory.
 * Aim: ApplicationContext- Singleton/Prototype, Constructor invocation, Property setting and plumbing.
 * 				Different ways of placing Configuration File.
 * 
*	ApplicationContext interface is extended from BeanFactory.
* 
* The most common way of instantiation the IoC container is by creating an ApplicationContext instance.
* Once this instance is created, the IoC container is up and running with all the singleton beans already loaded
* with other services provided by the container.
* 
 * Example 1: To understand Spring container, factory
 * 	1. Object created using no-arg constructor
 *  2. Object created using para-constructor
 *  3. Object creation and calling properties.
 *  4. Plumbing with another object
 *  5. Observe scope as Singleton/Prototype
* 
* 
* * Hashcode observation:
 * 	* Hashcode for Singleton bean from constructor and at client (main) are matching.
 * 	* Hashcode for Prototype bean from constructor and at client (main) are matching.
 * 	Inference: Scope does not lead to Proxy.
 * 
 * Lazy/Eager observations in BeanFactory...
 * 	* All singleton beans created EAGER by default while loading of container.
 * 	* All prototype beans created on demand.
 * 
 * 
*/

public class TestApplContext010 {

	public static void main(String[] args) {
		
		ApplicationContext ctx = null;
		
		///*  // Configuration at relative path
		String filePathRelative = "pack_10_ioc\\pack_10_beanBasics\\pack02_context\\context.xml";
		ctx = new ClassPathXmlApplicationContext(filePathRelative);
		//*/
		
		System.out.println("Container loaded.");
		
		///*
		// Stateless bean
		GlobalInvestment   beanResource2 = (GlobalInvestment) ctx.getBean("resourceBean2");
		//System.out.println(beanResource2);
		System.out.println("Stateless bean: Hashcode at client side:"+beanResource2.hashCode());
		
		System.out.println("----------------");
		
		// Stateful bean
		CustomerCart   custCart1 = (CustomerCart) ctx.getBean("cartBean");
		//System.out.println(custCart1);
		System.out.println("Stateful bean1: Hashcode at client side:"+custCart1.hashCode());
		
		System.out.println();
		
		CustomerCart   custCart2 = (CustomerCart) ctx.getBean("cartBean");
		System.out.println("Stateful bean2: Hashcode at client side:"+custCart2.hashCode());
		//*/
		
		// New version declares ApplicationContext as AutoCloseable.  Better close it.
		ConfigurableApplicationContext cctx = (ConfigurableApplicationContext) ctx;
		cctx.close();
	}
}
