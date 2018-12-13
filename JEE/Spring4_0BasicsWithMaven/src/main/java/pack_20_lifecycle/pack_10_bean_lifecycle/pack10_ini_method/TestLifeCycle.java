package pack_20_lifecycle.pack_10_bean_lifecycle.pack10_ini_method;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Example 18: Configuring initial value sets through init-method clause.
 * 1. There can be one or more init methods within a bean.
 * 2. Only one init method can provide initial values for a bean.
 * 3. Which init method to provide initial values depends on choice of administrator.
 */
public class TestLifeCycle {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
        "pack_20_lifecycle/pack_10_bean_lifecycle/pack10_ini_method/context.xml");
		
		CouponsTracking training = (CouponsTracking) ctx.getBean("trackCoupon");
		
		training.issueCoupon();
		training.issueCoupon();
		training.issueCoupon();
		training.issueCoupon();
		
		training.showCount();
		
		ctx.close();
	}
}
