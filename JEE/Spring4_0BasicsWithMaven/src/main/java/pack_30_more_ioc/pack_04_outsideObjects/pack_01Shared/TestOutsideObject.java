package pack_30_more_ioc.pack_04_outsideObjects.pack_01Shared;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestOutsideObject {

	public static void main(String[] args) {
	
		// Using BeanFactory
		/*
		Services services = new Services();
		BeanFactory ctx = new XmlBeanFactory(new ClassPathResource("pack_30_more_ioc\\pack_04_outsideObjects\\pack_01Shared\\context.xml"));
		
		((AutowireCapableBeanFactory)ctx).applyBeanPropertyValues(services, "services");
		System.out.println(services.getName());
		System.out.println(services);
		*/
		
		///*
		// Using ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext("pack_30_more_ioc\\pack_04_outsideObjects\\pack_01Shared\\context.xml");
		AutowireCapableBeanFactory autowirable = ctx.getAutowireCapableBeanFactory();
		
		Services services11= new Services();
		autowirable.applyBeanPropertyValues(services11, "services1");
		
		System.out.println(services11.getName());
		System.out.println(services11);
		
		Services services22 = new Services();
		autowirable.applyBeanPropertyValues(services22, "services2");
		autowirable.autowireBeanProperties(services22, AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE, false);
		// The boolean parameter: Whether to check dependency check?
		
		System.out.println(services22.getName());
		System.out.println(services22);
		//*/
	}
}
