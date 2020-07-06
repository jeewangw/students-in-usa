package com.vastika.studentinusa.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vastika.studentinusa.model.College;
import com.vastika.studentinusa.repository.UserRepository;


@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	


	@Override
	public void saveCollegeInfo(College college) {
		userRepository.saveCollegeInfo(college);
		
	}

	@Override
	public void updateCollegeInfo(College college) {
		userRepository.updateCollegeInfo(college);
		
	}

	@Override
	public List<College> getAllCollegeInfo() {
		return userRepository.getAllCollegeInfo();
	}

	@Override
	public void deleteCollegeInfo(int id) {
		userRepository.deleteCollegeInfo(id);
		
	}

	@Override
	public College getCollegeById(int id) {
		return userRepository.getCollegeById(id);
	}



}

