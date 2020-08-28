package com.kleenxcoder.product.impl.controller;

import com.kleenxcoder.product.base.controller.BaseUserController;
import com.kleenxcoder.product.impl.model.entity.User;

public interface UserController extends BaseUserController<User> {
	
	public User findByInternalId(String internalId);

}
