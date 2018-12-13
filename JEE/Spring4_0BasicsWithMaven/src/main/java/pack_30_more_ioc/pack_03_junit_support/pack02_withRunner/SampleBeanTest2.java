package pack_30_more_ioc.pack_03_junit_support.pack02_withRunner;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/* Example 26: Springs' support for test driven approach.
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:pack_30_more_ioc\\pack_03_junit_support\\pack02_withRunner\\context.xml"})

public class SampleBeanTest2 {
	
	//Inject the bean which we need to test.
	//Why to do it manually. So DI in JUnit also!!
	@Autowired
	private SampleBean sampleBean;

	@Test
	public void testSampleBean1() {
		System.out.println("Test method 1");
		//just need to now concentrate on testing the bean
		Assert.assertEquals("Sample method", sampleBean.sampleMethod());
	}
	
	@Test
	public void testSampleBean2() {
		System.out.println("Test method 2");
		//just need to now concentrate on testing the bean
		Assert.assertEquals("Sample method", sampleBean.sampleMethod());
	}
}
