package com.kleenxcoder.customer.base.impl.component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.kleenxcoder.customer.base.component.CustomerUserGenerator;
import com.kleenxcoder.customer.base.impl.model.entity.CustomerUser;

@Component
public class CustomerUserGeneratorImpl<T extends CustomerUser> implements CustomerUserGenerator<T> {

	@SuppressWarnings("unchecked")
	@Override
	public Iterable<T> generateUsers(int amount) {
		List<T> CustomerUsers = new ArrayList<>();

		for (int i = 0; i < amount; i++) {
			CustomerUsers.add((T) generateCustomerUser());
		}

		return CustomerUsers;
	}

	private CustomerUser generateCustomerUser() {
		CustomerUser customerUser = new CustomerUser();
		customerUser.setFirstName(firstNames[new Random().nextInt(firstNames.length)]);
		customerUser.setLastName(lastNames[new Random().nextInt(lastNames.length)]);
		customerUser.setActive(true);
		customerUser.setPassword(UUID.randomUUID().toString());
		customerUser.setEmail(getEmail(customerUser));
		customerUser.setInternalId(UUID.randomUUID().toString());
		return customerUser;
	}

	private String getEmail(CustomerUser customerUser) {
		return customerUser.getFirstName().toLowerCase() + "." + customerUser.getLastName().toLowerCase() + "@"
				+ "kleenxcoder.com";
	}
}
