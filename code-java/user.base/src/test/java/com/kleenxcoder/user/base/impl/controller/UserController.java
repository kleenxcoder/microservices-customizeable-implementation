package com.kleenxcoder.user.base.impl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kleenxcoder.user.base.controller.BaseUserControllerImpl;
import com.kleenxcoder.user.base.impl.model.entity.User;
import com.kleenxcoder.user.base.impl.model.repository.UserRepository;
import com.kleenxcoder.user.base.impl.service.UserService;

@RestController
@RequestMapping(value = "/v1/api/user")
public class UserController extends BaseUserControllerImpl<User, UserRepository, UserService> {

}
