package pack_10_ioc.pack_10_beanBasics.pack01_beanFact;

/* This exercise demonstrates how spring framework facilitate object creation
 * by specifying details of object within configuration file.
 * It also demonstrates the ways to initialize object state.
 */

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import org.springframework.core.io.Resource;

/*	BeanFactory is an implementation now deprecated.
 * Aim: Beanfactory- Singleton, Constructor invocation, Property setting and plumbing.
 * 
* The Container in Spring Framework is just an instance of BeanFactory interface or any of its child interfaces.
* The instance of type BeanFactory or its child is basically a factory mechanism and not really a container in real sense.
* Is it container less container?
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
 *  5. Observe scope is Singleton
* 
* 
* * Hashcode observation:
 * 	* Hashcode for Singleton bean from constructor and at client (main) are matching.
 * 	Inference: Scope does not lead to Proxy.
 * 
 * Lazy/Eager observations in BeanFactory...
 * 	* All singleton beans created LAZY after loading of container.
*/

public class TestBeanFactory010 {
	public static void main(String[] args)  {
		// Create application context/IoC container.  Instead of classpath there can be new FileSystemResource("beans.xml");
		
		// Configuration at relative path
		String filePathRelative = "pack_10_ioc\\pack_10_beanBasics\\pack01_beanFact\\context.xml";
		Resource resource = new ClassPathResource(filePathRelative);
		
		BeanFactory beanFact = new XmlBeanFactory(resource);
		
		System.out.println("Container loaded.");
		///*
		// Get the bean from IoC container.  Observe singleton ness.
		GlobalInvestment   beanResource1 = (GlobalInvestment) beanFact.getBean("resourceBean1");
		System.out.println("Hashcode at client side:"+beanResource1.hashCode());	// Bean is ready
		
		GlobalInvestment   beanResource2 = (GlobalInvestment) beanFact.getBean("resourceBean1");
		System.out.println("Hashcode at client side:"+beanResource2.hashCode());	// Bean is ready
		System.out.println(beanResource1);
		//*/
		/*
		// Bean with initial state configured in xml.  Using constructor-arg
		GlobalInvestment   beanResource2 = (GlobalInvestment) beanFact.getBean("resourceBean2");
		System.out.println("Hashcode at client side:"+beanResource2.hashCode());
		System.out.println(beanResource2);
		*/
	}
}