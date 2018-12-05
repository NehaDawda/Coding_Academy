import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * java.util.date to java.sql.date
 */
public class DatesConversion {

	public static void main(String[] args) {
// creating instances of java.util.Date which represents today's date and time
		java.util.Date now = new java.util.Date();
		System.out.println("Value of java.util.Date : " + now);

// converting java.util.Date to java.sql.Date in Java
		java.sql.Date sqlDate = 
				new java.sql.Date(now.getTime());
		System.out.println("Converted value of java.sql.Date : " + sqlDate);

// converting java.sql.Date to java.util.Date back
		java.util.Date utilDate = 
				new java.util.Date(sqlDate.getTime());
		System.out.println("Converted value of java.util.Date : " + utilDate);
//
		DateFormat df = new SimpleDateFormat("dd-MON-YYYY");
		System.out.println("Using a dateFormat date is : " 
		+ df.format(utilDate));
	}
}