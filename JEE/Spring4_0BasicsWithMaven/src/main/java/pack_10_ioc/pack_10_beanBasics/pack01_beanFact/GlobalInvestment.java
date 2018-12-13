package pack_10_ioc.pack_10_beanBasics.pack01_beanFact;

public class GlobalInvestment {
	private String firmName; // Thru constructor
	private String companyMotto; // Thru constructor
	private int globalRank; // Thru setter
	
	private Address headOfficeAddress; // Thru setter-reference
	
	public GlobalInvestment() {
		super();
		System.out.println("In constructor.");
		firmName = "Gobal Investment Pvt. Ltd.";
		companyMotto = "Ladder of success";
		System.out.println("Hashcode from Constructor:"+this.hashCode());
	}

	public GlobalInvestment(String firmName, String companyMotto) {
		super();
		this.firmName = firmName;
		this.companyMotto = companyMotto;
		System.out.println("Hashcode from Constructor:"+this.hashCode());
	}

	public String getFirmName() {
		return firmName;
	}
	
	public String getCompanyMotto() {
		return companyMotto;
	}
	
	// Getter Setter initialization
	public int getGlobalRank() {
		return globalRank;
	}

	public void setGlobalRank(int globalRank) {
		this.globalRank = globalRank;
	}
	
	// For plumbing.
	public Address getHeadOfficeAddress() {
		return headOfficeAddress;
	}

	public void setHeadOfficeAddress(Address headOfficeAddress) {
		this.headOfficeAddress = headOfficeAddress;
	}

	@Override
	public String toString() {
		return "GlobalInvestment"
				+ ", \n\tfirmName="+ firmName
				+ "  \n\tcompanyMotto=" + companyMotto
				+ ", \n\tglobalRank=" + globalRank
				+ ", \n\theadOfficeAddress=" + headOfficeAddress
				;
	}
}
