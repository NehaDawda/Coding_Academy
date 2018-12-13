package pack_30_more_ioc.pack_03_custom_events;

import org.springframework.context.ApplicationEvent;

public class BlacklistEvent extends ApplicationEvent {
	String address;
	
	public BlacklistEvent(String address, Object source) {
		super(source);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
}
