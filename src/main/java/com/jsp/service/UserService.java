package com.jsp.service;
import java.util.List;

import com.jsp.dao.UserDao;
import com.jsp.dto.User;

public class UserService {
    UserDao userDao = new UserDao();

    public User saveUser(User user) {
        return userDao.saveUser(user);
    }

    public List<User> getUsers() {
        return userDao.getUsers();
    }

    public User findUserByNameAndPass(String username, String password, String role) {
        return userDao.findUserByNameAndPass(username, password, role);
    }

	public User findUserById(int userId) {
		return userDao.findUserById(userId);
	}
}
