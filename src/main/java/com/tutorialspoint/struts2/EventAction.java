package com.tutorialspoint.struts2;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.tutorial.domain.Event;
import org.hibernate.tutorial.util.HibernateUtil;

import com.opensymphony.xwork2.ActionSupport;

public class EventAction extends ActionSupport {
	private Date date;
	private String title;
	private int id;
	private List events;
	
	public String execute() {
		createAndStoreEvent(title, date);
		events = listEvents();
		return "success";
	}
	
	private List listEvents() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List result = session.createQuery("from Event").list();
        session.getTransaction().commit();
        return result;
    }
	
	private void createAndStoreEvent(String title, Date theDate) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Event theEvent = new Event();
		theEvent.setTitle(title);
		theEvent.setDate(theDate);
		session.save(theEvent);
		session.getTransaction().commit();
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List getEvents() {
		return events;
	}

	public void setEvents(List events) {
		this.events = events;
	}
	
}
