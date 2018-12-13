package pack_40_aop.pack_10_aspect.pack_15_proxyFactoryBean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAspect0 implements MethodInterceptor {

	public Object invoke(MethodInvocation call) throws Throwable {
		System.out.println("\nfrom logging aspect: entering method ["
				+ call.getMethod() + "]");

		Object point = call.proceed();

		System.out.println("from logging aspect: exiting method ["
				+ call.getMethod() + "]");

		return point;
	}
}
