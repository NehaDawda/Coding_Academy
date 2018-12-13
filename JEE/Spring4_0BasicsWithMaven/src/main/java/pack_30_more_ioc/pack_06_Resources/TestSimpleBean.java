package pack_30_more_ioc.pack_06_Resources;

/* This exercise demonstrates how spring framework facilitate object creation
 * by specifying details of object within configuration file.
 * It also demonstrates the ways to initialize object state.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

/*
 * Spring Resource Loader provides a generic way to load resources like text file, media file etc.
 * 		File location may be on Class path, File path or on URL.
*/

public class TestSimpleBean {
	public static void main(String[] args) {
		String configPath = "pack_30_more_ioc\\pack_06_Resources\\context.xml";
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext(configPath);
		
		//String resourcePath = "classpath:pack_30_more_ioc\\pack_06_Resources\\Text.txt";
		//String resourcePath = "file:F:\\Spring\\SpringWorkSpace\\Spring3.2Ver1\\src\\pack_30_more_ioc\\pack_06_Resources\\Text.txt";
		String resourcePath = "file://CHANDRALAPTOP/pack_06_Resources/Text.txt";
		
		/*
		Resource resource = appContext.getResource(resourcePath);
		*/
		
		///* Using Resource Loader
		BeanResourceLoader resourceLoader = (BeanResourceLoader) appContext.getBean("resourceService");
		Resource resource = resourceLoader.getResource(resourcePath);
		//*/
	    try{
	     	  InputStream is = resource.getInputStream();
	          BufferedReader br = new BufferedReader(new InputStreamReader(is));
	 
	          String line;
	          while ((line = br.readLine()) != null) {
	             System.out.println(line);
	       	  } 
	          br.close();
	 
	    	}catch(IOException e){
	    		e.printStackTrace();
	    	}

	}
}