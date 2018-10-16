package view;

import java.awt.print.Book;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.*;

public class ProfileView{
	
	public void printView(String email, String username, Date lastLogin, List<Product> productList) {
		System.out.println("----PROFILE----");
		System.out.println("Email: " + email);
		System.out.println("Username: " + username);
		System.out.println("Last login: " + lastLogin);
		System.out.println("---------------\n");
		System.out.println("----SHOPPING HISTORY----\n");
		for(int i = 0; i < productList.size(); i++) {
			System.out.println("Name: " + productList.get(i).getProductName());
			System.out.println("Prize: " + productList.get(i).getProductPrize());
			System.out.println("Amount: " + productList.get(i).getProductStock() + "\n");
		}
		System.out.println("------------------------\n");
		System.out.print("\nInput something to exit: ");
		Scanner input = new Scanner(System.in);
		String exit = input.nextLine();
	}
}
