package pack_10_ioc.pack_50_exprLanguage.el010withXml;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestExpressionLang010 {

	public static void main(String[] args) {
		String filePathRelative = "pack_10_ioc\\pack_50_exprLanguage\\el010withXml\\context.xml";
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(filePathRelative);
		System.out.println("Container loaded.");
		
		Report   beanResource2 = (Report) ctx.getBean("report");
		System.out.println(beanResource2);
		
		ctx.close();
	}
}
