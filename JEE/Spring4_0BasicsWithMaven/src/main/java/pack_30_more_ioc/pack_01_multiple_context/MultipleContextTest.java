package pack_30_more_ioc.pack_01_multiple_context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* Example 22: Hierarchical formation of different context.
 * 1. The commonServices.xml is a root context.
 * 2. The financialServices and salesServices are children context.
 * 3. The children context can refer to beans from parent context.
 * 4. Vice versa not possible.
 * 
 */
public class MultipleContextTest {

	public static void main(String[] argv) {
		String commonServiceConfig = "pack_30_more_ioc\\pack_01_multiple_context\\commonServices.xml";
		String financeServiceConfig = "pack_30_more_ioc\\pack_01_multiple_context\\financeServices.xml";
		String salesServiceConfig = "pack_30_more_ioc\\pack_01_multiple_context\\salesServices.xml";
		
		//creating the parent context
		ApplicationContext pContext = new ClassPathXmlApplicationContext(commonServiceConfig);
		
		//creating the child context
		/*ApplicationContext cContext = new 
						ClassPathXmlApplicationContext(new String[]{financeServiceConfig, salesServiceConfig}, pContext);*/
		ApplicationContext cContext1 = new 
				ClassPathXmlApplicationContext(new String[] {financeServiceConfig}, pContext);
		
		ApplicationContext cContext2 = new 
				ClassPathXmlApplicationContext(new String[] {salesServiceConfig}, pContext);
		
		//  Using child context to get beans of parent context.
		ExchangeService exchService1 = cContext1.getBean(ExchangeService.class);
		System.out.println("Exchange Rate through CurrencyService: "+exchService1.getExchangeRate());
		
		//accessing the bean
		CurrencyService currencyService = cContext1.getBean(CurrencyService.class);
		//calling the method to verify if the parent bean was injected or not
		System.out.println("Exchange rates in CurrencyService: "+currencyService.convert());
		
		// Accessing the bean
		BillingService billingService = cContext2.getBean(BillingService.class);
		System.out.println("Exchange rates in BillingService: "+billingService.billAmount());
		
		exchService1.setExchangeRate(59.69f);
		System.out.println("Exchange rate has been changed through Exchange Service.");
		
		System.out.println("Exchange rates in CurrencyService: "+currencyService.convert());
		System.out.println("Exchange rates in BillingService: "+billingService.billAmount());
		
	}
}
