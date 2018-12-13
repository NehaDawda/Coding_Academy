package pack_20_lifecycle.pack_10_bean_lifecycle.pack40_beanPostProcessors;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class LifecycleTest {

	public static void main(String[] argv) {
		System.out.println("Before loading the IoC container..");
		
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("pack_20_lifecycle\\pack_10_bean_lifecycle\\pack40_beanPostProcessors\\context.xml");
		
		ISampleBean1 sb1 = ctx.getBean("sample1", ISampleBean1.class);
		
		System.out.println(sb1);
		
		ctx.close();
	}
}