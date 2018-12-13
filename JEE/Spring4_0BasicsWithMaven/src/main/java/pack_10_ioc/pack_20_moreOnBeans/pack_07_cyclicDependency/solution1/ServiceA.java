package pack_10_ioc.pack_20_moreOnBeans.pack_07_cyclicDependency.solution1;

public class ServiceA {
	private ServiceB serviceB;
	
	public ServiceA(){
		System.out.println("ServiceA created.");
	}
	
	public void setServiceB(ServiceB serviceB) {
		System.out.println("Setting ServiceB reference in ServiceA");
		this.serviceB = serviceB;
	}
}
