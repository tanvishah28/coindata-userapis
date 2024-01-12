package com.tanvi.userapi.dao;

import java.util.Optional;

import com.tanvi.userapi.entity.User;

public interface IUserDao {

	void save(User user);

	Optional<User> findByUsername(String username);

	Optional<User> findByEmail(String email);
}
