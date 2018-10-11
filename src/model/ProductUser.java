package model;

import java.util.ArrayList;
import java.util.List;

public class ProductUser {
	
	private int userId;
	private List<Product> productHistory;
	
	public ProductUser(User user) {
		this.userId = user.getUserId();
		productHistory = new ArrayList();
	}
	
	public void buyProduct(Product productToBuy, int amount) {
		Product copy = new Product();
		copy.copyProduct(productToBuy);
		copy.setProductStock(amount);
		productHistory.add(copy);
	}
	
	public void buyProduct(Product productToBuy) {
		this.buyProduct(productToBuy, 1);
	}
	
	public boolean containsProduct(Product product) {
		boolean contain = false;
		for(int i = 0; i < productHistory.size(); i++) {
			if(product.compareProduct(productHistory.get(i))) {
				contain = true;
				break;
			}
		}
		return contain;
	}
	
	public int getUserId() {
		return userId;
	}
}
