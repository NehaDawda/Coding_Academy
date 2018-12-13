package pack_10_ioc.pack_20_moreOnBeans.pack_05_InnerBean;

/* This exercise demonstrates how spring framework facilitate object creation
 * by specifying details of object within configuration file.
 * It also demonstrates the ways to initialize object state.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * An Inner bean is a bean defined within scope of another bean.
 * 		* If a bean is being used by one and only one property, declare it once and for all within a property.
 * 
 * Can be declared within a property or a constructor.
 */
public class TestSimpleBean {
	public static void main(String[] args) {
		String configPath = "pack_10_ioc\\pack_20_moreOnBeans\\pack_05_InnerBean\\context.xml";

		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		System.out.println("Container loaded.");
		
		GlobalInvestment   bean1 = (GlobalInvestment) ctx.getBean("bean");
		System.out.println(bean1);
		
	}
}