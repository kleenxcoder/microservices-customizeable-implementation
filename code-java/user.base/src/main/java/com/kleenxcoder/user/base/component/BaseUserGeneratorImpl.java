package com.kleenxcoder.user.base.component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import com.kleenxcoder.user.base.model.entity.BaseUser;

public abstract class BaseUserGeneratorImpl<T extends BaseUser> implements BaseUserGenerator<T> {
	

	@Override
	public Iterable<T> generateEntities(int amount) {
		List<T> users = new ArrayList<>();

		for (int i = 0; i < amount; i++) {
			users.add(generateEntity());
		}
		return users;
	}

	public T generateEntity() {
		T user = createEntity();
		user.setFirstName(firstNames[new Random().nextInt(firstNames.length)]);
		user.setLastName(lastNames[new Random().nextInt(lastNames.length)]);
		user.setActive(true);
		user.setPassword(UUID.randomUUID().toString());
		user.setEmail(getEmail(user));
		return user;
	}

	public String getEmail(T user) {
		return user.getFirstName().toLowerCase() + "." + user.getLastName().toLowerCase() + "@" + "kleenxcoder.com";
	}	

}
