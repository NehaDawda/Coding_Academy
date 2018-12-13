package pack_10_ioc.pack_50_exprLanguage.el040arithWithAnnot;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestExpressionLang010 {

	public static void main(String[] args) {
		String filePathRelative = "pack_10_ioc\\pack_50_exprLanguage\\el040arithWithAnnot\\context.xml";
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(filePathRelative);
		System.out.println("Container loaded.");
		
		Operators   operator = (Operators) ctx.getBean("operators");
		System.out.println(operator);
		
		ctx.close();
	}
}
