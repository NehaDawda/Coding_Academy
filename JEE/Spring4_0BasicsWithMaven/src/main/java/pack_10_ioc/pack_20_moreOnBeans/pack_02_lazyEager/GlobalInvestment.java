package pack_10_ioc.pack_20_moreOnBeans.pack_02_lazyEager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service ("resourceBean")
@Scope ("singleton")
//@Lazy(true)
public class GlobalInvestment {
	private String firmName; // Thru constructor
	private String companyMotto; // Thru constructor
	
	public GlobalInvestment() {
		super();
		firmName = "Gobal Investment Pvt. Ltd.";
		companyMotto = "Ladder of success";
		System.out.println("Constructor of GlobalInvestment:"+this.hashCode());
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
	
}
