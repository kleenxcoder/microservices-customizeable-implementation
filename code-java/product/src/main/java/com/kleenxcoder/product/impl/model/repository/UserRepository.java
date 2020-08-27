package com.kleenxcoder.product.impl.model.repository;

import org.springframework.stereotype.Repository;

import com.kleenxcoder.product.base.model.repository.BaseUserRepository;
import com.kleenxcoder.product.impl.model.entity.User;

@Repository
public interface UserRepository extends BaseUserRepository<User> {
	
	User findByInternalId(String internalId);

}
