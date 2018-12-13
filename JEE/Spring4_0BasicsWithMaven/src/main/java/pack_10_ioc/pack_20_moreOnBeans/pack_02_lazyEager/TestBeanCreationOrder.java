package pack_10_ioc.pack_20_moreOnBeans.pack_02_lazyEager;

/* This exercise demonstrates how spring framework facilitate object creation
 * by specifying details of object within configuration file.
 * It also demonstrates the ways to initialize object state.
 */

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * By default, Application context creates Singleton bean eagerly.
 * 
 */

public class TestBeanCreationOrder {
	public static void main(String[] args) {
		
		String filePathRelative = "pack_10_ioc\\pack_20_moreOnBeans\\pack_02_lazyEager\\context.xml";
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(filePathRelative);
		
		System.out.println("Container ready.");
		///*
		// Get the bean from IoC container
		EmpDao   empBean1 = (EmpDao) ctx.getBean("empDao");
		EmpDao   empBean2 = (EmpDao) ctx.getBean("empDao");
		System.out.println("Hashcode prototype Bean 1: "+empBean1.hashCode());
		System.out.println("Hashcode prototype Bean 2: "+empBean2.hashCode());
		//*/
		
		///*
		// Bean with initial state configured in xml.  Using constructor-arg
		GlobalInvestment   beanResource1 = (GlobalInvestment) ctx.getBean("resourceBean");
		GlobalInvestment   beanResource2 = (GlobalInvestment) ctx.getBean("resourceBean");
		System.out.println("Hashcode singleton Bean 1: "+beanResource1.hashCode());
		System.out.println("Hashcode singleton Bean 2: "+beanResource2.hashCode());
		//*/
		
		System.out.println(beanResource1);
		
		ctx.close();
	}
}