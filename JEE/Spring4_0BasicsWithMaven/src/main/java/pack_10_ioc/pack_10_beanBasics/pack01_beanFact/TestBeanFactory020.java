package pack_10_ioc.pack_10_beanBasics.pack01_beanFact;

import java.net.MalformedURLException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

/* This exercise demonstrates 
 * 	Three ways of placing configuration file...
 * 			ClassPathResource
 * 			FileSystemResource: Change absolute path.
 * 			UrlResource: Share path01_beanFact folder and then test.
 */

public class TestBeanFactory020 {
	public static void main(String[] args) throws MalformedURLException  {
		// Create application context/IoC container.  Instead of classpath there can be new FileSystemResource("beans.xml");
		
		/*  // Configuration at relative path
		String filePathRelative = "pack_10_ioc\\pack_10_beanBasics\\pack01_beanFact\\context.xml";
		Resource resource = new ClassPathResource(filePathRelative);
		*/
		///*	// Configuration at absolute path
		String filePathAbsolute = "F:\\Spring\\Spring4.0.9Environment\\SpringWSMaven\\Spring4_0Basics\\src\\main\\java\\pack_10_ioc\\pack_10_beanBasics\\pack01_beanFact\\context.xml";
		Resource  resource = new FileSystemResource(filePathAbsolute);
		//*/
		/*
		String filePathUrl = "file:\\\\CHANDRALAPTOP\\pack01_beanFact\\context.xml";
		Resource  resource = new UrlResource(filePathUrl);
		*/
		BeanFactory beanFact = new XmlBeanFactory(resource);
		
		System.out.println("Container loaded.");
		///*
		// Get the bean from IoC container
		GlobalInvestment   beanResource1 = (GlobalInvestment) beanFact.getBean("resourceBean1");
		System.out.println("Hashcode at client side:"+beanResource1.hashCode());	// Bean is ready
		//*/
		/*
		// Bean with initial state configured in xml.  Using constructor-arg
		GlobalInvestment   beanResource2 = (GlobalInvestment) beanFact.getBean("resourceBean2");
		System.out.println(beanResource2);
		System.out.println("Hashcode at client side:"+beanResource2.hashCode());
		*/
	}
}