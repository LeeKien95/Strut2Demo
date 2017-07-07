package com.tutorialspoint.struts2;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.util.SubsetIteratorFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 7/7/2017.
 */

@Results({
        @Result(name = "success", location = "/employee.jsp")
})
public class EmployeeMk2 extends ActionSupport {
    private String name;
    private String department;

    public EmployeeMk2(){}

    public EmployeeMk2(String name,String department)
    {
        this.name = name;
        this.department = department;
    }
    private List employees;
    private List contractors;

    @Action(value = "/employee")
    public String execute() {
        employees = new ArrayList();
        employees.add(new EmployeeMk2("George","Recruitment"));
        employees.add(new EmployeeMk2("Danielle","Accounts"));
        employees.add(new EmployeeMk2("Melissa","Recruitment"));
        employees.add(new EmployeeMk2("Rose","Accounts"));

        contractors = new ArrayList();
        contractors.add(new EmployeeMk2("Mindy","Database"));
        contractors.add(new EmployeeMk2("Vanessa","Network"));
        return "success";
    }

    public SubsetIteratorFilter.Decider getRecruitmentDecider() {
        return new SubsetIteratorFilter.Decider() {
            public boolean decide(Object element) throws Exception {
                EmployeeMk2 employee = (EmployeeMk2)element;
                return employee.getDepartment().equals("Recruitment");
            }
        };
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public List getEmployees() {
        return employees;
    }
    public void setEmployees(List employees) {
        this.employees = employees;
    }
    public List getContractors() {
        return contractors;
    }
    public void setContractors(List contractors) {
        this.contractors = contractors;
    }
}
