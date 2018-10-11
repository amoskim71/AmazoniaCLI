package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Product;
import model.ProductUser;
import model.User;

class ProductUserTest {

	@Test
	void test() {
		Product product1 = new Product("The name of the wind", 1, 70, 25.5);
		Product product2 = new Product("The power of one", 1, 5, 74.99);
		Product p3 = new Product("The name of the wind", 1, 70, 25.5);
		User joseLuis = new User("joseluis@mail.com", "joseluishozg", "Pasw0rd", false);
		ProductUser u1 = new ProductUser(joseLuis);
				
		u1.buyProduct(product1);
		u1.buyProduct(product2);
		
		assertEquals(u1.containsProduct(p3), true);
	}

}
