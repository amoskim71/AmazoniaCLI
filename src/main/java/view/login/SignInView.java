package view.login;

import java.util.Scanner;

import main.Main;
import view.View;

public class SignInView extends View{
	
	private String textField[];
	
	public SignInView() {
		textField = new String[2];
		textField[0] = "";
		textField[1] = "";
	}
	
	public void printView() {
		Scanner input = new Scanner(System.in);
		super.setNextView(true);
		for(int i = 0; i < textField.length + 1; i++) {
			System.out.println("--"+ Main.getMessage("signInM") +"--");
			System.out.println(Main.getMessage("username") + ": " + textField[0]);
			System.out.println(Main.getMessage("password") + ":"  + getHidePassword());
			System.out.println("------------");
			switch(i) {
				case 0:
					System.out.println(Main.getMessage("enterUsername"));
					break;
				case 1: 
					System.out.println(Main.getMessage("enterPassword"));
					break;
				default:
					System.out.println(Main.getMessage("pressEnter") + ".");
					break;
			}
			System.out.println("------------\n");
			if(i < textField.length) {
				System.out.print(">>> ");
				textField[i] = input.nextLine();
				if(textField[i].equals("b")) {
					super.setNextView(false);
					break;
				}
			}else{
				System.out.print(">>> ");
				super.pauseUntilInput();
			}
			View.clearView();
		}
		View.clearView();
	}
	
	public String getHidePassword() {
		String password = "";
		for(int i = 0; i < textField[1].length(); i++) {
			password += "*";
		}
		return password;
	}
	
	public String getUsername() {
		return textField[0];
	}
	
	public String getPassword() {
		return textField[1];
	}
}
