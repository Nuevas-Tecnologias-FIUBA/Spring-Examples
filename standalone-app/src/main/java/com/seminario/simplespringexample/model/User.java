package com.seminario.simplespringexample.model;

public class User {

	private final String username;

	public User(final String username) {
		super();
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	@Override
	public String toString() {
		return "User [username=" + username + "]";
	}
}
