package org.hibernate.tutorial.domain;

import java.util.HashSet;
import java.util.Set;

public class Person {
	private int id;
	private int age;
	private String firstname;
	private String lastname;
	private Set events = new HashSet();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Set getEvents() {
		return events;
	}
	public void setEvents(Set events) {
		this.events = events;
	}
	
}
