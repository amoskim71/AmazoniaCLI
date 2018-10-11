package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Category;
import model.Product;

class ProductTest {

	@Test
	void test() {
		Category books = new Category("Books");
		Product product1 = new Product("The name of the wind", books.getCategoryId(), 70, 25.5);
		Product product2 = new Product("The power of one", books.getCategoryId(), 5, 74.99);
		assertEquals(product1.getCategoryId(), 1);
		assertEquals(product2.getProductId(), 2);
	}

}
