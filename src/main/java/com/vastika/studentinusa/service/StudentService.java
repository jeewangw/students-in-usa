package com.vastika.studentinusa.service;

import java.util.List;

import com.vastika.studentinusa.model.Student;

public interface StudentService {
	
	void saveStudentInfo(Student student);
	void updateStudentInfo(Student student);
	List <Student> getAllStudentInfo();
	void deleteStudentInfo(int id);
	Student getStudentById(int id);

}
