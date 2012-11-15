package com.seminario.simplespringexample.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.seminario.simplespringexample.model.User;

@Component
// @Scope("prototype")
public class SimpleDataAccess implements IDataAccess {

	private final String databaseUrl;

	@Autowired
	public SimpleDataAccess(@Value("${database.url}") final String databaseUrl) {
		System.out.println("SimpleDataAccessImpl()");
		this.databaseUrl = databaseUrl;
	}

	@Override
	public User getById(int id) {
		System.out.println("Creating database connection to " + databaseUrl);
		return new User("user-" + id);
	}
}
