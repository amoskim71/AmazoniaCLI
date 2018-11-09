package view.login;

import java.util.Scanner;
import view.View;

public class LoginMenuView extends View{
	
	private int option;
	
	public void printView() {
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
	}

	public int getOption() {
		return option;
	}

}
