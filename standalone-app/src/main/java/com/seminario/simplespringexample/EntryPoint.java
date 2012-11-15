package com.seminario.simplespringexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seminario.simplespringexample.dao.IDataAccess;
import com.seminario.simplespringexample.model.User;

@Component
public class EntryPoint {

	@Autowired
	private IDataAccess dataAccess;

	public EntryPoint() {
		System.out.println("EntryPoint()");
	}

	public void run() {
		System.out.println("EntryPoint.run()");
		final User byId = dataAccess.getById(2);
		System.out.println("User: " + byId);
	}
}
