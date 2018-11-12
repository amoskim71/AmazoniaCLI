import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import controller.LoginController;
import controller.MenuController;
import model.Category;
import model.Product;
import model.User;
import view.MenuView;

class MainTest {
	
	/*
	private static User user;
	private static ArrayList<Category> categoryList = new ArrayList<Category>();
	private static ArrayList<Product> productList = new ArrayList<Product>();
	
	public static boolean authentication(User one, User two) {
		boolean login = false;
		if(one.getUsername().equals(two.getUsername()) && one.getPassword().equals(two.getPassword())) {
			login = true;
		}
		return login;
	}

	@Test
	void test() {
		LoginController login = new LoginController(user, new ArrayList<User>(), productList, categoryList);
		login.loadView();
		user = login.getUser();
		if(!authentication(user, user)) {
			test();
		}else {
			MenuController menu = new MenuController(new MenuView(), user, productList, categoryList);
			menu.loadView();
		}
	}
	*/
}
