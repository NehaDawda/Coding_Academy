package pack_10_ioc.pack_40_dr.pack_01_applcontext_aware;

public class TodaysNews {
	
	static int newsNumber=0;
	String todaysNews="Hockey India Federation's Elections in Limbo";
	
	public TodaysNews(){
		newsNumber++;
		System.out.println("Hashcode of TodaysNews from constructor"+this.hashCode());
	}
	
	public String getNews(){
		return newsNumber+" "+todaysNews;
	}
}
