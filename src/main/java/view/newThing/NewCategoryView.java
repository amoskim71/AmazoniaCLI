package view.newThing;

import java.util.Scanner;

import main.Main;
import model.Category;

public class NewCategoryView {
	
	private Category category;
	
	public void printView() {
		Scanner input = new Scanner(System.in);
		System.out.print(Main.getMessage("categoryName") + ": ");
		category = new Category(input.nextLine());
	}

	public Category getCategory() {
		return category;
	}
}
