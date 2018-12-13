package pack_10_ioc.pack_20_moreOnBeans.pack_07_cyclicDependency.solution2;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import pack_10_ioc.pack_20_moreOnBeans.pack_07_cyclicDependency.solution2.ServiceB;

@ Service
public class ServiceA {
	private ServiceB serviceB;
	
	public ServiceA(){
		System.out.println("ServiceA created.");
	}
	
	@Inject
	public void setServiceB(ServiceB serviceB) {
		System.out.println("Setting ServiceB reference in ServiceA");
		this.serviceB = serviceB;
	}
}
