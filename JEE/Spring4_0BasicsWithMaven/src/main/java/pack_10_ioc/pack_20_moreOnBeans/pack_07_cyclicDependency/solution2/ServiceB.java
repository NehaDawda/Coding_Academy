package pack_10_ioc.pack_20_moreOnBeans.pack_07_cyclicDependency.solution2;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import pack_10_ioc.pack_20_moreOnBeans.pack_07_cyclicDependency.solution2.ServiceA;

@ Service
public class ServiceB {
	private ServiceA serviceA;
	
	public ServiceB(){
		System.out.println("ServiceB created.");
	}
	
	@ Inject
	public void setServiceA(ServiceA serviceA) {
		System.out.println("Setting ServiceA reference in ServiceB");
		this.serviceA = serviceA;
	}
}
