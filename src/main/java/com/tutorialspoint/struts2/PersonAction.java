package com.tutorialspoint.struts2;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.tutorial.PersonManager;

import com.opensymphony.xwork2.ActionSupport;

public class PersonAction extends ActionSupport {
	private int id;
	private int age;
	private String firstname;
	private String lastname;
	private Set events = new HashSet();
	private List persons;
	private int personID;
	private int eventID;
	private PersonManager pm = PersonManager.getPersonManager();
	
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
	public List getPersons() {
		return persons;
	}
	public void setPersons(List persons) {
		this.persons = persons;
	}
	public int getPersonID() {
		return personID;
	}
	public void setPersonID(int personID) {
		this.personID = personID;
	}
	public int getEventID() {
		return eventID;
	}
	public void setEventID(int eventID) {
		this.eventID = eventID;
	}
	public String execute() {
		return "success";
	}
	
	public String addPerson() {
		pm.addPerson(age, firstname, lastname);
		persons = pm.listPersion();
		return "success";
	}
	
	public String addEventToPerson() {
		pm.addEventToPerson(eventID, personID);
		persons = pm.listPersion();
		return SUCCESS;
	}
	
    
}
