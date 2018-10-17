package view;

import java.util.Scanner;

public class MenuView {
	
	private String selectOption;
	
	public void printView(boolean isAdmin) {
		Scanner input = new Scanner(System.in);
		if(isAdmin) {
			System.out.println("1. Create a product.");
			System.out.println("2. Create a category.");
			System.out.println("3. Edit product.");
			System.out.println("4. Search product.");
			System.out.println("5. Exit.");
		}else {
			System.out.println("1. Show all products.");
			System.out.println("2. Show all products from a category.");
			System.out.println("3. Search product.");
			System.out.println("4. Buy a product.");
			System.out.println("5. My profile");
			System.out.println("6. Exit.");
		}
		System.out.print("\nSelect an option: ");
		selectOption = input.nextLine();
	}

	public String getSelectOption() {
		return selectOption;
	}
}
