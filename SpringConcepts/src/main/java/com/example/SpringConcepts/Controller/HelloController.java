package com.example.SpringConcepts.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String sayHello() {
        logger.info("INFO: sayHello() method called");
        logger.debug("DEBUG: sayHello() execution details");
        logger.error("ERROR: This is a sample error log");

        return "Hello, Spring Boot!";
    }
}



