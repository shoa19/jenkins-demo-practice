package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service

public class UserService {
	@Autowired
	UserRepository repository;
	void saveUser(Users user) {
		repository.save(user);
		System.out.println("user created " + user.getName());
}
	public Iterable<Users> getAllUsers() {
		return repository.findAll();
	}
	void deleteUser(@PathVariable int id) {
		repository.deleteById(id);
	}
}
	