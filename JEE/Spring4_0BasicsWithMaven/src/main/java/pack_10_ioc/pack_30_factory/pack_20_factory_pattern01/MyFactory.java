package pack_10_ioc.pack_30_factory.pack_20_factory_pattern01;

public class MyFactory {
	
	public MyFactory(){
		System.out.println("Hashcode MyFactory from constructor:"+this.hashCode());
	}
	
	public BankAcc getNewSavingsAcc(String name){
		System.out.println("From SavingsAcc factory method.");
		// Make decisions
		// Create other depending objects
		BankAcc bcc = new SavingsAcc(name);
		// Set dependencies.
		return bcc;
	}
	
	public BankAcc getNewCurrentAcc(String name){
		System.out.println("From CurrentAcc factory method.");
		// Make decisions
		// Create other depending objects
		BankAcc bcc = new CurrentAcc(name);
		// Set dependencies.
		return bcc;
	}
}
