package com.kleenxcoder.user.base.impl.component;

import org.springframework.stereotype.Component;

import com.kleenxcoder.user.base.component.BaseUserGenerator;
import com.kleenxcoder.user.base.component.BaseUserGeneratorImpl;
import com.kleenxcoder.user.base.impl.model.entity.User;

@Component
public class UserGeneratorImpl<T extends User> extends BaseUserGeneratorImpl<T> implements BaseUserGenerator<T> {

	@SuppressWarnings("unchecked")
	@Override
	public T createEntity() {
		return (T) new User();
	}

}