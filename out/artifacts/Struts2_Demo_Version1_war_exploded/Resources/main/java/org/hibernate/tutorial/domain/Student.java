package org.hibernate.tutorial.domain;

import javax.persistence.*;

/**
 * Created by Admin on 7/11/2017.
 */
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String lastName;
    @Column
    private String firstName;
    @Column
    private int marks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
