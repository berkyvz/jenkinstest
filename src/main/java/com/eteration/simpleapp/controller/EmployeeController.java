package com.eteration.simpleapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eteration.simpleapp.model.Employee;
import com.eteration.simpleapp.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee")
	public Employee getRandomEmployee() {
		return employeeService.generateRandomEmployee();
	}
	
	@GetMapping("/getzero")
	public String getZero() {
		return "0";
	}
	
	@RequestMapping("")
	public @ResponseBody String hello() {
		return "Welcome !";
	}
	
}
