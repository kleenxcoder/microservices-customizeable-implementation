package com.kleenxcoder.product.base.model.entity;

import java.util.Date;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@MappedSuperclass
public class BaseEntity {
	
	@Version
	private int version;
	
	@UpdateTimestamp
	private Date updateTimestamp;
	
	@CreationTimestamp
	private Date creationTimestamp;

}
