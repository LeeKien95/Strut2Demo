package com.tutorialspoint.struts2;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/**
 * Created by Admin on 7/6/2017.
 */
@Results({
        @Result(name="success", location = "/validation_success.jsp"),
        @Result(name="input", location = "/index.jsp")
})
public class Employee extends ActionSupport {
    private String name;
    private int age;

    @Action(value = "/empinfo")
    public String execute()
    {
        return SUCCESS;
    }

    @RequiredFieldValidator(message = "The name is required")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @IntRangeFieldValidator(message = "Age must be in between 28 and 65", min = "28", max = "65")
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

//    public void validate() {
//        if(name == null || name.trim().equals("")) {
//            addFieldError("name", "The name is required");
//        }
//        if(age < 28 || age > 65) {
//            addFieldError("age", "Age must between 28 and 65");
//        }
//    }
}
