package pack_10_ioc.pack_20_moreOnBeans.pack_02_lazyEager;

public class CustomerCart {
	private int customerId;
	
	public CustomerCart(){
		System.out.println("\tStateful bean: Hashcode from Constructor: "+this.hashCode());
	}
}
