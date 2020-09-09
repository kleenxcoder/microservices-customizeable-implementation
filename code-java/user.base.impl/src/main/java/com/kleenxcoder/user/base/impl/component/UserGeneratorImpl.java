package com.kleenxcoder.user.base.impl.component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.kleenxcoder.user.base.component.BaseUserGenerator;
import com.kleenxcoder.user.base.impl.model.entity.User;

@Component
public class UserGeneratorImpl implements BaseUserGenerator<User> {

	@Override
	public Iterable<User> generateUsers(int amount) {
		List<User> users = new ArrayList<>();

		for (int i = 0; i < amount; i++) {
			users.add(generateUser());
		}

		return users;
	}

	private User generateUser() {
		User user = new User();
		user.setFirstName(firstNames[new Random().nextInt(firstNames.length)]);
		user.setLastName(lastNames[new Random().nextInt(lastNames.length)]);
		user.setActive(true);
		user.setPassword(UUID.randomUUID().toString());
		user.setEmail(getEmail(user));
		return user;
	}

	private String getEmail(User user) {
		return user.getFirstName().toLowerCase() + "." + user.getLastName().toLowerCase() + "@" + "kleenxcoder.com";
	}

}
