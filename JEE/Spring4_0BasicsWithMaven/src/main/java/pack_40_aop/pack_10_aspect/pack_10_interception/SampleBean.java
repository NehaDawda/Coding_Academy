package pack_40_aop.pack_10_aspect.pack_10_interception;

public class SampleBean {
	
	public void method1(int x){
		System.out.println("Method1"+x);
	}
	
	public int method2(){
		System.out.println("Method2");
		return 0;
	}
	
	private void method3(){
		System.out.println("Method3");
	}
	public void method4(){
		System.out.println("Method4");
	}
}
