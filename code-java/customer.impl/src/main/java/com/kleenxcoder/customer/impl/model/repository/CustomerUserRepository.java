package com.kleenxcoder.customer.impl.model.repository;

import org.springframework.stereotype.Repository;

import com.kleenxcoder.customer.base.model.repository.BaseCustomerUserRepository;
import com.kleenxcoder.customer.impl.model.entity.CustomerUser;

@Repository
public interface CustomerUserRepository<T extends CustomerUser> extends BaseCustomerUserRepository<T> {
	
}
