package pack_10_ioc.pack_50_exprLanguage.el020withAnnot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("report")
public class Report {
	private @Value ("#{resourceBean.firmName}")     String firmName; 
	private @Value ("#{resourceBean.companyMotto}") String companyMotto;
	private @Value ("#{resourceBean.calculatedResult()}") int calcResult;
	private @Value ("#{resourceBean.branches['Mumbai']}") String mapElement;
	private @Value ("#{resourceBean.directorsPanel[0]}") String setElement;
	private @Value ("#{resourceBean.contactDetails[0]}") String listElement;
	private @Value ("#{resourceBean.headOfficeAddress.city}") String city;
	
	public Report(){}
	

	public String getFirmName() {
		return firmName;
	}

	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}

	public String getCompanyMotto() {
		return companyMotto;
	}

	public void setCompanyMotto(String companyMotto) {
		this.companyMotto = companyMotto;
	}

	@Override
	public String toString() {
		return "Report [\nfirmName=" + firmName + ", \ncompanyMotto="
				+ companyMotto + ", \ncalcResult=" + calcResult + ", \nmapElement="
				+ mapElement + ", \nsetElement=" + setElement + ", \nlistElement="
				+ listElement + ", \nCity=" + city + "\n]";
	}
}
