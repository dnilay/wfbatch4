package com.example.demo.rest;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Instructor;
import com.example.demo.service.InstructorService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/instructors")
@AllArgsConstructor
public class InstructorController {

	private final InstructorService instructorService;

	@PostMapping
	public Instructor createInstructor(@RequestBody Instructor instructor) {

		return instructorService.createInstructor(instructor);
	}

	@GetMapping("/{id}")
	public Optional<Instructor> findInstructor(@PathVariable("id") int id) {

		Optional<Instructor> o=instructorService.findInstructorById(id);
		
		return o;
	}

}
