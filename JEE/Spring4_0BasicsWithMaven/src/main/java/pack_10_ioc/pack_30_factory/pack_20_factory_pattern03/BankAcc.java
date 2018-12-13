package pack_10_ioc.pack_30_factory.pack_20_factory_pattern03;

public class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;
	
	public BankAcc(){
		System.out.println("Executing no-arg constructor of BankAcc."+this.hashCode());
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
		return "AccNo:"+accNo+" Name:"+accNm+" Balance:"+accBal+"  HashCode:"+this.hashCode();
	}
}
