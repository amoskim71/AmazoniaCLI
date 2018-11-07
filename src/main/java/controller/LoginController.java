package controller;

import java.util.List;

import model.User;
import view.LoginView;

public class LoginController extends Controller{

	private LoginView view;
	private static User model;
	private static List<User> userList;
	
	public LoginController(LoginView view, User model, List<User> userList) {
		this.view = view;
		model = model;
		
	}
	
	public boolean authentication(String username, String password) {
		boolean login = false;
		for(int i = 0; i < userList.size(); i++) {
			if(username.equals(userList.get(i).getUsername()) && password.equals(userList.get(i).getPassword())) {
				login = true;
				model = userList.get(i);
			}																																				
		}
		return login;
	}
	
	public void loadView() {
		clearView();
		view.printView();
		if(authentication(view.getUsername(), view.getPassword())) {
			System.out.println("Success login");
			model.setLastLogin();
		}else {
			System.out.println("Incorrect username or password");
			loadView();
		}
	}
}
