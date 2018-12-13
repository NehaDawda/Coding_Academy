package pack_10_ioc.pack_30_factory.pack_20_factory_pattern01;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 * Example 9: Spring using factory class to instantiate objects.
 * 1. The factory-bean clause and factory-method clause makes spring to use factory class to instantiate beans.
 * 2. This approach demands factory method as non-static.
 */
public class TestFactoryPattern {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("pack_10_ioc\\pack_30_factory\\pack_20_factory_pattern01\\context.xml");
		System.out.println("Container loaded.");
		
		BankAcc acc = (BankAcc) ctx.getBean("savingsAcc", "Suresh");
		System.out.println("Hashcode Savings from client(main):"+acc.hashCode());
		System.out.println(acc);
		
		BankAcc bacc = (BankAcc) ctx.getBean("currentAcc",	"Ramesh");
		System.out.println("Hashcode Current from client(main):"+bacc.hashCode());
		System.out.println(bacc);
		
		acc = (BankAcc) ctx.getBean("savingsAcc", "Suresh");
		System.out.println("Hashcode Savings from client(main):"+acc.hashCode());
		System.out.println(acc);
		
		ctx.close();
	}
}