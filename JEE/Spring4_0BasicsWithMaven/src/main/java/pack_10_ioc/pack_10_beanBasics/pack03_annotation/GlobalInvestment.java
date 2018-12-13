package pack_10_ioc.pack_10_beanBasics.pack03_annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component ("resourceBean")
@Scope("singleton")
public class GlobalInvestment {
	
	private @Value ("Gobal Investment Pvt. Ltd.")String firmName; // Thru constructor
	private @Value ("Ladder of success")String companyMotto; // Thru constructor
	
	public GlobalInvestment() {
		super();
		System.out.println("\tStateless bean: Hashcode from Constructor: "+this.hashCode());
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
