package controller;

import model.User;
import view.ExitView;
import view.View;
import view.login.*;

public class LoginController extends Controller{
	private User model;
	private View view;
	
	public LoginController() {
		this.view = new LoginView();
		model = new User();
	}
	
	public void loadView() {
		view.printView();
		switch(((LoginView)view).getOption()) {
			case 1:
				view = new SignInView();
				view.printView();
				setUser();
				break;
			case 2:
				view = new SignUpView();
				view.printView();
				setUser();
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
	
	//TODO: implement authentication method and input/output scheme to login.
}