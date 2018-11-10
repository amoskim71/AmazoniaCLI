package io;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Category;
import model.Product;
import model.User;

class OutputTest {

	@Test
	void testWriteUser() {
		Output.writeUser(new User("test", "test", "test", true));
	}

	@Test
	void testWriteProduct() {
		Output.writeProduct(new Product("Test", 1, 30, 100));
	}

	@Test
	void testWriteCategory() {
		Output.writeCategory(new Category("Test"));
	}
}
