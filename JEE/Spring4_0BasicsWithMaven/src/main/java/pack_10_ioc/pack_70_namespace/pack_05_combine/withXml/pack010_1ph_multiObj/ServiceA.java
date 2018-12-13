package pack_10_ioc.pack_70_namespace.pack_05_combine.withXml.pack010_1ph_multiObj;

public class ServiceA {
	private String value1;
	private String value2;
	private String value3;
	
	public ServiceA(){
	}
	
	public void setValue1(String value1) {
		this.value1 = value1;
	}
	public void setValue2(String value2) {
		this.value2 = value2;
	}
	public void setValue3(String value3) {
		this.value3 = value3;
	}

	@Override
	public String toString() {
		return "Service1 [value1=" + value1 + ", value2=" + value2
				+ ", value3=" + value3 + "]";
	}
}
