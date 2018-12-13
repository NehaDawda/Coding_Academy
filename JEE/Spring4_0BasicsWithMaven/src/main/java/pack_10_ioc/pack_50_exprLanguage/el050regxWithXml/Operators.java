package pack_10_ioc.pack_50_exprLanguage.el050regxWithXml;

public class Operators {
	private String regX;
	private String regXResult;
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
