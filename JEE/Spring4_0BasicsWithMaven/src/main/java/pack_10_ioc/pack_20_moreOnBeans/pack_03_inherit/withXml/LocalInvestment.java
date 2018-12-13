package pack_10_ioc.pack_20_moreOnBeans.pack_03_inherit.withXml;

public class LocalInvestment extends GlobalInvestment {
	private String branchId;
	
	public LocalInvestment() {
		System.out.println("Executing no-arg constructor of LocalInvestment."+this.hashCode());
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	@Override
	public String toString() {
		return "LocalInvestment [branchId=" + branchId + ", toString()="
				+ super.toString() + "]";
	}
}
