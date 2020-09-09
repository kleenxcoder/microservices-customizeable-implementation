package com.kleenxcoder.customer.base.impl.service;

import org.springframework.stereotype.Service;

import com.kleenxcoder.customer.base.impl.model.entity.CustomerUser;
import com.kleenxcoder.customer.base.impl.model.repository.CustomerUserRepository;
import com.kleenxcoder.customer.base.service.BaseCustomerUserServiceImpl;

@Service
public class CustomerUserService<T extends CustomerUser, R extends CustomerUserRepository<T>> extends BaseCustomerUserServiceImpl<T, R> {

	public CustomerUserService(R repository) {
		super(repository);
	}

}
