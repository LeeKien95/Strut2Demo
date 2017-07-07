package com.tutorialspoint.struts2;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Admin on 7/7/2017.
 */

@Results({
        @Result(name = "success", location = "/ajaxdemo.jsp"),
        @Result(type = "tiles", location = "/ajaxdemo.jsp")
})
public class AjaxAutocomplete extends ActionSupport {
    private String data = "Afghanistan, Zimbabwe, India, United States, Germany, China";
    private List<String> countries;
    private String country;

    @Action(value = "/ajaxdemo")
    public String execute() {
        countries = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(data, ",");

        while (st.hasMoreTokens()) {
            countries.add(st.nextToken().trim());
        }
        return SUCCESS;
    }
    public String getCountry() {
        return this.country;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}
