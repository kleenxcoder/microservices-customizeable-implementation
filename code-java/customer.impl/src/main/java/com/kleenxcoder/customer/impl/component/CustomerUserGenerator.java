package com.kleenxcoder.customer.impl.component;

import org.springframework.stereotype.Component;

import com.kleenxcoder.customer.base.component.BaseCustomerUserGenerator;
import com.kleenxcoder.customer.base.component.BaseCustomerUserGeneratorImpl;
import com.kleenxcoder.customer.impl.model.entity.CustomerUser;

@Component
public class CustomerUserGenerator<T extends CustomerUser> extends BaseCustomerUserGeneratorImpl<T> implements BaseCustomerUserGenerator<T> {

	@SuppressWarnings("unchecked")
	@Override
	public T createEntity() {
		return (T) new CustomerUser();
	}
	
	

}
