package pack_30_more_ioc.pack_04_outsideObjects.pack_02EntityObjects;

public class Emp {
	private int empNo;
	private String empNm;
	private float empSal;
	
	private Services service;
	
	public Emp(int empNo, String empNm, float empSal) {
		super();
		this.empNo = empNo;
		this.empNm = empNm;
		this.empSal = empSal;
	}

	public int getEmpNo() {
		return empNo;
	}

	public String getEmpNm() {
		return empNm;
	}

	public float getEmpSal() {
		return empSal;
	}

	public Services getService() {
		return service;
	}

	public void setService(Services service) {
		this.service = service;
	}

	// Business logic
	public void applyService() {
		service.service1(empNo);
	}
	
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", empNm=" + empNm + ", empSal="
				+ empSal + "]";
	}
}
