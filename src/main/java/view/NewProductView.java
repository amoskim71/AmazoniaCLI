package view;

import java.util.Scanner;

import model.Product;

public class NewProductView {
	
	private Product product;
	
	public void printView() {
		Scanner input = new Scanner(System.in);
		System.out.print("Product name: ");
		String productName = input.nextLine();
		System.out.print("Category Id: ");
		int categoryId = input.nextInt();
		System.out.print("Stock: ");
		int productStock = input.nextInt();
		System.out.print("Prize (','): ");
		double productPrize = input.nextDouble();
		product = new Product(productName, categoryId, productStock, productPrize);
	}

	public Product getProduct() {
		return product;
	}
}
