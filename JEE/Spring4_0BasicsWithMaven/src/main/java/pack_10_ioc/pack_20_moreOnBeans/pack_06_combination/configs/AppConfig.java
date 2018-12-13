package pack_10_ioc.pack_20_moreOnBeans.pack_06_combination.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

import pack_10_ioc.pack_20_moreOnBeans.pack_06_combination.daos.EmpDao;
import pack_10_ioc.pack_20_moreOnBeans.pack_06_combination.services.EmpReports;
import pack_10_ioc.pack_20_moreOnBeans.pack_06_combination.services.IGlobInvestment;

import javax.annotation.Resource;

@Configuration
@ImportResource(value={"pack_10_ioc\\pack_20_moreOnBeans\\pack_06_combination\\configs\\ContextMain.xml", "pack_10_ioc\\pack_20_moreOnBeans\\pack_06_combination\\configs\\ContextDB.xml"})
@ComponentScan(basePackages="pack_10_ioc\\pack_20_moreOnBeans\\pack_06_combination\\services")
public class AppConfig {

	///*
	// Uncomment following code for testing Autowiring and bean creation in AppConfig
	@Resource
	private EmpDao empDao;
	
	@Resource
	private IGlobInvestment globInvestment;
	
	@Bean(name="empReports")
	@Scope ("prototype")
	public EmpReports getCustomerCart() {
		
		EmpReports reports = new EmpReports(empDao);
		reports.setGlobalInvestment(globInvestment);
		
		return reports;
	}
	//*/
}
