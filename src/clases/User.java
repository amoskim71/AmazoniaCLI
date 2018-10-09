package clases;

import java.util.Calendar;
import java.util.Date;

public class User {
	
	private String email;
	private String username;
	private String password;
	private Date lastLogin;
	private int userId;
	
	public User(int userId, String email, String username,String password) {
		this.userId = userId;
		this.email = email;
		this.username = username;
		this.password = password;
		lastLogin = new Date();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}
