package com.vastika.studentinusa.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vastika.studentinusa.model.Student;
import com.vastika.studentinusa.util.HibernateUtil;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveStudentInfo(Student student) {
		Session session =HibernateUtil.getSession(sessionFactory);
		session.save(student);
		
	}

	@Override
	public List<Student> getAllStudentInfo() {
		Session session =HibernateUtil.getSession(sessionFactory);
		Criteria criteria = session.createCriteria(Student.class);
		return criteria.list();
	}

	@Override
	public void deleteStudentInfo(int id) {
		Student student = getStudentById(id);
		if (student!=null) {
			Session session =HibernateUtil.getSession(sessionFactory);
			session.delete(student);
		}
		
	}

	@Override
	public Student getStudentById(int id) {
		Session session =HibernateUtil.getSession(sessionFactory);
		return (Student) session.get(Student.class, id);
	}

	@Override
	public void updateStudentInfo(Student student) {
		Session session =HibernateUtil.getSession(sessionFactory);
		session.update(student);
		
	}

}
