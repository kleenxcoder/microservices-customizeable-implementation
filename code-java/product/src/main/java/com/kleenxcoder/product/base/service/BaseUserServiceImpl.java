package com.kleenxcoder.product.base.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.kleenxcoder.product.base.model.entity.BaseUser;
import com.kleenxcoder.product.base.model.repository.BaseUserRepository;

public abstract class BaseUserServiceImpl<T extends BaseUser, R extends BaseUserRepository<T>> implements BaseUserService<T,R> {
	
	protected R repository;
	
	@Autowired
	public BaseUserServiceImpl(R repository) {
		this.repository = repository;
	}
	
	public T findByEmail(String email) {
		T user = repository.findByEmail(email);
		return verifyUser(user);
	}
	
	protected T verifyUser(T user) {
		if (user!= null && user.isActive()) {
			return user;
		}
		return null;
	}

}
