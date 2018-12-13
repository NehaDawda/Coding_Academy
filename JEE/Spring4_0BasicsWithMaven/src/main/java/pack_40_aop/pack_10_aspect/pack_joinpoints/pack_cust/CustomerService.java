package pack_40_aop.pack_10_aspect.pack_joinpoints.pack_cust;

public interface CustomerService {

	public void applyForChequeBook(long acno);

	public void applyForCreditCard(String name, String address);

	public void stopCheque(long acno, int chequeNo);

	public void transfer(long fromacno, long toacno, double amt);
}