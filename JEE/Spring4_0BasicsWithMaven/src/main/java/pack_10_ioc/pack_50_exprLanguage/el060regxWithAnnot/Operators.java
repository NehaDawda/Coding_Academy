package pack_10_ioc.pack_50_exprLanguage.el060regxWithAnnot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Operators {
	/*@Value("#{operands.value1 == operands.value2}")                private boolean equalTest;
	<property name="regX" value="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$" />
	<property name="regXResult" value="#{(operands.email matches '^[_A-Za-z0-9-\+]+(\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\.[A-Za-z0-9]+)*(\.[A-Za-z]{2,})$')== true ? '-Yes there is a match.' : '-No there is no match.' }" />
	<property name="numberResult" value="#{ ('100' matches '\d+') == true ? '-Yes this is digit.' : '-No this is not a digit.' }" />*/
	@Value("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
		private String regX;
	@Value("#{(operands.email matches \'^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$\')== true ? '-Yes there is a match.' : '-No there is no match.' }")  
		private String regXResult;
	@Value("#{ (\'100\' matches \'\\d+\') == true ? \'-Yes this is digit.\' : \'-No this is not a digit.\' }")  
		private String numberResult;
	
	public String getRegX() {
		return regX;
	}
	public void setRegX(String regX) {
		this.regX = regX;
	}
	public String getRegXResult() {
		return regXResult;
	}
	public void setRegXResult(String regXResult) {
		this.regXResult = regXResult;
	}
	public String getNumberResult() {
		return numberResult;
	}
	public void setNumberResult(String numberResult) {
		this.numberResult = numberResult;
	}
	
	@Override
	public String toString() {
		return 
				"TestExpressionLang010 :  \n Does Operands.email match the ^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$ " 
				+ regXResult + "\n Is 100 a valid number ? " + numberResult; 
	}
}
