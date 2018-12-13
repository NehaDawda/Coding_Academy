package pack_20_lifecycle.pack_10_bean_lifecycle.pack40_beanPostProcessors;

public class SampleBean1Proxy  implements ISampleBean1{
	private SampleBean1 bean;
	
	public SampleBean1Proxy(SampleBean1 bean){
		this.bean = bean;
	}
	
	public String toString(){
		return "From SampleBean1 Proxy: "+bean.getCompanyName();
	}
}
