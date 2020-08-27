package com.kleenxcoder.product.impl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.kleenxcoder.product.impl.model.entity.User;
import com.kleenxcoder.product.impl.service.UserService;

@RestController
@RequestMapping(value = "/abf/api")
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/findByEmail/{email}")
    @ResponseStatus(HttpStatus.OK)
    public User findByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }
	
	@GetMapping("/findByInternalId/{internalId}")
    @ResponseStatus(HttpStatus.OK)
    public User findByInternalId(@PathVariable String internalId) {
        return service.findByInternalId(internalId);
    }

}
