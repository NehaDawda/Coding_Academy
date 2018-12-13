package pack_10_ioc.pack_70_namespace.pack_05_combine.withXml.pack030_Mpor_1Obj;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*Example 15: Use of property place holders.
 * 
 * Vital observations:
 * 	* Allows multiple property overriders.
 * 		* An object can thus be populated with values coming from multiple propertyoverriders
 * 			
 * 		* Can be used to define default values in config file and overwrite them
 * 			from property file using PropertyOverrider.
 * 		Order of initialization from property overriders depend on physical order of their configuration.
 * 			Initialization of Service 5 is done first from ValuesSetPOR1 and then ValuesSetPOR2
 * 		* If same value of Service5 (Value 3) is coming from multiple property overrider,
 * 				It will be overwritten by property overrider which is executed at last.
 */
public class TestMultiple {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
        "pack_10_ioc\\pack_70_namespace\\pack_05_combine\\withXml\\pack030_Mpor_1Obj\\ContextMain.xml");
		
		System.out.println("Container loaded.");
	
		ServiceA service = (ServiceA) ctx.getBean("serviceA");
		System.out.println(service);
		
		ctx.close();
	}
}
