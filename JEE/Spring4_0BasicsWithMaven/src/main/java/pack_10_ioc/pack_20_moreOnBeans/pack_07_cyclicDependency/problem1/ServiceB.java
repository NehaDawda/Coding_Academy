package pack_10_ioc.pack_20_moreOnBeans.pack_07_cyclicDependency.problem1;

public class ServiceB {
	private ServiceA serviceA;
	
	public ServiceB(ServiceA serviceA){
		this.serviceA = serviceA;
	}
}
