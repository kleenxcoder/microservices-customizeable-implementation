package com.kleenxcoder.user.base.impl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kleenxcoder.user.base.impl.component.UserGenerator;
import com.kleenxcoder.user.base.impl.model.entity.User;
import com.kleenxcoder.user.base.impl.model.repository.UserRepository;
import com.kleenxcoder.user.base.service.BaseUserServiceImpl;

@Service
public class UserService extends BaseUserServiceImpl<User, UserRepository, UserGenerator> {
	
	@Autowired
	public UserService(UserRepository repository, UserGenerator userGenerator) {
		super(repository, userGenerator);
	}

}
