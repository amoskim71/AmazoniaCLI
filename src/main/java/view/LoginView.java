package view;

import java.util.Scanner;

public class LoginView {
	private String username;
	private String password;
	
	public void printView() {
		Scanner input = new Scanner(System.in);
		System.out.print("Username: ");
		this.username = input.nextLine();
		System.out.print("Password: ");
		this.password = input.nextLine();
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
}
