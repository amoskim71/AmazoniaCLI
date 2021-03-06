package view.login;

import java.util.Scanner;

import main.Main;
import view.View;

public class SignUpView extends View{

	private String email;
	private String username;
	private String password;
	private boolean admin;
	
	
	@Override
	public void printView() {
		Scanner input = new Scanner(System.in);
		View.clearView();
		System.out.println("--"+ Main.getMessage("signUpM") +"--");
		System.out.println("------------");
		System.out.print(Main.getMessage("email") + ": ");
		setEmail(input.nextLine());
		System.out.print(Main.getMessage("username") + ": ");
		setUsername(input.nextLine());
		System.out.print(Main.getMessage("password") + ": ");
		setPassword(input.nextLine());
		System.out.print(Main.getMessage("admin") + ": ");
		setAdmin(input.nextLine());
		System.out.println("------------\n");
		view();
		super.setNextView(true);
	}
	
	private void view() {
		View.clearView();
		System.out.println("--"+ Main.getMessage("signInM") +"--");
		System.out.println(Main.getMessage("email") + getEmail());
		System.out.println(Main.getMessage("username") + getUsername());
		System.out.println(Main.getMessage("password") + getPassword());
		System.out.println(Main.getMessage("admin") + isAdmin());
		System.out.println("------------");
		View.pauseUntilInput();
	}
	
	public String getEmail() {
		return email;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public boolean isAdmin() {
		return admin;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	private void setUsername(String username) {
		this.username = username;
	}

	private void setPassword(String password) {
		this.password = password;
	}

	private void setAdmin(String admin) {
		this.admin = admin.equals("y") ? true : false;
	}	
}
