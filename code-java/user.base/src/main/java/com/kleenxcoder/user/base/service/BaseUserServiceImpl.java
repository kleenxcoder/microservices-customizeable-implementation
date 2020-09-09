package com.kleenxcoder.user.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kleenxcoder.user.base.component.BaseUserGenerator;
import com.kleenxcoder.user.base.model.entity.BaseUser;
import com.kleenxcoder.user.base.model.repository.BaseUserRepository;

public abstract class BaseUserServiceImpl<T extends BaseUser, R extends BaseUserRepository<T>> implements BaseUserService<T,R> {
	
	protected R repository;
//	protected UG userGenerator;
	
	@Autowired
	public BaseUserServiceImpl(R repository) {
		this.repository = repository;
//		this.userGenerator = userGenerator;
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
	
	public List<T> createUsers(BaseUserGenerator<T> userGenerator) {
		Iterable<T> users = userGenerator.generateEntities(10);
		return (List<T>) repository.saveAll(users);
	}

}
