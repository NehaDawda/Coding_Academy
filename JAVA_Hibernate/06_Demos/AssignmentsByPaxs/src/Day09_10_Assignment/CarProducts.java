/**
 * 
 */
package Day09_10_Assignment;

/**
 * @author Bhalchandra Kantikar
 *
 */
public class CarProducts  implements Comparable<CarProducts>{
	int productId;
	String company;
	String carModel;
	String colour;
	int price;
	public CarProducts(int productId, String company, String carModel, String colour, int price) {
		super();
		this.productId = productId;
		this.company = company;
		this.carModel = carModel;
		this.colour = colour;
		this.price = price;
	}
	@Override
	public int compareTo(CarProducts o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CarProducts [productId=" + productId + ", company=" + company + ", carModel=" + carModel + ", colour="
				+ colour + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return productId;
	}
	public boolean equals(CarProducts obj) {
		// TODO Auto-generated method stub
		return this.getProductId()==obj.getProductId();
	}
	
}
