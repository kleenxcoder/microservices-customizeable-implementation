package com.kleenxcoder.customer.base.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.kleenxcoder.customer.base.model.entity.CustomerBaseUser;
import com.kleenxcoder.user.base.model.repository.BaseUserRepository;

@NoRepositoryBean
public interface CustomerBaseUserRepository<T extends CustomerBaseUser> extends BaseUserRepository<T>, CrudRepository<T, Long> {

	T findByInternalId(String internalId);

}
