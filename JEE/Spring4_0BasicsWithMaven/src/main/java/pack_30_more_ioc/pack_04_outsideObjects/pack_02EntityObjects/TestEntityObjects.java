package pack_30_more_ioc.pack_04_outsideObjects.pack_02EntityObjects;

import java.util.List;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEntityObjects {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("pack_30_more_ioc\\pack_04_outsideObjects\\pack_02EntityObjects\\context.xml");
		AutowireCapableBeanFactory autowirable = ctx.getAutowireCapableBeanFactory();
		
		EmpDao empDao = new EmpDao();
		List<Emp> emps = empDao.getEmps();
		
		for(Emp emp : emps){
			autowirable.applyBeanPropertyValues(emp, "emp");
			autowirable.autowireBeanProperties(emp, AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE, false);
		}
		
		for(Emp emp : emps){
			emp.applyService();
		}
	}

}
