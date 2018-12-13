package pack_40_aop.pack_10_aspect.pack_joinpoints.pack_buss;

//import org.springframework.jdbc.BadSqlGrammarException;

public class BusinessComponent implements BusinessInterface {

	public String someBusinessMethod() { // throws BusinessException {
		System.out.println("\tIn Bussiness Method.");
		
		return "Message from Business Method";
	}
	
	public void methodThrowingException() throws BusinessException {
		//we are raising a different exception to see the aspects coming into action
		//throw new BadSqlGrammarException("","",null);
		throw new NullPointerException("101");
	}
}
