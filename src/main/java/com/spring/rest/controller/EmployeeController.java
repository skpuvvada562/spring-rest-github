package com.spring.rest.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.dto.Employee;
import com.spring.rest.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;

	@GetMapping("/fetchEmployees")
	public ResponseEntity<List<Employee>> getEmployee(){
		
		List<Employee> employees=empService.getEmployeeList();
		employees=employees.stream().filter(e->e.getFirstName().length()>4).collect(Collectors.toList());
		
		return new ResponseEntity<>(employees, HttpStatus.OK);
		
	}
}
