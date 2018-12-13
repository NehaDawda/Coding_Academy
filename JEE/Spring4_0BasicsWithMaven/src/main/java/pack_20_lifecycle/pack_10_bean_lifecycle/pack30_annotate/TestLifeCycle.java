package pack_20_lifecycle.pack_10_bean_lifecycle.pack30_annotate;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 * Example 20: Annotations for resource initialization and resource releasing.
 * 1. These are standard annotations.
 * 2. Observe order of call back methods PostConstruct and afterPropertySet.
 */
public class TestLifeCycle {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext beanFact = new ClassPathXmlApplicationContext(
        "pack_20_lifecycle\\pack_10_bean_lifecycle\\pack30_annotate\\context.xml");
		
		LeavesConfiguration limits = (LeavesConfiguration) beanFact.getBean("leavesLimits");
		System.out.println(limits);
		
		beanFact.close();
	}
}