package com.kleenxcoder.user.base.impl.model.repository;

import org.springframework.stereotype.Repository;

import com.kleenxcoder.user.base.impl.model.entity.User;
import com.kleenxcoder.user.base.model.repository.BaseUserRepository;

@Repository
public interface UserRepository extends BaseUserRepository<User> {
	
}
