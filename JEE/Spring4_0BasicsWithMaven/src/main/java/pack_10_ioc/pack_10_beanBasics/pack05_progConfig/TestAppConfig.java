package pack_10_ioc.pack_10_beanBasics.pack05_progConfig;

import org.springframework.context.ApplicationContext;

/*
 * This approach is for extreme dynamism.  Every part of configuration can be done through java code.
 * 		@ Value annotation does not work here.
 */
public class TestAppConfig {
	public static void main(String[] argv) {
		ApplicationContext ctx = AppConfig.getApplicationContext();
		
		System.out.println("Container loaded.");
		System.out.println("Bean set 1...");
		GlobalInvestment investService1 = ctx.getBean("resourceBean", GlobalInvestment.class);
		CustomerCart cart1 = ctx.getBean("custCart", CustomerCart.class);
		
		System.out.println("\tClient side Global Investment:"+investService1.hashCode());
		System.out.println("\tClient side CartBean:"+cart1.hashCode());
		
		System.out.println("Bean set 2...");
		GlobalInvestment investService2 = ctx.getBean("resourceBean", GlobalInvestment.class);
		CustomerCart cart2 = ctx.getBean("custCart", CustomerCart.class);
		
		System.out.println("\tClient side Global Investment:"+investService2.hashCode());
		System.out.println("\tClient side CartBean:"+cart2.hashCode());
		
		System.out.println(investService1);
	}
}
