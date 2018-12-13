package pack_10_ioc.pack_50_exprLanguage.el010withXml;

public class Report {
	private String firmName; // Thru constructor
	private String companyMotto; // Thru constructor
	private int calcResult;
	private String mapElement;
	private String setElement;
	private String listElement;
	private String city;
	
	public Report(String firmName, String companyMotto){
		this.firmName = firmName;
		this.companyMotto = companyMotto;
	}

	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}
	public void setCompanyMotto(String companyMotto) {
		this.companyMotto = companyMotto;
	}
	public void setCalcResult(int calcResult) {
		this.calcResult = calcResult;
	}
	public void setMapElement(String mapElement) {
		this.mapElement = mapElement;
	}
	public void setSetElement(String setElement) {
		this.setElement = setElement;
	}
	public void setListElement(String listElement) {
		this.listElement = listElement;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Report [\nfirmName=" + firmName + ", \ncompanyMotto="
				+ companyMotto + ", \ncalcResult=" + calcResult + ", \nmapElement="
				+ mapElement + ", \nsetElement=" + setElement + ", \nlistElement="
				+ listElement + ", \nCity=" + city + "\n]";
	}

}
