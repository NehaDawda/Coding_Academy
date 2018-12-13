package pack_10_ioc.pack_10_beanBasics.pack05_progConfig;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class AppConfig {

	public static ApplicationContext getApplicationContext() {
		GenericApplicationContext ctx = new GenericApplicationContext();
		 
		BeanDefinitionBuilder builderA = BeanDefinitionBuilder
		    .rootBeanDefinition(GlobalInvestment.class)
		    .addPropertyValue("firmName", "Gobal Investment Pvt. Ltd.")
		    .addPropertyValue("companyMotto", "Ladder of success")
		    .setScope("singleton");
		
		ctx.registerBeanDefinition("resourceBean", builderA.getBeanDefinition());
		 
		BeanDefinitionBuilder builderB = BeanDefinitionBuilder
				.rootBeanDefinition(CustomerCart.class)
				.setScope("prototype");
		    
		ctx.registerBeanDefinition("custCart", builderB.getBeanDefinition());
		 
		ctx.refresh();
		return ctx;
	}
}
