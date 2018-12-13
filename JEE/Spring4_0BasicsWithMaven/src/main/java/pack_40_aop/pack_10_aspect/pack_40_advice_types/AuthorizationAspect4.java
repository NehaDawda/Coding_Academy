package pack_40_aop.pack_10_aspect.pack_40_advice_types;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
public class AuthorizationAspect4 {

	@Before("within(pack_40_aop.pack_10_aspect.pack_joinpoints.pack_buss..*)")
	public void commonProcessingBeforeBusiness(JoinPoint jp) {
		System.out.println("\nFrom LoggingAspect4 some common processing before business");
	}
	
	@After("within(pack_40_aop.pack_10_aspect.pack_joinpoints.pack_buss..*)")
	public Object commonProcessingAfterBusiness(JoinPoint jp) {
		System.out.println("From LoggingAspect4 some common processing after business");
		return jp;
	}
	
	@AfterReturning(pointcut="within(pack_40_aop.pack_10_aspect.pack_joinpoints.pack_buss..*)", returning="retVal")
	public Object commonProcessingAfterBusinessOnReturnValue(JoinPoint jp, Object retVal) {
		System.out.println("Method "+jp.getSignature().getName()+" returned : "+retVal);
		return jp;
	}
	
	@Around("within(pack_40_aop.pack_10_aspect.pack_joinpoints.pack_buss..*)")
	public Object commonProcessing(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("\nFrom LoggingAspect4 some common processing before business");
		
		Object o = jp.proceed();
		return o;
	}
}
