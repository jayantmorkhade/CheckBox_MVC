package com.example.mvc.Service;

import java.util.List;

import com.example.mvc.Entity.User;

public interface ServiceInf {

	public boolean addUser(User user);

	public User getuser(String userName);

	public List<User> getUsers();

	public User getUsersByEmail(String eMail);

	public boolean updateUser(User user);

	public boolean deleteUser(String userName);

	public User getDetails(String userName);

}
