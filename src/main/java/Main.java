import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import controller.*;
import model.*;
import view.*;

public class Main {

	private static User user = new User();
	private static List<User> userList = new ArrayList();
	private static List<Product> productList = new ArrayList();
	private static List<Category> categoryList = new ArrayList();
	

	public static void main(String[] args) {
		userList.add(new User("user@mail.com", "user", "user", false));
		userList.add(new User("admin@mail.com", "admin", "admin", true));
		Scanner input = new Scanner(System.in);
		do{
			Controller.clearView();
			printLogin();
			MenuController menu = new MenuController(new MenuView(), user, productList, categoryList);
			menu.loadView();
			Controller.clearView();
			System.out.print("DO YOU WANT TO EXIT THE PROGRAM? (EXIT): ");
		}while(!input.nextLine().equals("EXIT"));
		System.out.println("\nGoodbye!");
	}
	
	private static void printLogin() {
		LoginView view = new LoginView();
		view.printView();
		if(authentication(view.getUsername(), view.getPassword())) {
			Controller.clearView();
			System.out.println("Success login");
			user.setLastLogin();
		}else {
			Controller.clearView();
			System.out.println("----Incorrect username or password, try again!----\n");
			printLogin();
		}
	}

	private static boolean authentication(String username, String password) {
		boolean login = false;
		for(int i = 0; i < userList.size(); i++) {
			if(username.equals(userList.get(i).getUsername()) && password.equals(userList.get(i).getPassword())) {
				login = true;
				user = userList.get(i);
				break;
			}																																				
		}
		return login;
	}
}
