package pack_30_more_ioc.pack_03_custom_events;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomEventTest {

	/*
	 * Example 24: Event handling in Spring
	 * 1. The EmailBean raises event and populate event data within BlacklistEvent object.
	 * 2. The event is caught asynchronously by two notifiers.
	 */
	public static void main(String[] argv) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("pack_30_more_ioc\\pack_03_custom_events\\context.xml");
		EmailBean emailer = ctx.getBean(EmailBean.class);
		
		//sending an email to a blacklisted id so that an event can be raised
		emailer.sendEmail("john@doe.org", "hello");
		
		System.out.println("\n");
		emailer.sendEmail("cbdesh@yahoo.com", "Hello, how are you?");
	}
}
