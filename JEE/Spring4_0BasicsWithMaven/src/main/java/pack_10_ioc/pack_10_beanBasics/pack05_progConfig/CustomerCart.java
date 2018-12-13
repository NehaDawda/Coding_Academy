package pack_10_ioc.pack_10_beanBasics.pack05_progConfig;

public class CustomerCart {
	private int customerId;
	
	public CustomerCart(){
		System.out.println("\tStateful bean: Hashcode from Constructor: "+this.hashCode());
	}
}
