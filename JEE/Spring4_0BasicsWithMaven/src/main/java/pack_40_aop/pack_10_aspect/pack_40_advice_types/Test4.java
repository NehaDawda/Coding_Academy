package pack_40_aop.pack_10_aspect.pack_40_advice_types;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pack_40_aop.pack_10_aspect.pack_joinpoints.pack_buss.BusinessInterface;

/*
 * Example 30: Different advice types.
 * 1. The Around: Most powerful.  Wraps execution of method within Before part and after part.
 * 2. The Before: Executed before method call.  Method call is deferred only if advice throws exception.
 * 3. The AfterReturning: Executed after successful execution of method.  If method throws exception, this advice is bypassed.
 * 4. The AfterException: Executed after method throws exception.  If method is successful, advice is bypassed.
 * 5. The After: Executed in both possibilities.
 */
public class Test4 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("pack_40_aop\\pack_10_aspect\\pack_40_advice_types\\applicationContext4.xml");
		
		BusinessInterface bc = (BusinessInterface) ctx.getBean("businessComponent");
		String msg = bc.someBusinessMethod();
		System.out.println(msg);
	}
}
