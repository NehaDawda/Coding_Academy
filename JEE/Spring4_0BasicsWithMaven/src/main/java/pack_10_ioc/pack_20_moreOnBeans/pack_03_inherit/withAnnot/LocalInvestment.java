package pack_10_ioc.pack_20_moreOnBeans.pack_03_inherit.withAnnot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("localInvest")
public class LocalInvestment extends GlobalInvestment {
	@Value ("Mum100") private String branchId;
	
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
