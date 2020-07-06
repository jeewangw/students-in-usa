package com.vastika.studentinusa.service;

import java.util.List;

import com.vastika.studentinusa.model.User;

public interface UserService {
	void saveUserInfo(User user);
	void updateUserInfo(User user);
	List <User> getAllUserInfo();
	void deleteUserInfo(int id);
	User getUserById(int id);

}
