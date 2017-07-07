package com.tutorialspoint.struts2;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/**
 * Created by Admin on 7/7/2017.
 */
@Results({
        @Result(name = "success", location = "/index.jsp")
})
public class Locale extends ActionSupport {
    private String request_locale;

    @Action(value = "/locale")
    public String execute() {
        return SUCCESS;
    }

    public void setRequest_locale(String request_locale) {
        this.request_locale = request_locale;
    }

    public String getRequest_locale() {
        return request_locale;
    }
}
