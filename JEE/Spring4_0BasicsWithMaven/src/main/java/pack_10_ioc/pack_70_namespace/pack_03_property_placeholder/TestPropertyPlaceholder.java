package pack_10_ioc.pack_70_namespace.pack_03_property_placeholder;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*Example 15: Use of property place holders.
 * 1. Observe db_config.xml to see how property place holders are used.
 * 2. The property values for these place holders are declared within db.properties file.
 * 3. Observe bean definition for PropertyPlaceholderConfigurer which populates properties from db.properties.
 */
public class TestPropertyPlaceholder {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
        "pack_10_ioc\\pack_70_namespace\\pack_03_property_placeholder\\ContextMain.xml");
		
		System.out.println("Container loaded.");
		
		EmpDao emp = (EmpDao) ctx.getBean("empList");
	
		for(Emp l : emp.getAllEmps()){
			System.out.println(l);
		}
		System.out.println("Hashcode of EmpDao from client(main):"+emp.hashCode());
		
		ctx.close();
	}
}
