package com.sample.main;

import org.springframework.stereotype.Component;

@Component
public class Person {
	int age;
	String name;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
}
