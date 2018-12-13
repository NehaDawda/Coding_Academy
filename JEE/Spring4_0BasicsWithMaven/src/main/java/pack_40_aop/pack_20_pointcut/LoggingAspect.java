package pack_40_aop.pack_20_pointcut;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("pack_40_aop.pack_20_pointcut.PointcutConfig.applyMethods()")
	public void log(JoinPoint joinPoint) {
		System.out.println("log advice executed for method : "+joinPoint.getSignature().getName());
	}
	
	@Before("pack_40_aop.pack_20_pointcut.PointcutConfig.serviceComponents()")
	public void timeLog(JoinPoint joinPoint) {
		System.out.println("request for method : "+joinPoint.getSignature().getName()+" occurred at "+new Date());
	}
}