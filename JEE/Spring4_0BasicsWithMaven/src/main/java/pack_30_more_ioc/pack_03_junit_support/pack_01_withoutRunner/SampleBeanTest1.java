package pack_30_more_ioc.pack_03_junit_support.pack_01_withoutRunner;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* 
 * Example 25: Simple tests
 */
public class SampleBeanTest1 {
	private static ApplicationContext ctx;
	
	@BeforeClass
	public static void setContext(){
		ctx = new ClassPathXmlApplicationContext("pack_30_more_ioc\\pack_03_junit_support\\pack_01_withoutRunner\\context.xml");
		System.out.println("Container loaded.");
	}
	@Test
	public void testSampleBean1() {
		System.out.println("Test method 1");
		
		// Need to call getBean() to access a particular bean which we need to test
		SampleBean sampleBean = ctx.getBean(SampleBean.class);
		
		//and then finally we get a change to test the bean method
		Assert.assertEquals("Sample method", sampleBean.sampleMethod());
	}
	
	@Test
	public void testSampleBean2() {
		System.out.println("Test method 2");
		
		// Need to call getBean() to access a particular bean which we need to test
		SampleBean sampleBean = ctx.getBean(SampleBean.class);
		
		//and then finally we get a change to test the bean method
		Assert.assertEquals("Sample method", sampleBean.sampleMethod());
	}
}
