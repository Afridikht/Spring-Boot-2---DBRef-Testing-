package com.test.pojo;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Zafar Iqbal
 * @since Apr 23, 2018
 */

@Document(collection = "mainEntity")
public class MainEntity {

	@Id
	private String id;
	
	@DBRef(db = "innerEntity", lazy = true)
	private InnerEntity innerEntity;
	
	@CreatedDate
	private Date creationTime;
	
	@LastModifiedDate
	private Date modifiedTime;
	
	public MainEntity(){}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public InnerEntity getInnerEntity() {
		return innerEntity;
	}

	public void setInnerEntity(InnerEntity innerEntity) {
		this.innerEntity = innerEntity;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	
}
