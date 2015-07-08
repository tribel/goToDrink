package com.gobuhat.tribel.dao;

import java.util.List;

import com.gobuhat.tribel.entity.Users;

public interface UsersDao {

	public List<Users> findAllUsers();

	public Users autorize(Users user);

	public void save(Users user);
	
	public void edit(Users user);
	
	public Users findById(int id);

}
