package org.hibernate.tutorial.domain;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 7/11/2017.
 */
public class StudentDAO {
    @SessionTarget
    Session session;

    @TransactionTarget
    Transaction transaction;

    @SuppressWarnings("unchecked")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<Student>();
        try {
            students = session.createQuery("from Student").list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public void addStudent(Student student) {
        session.save(student);
    }
}
