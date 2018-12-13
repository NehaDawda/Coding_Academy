package pack_10_ioc.pack_20_moreOnBeans.pack_00_constructor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestConstructor {

	public static void main(String[] args) {
		String filePathRelative = "pack_10_ioc\\pack_20_moreOnBeans\\pack_00_constructor\\context.xml";
		
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(filePathRelative);
		System.out.println("Container loaded.");
		
		
		GlobalInvestment   beanResource = (GlobalInvestment) ctx.getBean("resourceBean");
		System.out.println("\n\n"+beanResource);
		
		ctx.close();
	}
}
