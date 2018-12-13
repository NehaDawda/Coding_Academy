package pack_10_ioc.pack_30_factory.pack_20_factory_pattern02;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*Example 10: Spring using parameterized factory to create beans.
 * 1. When to use parameterised factory to create beans?
 * 2. How to pass parameters to factory class from client side?
 * 3. Passing multiple parameters with overloaded factory methods in factory class.
 * 4. Arguments in the bean are allowed only if bean is prototype.
 * 5. Thumb rule: An additional parameter can be passed through getBean() only for prototype beans.
 * 
 * Hashcode observations:
 * 	* No proxy.  The BankAcc, SavingAcc and CurrentAcc hash Code at construction matching with client side.
 * 
 * Eager/Lazy observations:
 * 	* Factory loaded eagerly as it is being singleton.  Other beans on demand (As they are prototype).
 */
public class TestFactoryPattern {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("pack_10_ioc\\pack_30_factory\\pack_20_factory_pattern02\\context.xml");
		System.out.println("Container loaded.");
		BankAcc acc1 = (BankAcc) ctx.getBean("bankacc", "savings");
		System.out.println("Bean:"+acc1+" Hashcode:"+acc1.hashCode());
		
		BankAcc acc2 = (BankAcc) ctx.getBean("bankacc", "savings", "Chandra");
		System.out.println("Bean:"+acc2+" Hashcode:"+acc2.hashCode());
		
		BankAcc acc3 = (BankAcc) ctx.getBean("bankacc", "current", "Mantra", 10000); // The second para can be of different type
		System.out.println("Bean:"+acc3+" Hashcode:"+acc3.hashCode());
		
		ctx.close();
	}
}