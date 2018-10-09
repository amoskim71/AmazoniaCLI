package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import clases.User;

class UserTest {

	@Test
	void test() {
		User joseLuis = new User("joseluisdelahozgarcia@gmail.com", "joseluishozg", "Pasw0rd");
		assertEquals(joseLuis.getEmail(), "joseluisdelahozgarcia@gmail.com");
		Date today = new Date();
		System.out.println(today);
	}

}
