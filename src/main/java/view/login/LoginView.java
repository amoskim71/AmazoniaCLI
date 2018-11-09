package view.login;

import java.util.Scanner;
import view.View;

public class LoginView extends View{
	
	private int option;
	
	public void printView() {
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("----WELCOME TO AMAZONIA----");
			System.out.println("1. Sign in.");
			System.out.println("2. Sign up.");
			System.out.println("3. Exit.");
			System.out.println("---------------------------");
			System.out.print(">>> ");
			option = input.nextInt();
			View.clearView();
			super.setNextView(true);
		}catch(Exception e) {
			View.clearView();
			System.out.println("ERROR: mismatch input, please choose a correct option.\n\n");
			printView();
		}
	}

	public int getOption() {
		return option;
	}
}
