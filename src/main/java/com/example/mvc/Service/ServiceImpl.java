package com.example.mvc.Service;

import java.util.List;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mvc.Dao.DaoImpl;
import com.example.mvc.Entity.User;

@Service
public class ServiceImpl implements ServiceInf {
	@Autowired
	private DaoImpl dao;

	@Override
	public User getuser(String userName) {

		if (ObjectUtils.isNotEmpty(userName)) {
			return dao.getuser(userName);
		} else {
			User user2 = null;
			return user2;

		}

	}

	@Override
	public boolean addUser(User user) {
		return dao.addUser(user);
	}

	@Override
	public List<User> getUsers() {

		return dao.getUsers();
	}

	@Override
	public User getDetails(String userName) {

		return dao.getDetails(userName);
	}

	@Override
	public boolean updateUser(User user) {
		return dao.updateUser(user);
	}

	@Override
	public boolean deleteUser(String userName) {
		return dao.deleteUser(userName);
	}

	@Override
	public User getUsersByEmail(String eMail) {

		return dao.getUsersByEmail(eMail);
	}

}
