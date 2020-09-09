package com.kleenxcoder.user.base.impl.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.context.annotation.Description;

import com.kleenxcoder.user.base.model.entity.BaseUser;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@Table(name = "user")
@Description("user table")
@EqualsAndHashCode(callSuper = true)
public class User extends BaseUser {

	private static final long serialVersionUID = 1L;
	
}
