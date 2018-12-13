package pack_10_ioc.pack_10_beanBasics.pack02_context;

public class CustomerCart {
	private int customerId;
	
	public CustomerCart(){
		System.out.println("\tStateful bean: Hashcode from Constructor: "+this.hashCode());
	}
}
