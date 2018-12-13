package pack_10_ioc.pack_20_moreOnBeans.pack_04_autowiring.pack_20_wireXml;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestDependency {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
        "pack_10_ioc\\pack_20_moreOnBeans\\pack_04_autowiring\\pack_20_wireXml\\ContextMain.xml");
		
		System.out.println("Container loaded.");
		EmpDao emp = (EmpDao) ctx.getBean("empList");
	
		for(Emp l : emp.getAllEmps()){
			System.out.println(l);
		}
		
		ctx.close();
	}
}