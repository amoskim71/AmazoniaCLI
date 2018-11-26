package view.newThing;

import java.util.Scanner;

import main.Main;
import model.Product;

public class NewProductView {
	
	private Product product;
	
	public void printView() {
		Scanner input = new Scanner(System.in);
		System.out.print(Main.getMessage("productName")+": ");
		String productName = input.nextLine();
		System.out.print(Main.getMessage("categoryId")+": ");
		int categoryId = input.nextInt();
		System.out.print(Main.getMessage("stock")+": ");
		int productStock = input.nextInt();
		System.out.print(Main.getMessage("prize")+": ");
		double productPrize = input.nextDouble();
		product = new Product(productName, categoryId, productStock, productPrize);
	}

	public Product getProduct() {
		return product;
	}
}
