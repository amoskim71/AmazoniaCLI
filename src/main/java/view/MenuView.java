package view;

import java.util.Scanner;

public class MenuView extends View{
	
	private String selectOption;
	
	/*
	 * If the user authenticates as administrator, this menu is displayed
	 */
	public void printView(boolean isAdmin) {
		System.out.println("---- MENU ----\n");
		Scanner input = new Scanner(System.in);
		if(isAdmin) {
			System.out.println("1. Create a product.");
			System.out.println("2. Create a category.");
			System.out.println("3. Exit.");
		}else{
			System.out.println("1. Show all products.");
			System.out.println("2. Show all products from a category.");
			System.out.println("3. My profile");
			System.out.println("4. Exit.");
		}
		System.out.print("\nSelect an option: ");
		selectOption = input.nextLine();
	}

	public String getSelectOption() {
		return selectOption;
	}

	@Override
	public void printView() {
		// TODO Auto-generated method stub
		
	}
}
