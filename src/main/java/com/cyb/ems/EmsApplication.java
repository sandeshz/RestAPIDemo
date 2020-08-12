package com.cyb.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cyb.ems.service.EmployeeService;

@SpringBootApplication
public class EmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsApplication.class, args);
		System.out.println("EMS App Running...");
	}

}
