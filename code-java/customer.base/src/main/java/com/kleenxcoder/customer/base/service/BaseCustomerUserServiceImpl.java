package com.kleenxcoder.customer.base.service;

import com.kleenxcoder.customer.base.model.entity.BaseCustomerUser;
import com.kleenxcoder.customer.base.model.repository.BaseCustomerUserRepository;
import com.kleenxcoder.user.base.service.BaseUserServiceImpl;

public abstract class BaseCustomerUserServiceImpl<T extends BaseCustomerUser, R extends BaseCustomerUserRepository<T>> extends BaseUserServiceImpl<T,R> implements BaseCustomerUserService<T,R> {

	public BaseCustomerUserServiceImpl(R repository) {
		super(repository);
	}
	
	public T findByInternalId(String internalId) {
		return repository.findByInternalId(internalId);
	}

}
