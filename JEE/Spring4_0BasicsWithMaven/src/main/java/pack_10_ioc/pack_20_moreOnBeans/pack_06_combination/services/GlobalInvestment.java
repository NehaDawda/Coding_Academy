package pack_10_ioc.pack_20_moreOnBeans.pack_06_combination.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component ("resourceBean")
@Scope("singleton")
public class GlobalInvestment implements IGlobInvestment {
	
	private @Value ("Gobal Investment Pvt. Ltd.")String firmName; // Thru constructor
	private @Value ("Ladder of success")String companyMotto; // Thru constructor
	
	public GlobalInvestment() {
		super();
		
	}

	@Override
	public String toString() {
		return "GlobalInvestment"
				+ ", \n\tfirmName="+ firmName
				+ "  \n\tcompanyMotto=" + companyMotto
				;
	}
	
	@Value("Chandra and Company.")
	public void setFirmName(String firmName){
		this.firmName = firmName;
	}

	@Override
	public String getFirmName() {
		return firmName;
		
	}
}
