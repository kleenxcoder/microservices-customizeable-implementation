package com.kleenxcoder.product.base.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import com.kleenxcoder.product.base.model.entity.BaseUser;

@NoRepositoryBean
public interface BaseUserRepository<T extends BaseUser> extends CrudRepository<T, Long> {

	public T findByFirstName(String firstName);

	@Query("select u from #{#entityName} as u where u.email = :email ")
	T findByEmail(@Param("email") String email);

}
