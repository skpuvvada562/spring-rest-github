package com.spring.rest.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.rest.dto.Address;
import com.spring.rest.dto.Employee;

@Service
public class EmployeeService {
	public List<Employee> getEmployeeList(){
		 // Create dummy address data
        Address address1 = new Address(1, 1, "12 Oak Lane", "Los Angeles", "CA", "90001", "USA", "Home");
        Address address2 = new Address(2, 1, "34 Work Ave", "Los Angeles", "CA", "90002", "USA", "Work");
        Address address3 = new Address(3, 2, "56 Maple Street", "Chicago", "IL", "60601", "USA", "Home");
        Address address4 = new Address(4, 2, "78 Industrial Blvd", "Chicago", "IL", "60602", "USA", "Work");
        Address address5 = new Address(5, 3, "90 Pine Road", "Miami", "FL", "33101", "USA", "Home");
        Address address6 = new Address(6, 3, "12 Business Plaza", "Miami", "FL", "33102", "USA", "Work");
        Address address7 = new Address(7, 4, "123 Amazon Way", "Themyscira", null, "12345", "Paradise Island", "Home");
        Address address8 = new Address(8, 5, "45 Spy Lane", "London", null, "W1D 4FA", "UK", "Home");
        Address address9 = new Address(9, 5, "22 Mission St", "London", null, "W1D 4FB", "UK", "Work");

        // Create dummy employee data
        Employee employee1 = new Employee(1, "Alice", "Smith", "alice.smith@example.com", new Date());
        employee1.setAddresses(Arrays.asList(address1, address2));

        Employee employee2 = new Employee(2, "Bob", "Johnson", "bob.johnson@example.com", new Date());
        employee2.setAddresses(Arrays.asList(address3, address4));

        Employee employee3 = new Employee(3, "Charlie", "Brown", "charlie.brown@example.com", new Date());
        employee3.setAddresses(Arrays.asList(address5, address6));

        Employee employee4 = new Employee(4, "Diana", "Prince", "diana.prince@example.com", new Date());
        employee4.setAddresses(Arrays.asList(address7));

        Employee employee5 = new Employee(5, "Ethan", "Hunt", "ethan.hunt@example.com", new Date());
        employee5.setAddresses(Arrays.asList(address8, address9));

        // Return list of employees
        return Arrays.asList(employee1, employee2, employee3, employee4, employee5);
	}

}
