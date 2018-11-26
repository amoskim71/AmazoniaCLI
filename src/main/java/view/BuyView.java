package view;

import java.util.Scanner;

import main.Main;
 

public class BuyView {
	
	private int id;
	private int amount;
	
	public void printInputProduct() {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("\n----- " + Main.getMessage("buyProductMenu") + " -----");
			System.out.print(Main.getMessage("productId") + ": ");
			id = input.nextInt();
			System.out.print(Main.getMessage("amount_default") + ": ");
			amount = input.nextInt();
			amount = amount > 0 ? amount : 1;
		}catch(Exception e) {
			System.out.println(Main.getMessage("inputErrorMessage"));
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
