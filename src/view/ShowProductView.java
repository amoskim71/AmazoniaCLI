package view;

import java.util.List;

import model.Product;

public class ShowProductView {	
	public void printProduct(String name, double prize, int stock, int productId) {
		System.out.println("------------------------");
		System.out.println("Name: " + name);
		System.out.println("Prize: " + prize);
		System.out.println("Amount: " + stock);
		System.out.println("Product id: " + productId);
		System.out.println("------------------------\n");
	}
}
