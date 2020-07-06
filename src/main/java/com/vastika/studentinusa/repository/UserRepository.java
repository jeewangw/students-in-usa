package com.vastika.studentinusa.repository;

import java.util.List;

import com.vastika.studentinusa.model.User;

public interface UserRepository {
	
	void saveUserInfo(User user);
	void updateUserInfo(User user);
	List <User> getAllUserInfo();
	void deleteUserInfo(int id);
	User getUserById(int id);

}
