package pack_40_aop.pack_10_aspect.pack_50_exception;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pack_40_aop.pack_10_aspect.pack_joinpoints.pack_buss.BusinessException;
import pack_40_aop.pack_10_aspect.pack_joinpoints.pack_buss.BusinessInterface;

/* Example 31: Execution of AfterException.
 * 1. How this exception makes code clean.
 * 2. How exception concerns of one layer are kept hidden from another layer. 
 * 
 */
public class Test5 {

	public static void main(String[] args) {
ApplicationContext ctx = new ClassPathXmlApplicationContext("pack_40_aop\\pack_10_aspect\\pack_50_exception\\applicationContext5.xml");
		
		BusinessInterface bc = (BusinessInterface) ctx.getBean("businessComponent");
		try {
			bc.methodThrowingException();
		} catch (BusinessException e1) {
			System.out.println("Exception Message:"+e1.getMessage());
		}
	}
}
