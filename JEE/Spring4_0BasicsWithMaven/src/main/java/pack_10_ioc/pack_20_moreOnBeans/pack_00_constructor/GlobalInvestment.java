package pack_10_ioc.pack_20_moreOnBeans.pack_00_constructor;

public class GlobalInvestment {
	private String firmName; // Thru constructor
	private String companyMotto; // Thru constructor
	private int globalRank; // Thru setter
	
	private Address headOfficeAddress; // Thru setter-reference

	public GlobalInvestment(String firmName, String companyMotto) {
		super();
		this.firmName = firmName;
		this.companyMotto = companyMotto;
		System.out.println("Constructor with parameters 1. firmName, 2. companyMotto");
	}
	
	public GlobalInvestment(String firmName, String companyMotto, int globalRank, Address headOfficeAddress) {
		super();
		this.firmName = firmName;
		this.companyMotto = companyMotto;
		this.globalRank = globalRank;
		this.headOfficeAddress = headOfficeAddress;
		System.out.println("Constructor with parameters 1. firmName, 2. companyMotto, 3. Global Rank, 4. Address");
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
