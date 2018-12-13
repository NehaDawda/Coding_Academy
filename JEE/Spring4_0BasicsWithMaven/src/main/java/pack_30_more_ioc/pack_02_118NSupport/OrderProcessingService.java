package pack_30_more_ioc.pack_02_118NSupport;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class OrderProcessingService implements MessageSourceAware {

	private MessageSource messageSource;

	
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	public void placeOrder(int quantity) {
		int availableQuantity = 2; //just an assumption
		Locale hiLocale = new Locale("hi", "IN");
		//Locale hiLocale = new Locale("en", "UK");
		
		if(quantity > availableQuantity) {
			/*String errorMessage = messageSource.getMessage("insufficient.stock", 
					new Object[]{availableQuantity, quantity}, Locale.getDefault());*/
			String errorMessage = messageSource.getMessage("insufficient.stock", 
					new Object[]{availableQuantity, quantity}, hiLocale);//, hiLocale, Locale.getDefault());
			throw new RuntimeException(errorMessage);
		}
	}
}
