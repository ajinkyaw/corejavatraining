package com.goizizo.booking.util;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Login {
	
	@Size(min = 5, message = "Enter atleast 5 characters")
	private String username;
	
	@NotEmpty(message = "Password should not be empty")
	private String password;
	
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
	

}
