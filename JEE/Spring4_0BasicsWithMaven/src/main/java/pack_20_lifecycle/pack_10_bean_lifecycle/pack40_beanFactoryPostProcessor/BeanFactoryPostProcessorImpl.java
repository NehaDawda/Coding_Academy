package pack_20_lifecycle.pack_10_bean_lifecycle.pack40_beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/*
 * The Spring IOC Container allows BeanFactoryPostProcessor to read the configuration metadata and change it
 * 	before container instantiates any bean other than BeanFactoryPostProcessors.
 */
public class BeanFactoryPostProcessorImpl implements BeanFactoryPostProcessor {

	public BeanFactoryPostProcessorImpl() {
		System.out.println("BeanFactoryPostProcessorImpl class instantiated..");
	}
	
	public void postProcessBeanFactory(ConfigurableListableBeanFactory configFactory)
			throws BeansException {
		System.out.println("In postProcessBeanFactory(ConfigurableListableBeanFactory).");
		System.out.println("Total beans in context:"+configFactory.getBeanDefinitionCount());
		
		// Dynamically registering bean in the context.
		SampleBean3 bean = new SampleBean3();
		bean.setCompanyName("SAMPLE-III Company");
		configFactory.registerSingleton("sample3", bean);
		
		// Reading configuration context.
		String[] beanList = configFactory.getBeanDefinitionNames();
		
		for(String beanName : beanList){
			System.out.println(beanName);
		}
	}
}
