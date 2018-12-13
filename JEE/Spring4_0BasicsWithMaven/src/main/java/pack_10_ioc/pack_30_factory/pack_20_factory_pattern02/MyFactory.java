package pack_10_ioc.pack_30_factory.pack_20_factory_pattern02;


public class MyFactory {
	
	public MyFactory(){
		System.out.println("Hashcode MyFactory from constructor:"+this.hashCode());
	}
	// Factory method
	public  BankAcc getBankInstance(String accType){
		
		if (accType.equalsIgnoreCase("savings"))
			return new SavingsAcc();
		else
			return new CurrentAcc();
	}
	
	public  BankAcc getBankInstance(String accType, String accNm){
		
		if (accType.equalsIgnoreCase("savings"))
			return new SavingsAcc(accNm);
		else
			return new CurrentAcc(accNm);
	}

	public  BankAcc getBankInstance(String accType, String accNm, float initialBalance){
		
		if (accType.equalsIgnoreCase("savings"))
			return new SavingsAcc(accNm, initialBalance);
		else
			return new CurrentAcc(accNm, initialBalance);
	}
}
