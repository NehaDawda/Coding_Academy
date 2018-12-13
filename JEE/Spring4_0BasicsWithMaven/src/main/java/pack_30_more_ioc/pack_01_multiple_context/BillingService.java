package pack_30_more_ioc.pack_01_multiple_context;

public class BillingService {
	private ExchangeService exchangeService;
	
	
	public BillingService() {
		System.out.println("Billing Service created.");
	}

	public void setExchangeService(ExchangeService exchangeService) {
		this.exchangeService = exchangeService;
	}
	
	public double billAmount() {
		
		return exchangeService.getExchangeRate();
	}
}
