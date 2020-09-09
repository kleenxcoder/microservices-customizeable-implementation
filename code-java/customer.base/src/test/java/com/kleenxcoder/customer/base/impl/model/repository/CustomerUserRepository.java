package com.kleenxcoder.customer.base.impl.model.repository;

import org.springframework.stereotype.Repository;

import com.kleenxcoder.customer.base.impl.model.entity.CustomerUser;
import com.kleenxcoder.customer.base.model.repository.BaseCustomerUserRepository;

@Repository
public interface CustomerUserRepository<T extends CustomerUser> extends BaseCustomerUserRepository<T> {
	
}
