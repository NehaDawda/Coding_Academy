package pack_40_aop.pack_10_aspect.pack_joinpoints.pack_cust;


public class CustomerServiceImpl implements CustomerService {

	public void applyForChequeBook(long acno) {
		
		System.out.println("\t\tsome business logic for applyForChequeBook");
		
	}
	
	public void applyForCreditCard(String name, String address) {
		System.out.println("\t\tsome business logic for applyForCreditCard");
	}
	
	public void stopCheque(long acno, int chequeNo) {
		System.out.println("\t\tsome business logic for stopCheque");
	}
	
	public void transfer(long fromacno, long toacno, double amt) {
		System.out.println("\t\tsome business logic for transfer");
	}
}
