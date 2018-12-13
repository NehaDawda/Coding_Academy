package pack_10_ioc.pack_20_moreOnBeans.pack_01_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplContext {

	public static void main(String[] args) {
		// Create application context/IoC container.  Instead of classpath there can be new FileSystemResource("beans.xml");
		ApplicationContext ctx = null;
		
		///*  // Configuration at relative path
		String filePathRelative = "pack_10_ioc\\pack_20_moreOnBeans\\pack_01_lazyEager\\context.xml";
		ctx = new ClassPathXmlApplicationContext(filePathRelative);
		
		
		System.out.println("Container loaded.");
		
		///*
		// Bean with initial state configured in xml.  Using constructor-arg
		GlobalInvestment   beanResource2 = (GlobalInvestment) ctx.getBean("resourceBean");
		System.out.println(beanResource2);
		System.out.println("Hashcode at client side:"+beanResource2.hashCode());
		//*/

		((ConfigurableApplicationContext) ctx).close();
	}
}
