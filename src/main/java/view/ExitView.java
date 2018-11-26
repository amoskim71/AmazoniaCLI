package view;

import main.Main;

public class ExitView extends View{
	public void printView() {
		View.clearView();
		System.out.println("--------");
		System.out.println(Main.getMessage("goodbyeMessage"));
		System.out.println("--------");
		super.setNextView(true);
	}
}
