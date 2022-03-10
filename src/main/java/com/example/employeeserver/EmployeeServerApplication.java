package com.example.employeeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EmployeeServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeServerApplication.class, args);
    }

}
