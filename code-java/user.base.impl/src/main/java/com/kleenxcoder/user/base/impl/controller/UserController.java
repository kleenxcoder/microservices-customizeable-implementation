package com.kleenxcoder.user.base.impl.controller;

import java.util.List;

import com.kleenxcoder.user.base.controller.BaseUserController;
import com.kleenxcoder.user.base.impl.model.entity.User;

public interface UserController extends BaseUserController<User> {
	
	public List<User> createUsers();
	
}
