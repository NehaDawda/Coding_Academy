package pack_40_aop.pack_10_aspect.pack_10_interception;

/*
 * This program needs lib/cglib/cglib-nodep-2.1_3.jar to be on classpath.
 */

/* Example 27: Spring's interception solution.
 * 1. To design simple pointcuts and advisors.
 * 2. To associate advisor with join points.
 * 3. Create proxy from proxy factory.
 * 4. Exercise interception for methods do not take parameters.
 * 5. Exercise interception for methods take parameters.
 * 6. Proxy does not allow interception on fields and private/protected methods.
 */

//import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;

import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

public class TestPointcuts {

	public static void main(String[] args) {
		SampleBean sb = new SampleBean();
		
		// Create advisor
		/*NameMatchMethodPointcut pc = new NameMatchMethodPointcut();
		pc.addMethodName("method1");
		pc.addMethodName("method2");
		//pc.addMethodName("method3");
		
		Advisor advisor = new DefaultPointcutAdvisor(pc, new SimpleAdvice());*/
		
		NameMatchMethodPointcutAdvisor advisor = new NameMatchMethodPointcutAdvisor(
                new SimpleAdvice());
        advisor.addMethodName("method2");
        advisor.addMethodName("method4");
		
		// Create Proxy
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(sb);
		pf.addAdvisor(advisor);
		
		SampleBean proxy = (SampleBean) pf.getProxy();
		
		proxy.method1(10);
		proxy.method2();
		proxy.method4();
	}
}
