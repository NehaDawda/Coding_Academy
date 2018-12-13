package pack_40_aop.pack_10_aspect.pack_30_aspect_order;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pack_40_aop.pack_10_aspect.pack_joinpoints.pack_dao.EmployeeDao;

/* Example 29: Point cuts through annotations.
 * Refer: applicationContext2.xml, EmployeeDao.java
 *  To understand AOP pointcut in advice class
 * 	To understand default order of multiple advice on a join point
 *  To understand defined order of multiple advice on a join point
 */

public class Test2_3 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("pack_40_aop\\pack_10_aspect\\pack_30_aspect_order\\applicationContext2_3.xml");
		
		// Step II and III
		EmployeeDao e = (EmployeeDao) ctx.getBean("empDao");
		
		// Methods set with Around advice with pointcut in advice
		e.save();
	}
}
