package pack_10_ioc.pack_50_exprLanguage.el030arithWithXml;

public class Operators {
	private boolean equalTest;
	private boolean ltTest;
	private boolean leTest;
	private boolean gtTest;
	private boolean geTest;
	private boolean andTest;
	private int addTest;
	private String concatStrTest;
	private String ternaryTest;
	
	public void setEqualTest(boolean equalTest) {
		this.equalTest = equalTest;
	}
	public void setLtTest(boolean ltTest) {
		this.ltTest = ltTest;
	}
	public void setLeTest(boolean leTest) {
		this.leTest = leTest;
	}
	public void setGtTest(boolean gtTest) {
		this.gtTest = gtTest;
	}
	public void setGeTest(boolean geTest) {
		this.geTest = geTest;
	}
	public void setAndTest(boolean andTest) {
		this.andTest = andTest;
	}
	public int isAddTest() {
		return addTest;
	}
	public void setAddTest(int addTest) {
		this.addTest = addTest;
	}
	public void setConcatStrTest(String concatStrTest) {
		this.concatStrTest = concatStrTest;
	}
	public void setTernaryTest(String ternaryTest) {
		this.ternaryTest = ternaryTest;
	}
	
	@Override
	public String toString() {
		return "Operators [\nequalTest=" + equalTest + ", \nltTest=" + ltTest
				+ ", \nleTest=" + leTest + ", \ngtTest=" + gtTest + ", \ngeTest="
				+ geTest + ", \nandTest=" + andTest + ", \naddTest=" + addTest
				+ ", \nconcatStrTest=" + concatStrTest 
				+ ", \nternaryTest=" + ternaryTest + "\n]";
	}
}
