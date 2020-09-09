package com.kleenxcoder.user.base.impl.service;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kleenxcoder.user.base.impl.model.entity.User;

@SpringBootTest
public class UserServiceTest {
	
	@Autowired
	UserService userService;
	
	@Test
	public void verifyUserIsNotNull() {
			User user = userService.verifyUser(null);
			assertNull(user);
	}

}
