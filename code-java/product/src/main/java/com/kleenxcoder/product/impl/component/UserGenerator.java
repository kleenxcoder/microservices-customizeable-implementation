package com.kleenxcoder.product.impl.component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.kleenxcoder.product.impl.model.entity.User;

@Component
public class UserGenerator {
	
	private static final String firstNames[] = {"Peter", "Ronald", "Christian", "Paul", "Anna", "Emma", "Laura", "Sophie"};
	private static final String lastNames[] = {"Mayer", "Huber", "Mustermann", "Gruber", "Egger", "Brunner", "Wagner", "Schmidt", "Müller", "Weiss"};

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
		user.setInternalId(UUID.randomUUID().toString());
		return user;
	}

	private String getEmail(User user) {
		return user.getFirstName().toLowerCase() + "." + user.getLastName().toLowerCase() + "@" + "kleenxcoder.com";
	}
}
