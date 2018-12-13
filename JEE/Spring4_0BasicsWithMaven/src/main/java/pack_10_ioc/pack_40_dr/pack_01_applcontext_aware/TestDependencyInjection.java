package pack_10_ioc.pack_40_dr.pack_01_applcontext_aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 * Example 12: Injecting ApplicationContext within bean
 * 1. Purpose of ApplicationContext within bean.
 * 2. What is ApplicationContextAware interface?
 * 3. How container injects context reference while going through bean creation steps.
 * 4. What is Dependency Relationship?
 * 
 * Hashcode observations:
 * 	* No proxy for NewsPrintManager and TodaysNews.
 * 
 * Eager/Lazy creation
 * 	* NewsPrintManager loaded eagerly while TodaysNews loaded on demand(Prototype).
 */
public class TestDependencyInjection {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("pack_10_ioc\\pack_40_dr\\pack_01_applcontext_aware\\context.xml");
		System.out.println("Container loaded.");
		NewsPrintManager acc = (NewsPrintManager) ctx.getBean("news_print_manager");
		System.out.println("Hashcode for NewsPrintManager from client(Main)"+acc.hashCode());
		acc.printNews();
	
		acc = (NewsPrintManager) ctx.getBean("news_print_manager");
		System.out.println("Hashcode for NewsPrintManager from client(Main)"+acc.hashCode());
		acc.printNews();
		
		//BankAcc bacc = beanFact.getBean("bankacc",	BankAcc.class);
	}
}