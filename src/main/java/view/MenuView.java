package view;

import java.util.Scanner;

import main.Main;

public class MenuView extends View{
	
	private String selectOption;
	
	public void printView(boolean isAdmin) {
		System.out.println("---- MENU ----\n");
		Scanner input = new Scanner(System.in);
		if(isAdmin) {
			System.out.println("1. " + Main.getMessage("createProduct") + ".");
			System.out.println("2. " + Main.getMessage("createCategory") + ".");
			System.out.println("3. " + Main.getMessage("exit") + ".");
		}else{
			System.out.println("1. " + Main.getMessage("showAllProducts") + ".");
			System.out.println("2. " + Main.getMessage("showAllProductsFromCategory") + ".");
			System.out.println("3. " + Main.getMessage("my_profile") + ".");
			System.out.println("4. " + Main.getMessage("exit") + ".");
		}
		System.out.print("\n" + Main.getMessage("select") + ": ");
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
