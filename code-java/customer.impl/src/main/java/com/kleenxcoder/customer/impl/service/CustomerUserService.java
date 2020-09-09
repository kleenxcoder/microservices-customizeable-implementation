package com.kleenxcoder.customer.impl.service;

import org.springframework.stereotype.Service;

import com.kleenxcoder.customer.base.service.BaseCustomerUserServiceImpl;
import com.kleenxcoder.customer.impl.model.entity.CustomerUser;
import com.kleenxcoder.customer.impl.model.repository.CustomerUserRepository;

@Service
public class CustomerUserService<T extends CustomerUser, R extends CustomerUserRepository<T>> extends BaseCustomerUserServiceImpl<T, R> {

	public CustomerUserService(R repository) {
		super(repository);
	}

}
