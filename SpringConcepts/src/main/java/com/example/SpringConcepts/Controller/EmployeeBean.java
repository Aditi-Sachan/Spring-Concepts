package com.example.SpringConcepts.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Marks this class as a Spring Bean
public class EmployeeBean {

    private String name = "John Doe";

    @Autowired // Injecting DepartmentBean
    private DepartmentBean department;

    public String getEmployeeDetails() {
        return "Employee: " + name + ", Department: " + department.getDeptName();
    }
}
