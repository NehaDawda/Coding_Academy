package pack_10_ioc.pack_20_moreOnBeans.pack_07_cyclicDependency.problem2;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@ Service
public class ServiceB {
	//@ Inject
	//@Autowired
	@Resource
	private ServiceA serviceA;
	
	//@ Inject
	//@Autowired
	public ServiceB(ServiceA serviceA){
		this.serviceA = serviceA;
	}
}
