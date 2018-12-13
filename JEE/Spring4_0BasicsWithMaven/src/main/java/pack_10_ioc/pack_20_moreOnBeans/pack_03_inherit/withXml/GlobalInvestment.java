package pack_10_ioc.pack_20_moreOnBeans.pack_03_inherit.withXml;

public abstract class GlobalInvestment {
	
	private String firmName;
	private String companyMotto;
	
	public GlobalInvestment() {
		super();
		System.out.println("\tStateless bean: Hashcode from Constructor: "+this.hashCode());
	}

	
	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}


	public void setCompanyMotto(String companyMotto) {
		this.companyMotto = companyMotto;
	}


	@Override
	public String toString() {
		return "GlobalInvestment"
				+ ", \n\tfirmName="+ firmName
				+ "  \n\tcompanyMotto=" + companyMotto
				;
	}
}
