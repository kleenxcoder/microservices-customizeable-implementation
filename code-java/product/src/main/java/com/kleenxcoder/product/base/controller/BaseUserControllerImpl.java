package com.kleenxcoder.product.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.kleenxcoder.product.base.model.entity.BaseUser;
import com.kleenxcoder.product.base.model.repository.BaseUserRepository;
import com.kleenxcoder.product.base.service.BaseUserService;

public abstract class BaseUserControllerImpl<T extends BaseUser, R extends BaseUserRepository<T> , S extends BaseUserService<T, R> > implements BaseUserController<T> {
	
	@Autowired
	protected S service;
	
	@GetMapping("/findByEmail/{email}")
    @ResponseStatus(HttpStatus.OK)
    public T findByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }	

}
