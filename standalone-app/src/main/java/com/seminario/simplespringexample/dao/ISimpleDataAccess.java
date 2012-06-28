package com.seminario.simplespringexample.dao;

import com.seminario.simplespringexample.model.User;

public interface ISimpleDataAccess {
	public User getById(int id);
}
