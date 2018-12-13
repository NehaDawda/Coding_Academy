package pack_20_lifecycle.pack_10_bean_lifecycle.pack40_beanFactoryPostProcessor;

public class SampleBean1 {
	private String companyName;
	
	public SampleBean1() {
		System.out.println("SampleBean1 class instantiated..");
	}
	
	public void setCompanyName(String name){
		companyName = name;
	}
	
	public String getCompanyName(){
		return companyName;
	}
	
	public void init() {
		System.out.println("SampleBean1 class initialized..");
	}
	
	public void destroy() {
		System.out.println("SampleBean1 class destroyed..");
	}
	
	public String toString(){
		return "From SampleBean1: "+companyName;
	}
}
