package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Product;

class ProductTest {

	@Test
	void test() {
		Product product1 = new Product(3, "Product");
		Product product2 = new Product(3, "Product");
		assertEquals(product1.compareProduct(product2), true);
	}

}
