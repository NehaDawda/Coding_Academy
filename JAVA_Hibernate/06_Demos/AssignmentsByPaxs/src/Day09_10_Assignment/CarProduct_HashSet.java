/**
 * 
 */
package Day09_10_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Bhalchandra Kanitkar
 *
 */
public class CarProduct_HashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarProducts cp1 = (new CarProducts(300, "Hundai", "Santro", "White", 500000));
		CarProducts cp2 = (new CarProducts(100, "Hundai", "i10", "grey", 700000));
		HashSet<CarProducts> carList = new HashSet<CarProducts>();
		carList.add(cp1);
		carList.add(cp2);
		carList.add(new CarProducts(200, "Honda", "Honda-City", "Light-grey", 1000000));
		System.out.println("Before sorting...");
		for (CarProducts carProducts : carList) {
			System.out.println("ProductID: "+carProducts.productId+" Company Name: "+carProducts.company+" Model: "+carProducts.carModel
					+" Colour: "+carProducts.colour+" Price: "+carProducts.price);
		}
		// Can you sort using Hash Set??
		List sortedList = new ArrayList(carList);
		Collections.sort(sortedList, new ProductIdComparator());
		System.out.println();
		System.out.println("After Sorting...");
		for (CarProducts carProducts : carList) {
			System.out.println("ProductID: "+carProducts.productId+" Company Name: "+carProducts.company+" Model: "+carProducts.carModel
					+" Colour: "+carProducts.colour+" Price: "+carProducts.price);
		}
		/*Iterator itr = carList.iterator();
		while(itr.hasNext()) {
			CarProducts car =(CarProducts) itr.next();
			System.out.println ("ProductID: "+car.productId+" Company Name: "+car.company+" Model: "+car.carModel
					+" Colour: "+car.colour+" Price: "+car.price);
		}*/
		
		
	}

}

/*Output:

Before sorting...
ProductID: 300 Company Name: Hundai Model: Santro Colour: White Price: 500000
ProductID: 200 Company Name: Honda Model: Honda-City Colour: Light-grey Price: 1000000
ProductID: 100 Company Name: Hundai Model: i10 Colour: grey Price: 700000

After Sorting...
ProductID: 300 Company Name: Hundai Model: Santro Colour: White Price: 500000
ProductID: 200 Company Name: Honda Model: Honda-City Colour: Light-grey Price: 1000000
ProductID: 100 Company Name: Hundai Model: i10 Colour: grey Price: 700000*/

