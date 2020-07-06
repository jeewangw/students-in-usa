package com.vastika.studentinusa.repository;

import java.util.ArrayList;

import java.util.List;


import javax.sql.DataSource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vastika.studentinusa.model.College;
import com.vastika.studentinusa.util.HibernateUtil;


@Repository
public class UserRepositoryImpl implements UserRepository {

	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public void saveCollegeInfo(College college) {
		Session session =HibernateUtil.getSession(sessionFactory);
		session.save(college);
		
	}

	@Override
	public List<College> getAllCollegeInfo() {
		Session session =HibernateUtil.getSession(sessionFactory);
		Criteria criteria = session.createCriteria(College.class);
		return criteria.list();
	}

	@Override
	public void deleteCollegeInfo(int id) {
		College college = getCollegeById(id);
		if (college!=null) {
			Session session =HibernateUtil.getSession(sessionFactory);
			session.delete(college);
		}
		
	}

	@Override
	public College getCollegeById(int id) {
		Session session =HibernateUtil.getSession(sessionFactory);
		return (College) session.get(College.class, id);
	}

	@Override
	public void updateCollegeInfo(College college) {
		Session session =HibernateUtil.getSession(sessionFactory);
		session.update(college);
		
	}
	
	

}

