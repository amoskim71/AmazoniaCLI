package view;

import java.util.Scanner;

import controller.ShowProductController;

public class BuyView {
	
	private int id;
	private int amount;
	
	public void printInputProduct() {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("\n----- BUY A PRODUCT (0 to cancel) -----");
			System.out.print("Product id: ");
			id = input.nextInt();
			System.out.print("Amount(default = 1): ");
			amount = input.nextInt();
			amount = amount > 0 ? amount : 1;
		}catch(Exception e) {
			System.out.println("An input error has ocurred.");
			printInputProduct();
		}
		
	}

	public int getId() {
		return id;
	}

	public int getAmount() {
		return amount;
	}
}
