package pack_10_ioc.pack_20_moreOnBeans.pack_05_InnerBean;

public class GlobalInvestment {
	private Address address;
	
	public GlobalInvestment(Address address) {
		System.out.println("In constructor of GlobalInvestment.");
		this.address = address;
	}

	public GlobalInvestment() {
		System.out.println("In constructor of GlobalInvestment.");
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("GlobalInvestment Address set "+this.address.hashCode());
	}

	@Override
	public String toString() {
		return "GlobalInvestment [address=" + address + "]";
	}
}
