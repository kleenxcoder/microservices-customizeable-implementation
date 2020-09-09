package com.kleenxcoder.customer.base.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.kleenxcoder.customer.base.model.entity.BaseCustomerUser;
import com.kleenxcoder.user.base.model.repository.BaseUserRepository;

@NoRepositoryBean
public interface BaseCustomerUserRepository<T extends BaseCustomerUser> extends BaseUserRepository<T>, CrudRepository<T, Long> {

	T findByInternalId(String internalId);

}
