package pack_20_lifecycle.pack_10_bean_lifecycle.pack40_beanFactoryPostProcessor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Observations:
 * 		The ApplicationContext auto-detect implementation of interface BeanFactoryPostProcessor out of beans
 * 			declared in context.
 * 		This interface provides a factory hook for modifying context loaded by ApplicationContext.
 * 		Observe the output...
 * 			1. Application Context after loading configuration creating context but not beans, identifies
 * 				bean implementation of above said interface.  Instantiate it and calls factory hook.
 * 			2. In factory hook, number of beans declared in  configuration file can be known.
 * 					But as beans are yet to be instantiated (except BeanFactoryPostProcessor), beans are not accessible.
 */
public class LifecycleTest {

	public static void main(String[] argv) {
		System.out.println("Before loading the IoC container..");
		
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("pack_20_lifecycle\\pack_10_bean_lifecycle\\pack40_beanFactoryPostProcessor\\context.xml");
		
		SampleBean1 sb1 = ctx.getBean("sample1", SampleBean1.class);
		System.out.println(sb1);
		
		SampleBean2 sb2 = ctx.getBean("sample2", SampleBean2.class);
		System.out.println(sb2);
		
		SampleBean3 sb3 = ctx.getBean("sample3", SampleBean3.class);
		System.out.println(sb3);
		
		ctx.close();
	}
}