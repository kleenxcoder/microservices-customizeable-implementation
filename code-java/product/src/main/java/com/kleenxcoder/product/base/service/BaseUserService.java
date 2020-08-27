package com.kleenxcoder.product.base.service;

import com.kleenxcoder.product.base.model.entity.BaseUser;
import com.kleenxcoder.product.base.model.repository.BaseUserRepository;

public interface BaseUserService<T extends BaseUser, R extends BaseUserRepository<T>> {

	public T findByEmail(String email);
}
