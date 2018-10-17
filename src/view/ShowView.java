package view;

import java.util.List;

import model.Category;
import model.Product;

public class ShowView {
	public void printView(List<Product> productList, int categoryId) {
		for(int i = 0; i < productList.size(); i++) {
			if(productList.get(i).getCategoryId() == categoryId) {
				System.out.println("Name: " + productList.get(i).getProductName());
				System.out.println("Prize: " + productList.get(i).getProductPrize());
				System.out.println("Amount: " + productList.get(i).getProductStock() + "\n");	
			}
		}
	}
	
	public void printView(List<Product> productList) {
		for(int i = 0; i < productList.size(); i++) {
			System.out.println("Name: " + productList.get(i).getProductName());
			System.out.println("Prize: " + productList.get(i).getProductPrize());
			System.out.println("Amount: " + productList.get(i).getProductStock() + "\n");			
		}
	}
}
