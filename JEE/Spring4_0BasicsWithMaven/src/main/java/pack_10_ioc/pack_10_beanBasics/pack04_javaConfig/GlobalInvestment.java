package pack_10_ioc.pack_10_beanBasics.pack04_javaConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

public class GlobalInvestment {
	
	private String firmName; // @Value ("Gobal Investment Pvt. Ltd..") 
	private @Value ("Ladder of success")String companyMotto; 
	
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
	
	@Value("Chandra and Company.")
	public void setFirmName(String firmName){
		System.out.println("Calling setter method.");
		this.firmName = firmName;
	}
}
