package controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import controller.MenuController;
import model.Category;
import model.Product;
import model.User;
import view.MenuView;

class MenuTest {

	@Test
	void test() {
		User andres = new User("andres@gmail.com", "andres", "Pasw0rd", false);
		Category books = new Category("Books");
		Product product1 = new Product("The name of the wind", books.getCategoryId(), 70, 25.5);
		Product product2 = new Product("The power of one", books.getCategoryId(), 5, 74.99);
		List<Category> categoryList = new ArrayList();
		List<Product> productList = new ArrayList();
		categoryList.add(books);
		productList.add(product1);
		productList.add(product2);
		andres.buyProduct(product1);
 		MenuController control = new MenuController(new MenuView(), andres, productList, categoryList);
 		control.loadView();
 		assertEquals(books.getCategoryId(), 1);
 		//assertEquals(categoryList.get(0).getCategoryName(), "category");
	}

}
