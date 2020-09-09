package com.kleenxcoder.user.base.controller;

import java.util.List;

import com.kleenxcoder.user.base.model.entity.BaseUser;

public interface BaseUserController<T extends BaseUser> {
	
	public abstract T findByEmail(String email);
	public abstract List<T> createUsers();

}
