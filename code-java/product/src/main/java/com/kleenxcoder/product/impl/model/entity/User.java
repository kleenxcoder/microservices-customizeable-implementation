package com.kleenxcoder.product.impl.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.context.annotation.Description;

import com.kleenxcoder.product.base.model.entity.BaseUser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "user")
@Description("user table")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class User extends BaseUser {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "internal_id")
    private String internalId;

}
