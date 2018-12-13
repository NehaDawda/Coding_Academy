package pack_10_ioc.pack_10_beanBasics.pack05_progConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

public class GlobalInvestment {
	
	/* Annotation does not work
	private @Value ("Gobal Investment Pvt. Ltd.")String firmName; 
	private @Value ("Ladder of success")String companyMotto; 
	*/
	private String firmName;
	private String companyMotto;
	
	public GlobalInvestment() {
		super();
		System.out.println("Singleton bean created with hashcode:"+this.hashCode());
	}

	@Override
	public String toString() {
		return "GlobalInvestment"
				+ ", \n\tfirmName="+ firmName
				+ "  \n\tcompanyMotto=" + companyMotto
				;
	}
	
	//This annotation does not work @Value("Chandra and Company.")
	public void setFirmName(String firmName){
		this.firmName = firmName;
	}

	public String getCompanyMotto() {
		return companyMotto;
	}

	public void setCompanyMotto(String companyMotto) {
		this.companyMotto = companyMotto;
	}
}
