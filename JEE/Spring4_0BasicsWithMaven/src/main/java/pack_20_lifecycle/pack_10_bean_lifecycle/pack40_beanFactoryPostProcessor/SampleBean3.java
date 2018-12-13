package pack_20_lifecycle.pack_10_bean_lifecycle.pack40_beanFactoryPostProcessor;


public class SampleBean3 {
private String companyName;
	
	public SampleBean3() {
		System.out.println("SampleBean3 class instantiated..");
	}
	
	public void setCompanyName(String name){
		companyName = name;
	}
	
	public String getCompanyName(){
		return companyName;
	}
	
	public String toString(){
		return "From SampleBean3: "+companyName;
	}
}
