package pack_40_aop.pack_10_aspect.pack_30_aspect_order;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.util.StopWatch;
/*
 * The bean declared in application context and annotated with @Aspect
 *  is automatically detected as Aspect class.  The @Aspect annotation
 *  guides framework to exclude this bean from auto-proxying.
 */
@Aspect
public class AuthorizationAspect2 implements Ordered {
	private int order;
	
	public int getOrder() {
		return order;
	}
	
	// This method is optional
	public void setOrder(int order){
		this.order = order;
	}
	
	@Around ("execution(* pack_40_aop.pack_10_aspect.pack_joinpoints.packDao.*.*(..))") //Pointcut
	public Object adviceAuthorization(ProceedingJoinPoint call) throws Throwable {
		StopWatch st = new StopWatch();
		st.start();
		
		System.out.println("\nFrom AuthorizationAspect2 before : "+call.toShortString());
		
		Object point = call.proceed();
		System.out.println("From AuthorizationAspect2 after : "+call.toShortString());
		
		return point;
	}
}
