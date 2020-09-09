package com.kleenxcoder.user.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kleenxcoder.user.base.component.BaseUserGenerator;
import com.kleenxcoder.user.base.model.entity.BaseUser;
import com.kleenxcoder.user.base.model.repository.BaseUserRepository;

public abstract class BaseUserServiceImpl<T extends BaseUser, R extends BaseUserRepository<T>, UG extends BaseUserGenerator<T>> implements BaseUserService<T,R> {
	
	protected R repository;
	protected UG userGenerator;
	
	@Autowired
	public BaseUserServiceImpl(R repository, UG userGenerator) {
		this.repository = repository;
		this.userGenerator = userGenerator;
	}
	
	public T findByEmail(String email) {
		T user = repository.findByEmail(email);
		return verifyUser(user);
	}
	
	public T verifyUser(T user) {
		if (user!= null && user.isActive()) {
			return user;
		}
		return null;
	}
	
	public List<T> createUsers() {
		Iterable<T> users = userGenerator.generateUsers(10);
		return (List<T>) repository.saveAll(users);
	}

}
