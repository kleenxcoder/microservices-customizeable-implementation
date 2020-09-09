package com.kleenxcoder.customer.base.service;

import com.kleenxcoder.customer.base.model.entity.BaseCustomerUser;
import com.kleenxcoder.customer.base.model.repository.BaseCustomerUserRepository;
import com.kleenxcoder.user.base.service.BaseUserService;

public interface BaseCustomerUserService<T extends BaseCustomerUser, R extends BaseCustomerUserRepository<T>> extends BaseUserService<T,R> {

	T findByInternalId(String internalId);
}
