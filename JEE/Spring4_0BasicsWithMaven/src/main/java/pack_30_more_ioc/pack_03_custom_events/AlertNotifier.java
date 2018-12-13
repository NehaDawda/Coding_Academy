package pack_30_more_ioc.pack_03_custom_events;

import org.springframework.context.ApplicationListener;

public class AlertNotifier implements ApplicationListener<AlertEvent> {
	private String alertAddress;
	
	public void setAlertAddress(String alertAddress) {
		this.alertAddress = alertAddress;
	}
	
	@Override
	public void onApplicationEvent(AlertEvent event) {
		String alertEmailAddr = event.getAddress();
		EmailBean eb =(EmailBean) event.getSource();
		
		System.out.println("Received Alert about a blacklisted email address "+alertEmailAddr);
       	System.out.println("The address to notify is:"+alertEmailAddr);
       	System.out.println("Source of event:"+eb.getClass().getName());
	}
}
