package controller;

import java.io.IOException;

public class Controller {
	
	protected void clearView() {
		for(int i = 0; i < 100; i++) {
			System.out.println("\n\n\n\n\n");
		}
	}
	
	protected void pauseUntilInput() {
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}