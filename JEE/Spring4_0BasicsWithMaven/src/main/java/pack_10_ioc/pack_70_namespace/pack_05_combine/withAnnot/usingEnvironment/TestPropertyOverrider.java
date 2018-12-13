package pack_10_ioc.pack_70_namespace.pack_05_combine.withAnnot.usingEnvironment;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPropertyOverrider {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmpDao emp = (EmpDao) ctx.getBean("empList");
	
		for(Emp l : emp.getAllEmps()){
			System.out.println(l);
		}
		
		ctx.close();
	}
}
