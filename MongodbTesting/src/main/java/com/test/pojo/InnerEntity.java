package com.test.pojo;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Zafar Iqbal
 * @since Apr 23, 2018
 */

@Document(collection = "innerEntity")
public class InnerEntity {

	@Id
	private String id;
	
	private String name;
	
	@CreatedDate
	private Date creationTime;
	
	@LastModifiedDate
	private Date modifiedTime;
	
	public InnerEntity(){}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
