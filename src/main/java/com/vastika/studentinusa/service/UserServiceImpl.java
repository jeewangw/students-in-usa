package com.vastika.studentinusa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vastika.studentinusa.model.User;
import com.vastika.studentinusa.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUserInfo(User user) {
		userRepository.saveUserInfo(user);
		
	}

	@Override
	public void updateUserInfo(User user) {
		userRepository.updateUserInfo(user);
		
	}

	@Override
	public List<User> getAllUserInfo() {
		return userRepository.getAllUserInfo();
	}

	@Override
	public void deleteUserInfo(int id) {
		userRepository.deleteUserInfo(id);
		
	}

	@Override
	public User getUserById(int id) {
		return userRepository.getUserById(id);
	}

}
