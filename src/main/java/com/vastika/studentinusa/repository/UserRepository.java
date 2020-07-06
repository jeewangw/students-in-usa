package com.vastika.studentinusa.repository;

import java.util.List;

import com.vastika.studentinusa.model.College;

public interface UserRepository {
	void saveCollegeInfo(College college);
	List <College> getAllCollegeInfo();
	void deleteCollegeInfo(int id);
	College getCollegeById (int id);
	void updateCollegeInfo(College college);
}
