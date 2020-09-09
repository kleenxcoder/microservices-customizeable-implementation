package com.kleenxcoder.customer.base.service;

import com.kleenxcoder.customer.base.model.entity.CustomerBaseUser;
import com.kleenxcoder.customer.base.model.repository.CustomerBaseUserRepository;
import com.kleenxcoder.user.base.service.BaseUserService;

public interface CustomerBaseUserService<T extends CustomerBaseUser, R extends CustomerBaseUserRepository<T>> extends BaseUserService<T,R> {

	T findByInternalId(String internalId);
}
