package pack_30_more_ioc.pack_01_multiple_context;

public class ExchangeService {
	private float rate;
	
	public ExchangeService(){
		System.out.println("Exchange service created.");
	}
	public double getExchangeRate() {
		return rate;
	}
	
	public void setExchangeRate(float rate){
		this.rate = rate;
	}
}
