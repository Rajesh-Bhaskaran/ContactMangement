package com.flightreservation.dto;

public class UserCredential {
	private String username;
	private String password;

	public UserCredential(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
