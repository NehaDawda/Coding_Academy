package pack_40_aop.pack_10_aspect.pack_50_exception;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.MessageSource;

import pack_40_aop.pack_10_aspect.pack_joinpoints.pack_buss.BusinessException;

@Aspect
public class ExceptionHandler5 {

	private MessageSource messageSource;
		
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@AfterThrowing(pointcut="execution(* methodThrowingException(..))", throwing="ex")
	public void handleException(JoinPoint jp, RuntimeException ex) throws Throwable {
		ex.getMessage();
		System.out.println("Routine exception handling code here.");
		System.out.println("Let's see who has raised an exception!");
		System.out.println("====================================================================");
		System.out.println(jp.getSignature().getName());
		System.out.println("====================================================================");
		System.out.println(messageSource.getMessage(jp.getSignature().getName(), null, null, null));
		String msg = messageSource.getMessage(jp.getSignature().getName(), null, null, null);
		throw new BusinessException(msg);
		
		// Observe the message source.  It is being brought from the property file resource/messages.properties
	}
}
