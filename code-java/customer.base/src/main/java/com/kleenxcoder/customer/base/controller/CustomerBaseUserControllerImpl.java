package com.kleenxcoder.customer.base.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.kleenxcoder.customer.base.model.entity.CustomerBaseUser;
import com.kleenxcoder.customer.base.model.repository.CustomerBaseUserRepository;
import com.kleenxcoder.customer.base.service.CustomerBaseUserService;
import com.kleenxcoder.user.base.controller.BaseUserControllerImpl;

public abstract class CustomerBaseUserControllerImpl<T extends CustomerBaseUser, R extends CustomerBaseUserRepository<T> , S extends CustomerBaseUserService<T, R> > extends BaseUserControllerImpl<T,R,S> implements CustomerBaseUserController<T> {
	
	@GetMapping("/findByInternalId/{internalId}")
    @ResponseStatus(HttpStatus.OK)
    public T findByInternalId(@PathVariable String internalId) {
        return service.findByInternalId(internalId);
    }
}
