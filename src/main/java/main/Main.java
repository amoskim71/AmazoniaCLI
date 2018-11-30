package main;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import controller.LoginController;
import io.Input;
import io.Output;
import model.*;
import view.View;

public class Main{
	
	private static ArrayList<User> userList;
	private static ArrayList<Product> productList;
	private static ArrayList<Category> categoryList;
	
	private static User user;
	
	private static final Locale locale[] = new Locale[2];
	private static ResourceBundle msgBundler;
	
	public static final int EN = 0;
	public static final int ES = 1;

	
	public static void main(String[] args) {
		loadLanguages();
		retrieveFromDataBase();
		System.out.print("English(1) or Spanish(2) [ENGLISH BY DEFAULT]: ");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		if(option.equals("2")) {
			setLocale(locale[ES]);
		}else {
			setLocale(locale[EN]);
		}
		View.clearView();
		LoginController login = new LoginController(user, userList, productList, categoryList);
		login.loadView();
		setToDataBase();
	}
	
	private static void loadLanguages() {
		locale[EN] = new Locale("en", "US");
		locale[ES] = new Locale("es", "ES");
		msgBundler = ResourceBundle.getBundle("lang", locale[EN]);
	}
	
	public static void setLocale(Locale locale) {
		msgBundler = ResourceBundle.getBundle("lang", locale);
	}
	
	public static String getMessage(String key) {
		return msgBundler.getString(key);
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