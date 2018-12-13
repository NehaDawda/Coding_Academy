package pack_10_ioc.pack_30_factory.pack_20_factory_pattern02;

public class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;
	
	public BankAcc(){
		System.out.println("Executing no-arg constructor of BankAcc."+this.hashCode());
	}

	public BankAcc(String accNm){
		System.out.println("Executing one-arg constructor of BankAcc."+this.hashCode());
		this.accNm = accNm;
	}
	
	public BankAcc(String accNm, float initialBalance){
		System.out.println("Executing two-arg constructor of BankAcc."+this.hashCode());
		this.accNm = accNm;
		accBal = initialBalance;
	}
	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	@Override
	public String toString() {
		return "AccNo:"+accNo+" Name:"+accNm+" Balance:"+accBal;
	}
}
