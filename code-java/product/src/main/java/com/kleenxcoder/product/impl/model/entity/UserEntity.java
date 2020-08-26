package com.kleenxcoder.product.impl.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.kleenxcoder.product.base.model.entity.BaseUserEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class UserEntity extends BaseUserEntity {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "internal_id")
    private String internalId;

}
