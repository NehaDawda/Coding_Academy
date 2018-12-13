package pack_10_ioc.pack_10_beanBasics.pack03_annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component ("custCart")
@Scope("prototype")
public class CustomerCart {
	private int customerId;
	
	public CustomerCart(){
		System.out.println("\tStateful bean: Hashcode from Constructor: "+this.hashCode());
	}
}
