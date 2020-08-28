package com.kleenxcoder.product.base.controller;

import com.kleenxcoder.product.base.model.entity.BaseUser;

public interface BaseUserController<T extends BaseUser> {
	
	public T findByEmail(String email);

}
