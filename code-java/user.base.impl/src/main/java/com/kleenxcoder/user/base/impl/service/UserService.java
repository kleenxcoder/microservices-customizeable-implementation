package com.kleenxcoder.user.base.impl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kleenxcoder.user.base.impl.component.UserGeneratorImpl;
import com.kleenxcoder.user.base.impl.model.entity.User;
import com.kleenxcoder.user.base.impl.model.repository.UserRepository;
import com.kleenxcoder.user.base.service.BaseUserServiceImpl;

@Service
public class UserService extends BaseUserServiceImpl<User, UserRepository, UserGeneratorImpl> {
	
	@Autowired
	public UserService(UserRepository repository, UserGeneratorImpl userGenerator) {
		super(repository, userGenerator);
	}

}