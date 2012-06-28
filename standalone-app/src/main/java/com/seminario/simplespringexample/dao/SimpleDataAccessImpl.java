package com.seminario.simplespringexample.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.seminario.simplespringexample.model.User;

@Component
public class SimpleDataAccessImpl implements ISimpleDataAccess {

	private final String databaseUrl;

	@Autowired
	public SimpleDataAccessImpl(@Value(value = "${database.url}") final String databaseUrl) {
		super();
		this.databaseUrl = databaseUrl;

		System.out.println("SimpleDataAccessImpl()");
	}

	@Override
	public User getById(int id) {
		System.out.println("Creating database connection to " + databaseUrl);
		return new User("user-" + id);
	}
}
