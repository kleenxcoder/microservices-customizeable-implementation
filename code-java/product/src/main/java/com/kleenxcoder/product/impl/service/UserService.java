package com.kleenxcoder.product.impl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kleenxcoder.product.base.service.BaseUserServiceImpl;
import com.kleenxcoder.product.impl.component.UserGenerator;
import com.kleenxcoder.product.impl.model.entity.User;
import com.kleenxcoder.product.impl.model.repository.UserRepository;

@Service
public class UserService extends BaseUserServiceImpl<User, UserRepository> {
	
	@Autowired
	UserGenerator userGenerator;
	
	@Autowired
	public UserService(UserRepository repository) {
		super(repository);
	}

	public User findByInternalId(String internalId) {
		User user = repository.findByInternalId(internalId);
		return verifyUser(user);
	}

	public List<User> createUsers() {
		Iterable<User> users = userGenerator.generateUsers(10);
		return (List<User>) repository.saveAll(users);
	}

}
