package pack_10_ioc.pack_20_moreOnBeans.pack_04_autowiring.pack_30_wireAnnot;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * With @Component annotation at class level, the bean may not be declared within XML.
 * 	The @Component without name of a bean does not pickup class name by default
 *  
 *  The @Component annotation has 4 sub annotations: (1)@Service, (2)@Repository, (3)@Controller and (4)@RestController.
 *  	The (3) and (4) are usefull in Spring-MVC and Spring-REST respectively.
 * 
 * 	The @Autowire annotation
 * 		By default goes by type.  For going by Name, needs @Qualifier(Of Spring API and not of javax.inject API.)
 * 
 * 	The @Inject annotation
 * 		By default goes by type.  
 */

/* Example 6: To understand autowiring using annotations.
 * 1. Annotations @Autowired, @Resource, @Inject by default
 * 		By type.
 * 2. @Autowired and @Inject to be qualified with @Qualifier for ByName
 * 
 * 	  * @Autowired and @Inject are similar.
 * 
 * 3. @Resourse: Goes byType by default.  But if byType fails, picks up method name to search for resource in Context.
 * 			Needs "name" attribute to force it to go by Name.
 * 			Is not applicable on Constructor.

 * *. The 'byType' is possible on subclass also.  Observe for GlobalInventment, its interface type is being autowired.
 * 
 * 	Inference: Resource Annotation does not lead to proxy.
 * 				Autowired(ByType and ByName) does not lead to proxy.
 * 

 */
public class TestDependency {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
        "pack_10_ioc\\pack_20_moreOnBeans\\pack_04_autowiring\\pack_30_wireAnnot\\Maincontext.xml");
		
		System.out.println("Container loaded..");
		EmpDao emp = (EmpDao) ctx.getBean("empDao");
	
		for(Emp l : emp.getAllEmps()){
			System.out.println(l);
		}
		System.out.println("Hashcode EmpDao from client"+emp.hashCode());
		
		ctx.close();
	}
}