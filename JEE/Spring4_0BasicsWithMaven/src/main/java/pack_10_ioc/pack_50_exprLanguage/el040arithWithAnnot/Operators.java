package pack_10_ioc.pack_50_exprLanguage.el040arithWithAnnot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Operators {
	@Value("#{operands.value1 == operands.value2}")                private boolean equalTest;
	@Value("#{operands.value1 lt operands.value2}")                private boolean ltTest;
	@Value("#{operands.value1 le operands.value2}")                private boolean leTest;
	@Value("#{operands.value1 gt operands.value2}")                private boolean gtTest;
	@Value("#{operands.value1 ge operands.value2}")                private boolean geTest;
	@Value("#{operands.value1 == 150 and operands.value2 == 200}") private boolean andTest;
	@Value("#{operands.value1 + operands.value2}")                 private int addTest;
	@Value("#{'Hello' + ' New ' + 'World'}")                       private String concatStrTest;
	@Value("#{operands.value1 != operands.value2 ? 'not equal' : 'equal'}") private String ternaryTest;
	
	@Override
	public String toString() {
		return "Operators [\nequalTest=" + equalTest + ", \nltTest=" + ltTest
				+ ", \nleTest=" + leTest + ", \ngtTest=" + gtTest + ", \ngeTest="
				+ geTest + ", \nandTest=" + andTest + ", \naddTest=" + addTest
				+ ", \nconcatStrTest=" + concatStrTest 
				+ ", \nternaryTest=" + ternaryTest + "\n]";
	}
}
