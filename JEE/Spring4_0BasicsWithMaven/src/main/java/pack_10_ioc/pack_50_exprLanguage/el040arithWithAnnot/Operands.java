package pack_10_ioc.pack_50_exprLanguage.el040arithWithAnnot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Operands {
	@Value("150") private int value1;
	@Value("200") private int value2;
	
	public int getValue1() {
		return value1;
	}
	
	public int getValue2() {
		return value2;
	}
	
	@Override
	public String toString() {
		return "Operands [value1=" + value1 + ", value2=" + value2 + "]";
	}
}
