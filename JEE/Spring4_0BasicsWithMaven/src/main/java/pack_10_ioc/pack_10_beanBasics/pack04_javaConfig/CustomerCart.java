package pack_10_ioc.pack_10_beanBasics.pack04_javaConfig;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class CustomerCart {
	private int customerId;
	
	public CustomerCart(){
		System.out.println("\tStateful bean: Hashcode from Constructor: "+this.hashCode());
	}
}
