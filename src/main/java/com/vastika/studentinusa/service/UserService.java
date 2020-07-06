package com.vastika.studentinusa.service;

import java.util.List;

import com.vastika.studentinusa.model.College;

public interface UserService {
	void saveCollegeInfo(College college);
	void updateCollegeInfo(College college);
	List <College> getAllCollegeInfo();
	void deleteCollegeInfo(int id);
	College getCollegeById(int id);
}
