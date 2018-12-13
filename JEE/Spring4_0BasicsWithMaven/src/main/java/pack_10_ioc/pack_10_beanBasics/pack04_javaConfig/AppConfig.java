package pack_10_ioc.pack_10_beanBasics.pack04_javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

public class AppConfig {

	@Bean(name="resourceBean")
	@Scope ("singleton")
	public GlobalInvestment getGlobalInvestment() {
		GlobalInvestment invest = new GlobalInvestment();
		//invest.setFirmName("Chandra and Sons.");
		//System.out.println("New name is set.");
		return invest;
	}
	
	@Bean(name="custCart")
	@Scope ("prototype")
	public CustomerCart getCustomerCart() {
		return new CustomerCart();
	}
}
