/**
 * 
 */

//step 1 : package declaration(none/one)
//step 2 : import statements if requires(none/more)
import java.util.Date;

/**
 * @author Smita
 *
 */
//step 3 : public class
public class Customer {
	//step 4 : private instance variables or protected in case of inheritance
	//protected means available within the package and to the sub-class outside the package
	protected int custId;
	protected String firstName;
	protected String lastName;
	protected String phoneNo;
	protected String email;
	protected Date dob;
	//step 4 : private static variables
	private static int numId;//automatic id generation
	//step 5 : static initializer block - used to initialize static field
	static {
		System.out.println("****Static Initializer Block**** executed only once and before constuctor");
		//automatic id generation
		numId=1000+(int) (Math.random()*22.123);//explicitly type cast long to int
	}
	//step 6: initializer block
	{
		System.out.println("**** Initializer Block****executed for every object and before constuctor");
		custId=numId;//assigned the auto-generated numId to custId
	}
	//step 6: No-arg Constructor
	public Customer() {
		System.out.println("****No-arg Constructor of Customer****executed for every object created using default constructor");
	}
	//step 6: Overloaded Constructor
	public Customer(String firstName, String lastName, String phoneNo, String email, Date dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.email = email;
		this.dob = dob;
	}
	// step 7: Generate getters and setters
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	// step 8: Generate toString()
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNo="
				+ phoneNo + ", email=" + email + ", dob=" + dob + "]";
	}

}
