package model;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import controller.NewProductController;
import model.Category;
import model.Product;
import view.NewProductView;

class ProductTest {

	@Test
	void test() {
		Category books = new Category("Books");
		Product product1 = new Product("The name of the wind", books.getCategoryId(), 70, 25.5);
		Product product2 = new Product("The power of one", books.getCategoryId(), 5, 74.99);
		List<Product> productList = new ArrayList();
		productList.add(product1);
		productList.add(product2);
		
		NewProductController controller = new NewProductController(new NewProductView(), productList);
		controller.loadView();
		assertEquals(productList.get(2).getProductName(), "hola");
	}

}
