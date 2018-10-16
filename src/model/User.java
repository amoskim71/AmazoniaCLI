package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class User {
	
	private String email;
	private String username;
	private String password;
	private Date lastLogin;
	private int userId;
	private boolean admin;
	
	private List<Product> productHistory;
	
	private static int generateId = 0;
	
	public User(String email, String username,String password, boolean admin) {
		this.userId = ++this.generateId;
		this.email = email;
		this.username = username;
		this.password = password;
		this.admin = admin;
		lastLogin = new Date();
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
	
	public Product getProductFromHistory(int index) {
		return productHistory.get(index);
	}

	public List<Product> getProductHistory() {
		return this.productHistory;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public int getUserId() {
		return userId;
	}
}
