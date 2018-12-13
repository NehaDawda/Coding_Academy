package pack_10_ioc.pack_20_moreOnBeans.pack_07_cyclicDependency.solution1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Instead of Constructor injection, preferring Setter injection as a solution.
 * 		Even Lazy initialization also gets resolved with this problem.
 */
public class TestProblemCyclicRelation {

	public static void main(String[] args) {
		String filePathRelative = "pack_10_ioc\\pack_20_moreOnBeans\\pack_07_cyclicDependency\\solution1\\context.xml";
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(filePathRelative);
		System.out.println("Container loaded.");
		
		// Following code throws exception- 
		//		Error creating bean with name 'serviceA': Requested bean is currently in creation: Is there an unresolvable circular reference?
		ServiceA serviceA = (ServiceA) ctx.getBean("serviceA");
		ServiceB serviceB = (ServiceB) ctx.getBean("serviceB");
		
		System.out.println("Beans created.");
		ctx.close();
	}
}
