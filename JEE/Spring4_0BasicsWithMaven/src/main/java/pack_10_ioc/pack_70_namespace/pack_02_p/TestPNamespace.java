package pack_10_ioc.pack_70_namespace.pack_02_p;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 * Example 14: The 'p' namespace to reduce verbosity of xml file.
 * 1. Observe db_config.xml where in property clause is replaced by 'p' clause.
 * 2. Observe context01.xml wherein 'p' namespace is used for custom class.
 * 
 * Hashode observations:
 * 	* EmpDao loaded eagerly.
 */
public class TestPNamespace {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
        "pack_10_ioc\\pack_70_namespace\\pack_02_p\\ContextMain.xml");
		
		System.out.println("Container loaded.");
		EmpDao emp = (EmpDao) ctx.getBean("empList");
	
		for(Emp l : emp.getAllEmps()){
			System.out.println(l);
		}
		System.out.println("Hashcode of EmpDao at client(main)"+emp.hashCode());
		
		ctx.close();
	}
}
