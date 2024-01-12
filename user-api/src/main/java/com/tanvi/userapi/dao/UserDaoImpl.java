package com.tanvi.userapi.dao;

import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tanvi.userapi.entity.User;

@Repository
public class UserDaoImpl implements IUserDao {

	private SessionFactory sessionFactory;
	
	@Autowired
	private UserDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Optional<User> findByUsername(String username) {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("FROM User WHERE username = :username", User.class)
				.setParameter("username", username).uniqueResultOptional();
	}

	public Optional<User> findByEmail(String email) {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("FROM User WHERE email = :email", User.class).setParameter("email", email)
				.uniqueResultOptional();
	}

	@Override
	public void save(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(user);
	}
}
