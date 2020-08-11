package com.cyb.ems.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

	static final Logger log = LoggerFactory.getLogger(EmpController.class);
	
	public String showmsg() {
		log.info("Inside showmsg()...");
		return "EMS Spring Boot App";
	}
	
}
