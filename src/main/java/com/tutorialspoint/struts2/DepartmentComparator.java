package com.tutorialspoint.struts2;

import java.util.Comparator;

/**
 * Created by Admin on 7/7/2017.
 */
public class DepartmentComparator implements Comparator {

    public int compare(EmployeeMk2 e1, EmployeeMk2 e2) {
        return e1.getDepartment().compareTo(e2.getDepartment());
    }

    public int compare(Object o1, Object o2) {
        return 0;
    }
}
