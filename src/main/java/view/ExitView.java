package view;

public class ExitView extends View{
	public void printView() {
		View.clearView();
		System.out.println("--------");
		System.out.println("Goodbye!");
		System.out.println("--------");
		super.setNextView(true);
	}
}
