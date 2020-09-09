package com.kleenxcoder.customer.base.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.kleenxcoder.user.base.model.entity.BaseUser;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString
@MappedSuperclass
public abstract class CustomerBaseUser extends BaseUser implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "internal_id")
    private String internalId;

}
