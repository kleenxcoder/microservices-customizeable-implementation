package com.kleenxcoder.customer.base.component;

import java.util.UUID;

import com.kleenxcoder.customer.base.model.entity.BaseCustomerUser;
import com.kleenxcoder.user.base.component.BaseUserGeneratorImpl;

public abstract class BaseCustomerUserGeneratorImpl<T extends BaseCustomerUser> extends BaseUserGeneratorImpl<T> implements BaseCustomerUserGenerator<T> {

	@SuppressWarnings("unchecked")
	@Override
	public T generateEntity() {
		BaseCustomerUser entity = super.generateEntity();
		entity.setInternalId(UUID.randomUUID().toString());
		return (T) entity;
	}

}
