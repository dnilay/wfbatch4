package com.example.demo.rest;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Instructor;
import com.example.demo.repo.InstructorRepository;

@RestController
@RequestMapping("/instructors")

public class InstructorController {

	private InstructorRepository instructorRepository;

	// dependency injection
	public InstructorController(InstructorRepository instructorRepository) {

		this.instructorRepository = instructorRepository;
	}

	@PostMapping
	public Instructor createInstructor(@RequestBody Instructor instructor) {

		return instructorRepository.save(instructor);
	}

	@GetMapping("/{id}")
	public Optional<Instructor> findInstructor(@PathVariable("id") int id) {

		Optional<Instructor> o=instructorRepository.findById(id);
		//Instructor i=o.get();
		//System.out.println(i);
		return o;
	}

}
