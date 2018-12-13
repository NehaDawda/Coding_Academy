package pack_10_ioc.pack_30_factory.pack_20_factory_pattern01;

public class SavingsAcc extends BankAcc {

	public SavingsAcc(){
		super();
	}
	
	public SavingsAcc(String accNm){
		super(accNm);
	}
	
	public SavingsAcc(String accNm, float initialBalance){
		super(accNm, initialBalance);
	}
	
	@Override
	public String toString() {
		return "From Savings:"+super.toString();
	}
}
