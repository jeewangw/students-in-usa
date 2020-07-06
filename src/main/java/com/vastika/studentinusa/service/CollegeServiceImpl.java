package com.vastika.studentinusa.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vastika.studentinusa.model.College;
import com.vastika.studentinusa.repository.CollegeRepository;


@Service
@Transactional
public class CollegeServiceImpl implements CollegeService {

	@Autowired
	private CollegeRepository collegeRepository;
	
	


	@Override
	public void saveCollegeInfo(College college) {
		collegeRepository.saveCollegeInfo(college);
		
	}

	@Override
	public void updateCollegeInfo(College college) {
		collegeRepository.updateCollegeInfo(college);
		
	}

	@Override
	public List<College> getAllCollegeInfo() {
		return collegeRepository.getAllCollegeInfo();
	}

	@Override
	public void deleteCollegeInfo(int id) {
		collegeRepository.deleteCollegeInfo(id);
		
	}

	@Override
	public College getCollegeById(int id) {
		return collegeRepository.getCollegeById(id);
	}



}

