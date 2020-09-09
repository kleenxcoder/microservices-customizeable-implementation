package com.kleenxcoder.customer.base.impl.service;

import org.springframework.stereotype.Service;

import com.kleenxcoder.customer.base.component.CustomerUserGenerator;
import com.kleenxcoder.customer.base.impl.model.entity.CustomerUser;
import com.kleenxcoder.customer.base.impl.model.repository.CustomerUserRepository;
import com.kleenxcoder.customer.base.service.CustomerBaseUserServiceImpl;

@Service
public class CustomerUserService<T extends CustomerUser, R extends CustomerUserRepository<T>, UG extends CustomerUserGenerator<T>> extends CustomerBaseUserServiceImpl<T, R, UG> {

	public CustomerUserService(R repository, UG userGenerator) {
		super(repository, userGenerator);
	}

}
