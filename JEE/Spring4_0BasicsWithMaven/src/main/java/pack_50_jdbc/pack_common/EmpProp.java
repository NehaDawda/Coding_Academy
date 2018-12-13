package pack_50_jdbc.pack_common;

public class EmpProp {
	private int empNo;
	private String eName;
	private float sal;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "EmpProp [empNo=" + empNo + ", eName=" + eName + ", sal=" + sal
				+ "]";
	}
}