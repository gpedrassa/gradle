package com.amanager.entity;

import org.springframework.data.annotation.Id;

public class Greeting {

	@Id
	private String id;
	private String content;

	public Greeting(String id, String content) {
		this.id = id;
		this.content = content;
	}

	public Greeting() {
		
	}

	public String getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
