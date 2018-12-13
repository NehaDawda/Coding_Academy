package pack_10_ioc.pack_20_moreOnBeans.pack_07_cyclicDependency.problem2;

import javax.inject.Inject;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@ Service
public class ServiceA {
	//@ Inject
	//@Autowired
	@Resource
	private ServiceB serviceB;
	
	//@ Inject
	//@Autowired
	public ServiceA(ServiceB serviceB){
		this.serviceB = serviceB;
	}
}
