package com.kleenxcoder.customer.base.component;

import java.util.UUID;

import com.kleenxcoder.customer.base.model.entity.CustomerBaseUser;
import com.kleenxcoder.user.base.component.BaseUserGeneratorImpl;

public abstract class BaseCustomerUserGeneratorImpl<T extends CustomerBaseUser> extends BaseUserGeneratorImpl<T> implements BaseCustomerUserGenerator<T> {

	@SuppressWarnings("unchecked")
	@Override
	public T generateEntity() {
		CustomerBaseUser entity = super.generateEntity();
		entity.setInternalId(UUID.randomUUID().toString());
		return (T) entity;
	}

}
