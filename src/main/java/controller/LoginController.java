package controller;

import java.util.ArrayList;

import model.Category;
import model.Product;
import model.User;
import view.ExitView;
import view.MenuView;
import view.View;
import view.login.*;

public class LoginController extends Controller{
	private User model;
	private View view;
	private ArrayList<User> userList;
	private ArrayList<Product> productList;
	private ArrayList<Category> categoryList;
	
	public LoginController(User user, ArrayList<User> userList, ArrayList<Product> productList, ArrayList<Category> categoryList) {
		model = new User();
		this.userList = userList;
		this.productList = productList;
		this.categoryList = categoryList;
	}
	
	public void loadView() {
		this.view = new LoginView();
		view.printView();
		switch(((LoginView)view).getOption()) {
			case 1:
				view = new SignInView();
				view.printView();
				setUser();
				if(authentication(userList)) {
					MenuController menu = new MenuController(new MenuView(), model, productList, categoryList);
					menu.loadView();
				}else {
					System.out.println("Incorrect combination.\n");
					loadView();
				}
				break;
			case 2:
				view = new SignUpView();
				view.printView();
				setUser();
				userList.add(model);
				MenuController menu = new MenuController(new MenuView(), model, productList, categoryList);
				menu.loadView();
				break;
			case 3:
				view = new ExitView();
				view.printView();
				break;
		}
	}
	
	private void setUser() {
		if(view.isNextView()) {
			if(view.getClass() == SignInView.class) {
				model.setUsername(((SignInView)view).getUsername());
				model.setPassword(((SignInView)view).getPassword());
			}else if(view.getClass() == SignUpView.class) {
				model.setEmail(((SignUpView)view).getEmail());
				model.setUsername(((SignUpView)view).getUsername());
				model.setPassword(((SignUpView)view).getPassword());
				model.setAdmin(((SignUpView)view).isAdmin());
			}
		}
	}
	
	public User getUser() {
		return model;
	}
	
	public boolean authentication(ArrayList<User> userList) {
		boolean login = false;
		for(int i = 0; i < userList.size(); i++) {
			if(model.getUsername().equals(userList.get(i).getUsername()) && model.getPassword().equals(userList.get(i).getPassword())){
				model = userList.get(i);
				login = true;
				break;
			}
		}
		return login;
	}
}