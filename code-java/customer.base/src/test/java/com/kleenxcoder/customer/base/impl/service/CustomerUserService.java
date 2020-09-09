package com.kleenxcoder.customer.base.impl.service;

import org.springframework.stereotype.Service;

import com.kleenxcoder.customer.base.impl.model.entity.CustomerUser;
import com.kleenxcoder.customer.base.impl.model.repository.CustomerUserRepository;
import com.kleenxcoder.customer.base.service.CustomerBaseUserServiceImpl;

@Service
public class CustomerUserService<T extends CustomerUser, R extends CustomerUserRepository<T>> extends CustomerBaseUserServiceImpl<T, R> {

	public CustomerUserService(R repository) {
		super(repository);
	}

}
