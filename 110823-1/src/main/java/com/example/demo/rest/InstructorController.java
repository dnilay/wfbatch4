package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Instructor;
import com.example.demo.repo.InstructorRepository;

@RestController
@RequestMapping("/instructors")
public class InstructorController {

	// dependency injection
	@Autowired
	private InstructorRepository instructorRepository;

	@PostMapping
	public Instructor createInstructor(@RequestBody Instructor instructor) {
		
		return instructorRepository.save(instructor);

	}

}
