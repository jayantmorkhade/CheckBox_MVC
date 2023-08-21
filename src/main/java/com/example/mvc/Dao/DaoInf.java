package com.example.mvc.Dao;

import java.util.List;

import com.example.mvc.Entity.User;


public interface DaoInf {

	public boolean addUser(User user);

	public User getuser(String userName);

	public List<User> getUsers();

	public boolean updateUser(User user);

	public boolean deleteUser(String userName);

	public User getDetails(String userName);

	public User getUsersByEmail(String eMail);
}
