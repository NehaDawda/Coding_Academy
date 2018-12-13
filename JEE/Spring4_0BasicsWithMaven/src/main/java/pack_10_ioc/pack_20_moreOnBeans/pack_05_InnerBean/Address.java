package pack_10_ioc.pack_20_moreOnBeans.pack_05_InnerBean;

public class Address {
	private String line1;
	private String city;
	
	public Address(){
		System.out.println("In constructor of Address.");
	}
	
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
    public String toString() {
        return String.format("\n\tAddress:%s\n\t\t%s",
                this.line1, this.city);
    }
}
