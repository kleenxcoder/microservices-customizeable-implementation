package com.kleenxcoder.customer.impl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kleenxcoder.customer.base.controller.BaseCustomerUserControllerImpl;
import com.kleenxcoder.customer.impl.model.entity.CustomerUser;
import com.kleenxcoder.customer.impl.model.repository.CustomerUserRepository;
import com.kleenxcoder.customer.impl.service.CustomerUserService;

@RestController
@RequestMapping(value = "/v1/api/user")
public class CustomerUserControllerImpl<T extends CustomerUser, R extends CustomerUserRepository<T> , S extends CustomerUserService<T, R> > extends BaseCustomerUserControllerImpl<T,R,S> implements CustomerUserController<T> {
	
}
