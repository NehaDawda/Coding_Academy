/**
 * 
 */
package Day09_10_Assignment;

import java.util.Comparator;

/**
 * @author Bhalchandra Kanitkar
 *
 */
public class ProductIdComparator implements Comparator<CarProducts> {
	
	@Override
	public int compare(CarProducts o1,CarProducts o2) {
		// TODO Auto-generated method stub
		/*CarProducts c1 = (CarProducts) o1;
		CarProducts c2 = (CarProducts) o2;
		if(c1.productId==c2.productId) {
			return 0;
		}else if (c1.productId>c2.productId) {
			return 1;
		}else {
			return -1;
		}*/
		return o1.getProductId()-o2.getProductId();
	}
}