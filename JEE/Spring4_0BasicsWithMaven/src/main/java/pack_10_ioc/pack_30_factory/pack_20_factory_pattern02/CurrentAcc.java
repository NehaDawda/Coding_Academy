package pack_10_ioc.pack_30_factory.pack_20_factory_pattern02;

public class CurrentAcc extends BankAcc {

	public CurrentAcc(){
		super();
	}
	
	public CurrentAcc(String accNm){
		super(accNm);
	}
	
	public CurrentAcc(String accNm, float initialBalance){
		super(accNm, initialBalance);
	}
	
	@Override
	public String toString() {
		return "From Current:"+super.toString();
	}
}
