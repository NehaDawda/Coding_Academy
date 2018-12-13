package pack_10_ioc.pack_20_moreOnBeans.pack_03_inherit.withAnnot;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Example 7: To set inheritance relation in xml.  To declare class as abstract in xml.
 * 1. How to prevent spring from trying to instantiate abstract class?
 * 2. How to initialize state of instance fields of super class while instantiating subclass object.
 * 3. Even if class is not abstract, its instantiation can be prevented by declaring 'abstract' clause.
 * 
 * Hashcode observations...
 * 	* The hashcode in constructor and at client side are same for SavingsAcc.
 * 
 */
public class TestInheritance {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("pack_10_ioc\\pack_20_moreOnBeans\\pack_03_inherit\\withAnnot\\context.xml");
		System.out.println("Container loaded.");
		
		//GlobalInvestment ba = ctx.getBean("globalInvest", GlobalInvestment.class);
		
		LocalInvestment acc = (LocalInvestment) ctx.getBean("localInvest");
		System.out.println("Object:"+acc+" \nHashcode at client(main):"+acc.hashCode());
		
		GlobalInvestment bacc = ctx.getBean("localInvest",	GlobalInvestment.class);
		
		System.out.println(bacc);
		
		ctx.close();
	}
	
	
}