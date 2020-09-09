package com.kleenxcoder.customer.base.service;

import com.kleenxcoder.customer.base.component.CustomerUserGenerator;
import com.kleenxcoder.customer.base.model.entity.CustomerBaseUser;
import com.kleenxcoder.customer.base.model.repository.CustomerBaseUserRepository;
import com.kleenxcoder.user.base.service.BaseUserServiceImpl;

public abstract class CustomerBaseUserServiceImpl<T extends CustomerBaseUser, R extends CustomerBaseUserRepository<T>, GU extends CustomerUserGenerator<T>> extends BaseUserServiceImpl<T,R,GU> implements CustomerBaseUserService<T,R> {

	public CustomerBaseUserServiceImpl(R repository, GU userGenerator) {
		super(repository, userGenerator);
	}
	
	public T findByInternalId(String internalId) {
		return repository.findByInternalId(internalId);
	}

}
