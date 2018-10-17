package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controller.MenuController;
import model.User;
import view.MenuView;

class MenuTest {

	@Test
	void test() {
		User andres = new User("andres@gmail.com", "andres", "Pasw0rd", false);
		MenuController control = new MenuController(new MenuView(), andres);
		control.loadView();
	}

}
