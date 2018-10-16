package controller;

public abstract class Controller {
	
	abstract public void loadView();
	
	protected void clearView() {
		for(int i = 0; i < 100; i++) {
			System.out.println("\n\n\n\n\n");
		}
	}
}