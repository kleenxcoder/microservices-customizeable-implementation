package com.kleenxcoder.customer.base.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.kleenxcoder.customer.base.model.entity.BaseCustomerUser;
import com.kleenxcoder.customer.base.model.repository.BaseCustomerUserRepository;
import com.kleenxcoder.customer.base.service.BaseCustomerUserService;
import com.kleenxcoder.user.base.controller.BaseUserControllerImpl;

public abstract class BaseCustomerUserControllerImpl<T extends BaseCustomerUser, R extends BaseCustomerUserRepository<T> , S extends BaseCustomerUserService<T, R> > extends BaseUserControllerImpl<T,R,S> implements BaseCustomerUserController<T> {
	
	@GetMapping("/findByInternalId/{internalId}")
    @ResponseStatus(HttpStatus.OK)
    public T findByInternalId(@PathVariable String internalId) {
        return service.findByInternalId(internalId);
    }
}
