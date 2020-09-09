package com.kleenxcoder.user.base.impl.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.kleenxcoder.user.base.controller.BaseUserControllerImpl;
import com.kleenxcoder.user.base.impl.model.entity.User;
import com.kleenxcoder.user.base.impl.model.repository.UserRepository;
import com.kleenxcoder.user.base.impl.service.UserService;

@RestController
@RequestMapping(value = "/v1/api/user")
public class UserControllerImpl extends BaseUserControllerImpl<User, UserRepository, UserService> implements UserController {
	
	@GetMapping("/createUsers")
    @ResponseStatus(HttpStatus.OK)
	public List<User> createUsers() {
		return service.createUsers();
	}

}
