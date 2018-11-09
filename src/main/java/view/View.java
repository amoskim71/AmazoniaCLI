package view;

import java.io.IOException;

public abstract class View {
	
	private boolean nextView;
	
	public static void clearView() {
		for(int i = 0; i < 100; i++) {
			System.out.println("\n\n\n\n\n");
		}
	}
	
	public static void pauseUntilInput() {
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public abstract void printView();

	public boolean isNextView() {
		return nextView;
	}

	public void setNextView(boolean nextView) {
		this.nextView = nextView;
	}
}
