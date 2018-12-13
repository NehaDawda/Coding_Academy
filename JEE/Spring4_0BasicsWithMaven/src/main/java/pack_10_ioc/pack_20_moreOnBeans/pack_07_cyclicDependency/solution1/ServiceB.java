package pack_10_ioc.pack_20_moreOnBeans.pack_07_cyclicDependency.solution1;

public class ServiceB {
	private ServiceA serviceA;

	public ServiceB(){
		System.out.println("ServiceB created.");
	}
	
	public void setServiceA(ServiceA serviceA) {
		System.out.println("Setting ServiceA reference in ServiceB");
		this.serviceA = serviceA;
	}
}
