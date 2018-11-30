package view.login;

import java.util.Scanner;

import main.Main;
import view.View;

public class LoginView extends View{
	
	private int option;
	
	public void printView() {
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("----" + Main.getMessage("welcomeMessage") + "----");
			System.out.println("1. "+ Main.getMessage("signIn") + ".");
			System.out.println("2. "+ Main.getMessage("signUp") + ".");
			System.out.println("3. " + Main.getMessage("exit") + ".");
			System.out.println("---------------------------");
			System.out.print(">>> ");
			option = input.nextInt();
			View.clearView();
			super.setNextView(true);
		}catch(Exception e) {
			View.clearView();
			System.out.println(Main.getMessage("error_msg_mismatch") + "\n\n");
			printView();
		}
	}

	public int getOption() {
		return option;
	}
}
