package pack_10_ioc.pack_20_moreOnBeans.pack_06_combination.tests;

/* 
 * Data source has been defined in ContextDB.xml
 * EmpDao has been defined in ContextMain.xml.
 * 		It is depending on DataSource.
 * 
 * GlobalInvestment has been declared through annotation.
 * 
 * AppConfig:
 * 	Imports resource: ContextDB and ContextMain
 *  Sets component scan to GlobalInvestment.
 *  Does autowiring for EmpDao and GlobalInvestment.
 *  
 * 
 */

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pack_10_ioc.pack_20_moreOnBeans.pack_06_combination.configs.AppConfig;
import pack_10_ioc.pack_20_moreOnBeans.pack_06_combination.daos.Emp;
import pack_10_ioc.pack_20_moreOnBeans.pack_06_combination.daos.EmpDao;
import pack_10_ioc.pack_20_moreOnBeans.pack_06_combination.services.EmpReports;
import pack_10_ioc.pack_20_moreOnBeans.pack_06_combination.services.IGlobInvestment;

public class TestCombination {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Container loaded.");
		
		/*  
		System.out.println("Get annotated bean through XML configuration.");
		IGlobInvestment investService = ctx.getBean("resourceBean", IGlobInvestment.class);
		System.out.println(investService);
		
		System.out.println("\n\nGet XML configured bean which imports DataSource from another XML configuration.");
		EmpDao emp = (EmpDao) ctx.getBean("empDao");
	
		for(Emp l : emp.getAllEmps()){
			System.out.println(l);
		}
		*/
		///*  
		// Procure bean from factory code declared in AppConfig.
		// Uncomment autowiring and bean definition from AppConfig. 
		System.out.println("\n\nGet bean defined in AppConfig as @Bean annotation.");
		EmpReports empReports = (EmpReports)ctx.getBean("empReports");
		empReports.prepareReport();
		//*/
		ctx.close();
	}
}