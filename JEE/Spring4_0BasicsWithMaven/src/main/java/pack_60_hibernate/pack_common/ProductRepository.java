package pack_60_hibernate.pack_common;

import java.util.List;

public interface ProductRepository {

	public void add(Product product);
	public Product get(int productId);
	public List<Product> getAll();
	public List<Product> getProductsByPrice(double rangeLower);
}
