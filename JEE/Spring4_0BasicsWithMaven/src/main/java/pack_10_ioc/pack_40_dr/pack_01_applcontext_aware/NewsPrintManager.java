package pack_10_ioc.pack_40_dr.pack_01_applcontext_aware;

import javax.annotation.Resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class NewsPrintManager {//implements ApplicationContextAware {
	
	@Resource
	private ApplicationContext ctx;
	
	public void setApplicationContext(ApplicationContext ctx)
	throws BeansException {
		
		this.ctx = ctx;
	}
	
	public NewsPrintManager() {
		System.out.println("Hashcode for NewsPrintManager from constructor"+this.hashCode());
	}

	public void printNews(){
		TodaysNews dtNews = ctx.getBean("todays_news", TodaysNews.class);  
		System.out.println(dtNews.getNews());
		System.out.println("Hashcode TodaysNews from client(NewsPrintManager):"+dtNews.hashCode());
	}
}
