package view.newThing;

import java.util.Scanner;

import model.Category;

public class NewCategoryView {
	
	private Category category;
	
	public void printView() {
		Scanner input = new Scanner(System.in);
		System.out.print("Category name: ");
		category = new Category(input.nextLine());
	}

	public Category getCategory() {
		return category;
	}
}
