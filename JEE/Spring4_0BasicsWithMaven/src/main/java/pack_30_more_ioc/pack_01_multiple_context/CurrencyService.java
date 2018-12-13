package pack_30_more_ioc.pack_01_multiple_context;

public class CurrencyService {
	private ExchangeService exchangeService;
	
	
	public CurrencyService() {
		System.out.println("Currency Service Created.");
	}

	public void setExchangeService(ExchangeService exchangeService) {
		this.exchangeService = exchangeService;
	}
	
	public double convert() {
		
		return exchangeService.getExchangeRate();
	}
}
