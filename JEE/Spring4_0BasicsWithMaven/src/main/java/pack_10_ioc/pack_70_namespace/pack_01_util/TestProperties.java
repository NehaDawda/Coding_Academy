package pack_10_ioc.pack_70_namespace.pack_01_util;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 * Example 13: Util namespace to get properties object.
 */
public class TestProperties {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
        "pack_10_ioc\\pack_70_namespace\\pack_01_util\\context.xml");
		
		Services service = (Services) ctx.getBean("services");
	
		System.out.println("IP for data_server"+service.getIp("data_server"));
	}
}
