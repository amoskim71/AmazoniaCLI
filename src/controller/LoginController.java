package controller;

import model.User;
import view.LoginView;

public class LoginController extends Controller{

	private LoginView view;
	private User model;
	
	public LoginController(LoginView view, User model) {
		this.view = view;
		this.model = model;
	}
	
	public boolean authentication(String username, String password, User model) {
		boolean login = false;
		if(username.equals(model.getUsername()) && password.equals(model.getPassword())) {
			login = true;
		}
		return login;
	}
	
	@Override
	public void loadView() {
		// TODO Auto-generated method stub
		view.printView();
		if(authentication(view.getUsername(), view.getPassword(), model)) {
			System.out.println("Success login");
		}else {
			clearView();
			System.out.println("Incorrect username or password");
			loadView();
		}
	}
}
