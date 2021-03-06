package io;

import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import controller.show.ShowProductController;
import model.Category;
import model.Product;
import model.User;
import view.show.ShowProductView;

class InputTest {

	@Test
	void test() {
		ArrayList<User>userList = Input.retrieveUsersFromDataBase();
		for(User user: userList) {
			System.out.println(user);
		}
	}
	
	@Test
	void testProducts() {
		List<Product> productList = Input.retrieveProductsFromDataBase();
		for(Product product: productList) {
			System.out.println(product);
		}
	}
	
	@Test
	void testCategories() {
		List<Category> categoryList = Input.retrieveCategoriesFromDataBase();
		for(Category categories: categoryList) {
			System.out.println(categories);
		}
	}

}
