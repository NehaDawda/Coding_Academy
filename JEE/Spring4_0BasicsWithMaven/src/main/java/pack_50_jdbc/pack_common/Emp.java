package pack_50_jdbc.pack_common;

public class Emp {
	private int empNo;
	private String empNm;
	private float empSal;
	
	public Emp() {
		super();
	}
	
	public Emp(int empNo, String empNm, float empSal) {
		super();
		this.empNo = empNo;
		this.empNm = empNm;
		this.empSal = empSal;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpNm() {
		return empNm;
	}
	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	
	@Override
	public String toString(){
		return "Emp Id: "+empNo+"    Name: "+empNm+"   Salary:"+empSal;
	}
}
