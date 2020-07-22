package com.vastika.studentinusa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vastika.studentinusa.model.Student;
import com.vastika.studentinusa.repository.StudentRepository;


@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void saveStudentInfo(Student student) {
		studentRepository.saveStudentInfo(student);
		
	}

	@Override
	public void updateStudentInfo(Student student) {
		studentRepository.updateStudentInfo(student);
		
	}

	@Override
	public List<Student> getAllStudentInfo() {
		return studentRepository.getAllStudentInfo();
	}

	@Override
	public void deleteStudentInfo(int id) {
		studentRepository.deleteStudentInfo(id);
		
	}

	@Override
	public Student getStudentById(int id) {
		return studentRepository.getStudentById(id);
	}

}
