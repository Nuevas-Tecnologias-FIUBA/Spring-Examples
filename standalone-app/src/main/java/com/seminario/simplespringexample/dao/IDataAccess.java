package com.seminario.simplespringexample.dao;

import com.seminario.simplespringexample.model.User;

public interface IDataAccess {
	public User getById(int id);
}
