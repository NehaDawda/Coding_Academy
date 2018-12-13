package pack_10_ioc.pack_50_exprLanguage.el010withXml;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class GlobalInvestment {
	private String firmName; // Thru constructor
	private String companyMotto; // Thru constructor
	private Set<String> directorsPanel; // Thru setter-collection
	private List<String> contactDetails; // Thru setter-list
	private Map<String, String> branches; // Thru setter-collection
	
	private Address headOfficeAddress; // Thru setter-reference
	
	public GlobalInvestment() {
		super();
		System.out.println("In constructor.");
		firmName = "Gobal Investment Pvt. Ltd.";
		companyMotto = "Ladder of success";
		System.out.println("\tStateless bean: Hashcode from Constructor:"+this.hashCode());
	}

	public GlobalInvestment(String firmName, String companyMotto) {
		super();
		this.firmName = firmName;
		this.companyMotto = companyMotto;
		System.out.println("\tStateless bean: Hashcode from Constructor:"+this.hashCode());
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

	public void setDirectorsPanel(Set<String> directorsPanel) {
		this.directorsPanel = directorsPanel;
	}

	public List<String> getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(List<String> contactDetails) {
		this.contactDetails = contactDetails;
	}
	
	public Map<String, String> getBranches() {
		return branches;
	}

	public void setBranches(Map<String, String> branches) {
		this.branches = branches;
	}

	public Address getHeadOfficeAddress() {
		return headOfficeAddress;
	}

	public void setHeadOfficeAddress(Address headOfficeAddress) {
		this.headOfficeAddress = headOfficeAddress;
	}

	@Override
	public String toString() {
		return "GlobalInvestment [\nfirmName=" + firmName + ", \ncompanyMotto="
				+ companyMotto + ", \ndirectorsPanel=" + directorsPanel
				+ ", \ncontactDetails=" + contactDetails + ", \nbranches="
				+ branches + "]";
	}
}
