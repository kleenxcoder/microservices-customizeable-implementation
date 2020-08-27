package com.kleenxcoder.product.base.controller;

import com.kleenxcoder.product.impl.model.entity.User;

public interface BaseUserController {
	
	public User findByEmail(String email);

}
