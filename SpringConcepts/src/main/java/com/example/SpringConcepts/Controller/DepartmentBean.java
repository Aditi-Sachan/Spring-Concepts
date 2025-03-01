package com.example.SpringConcepts.Controller;

import org.springframework.stereotype.Component;

@Component  // Marks this class as a Spring-managed bean
public class DepartmentBean {

    private String deptName = "Software Development";

    public String getDeptName() {
        return deptName;
    }
}

