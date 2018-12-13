package pack_30_more_ioc.pack_03_custom_events;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class EmailBean implements ApplicationContextAware {
	private List<String> blackListed;
	private ApplicationContext ctx;
	
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		this.ctx = ctx;
	}
	
	public void setBlackList(List<String> lst){
		this.blackListed = lst;
	}
	
	public void sendEmail(String address, String text){
		if (blackListed.contains(address)){
			BlacklistEvent blEvent = new BlacklistEvent(address, this);
			ctx.publishEvent(blEvent);
			
			AlertEvent applEvent = new AlertEvent(address, this);
			ctx.publishEvent(applEvent);
			return;
		}
		System.out.println("Not a blacklisted address:"+address+" Sent a message text: "+text);
	}
}
