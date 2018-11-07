package controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import controller.LoginController;
import model.User;
import view.LoginView;

class LoginTest {

	@Test
	void test() {
		User joseLuis = new User("j", "j", "pass", false);
		LoginView view = new LoginView();
		List<User> jl = new ArrayList();
		jl.add(joseLuis);
		LoginController controller = new LoginController(view, joseLuis, jl);
		controller.loadView();
	}

}
