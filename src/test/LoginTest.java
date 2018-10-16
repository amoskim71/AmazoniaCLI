package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controller.LoginController;
import model.User;
import view.LoginView;

class LoginTest {

	@Test
	void test() {
		User joseLuis = new User("j", "j", "pass", false);
		LoginView view = new LoginView();
		LoginController controller = new LoginController(view, joseLuis);
		controller.loadView();
	}

}
