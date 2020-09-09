package com.kleenxcoder.user.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.kleenxcoder.user.base.model.entity.BaseUser;
import com.kleenxcoder.user.base.model.repository.BaseUserRepository;
import com.kleenxcoder.user.base.service.BaseUserService;

public abstract class BaseUserControllerImpl<T extends BaseUser, R extends BaseUserRepository<T> , S extends BaseUserService<T, R> > implements BaseUserController<T> {
	
	@Autowired
	protected S service;
	
	@GetMapping("/findByEmail/{email}")
    @ResponseStatus(HttpStatus.OK)
    public T findByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }
	
	@GetMapping("/createUsers")
    @ResponseStatus(HttpStatus.OK)
	public List<T> createUsers() {
		return service.createUsers();
	}
	
}
