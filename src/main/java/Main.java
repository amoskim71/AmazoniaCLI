import java.util.ArrayList;

import controller.LoginController;
import io.Input;
import io.Output;
import model.*;

public class Main{
	
	private static ArrayList<User> userList;
	private static ArrayList<Product> productList;
	private static ArrayList<Category> categoryList;
	
	private static User user;

	
	public static void main(String[] args) {
		retrieveFromDataBase();
		LoginController login = new LoginController(user, userList, productList, categoryList);
		login.loadView();
		setToDataBase();
	}
	
	
	private static void retrieveFromDataBase() {
		userList = Input.retrieveUsersFromDataBase();
		productList = Input.retrieveProductsFromDataBase();
		categoryList = Input.retrieveCategoriesFromDataBase();
	}
	
	private static void setToDataBase() {
		Output.setUsersToDataBase(userList);
		Output.setProductsToDataBase(productList);
		Output.setCategoriesToDataBase(categoryList);
	}
}