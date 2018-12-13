package pack_30_more_ioc.pack_03_custom_events;

import org.springframework.context.ApplicationListener;

public class BlacklistNotifier1 implements ApplicationListener<BlacklistEvent>{
	String notificationAddress;
	
	public void setNotificationAddress(String notificationAddress) {
		this.notificationAddress = notificationAddress;
	}

	public void onApplicationEvent(BlacklistEvent event) {
		String blackListedEmailAddr = event.getAddress();
		EmailBean eb =(EmailBean) event.getSource();
		
		System.out.println("Received notification I about a blacklisted email address "+blackListedEmailAddr);
       	System.out.println("The address to notify is:"+notificationAddress);
       	System.out.println("Source of event:"+eb.getClass().getName());
       	
	}
}
