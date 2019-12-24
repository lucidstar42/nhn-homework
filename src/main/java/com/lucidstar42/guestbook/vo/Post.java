package com.lucidstar42.guestbook.vo;

import java.sql.Date;

public class Post {
	protected int id;
	protected String email;
	protected String password;
	protected String content;
	protected Date createdAt;
	protected Date modifiedAt;
	
	public int getId() {
		return id;
	}
	
	public Post setId(int id) {
		this.id = id;
		return this;
	}
	
	public String getEmail() {
		return email;
	}
	
	public Post setEmail(String email) {
		this.email = email;
		return this;
	}
	
	public String getPassword() {
		return password;
	}
	
	public Post setPassword(String password) {
		this.password = password;
		return this;
	}
	
	public String getContent() {
		return content;
	}
	
	public Post setContent(String content) {
		this.content = content;
		return this;
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}
	
	public Post setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
		return this;
	}
	
	public Date getModifiedAt() {
		return modifiedAt;
	}
	
	public Post setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
		return this;
	}
	
	@Override
	public String toString() {
		return "ID : " + id 
				+ "\nEmail : " + email 
				+ "\nPassword : " + password 
				+ "\nContent : " + content 
				+ "\nCreated At : " + createdAt
				+ "\nModified At : " + modifiedAt;
	}
}
