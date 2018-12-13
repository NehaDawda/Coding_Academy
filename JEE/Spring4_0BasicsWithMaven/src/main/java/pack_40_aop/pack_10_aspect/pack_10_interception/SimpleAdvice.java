package pack_40_aop.pack_10_aspect.pack_10_interception;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class SimpleAdvice implements MethodInterceptor{

	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("\tBefore Method:"+arg0.getMethod().getName());
		//Integer i = (Integer)arg0.getArguments()[0];
		//System.out.println(i);
		Object o =  arg0.proceed(); // Join point Method is called.
		System.out.println("\tAfter Method:"+arg0.getMethod().getName());
		
		return o;
	}
}