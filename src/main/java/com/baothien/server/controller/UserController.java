package com.baothien.server.controller;

import com.baothien.server.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baothien.server.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	@Autowired
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/test")
	public String test() {
		return "Test";
	}

	@GetMapping("/get-users")
	public List<Users> getUsers() {
		return userService.getAllUsers();
	}
}
