package pack_10_ioc.pack_70_namespace.pack_04_property_override;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*Example 16: Use of property override configurer
 * 1. Observe, db_config.xml the definition of Driver Manager datasource.  No property is set.
 * 		Its all properties are automatically set through PropertyOverrideConfigurer.
 * 2. Every property is identified by Datasource definition id and property name.
 * 3. All property names and their values are declared in db2.properties.
 */
public class TestPropertyOverrider {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
        "pack_10_ioc\\pack_70_namespace\\pack_04_property_override\\ContextMain.xml");
		
		EmpDao emp = (EmpDao) ctx.getBean("empList");
	
		for(Emp l : emp.getAllEmps()){
			System.out.println(l);
		}
		
		ctx.close();
	}
}
