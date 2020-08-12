package com.cyb.ems.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cyb.ems.model.Employee;
import com.cyb.ems.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmpController {

	static final Logger log = LoggerFactory.getLogger(EmpController.class);
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/showMessage")
	public String showmsg() {
		log.info("Inside showmsg()...");
		return "EMS Spring Boot App";
	}

	@GetMapping("/getEmployee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		log.info("Employee retrieved with given id...");
		return empService.getEmployee(id);
	}	
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		log.info("All Employees retrieved...");
		return empService.getAllEmployees();
	}
	
	@PutMapping("/updateName")
	public Employee updateEmployee(@RequestParam int id, @RequestParam String name) {
		log.info("Employee updated...");
		return empService.updateEmployee(id, name);
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable int id) {
		empService.deleteEmployee(id);
		log.info("Employee deleted...");
	}
	
}
