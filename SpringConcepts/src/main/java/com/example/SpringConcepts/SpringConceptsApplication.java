package com.example.SpringConcepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptsApplication {

	public static void main(String[] args) {

		// Start Spring application and get ApplicationContext
		ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);

		// Retrieve EmployeeBean from ApplicationContext
		EmployeeBean employee = context.getBean(EmployeeBean.class);

		// Print employee details
		System.out.println(employee.getEmployeeDetails());
	}

}
