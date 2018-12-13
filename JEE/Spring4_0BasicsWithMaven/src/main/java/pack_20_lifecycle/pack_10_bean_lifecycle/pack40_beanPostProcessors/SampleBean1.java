package pack_20_lifecycle.pack_10_bean_lifecycle.pack40_beanPostProcessors;

public class SampleBean1  implements ISampleBean1{
	private String companyName;
	
	public SampleBean1() {
		System.out.println("SampleBean1 class instantiated.");
	}
	
	public SampleBean1(String companyName) {
		System.out.println("SampleBean1 class instantiated by para-constructor.");
		this.companyName = companyName;
	}
	
	public void setCompanyName(String name){
		System.out.println("SampleBean1 properties applied.");
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
