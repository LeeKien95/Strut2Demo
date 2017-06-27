package com.tutorialspoint.struts2;

/**
 * Created by Admin on 6/26/2017.
 */
public class HelloWorldAction {
    private String name;

    public String execute() throws Exception {
        return "success";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
