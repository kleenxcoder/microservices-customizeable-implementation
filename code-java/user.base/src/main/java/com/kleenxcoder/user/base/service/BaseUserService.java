package com.kleenxcoder.user.base.service;

import java.util.List;

import com.kleenxcoder.user.base.model.entity.BaseUser;
import com.kleenxcoder.user.base.model.repository.BaseUserRepository;

public interface BaseUserService<T extends BaseUser, R extends BaseUserRepository<T>> {

	public T findByEmail(String email);
	public List<T> createUsers();
}
