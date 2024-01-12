package com.tanvi.userapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tanvi.userapi.dao.IUserDao;
import com.tanvi.userapi.entity.User;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserDao userDao;

	public User createUser(User user) {
		if (userDao.findByUsername(user.getUserName()).isPresent()) {
			throw new IllegalArgumentException("Username already exists");
		}
		if (userDao.findByEmail(user.getEmail()).isPresent()) {
			throw new IllegalArgumentException("Username already exists");
		}

		userDao.save(user);
		return user;
	}
}
