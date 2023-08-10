package com.example.demo.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController("employees")
@RequestMapping("/employees")
public class EmployeeController {

	private List<Employee> list;

	{
		list = new ArrayList<Employee>();

		list.add(new Employee(new Random().nextInt(1000), "John", "Doe", "john@email.com"));
		list.add(new Employee(new Random().nextInt(1000), "Mary", "Public", "mary@email.com"));
		list.add(new Employee(new Random().nextInt(1000), "Rahul", "Dravid", "rahul@email.com"));

	}

	@GetMapping
	public List<Employee> getEmployees() {
		return list;
	}
	
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee)
	{
		list.add(employee);
		return employee;
	}

}
