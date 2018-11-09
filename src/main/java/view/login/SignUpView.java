package view.login;

import java.util.Scanner;

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
		System.out.println("--SIGN UN--");
		System.out.println("------------");
		System.out.println("To go back enter 'b'.");
		System.out.println("------------\n");
		System.out.print("email: ");
		setEmail(input.nextLine());
		System.out.print("username: ");
		setUsername(input.nextLine());
		System.out.print("password: ");
		setPassword(input.nextLine());
		System.out.print("admin: ");
		setAdmin(input.nextLine());
		view();
		super.setNextView(true);
	}
	
	private void view() {
		View.clearView();
		System.out.println("--SIGN UP--");
		System.out.println("email: " + getEmail());
		System.out.println("username: " + getUsername());
		System.out.println("password: " + getPassword());
		System.out.println("admin: " + isAdmin());
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
