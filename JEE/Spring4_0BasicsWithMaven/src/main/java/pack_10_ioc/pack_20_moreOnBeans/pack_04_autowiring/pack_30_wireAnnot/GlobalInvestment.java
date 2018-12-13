package pack_10_ioc.pack_20_moreOnBeans.pack_04_autowiring.pack_30_wireAnnot;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.stereotype.Service;

@ Service ("resourceBean")
public class GlobalInvestment implements IGlobInvestment {
	private String firmName; // Thru constructor
	private String companyMotto; // Thru constructor
	private int globalRank; // Thru setter
	
	private String headOfDirectors; // Thru setter
	private Set<String> directorsPanel; // Thru setter-collection
	
	private List<String> contactDetails; // Thru setter-list
	
	private Map<String, String> branches; // Thru setter-collection
	private Properties branchManagers; // Thru setter-Properties
	
	private Properties serverIps; // Thru setter-properties-Another config.
	
	public GlobalInvestment() {
		super();
		firmName = "Gobal Investment Pvt. Ltd.";
		companyMotto = "Ladder of success";
		System.out.println("Hashcode GlobalInvestment from Constructor:"+this.hashCode());
	}

	public GlobalInvestment(String firmName, String companyMotto) {
		super();
		this.firmName = firmName;
		this.companyMotto = companyMotto;
		System.out.println("Hashcode GlobalInvestment from Constructor:"+this.hashCode());
	}

	public String getFirmName() {
		return firmName;
	}
	
	public String getCompanyMotto() {
		return companyMotto;
	}
	
	public int getGlobalRank() {
		return globalRank;
	}

	public void setGlobalRank(int globalRank) {
		this.globalRank = globalRank;
	}

	public String getHeadOfDirectors() {
		return headOfDirectors;
	}

	public void setHeadOfDirectors(String headOfDirectors) {
		this.headOfDirectors = headOfDirectors;
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
	
	public Properties getBranchManagers() {
		return branchManagers;
	}

	public void setBranchManagers(Properties branchManagers) {
		this.branchManagers = branchManagers;
	}

	public Properties getServerIps() {
		return serverIps;
	}

	public void setServerIps(Properties serverIps) {
		this.serverIps = serverIps;
	}

	@Override
	public String toString() {
		return "GlobalInvestment"
				+ ", \n\tfirmName="+ firmName
				+ "  \n\tcompanyMotto=" + companyMotto
				+ ", \n\tglobalRank=" + globalRank
				+ ", \n\theadOfDirectors=" + headOfDirectors
				+ ", \n\tdirectorsPanel=" + directorsPanel
				+ ", \n\tcontactDetails=" + contactDetails
				+ ", \n\tbranches=" + branches
				+ ", \n\tbranchManagers=" + branchManagers
				+ ", \n\tserverIps=" + serverIps
				;
	}
}
