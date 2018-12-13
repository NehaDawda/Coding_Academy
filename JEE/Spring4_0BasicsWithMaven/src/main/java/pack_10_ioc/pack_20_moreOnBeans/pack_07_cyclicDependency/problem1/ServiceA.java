package pack_10_ioc.pack_20_moreOnBeans.pack_07_cyclicDependency.problem1;

public class ServiceA {
	private ServiceB serviceB;
	
	public ServiceA(ServiceB serviceB){
		this.serviceB = serviceB;
	}
}
