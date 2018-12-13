package pack_20_lifecycle.pack_10_bean_lifecycle.pack40_beanFactoryPostProcessor;

public class SampleBean2 {
		private String companyName;
	
		public SampleBean2() {
			System.out.println("SampleBean2 class instantiated..");
		}
		
		public void setCompanyName(String name){
			companyName = name;
		}
		
		public String getCompanyName(){
			return companyName;
		}
		
		public void init() {
			System.out.println("SampleBean2 class initialized..");
		}
		
		public void destroy() {
			System.out.println("SampleBean2 class destroyed..");
		}
		
		public String toString(){
			return "From SampleBean2: "+companyName;
		}
	}
