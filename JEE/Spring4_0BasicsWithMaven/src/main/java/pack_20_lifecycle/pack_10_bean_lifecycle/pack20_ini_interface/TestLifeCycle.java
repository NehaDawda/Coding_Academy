package pack_20_lifecycle.pack_10_bean_lifecycle.pack20_ini_interface;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 * Example 19: Interfaces to declare container callback methods to define life cycle for a bean.
 * 1. These callbacks executed after configured setter methods are called.
 * 2. The purpose of these callbacks is to validate configuration data.
 */
public class TestLifeCycle {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext beanFact1 = new ClassPathXmlApplicationContext("pack_20_lifecycle\\pack_10_bean_lifecycle\\pack20_ini_interface\\context.xml");
		
		LeavesConfiguration emp = (LeavesConfiguration) beanFact1.getBean("leavesLimits");
	
		beanFact1.close();
	}
}
