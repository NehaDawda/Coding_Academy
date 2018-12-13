package pack_10_ioc.pack_10_beanBasics.pack02_context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

/*	 
 * This exercise demonstrates 
 * 	Three ways of placing configuration file...
 * 			ClassPathResource
 * 			FileSystemResource: Change absolute path.
 * 			UrlResource: Share path01_beanFact folder and then test.
*/

public class TestApplContext020 {

	public static void main(String[] args) {
		
		ApplicationContext ctx = null;
		
		///*  // Configuration at relative path
		String filePathRelative = "pack_10_ioc\\pack_10_beanBasics\\pack02_context\\context.xml";
		ctx = new ClassPathXmlApplicationContext(filePathRelative);
		//*/
		
		/*	// Configuration at absolute path
		String filePathAbsolute = "F:\\Spring\\Spring4.0.9Environment\\SpringWSMaven\\Spring4_0Basics\\src\\main\\java\\pack_10_ioc\\pack_10_beanBasics\\pack02_context\\context.xml";
		ctx = new FileSystemXmlApplicationContext(filePathAbsolute);
		*/
		/*  // Configuration from URL.  Need to share following folder on network.
		String filePathUrl = "file:\\\\CHANDRALAPTOP\\pack02_context\\context.xml";
		ctx = new FileSystemXmlApplicationContext(filePathUrl);
		*/
		
		System.out.println("Container loaded.");
		
		///*
		// Bean with initial state configured in xml.  Using constructor-arg
		GlobalInvestment   beanResource2 = (GlobalInvestment) ctx.getBean("resourceBean2");
		System.out.println(beanResource2);
		System.out.println("Hashcode at client side:"+beanResource2.hashCode());
		//*/
		
		// New version declares ApplicationContext as AutoCloseable.  Better close it.
		ConfigurableApplicationContext cctx = (ConfigurableApplicationContext) ctx;
		cctx.close();
	}
}
