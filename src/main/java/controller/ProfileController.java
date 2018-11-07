package controller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.*;
import view.ProfileView;

public class ProfileController extends Controller{
	
	private ProfileView view;
	private User model;
	
	public ProfileController(ProfileView view, User model) {
		this.view = view;
		this.model = model;
	}
	
	public String getUsername() {
		return model.getUsername();
	}
	
	public String getEmail() {
		return model.getEmail();
	}
	
	public Date getLastLogin() {
		return model.getLastLogin();
	}
	
	public List<Product> getProductHistory(){
		return model.getProductHistory();
	}
	
	public void loadView() {
		view.printView(getUsername(), getEmail(), getLastLogin(), getProductHistory());
		pauseUntilInput();
		clearView();
	}
}
