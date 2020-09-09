package com.kleenxcoder.customer.base.service;

import com.kleenxcoder.customer.base.model.entity.CustomerBaseUser;
import com.kleenxcoder.customer.base.model.repository.CustomerBaseUserRepository;
import com.kleenxcoder.user.base.service.BaseUserServiceImpl;

public abstract class CustomerBaseUserServiceImpl<T extends CustomerBaseUser, R extends CustomerBaseUserRepository<T>> extends BaseUserServiceImpl<T,R> implements CustomerBaseUserService<T,R> {

	public CustomerBaseUserServiceImpl(R repository) {
		super(repository);
	}
	
	public T findByInternalId(String internalId) {
		return repository.findByInternalId(internalId);
	}

}
