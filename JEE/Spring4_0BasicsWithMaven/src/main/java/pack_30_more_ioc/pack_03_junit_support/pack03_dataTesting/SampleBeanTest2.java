package pack_30_more_ioc.pack_03_junit_support.pack03_dataTesting;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.test.AssertFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/* Example 26: Springs' support for test driven approach.
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:pack_30_more_ioc\\pack_03_junit_support\\pack03_dataTesting\\context.xml"})

public class SampleBeanTest2 {
	String EXPECTED_FILE = "F:\\Spring\\SpringWorkSpace\\Spring3.2Ver1\\src\\pack_30_more_ioc\\pack_03_junit_support\\pack03_dataTesting\\expectedData\\expected.data";
	String OUTPUT_FILE   = "F:\\Spring\\SpringWorkSpace\\Spring3.2Ver1\\src\\pack_30_more_ioc\\pack_03_junit_support\\pack03_dataTesting\\outputData\\output.data";
	
	@Test
	public void testSampleBean3() throws Exception {
		System.out.println("Test method");
		
		AssertFile.assertFileEquals(new FileSystemResource(EXPECTED_FILE),
		                            new FileSystemResource(OUTPUT_FILE));
	}
}
