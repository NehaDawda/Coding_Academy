package pack_10_ioc.pack_20_moreOnBeans.pack_03_inherit.withAnnot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("globalInvest")
public abstract class GlobalInvestment {
	
	@Value ("Global Investment Pvt. Ltd.") private String firmName;
	@Value ("Need of the hour") private String companyMotto;
	
	public GlobalInvestment() {
		super();
		System.out.println("Executing no-arg constructor of GlobalInvestment."+this.hashCode());
	}

	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}

	public void setCompanyMotto(String companyMotto) {
		this.companyMotto = companyMotto;
	}

	@Override
	public String toString() {
		return "GlobalInvestment"
				+ ", \n\tfirmName="+ firmName
				+ "  \n\tcompanyMotto=" + companyMotto
				;
	}
}
