package pack_10_ioc.pack_30_factory.pack_10_factory_method;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Example 8: Spring instantiating programmatically created singleton class
 * 1. The factory-method clause in Bean tag makes spring to rely on given factory method of a singleton class
 * 2. The spring does not use its factory mechanism.
 * 3. The 'factory-method' works only for 'static' factory method.  Observe- getResources() method must be static.
 * 3. String's declaration of prototype of such a class does not override singleton behavior.
 * 4. Arguments in the getBean() are specified only if bean is prototype.  For singleton beans, arg not allowed.
 * 
 * Hashcode observations:
 * 		* The hashcode of ResourceBundle from constructor and at client side matching.
 * 
 */
public class TestFactoryMethod {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx 
			= new ClassPathXmlApplicationContext("pack_10_ioc\\pack_30_factory\\pack_10_factory_method\\context.xml");
		System.out.println("Container loaded.");
		
		ResourceBundle bundle1 = (ResourceBundle) ctx.getBean("resourceBundle");
		System.out.println("Hashcode at client(main)"+bundle1.hashCode());
		
		ResourceBundle bundle2 = ctx.getBean("resourceBundle",	ResourceBundle.class);
		System.out.println("Hashcode at client(main)"+bundle2.hashCode());
		
		/*  Following bean definition works for Prototype beans only.
		ResourceBundle bundle3 = (ResourceBundle)ctx.getBean("resourceBundle",	"For overloaded factory method");
		System.out.println(bundle3.hashCode());
		*/
		ctx.close();
	}
}