package com.vastika.studentinusa.repository;

import java.util.List;

import com.vastika.studentinusa.model.Student;

public interface StudentRepository {
	void saveStudentInfo(Student student);
	List <Student> getAllStudentInfo();
	void deleteStudentInfo(int id);
	Student getStudentById (int id);
	void updateStudentInfo(Student student);

}
