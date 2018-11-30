package view.show;

import java.util.Date;
import java.util.List;

import main.Main;
import model.*;

public class ProfileView{
	
	public void printView(String email, String username, Date lastLogin, List<Product> productList) {
		System.out.println("----"+ Main.getMessage("profile") +"----");
		System.out.println(Main.getMessage("email")+": " + email);
		System.out.println(Main.getMessage("username")+": " + username);
		System.out.println(Main.getMessage("lastLogin") + ": " + lastLogin);
		System.out.println("---------------\n");
		System.out.println("----"+ Main.getMessage("shoppingHistory") +"----\n");
		for(int i = 0; i < productList.size(); i++) {
			System.out.println(Main.getMessage("name")+": " + productList.get(i).getProductName());
			System.out.println(Main.getMessage("prize")+": " + productList.get(i).getProductPrize());
			System.out.println(Main.getMessage("stock")+": " + productList.get(i).getProductStock());
			System.out.println(Main.getMessage("Id")+": " + productList.get(i).getProductId() + "\n");
		}
		System.out.println("------------------------\n");
	}
}
