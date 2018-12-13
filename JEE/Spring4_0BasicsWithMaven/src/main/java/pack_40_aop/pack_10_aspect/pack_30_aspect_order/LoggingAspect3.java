package pack_40_aop.pack_10_aspect.pack_30_aspect_order;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.util.StopWatch;

@Aspect
public class LoggingAspect3 implements Ordered {
	private int order;
	
	public int getOrder() {
		return order;
	}
	
	public void setOrder(int order){
		this.order = order;
	}
	
	@Around("execution(* pack_40_aop.pack_10_aspect.pack_joinpoints.pack_dao.*Dao.*(..))") //Pointcut
	public Object adviceLogging(ProceedingJoinPoint call) throws Throwable {
		StopWatch st = new StopWatch();
		st.start();
		
		System.out.println("\nFrom LoggingAspect3 before : "+call.toShortString());
		Object point = call.proceed();
		System.out.println("From LoggingAspect3 after : "+call.toShortString());
		
		return point;
	}
}
