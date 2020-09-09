package com.kleenxcoder.user.base.service;

import java.util.List;

import com.kleenxcoder.user.base.component.BaseUserGenerator;
import com.kleenxcoder.user.base.model.entity.BaseUser;
import com.kleenxcoder.user.base.model.repository.BaseUserRepository;

public interface BaseUserService<T extends BaseUser, R extends BaseUserRepository<T>> {

	public abstract T findByEmail(String email);
	public abstract List<T> createUsers(BaseUserGenerator<T> userGenerator);
}
