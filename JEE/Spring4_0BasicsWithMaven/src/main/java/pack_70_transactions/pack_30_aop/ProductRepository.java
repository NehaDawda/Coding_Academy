package pack_70_transactions.pack_30_aop;

import java.util.List;

public interface ProductRepository {

	public void add(Product product);
	public Product get(int productId);
	public List<Product> getAll();
	public List<Product> getProductsByPrice(double rangeLower);
}
