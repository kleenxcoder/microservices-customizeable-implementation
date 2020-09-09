package com.kleenxcoder.user.base.controller;

import com.kleenxcoder.user.base.model.entity.BaseUser;

public interface BaseUserController<T extends BaseUser> {
	
	public T findByEmail(String email);

}
