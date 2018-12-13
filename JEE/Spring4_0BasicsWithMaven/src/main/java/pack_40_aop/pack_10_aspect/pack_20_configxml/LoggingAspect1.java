package pack_40_aop.pack_10_aspect.pack_20_configxml;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect1 {

	public Object log(ProceedingJoinPoint call) throws Throwable {
		System.out.println("\nfrom logging aspect: entering method ["
				+ call.toShortString() + "]");

		Object point = call.proceed();

		System.out.println("from logging aspect: exiting method ["
				+ call.toShortString() + "]");

		return point;
	}
}
