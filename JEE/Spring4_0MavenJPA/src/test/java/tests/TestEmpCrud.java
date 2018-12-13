package tests;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dto.Emp;
import services.EmpCrudServices;

public class TestEmpCrud {

	public static void main(String[] args) {
		ConfigurableApplicationContext springCtx1 = new ClassPathXmlApplicationContext("classpath:/springConfig.xml");

		EmpCrudServices services = (EmpCrudServices) springCtx1.getBean("empServices");
		
		
		List<Emp> empList = services.getEmpList();
		
		for(Emp emp : services.getEmpList()){
			System.out.println(emp);
		}
		
		springCtx1.close();
	}
}
