package com.kleenxcoder.product.impl.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.kleenxcoder.product.base.controller.BaseUserControllerImpl;
import com.kleenxcoder.product.impl.model.entity.User;
import com.kleenxcoder.product.impl.model.repository.UserRepository;
import com.kleenxcoder.product.impl.service.UserService;

@RestController
@RequestMapping(value = "/abf/api/user")
public class UserControllerImpl extends BaseUserControllerImpl<User, UserRepository, UserService> implements UserController {
	
	
	@GetMapping("/findByInternalId/{internalId}")
    @ResponseStatus(HttpStatus.OK)
    public User findByInternalId(@PathVariable String internalId) {
        return service.findByInternalId(internalId);
    }
	
	@GetMapping("/createUsers")
    @ResponseStatus(HttpStatus.OK)
	public List<User> createUsers() {
		return service.createUsers();
	}

}
