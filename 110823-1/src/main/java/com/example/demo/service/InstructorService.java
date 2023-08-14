package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.Instructor;

public interface InstructorService {
	
	Instructor createInstructor(Instructor instructor);
	
	Optional<Instructor> findInstructorById(int id);
	
	Instructor updateInstructor(Instructor instructor);

}
