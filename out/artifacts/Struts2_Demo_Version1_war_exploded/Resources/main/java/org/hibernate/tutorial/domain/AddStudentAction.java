package org.hibernate.tutorial.domain;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 7/11/2017.
 */
public class AddStudentAction extends ActionSupport implements ModelDriven<Student> {
    public Student getModel() {
        return student;
    }

    Student student = new Student();
    List<Student> students = new ArrayList<Student>();
    StudentDAO dao = new StudentDAO();

    public String execute() {
        dao.addStudent(student);
        return SUCCESS;
    }

    public String listStudents(){
        students = dao.getStudents();
        return SUCCESS;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
