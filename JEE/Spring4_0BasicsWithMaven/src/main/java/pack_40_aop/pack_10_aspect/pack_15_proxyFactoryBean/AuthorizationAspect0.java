package pack_40_aop.pack_10_aspect.pack_15_proxyFactoryBean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;
/*
 * The bean declared in application context and annotated with @Aspect
 *  is automatically detected as Aspect class.  The @Aspect annotation
 *  guides framework to exclude this bean from auto-proxying.
 */
public class AuthorizationAspect0 implements MethodInterceptor {
	
	
	public Object invoke(MethodInvocation call) throws Throwable {
		StopWatch st = new StopWatch();
		st.start();
		
		System.out.println("From AuthorizationAspect0 before : "+call.getMethod());
		
		Object point = call.proceed();
		System.out.println("From AuthorizationAspect0 after : "+call.getMethod());
		
		return point;
	}
}
