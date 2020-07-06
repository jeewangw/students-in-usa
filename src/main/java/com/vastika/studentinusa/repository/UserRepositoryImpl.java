package com.vastika.studentinusa.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vastika.studentinusa.model.User;
import com.vastika.studentinusa.util.HibernateUtil;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public void saveUserInfo(User user) {
		Session session =HibernateUtil.getSession(sessionFactory);
		session.save(user);
		
	}

	@Override
	public void updateUserInfo(User user) {
		Session session =HibernateUtil.getSession(sessionFactory);
		session.update(user);
		
	}

	@Override
	public List<User> getAllUserInfo() {
		Session session =HibernateUtil.getSession(sessionFactory);
		Criteria criteria = session.createCriteria(User.class);
		return criteria.list();
	}

	@Override
	public void deleteUserInfo(int id) {
		User user = getUserById(id);
		if (user!=null) {
			Session session =HibernateUtil.getSession(sessionFactory);
			session.delete(user);
		}
		
	}

	@Override
	public User getUserById(int id) {
		Session session =HibernateUtil.getSession(sessionFactory);
		return (User) session.get(User.class, id);
	}

}
