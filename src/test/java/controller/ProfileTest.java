package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controller.ProfileController;
import model.Category;
import model.Product;
import model.User;
import view.ProfileView;

class ProfileTest {

	@Test
	void test() {
		User joseLuis = new User("joseluis@mail.com", "joseluishozg", "pass", false);
		Category books = new Category("Books");
		Product product1 = new Product("The name of the wind", books.getCategoryId(), 70, 25.5);
		Product product2 = new Product("The power of one", books.getCategoryId(), 5, 74.99);
		ProfileView view = new ProfileView();
		ProfileController controller = new ProfileController(view, joseLuis);
		
		controller.loadView();
		joseLuis.buyProduct(product1);
		controller.loadView();
		joseLuis.buyProduct(product1, 5);
		controller.loadView();
	}

}
