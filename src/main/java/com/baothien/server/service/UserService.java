package com.baothien.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baothien.server.model.Users;
import com.baothien.server.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<Users> getAllUsers() {
		return (List<Users>) userRepository.findAll();
	}
}
