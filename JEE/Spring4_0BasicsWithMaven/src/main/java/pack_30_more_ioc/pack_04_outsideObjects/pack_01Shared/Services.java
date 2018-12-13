package pack_30_more_ioc.pack_04_outsideObjects.pack_01Shared;

public class Services {
	private GlobalInvestment globalInvestment;
	private String name;
	
	public void setGlobalInvestment(GlobalInvestment globalInvestment) {
		this.globalInvestment = globalInvestment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Services [globalInvestment=" + globalInvestment + "]";
	}
}
