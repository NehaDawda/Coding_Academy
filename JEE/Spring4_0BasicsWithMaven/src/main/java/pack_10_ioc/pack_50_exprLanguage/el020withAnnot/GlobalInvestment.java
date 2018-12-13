package pack_10_ioc.pack_50_exprLanguage.el020withAnnot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component ("resourceBean")
@Scope("singleton")
public class GlobalInvestment {
	
	private @Value ("Gobal Investment Pvt. Ltd.")String firmName; // Thru constructor
	private @Value ("Ladder of success")         String companyMotto; // Thru constructor
	private Set<String> directorsPanel; // Thru setter-collection
	private List<String> contactDetails; // Thru setter-list
	private Map<String, String> branches; // Thru setter-collection
	
	@ Autowired
	private Address headOfficeAddress; // Thru setter-reference
	
	public GlobalInvestment() {
		super();
		directorsPanel = new HashSet<String>();
		directorsPanel.add("Mr. Malhotra");
		directorsPanel.add("Mr. Gihrotra");
		directorsPanel.add("Mr. Sanmitra");
		
		contactDetails = new ArrayList<String>(3);
		contactDetails.add("Landline:022 3089 1000(100 Lines)");
		contactDetails.add("Mobile: 9223912345");
		contactDetails.add("Fax: 022 3090 1234");
	
		branches = new HashMap<String, String>();
		branches.put("Mumbai", "Shop 123, Lane 6, Subhash Road");
		branches.put("Delhi", "Shop 234, Shoper's Stop, Link Road");
		branches.put("Kolkata", "Teen Hath Naka, Cross Road 2");
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

	public String getFirmName() {
		return firmName;
	}

	public String getCompanyMotto() {
		return companyMotto;
	}
	
	public int calculatedResult(){
		return 104;
	}
	
	public Set<String> getDirectorsPanel() {
		return directorsPanel;
	}

	public List<String> getContactDetails() {
		return contactDetails;
	}
	
	public Map<String, String> getBranches() {
		return branches;
	}

	public Address getHeadOfficeAddress() {
		return headOfficeAddress;
	}
	
	
}
