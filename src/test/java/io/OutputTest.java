package io;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import model.Category;
import model.Product;
import model.User;

class OutputTest {

	@Test
	void testWriteUser() {
		User joseLuis = new User("joseluis@mail.com", "joseluishozg", "pass", false);
		User andres = new User("andres@gmail.com", "andres", "Pasw0rd", false);
		User alonso = new User("alonsos@gmail.com", "alonso", "Pasw0rd", false);
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(joseLuis);
		userList.add(andres);
		userList.add(alonso);
		Output.setUsersToDataBase(userList);
	}

	@Test
	void testWriteProduct() {
		Category books = new Category("Books");
		Product product1 = new Product("The name of the wind", books.getCategoryId(), 70, 25.5);
		Product product2 = new Product("The power of one", books.getCategoryId(), 5, 74.99);
		ArrayList<Product> productList = new ArrayList();
		productList.add(product1);
		productList.add(product2);
		Output.setProductsToDataBase(productList);
	}

	@Test
	void testWriteCategory() {
		Category category1 = new Category("Books");
		Category category2 = new Category("Electronics");
		ArrayList<Category> categoryList = new ArrayList<Category>();
		categoryList.add(category1);
		categoryList.add(category2);
		Output.setCategoriesToDataBase(categoryList);
	}
}
