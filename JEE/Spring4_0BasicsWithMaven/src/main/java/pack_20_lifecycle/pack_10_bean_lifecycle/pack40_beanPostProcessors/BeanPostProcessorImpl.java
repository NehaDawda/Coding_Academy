package pack_20_lifecycle.pack_10_bean_lifecycle.pack40_beanPostProcessors;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
 
/*
 * The interface InstantiationAwareBeanPostProcessor is extended from BeanPostProcessor.
 * Methods of BeanPostProcessor: 
 * 			1. postProcessBeforeInitialization(): Callback hook for initializing bean.  After instantiation, properties but before initialization.
 * 			2. postProcessAfterInitialization(): Callback hook for wrapping bean in Proxy.  After initialization.
 * Methods of InstantiationAwareBeanPostProcessor
 * 			1. Both above methods
 * 			2. postProcessBeforeInstantiation(): applying custom instantiation process.
 * 			3. postProcessAfterInstantiation(): For field injection.
 * 			4. postProcessPropertyValues(): For checking all dependencies.  After instantiation but before applying properties.
 */
public class BeanPostProcessorImpl implements  InstantiationAwareBeanPostProcessor { //InstantiationAwareBeanPostProcessor BeanPostProcessor

	@Override // Use this method for custom creation of object.  Apply conditions on alias/.class for choosing which bean to create.
	// The Class parameter gets the class type of bean being instantiated.
	// The alias parameter gets the alias of bean declared in config. file.
	// This callback is not applied for beans created using factory-method.
	public Object postProcessBeforeInstantiation(Class<?> arg0, String alias)
			throws BeansException {
		System.out.println(alias+": postProcessBeforeInstantiation()");
		/*  On returning bean object, does short circuiting and directly executes AfterInitialization.
		SampleBean1 sampleBean = new SampleBean1("SAMPLE-I company para-constructor");
		return sampleBean;
		*/
		///* Otherwise Spring context creates object using no-arg constructor.  Applies all hooks.
		return null;
		//*/
	}
	
	@Override
	// Executed after beans instantiated via constructor or factory method but before beans property sets or autowired.
	// This callback is ideal for field injections.
	// If returns 'true' - Will populate bean.  'false' to skip populating bean.
	public boolean postProcessAfterInstantiation(Object bean, String alias)
			throws BeansException {
		
		System.out.println(alias+": postProcessAfterInstantiation()");
		return true;
	}

	@Override
	// Post process given property values before factory processes them on bean.  Allows checking of all 'Required' dependencies are satisfied or not.
	// The pvs: The property values factory is about to apply.
	// The pds: The property descriptors for target bean.
	// The bean: The bean instance created but properties not yet applied.
	// The alias: Alias of target bean.
	public PropertyValues postProcessPropertyValues(PropertyValues pvs,
			PropertyDescriptor[] pds, Object bean, String alias)
			throws BeansException {
		System.out.println(alias+": postProcessPropertyValues()");
		return pvs;
	}
	
	// Post processing hooks from interface BeanPostProcessor.
	
	// Following hook is executed after properties applied on bean but before initialization.
	// This hook is for overwriting on property values.
	@Override
	public Object postProcessBeforeInitialization(Object bean, String alias)
			throws BeansException {
		System.out.println(alias+": PostProcessBeforeInitialization()");
		if (bean instanceof SampleBean1){
			SampleBean1 sampleBean = (SampleBean1) bean;
			//sampleBean.setCompanyName("SAMPLE-I company Overwritten");
		}
		return bean;
	}
	
	// Following hook is executed after initialization.
	// This hook is for wrapping object in proxy.
	@Override
	public Object postProcessAfterInitialization(Object bean, String alias)
			throws BeansException {
		System.out.println(alias+":PostProcessAfterInitialization()");
		SampleBean1Proxy proxy = new SampleBean1Proxy((SampleBean1) bean);
		return proxy;
	}
}
