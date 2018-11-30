package view.show;

import main.Main;

public class ShowProductView {	
	public void printProduct(String name, double prize, int stock, int productId) {
		System.out.println("------------------------");
		System.out.println(Main.getMessage("name")+": " + name);
		System.out.println(Main.getMessage("prize")+"Prize: " + prize + "€");
		System.out.println(Main.getMessage("stock") + ": " + stock);
		System.out.println(Main.getMessage("Id") +": " + productId);
		System.out.println("------------------------\n");
	}
}
