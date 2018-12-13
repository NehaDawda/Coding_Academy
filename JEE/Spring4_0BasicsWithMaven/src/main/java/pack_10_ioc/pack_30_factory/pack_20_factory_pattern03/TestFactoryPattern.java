package pack_10_ioc.pack_30_factory.pack_20_factory_pattern03;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*Example 11: Spring's factory pattern support
 * 1. Using interface FactoryBean
 * 2. Writing getObject method to create complex objects.
 * 3. Singleton: Return 'true' from MyFactory.isSingleton()
 * 4. Prototype: Return 'false' from MyFactory.isSingleton()
 * 
 * Hashcode observations:
 * 	* No proxy.  The BankAcc, SavingAcc and CurrentAcc hash Code at construction matching with client side.
 * 
 * Eager/Lazy observations:
 * 	* Factory loaded eagerly.  Other beans on demand (As they are prototype).
 */
public class TestFactoryPattern {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("pack_10_ioc\\pack_30_factory\\pack_20_factory_pattern03\\context.xml");
		System.out.println("Container loaded.");
		
		BankAcc acc1 = ctx.getBean("myfactory", BankAcc.class);
		System.out.println("Hashcode at client(main)"+acc1.hashCode());
		
		BankAcc acc2 = (BankAcc) ctx.getBean("myfactory");
		System.out.println("Hashcode at client(main)"+acc2.hashCode());
	}
}