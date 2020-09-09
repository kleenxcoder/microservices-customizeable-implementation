package com.kleenxcoder.user.base.component;

import java.util.function.Supplier;

import com.kleenxcoder.user.base.model.entity.BaseUser;

public interface BaseUserGenerator<T extends BaseUser> {
	
	static final String firstNames[] = {"Peter", "Ronald", "Christian", "Paul", "Anna", "Emma", "Laura", "Sophie"};
	static final String lastNames[] = {"Mayer", "Huber", "Mustermann", "Gruber", "Egger", "Brunner", "Wagner", "Schmidt", "Müller", "Weiss"};

//	public Iterable<T> generateUsers(int amount, Supplier<T> supplier);
	public Iterable<T> generateUsers(int amount);

}
